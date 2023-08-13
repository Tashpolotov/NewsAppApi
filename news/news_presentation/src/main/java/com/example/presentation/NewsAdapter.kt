package com.example.presentation

    import android.view.LayoutInflater
    import android.view.ViewGroup
    import androidx.recyclerview.widget.RecyclerView
    import androidx.recyclerview.widget.DiffUtil
    import androidx.recyclerview.widget.ListAdapter
    import com.bumptech.glide.Glide
    import com.example.news_domain.model.Article
    import com.example.presentation.databinding.ViewHolderArticlesBinding


class NewsAdapter : ListAdapter<Article, NewsAdapter.MyViewHolder>(ArticleDiffCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val binding =
            ViewHolderArticlesBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MyViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    inner class MyViewHolder(private val viewDataBinding: ViewHolderArticlesBinding) :
        RecyclerView.ViewHolder(viewDataBinding.root) {

        fun bind(article: Article) {
            viewDataBinding.apply {
                Glide.with(viewDataBinding.root)
                    .load(article.urlToImage)
                    .into(viewDataBinding.ivArticle)
                tvHeadlines.text = article.title
                tvContent.text = article.content
            }
        }
    }

    private class ArticleDiffCallback : DiffUtil.ItemCallback<Article>() {
        override fun areItemsTheSame(oldItem: Article, newItem: Article): Boolean {
            return oldItem == newItem
        }

        override fun areContentsTheSame(oldItem: Article, newItem: Article): Boolean {
            return oldItem == newItem
        }
    }
}