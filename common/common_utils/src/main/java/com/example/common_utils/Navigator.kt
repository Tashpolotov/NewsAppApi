package com.example.common_utils

import android.app.Activity

interface Navigator {

    fun navigate(activity: Activity)

    interface Provider{
        fun getActivity(activities: Activities):Navigator
    }
}