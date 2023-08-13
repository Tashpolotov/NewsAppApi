package com.example.newsapp.navigation

import com.example.common_utils.Activities
import com.example.common_utils.Navigator
import com.example.presentation.NewsActivity
import com.example.search_presentation.SearchActivity


class DefaultNavigator: Navigator.Provider {
    override fun getActivity(activities: Activities): Navigator {
        return when(activities) {
            Activities.NewsActivity-> {
                NewsActivity.GotoNewsActivity
            }
            Activities.SearchActivity-> {
                SearchActivity.GoToSearchActivity}

        }
    }
}