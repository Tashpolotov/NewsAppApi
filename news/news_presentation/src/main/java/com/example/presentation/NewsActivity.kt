package com.example.presentation

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.Toast
import androidx.activity.viewModels
import androidx.lifecycle.lifecycleScope
import com.example.common_utils.Navigator
import com.example.presentation.databinding.ActivityNewsBinding
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.collectLatest

@AndroidEntryPoint
class NewsActivity : AppCompatActivity() {



    companion object {
        fun launchActivity(activity: Activity) {
            val intent = Intent(activity, NewsActivity::class.java)
            activity.startActivity(intent)
        }
    }
    private var _binding : ActivityNewsBinding?=null
    private val binding:ActivityNewsBinding
    get() = _binding!!

    private val newsViewModel: NewsViewModel by viewModels()

    private val newsAdapter = NewsAdapter()



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityNewsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initView()
        serObservers()

    }

    private fun initView() {
        binding.rvArticles.adapter = newsAdapter

    }

    private fun serObservers() {
        lifecycleScope.launchWhenCreated {
             newsViewModel.newsArticle.collectLatest{
                 if(it.isLoading){
                    binding.progressBar.visibility = View.VISIBLE
                 }
                 if(it.error.isNotBlank()){
                     binding.progressBar.visibility = View.GONE
                     Toast.makeText(this@NewsActivity, it.error, Toast.LENGTH_LONG).show()
                 }
                 it.data?.let {
                     binding.progressBar.visibility = View.VISIBLE
                    newsAdapter.submitList(it)
                 }
             }
        }
    }

    object GotoNewsActivity: Navigator {
        override fun navigate(activity: Activity) {
            NewsActivity.launchActivity(activity)
        }


    }
}