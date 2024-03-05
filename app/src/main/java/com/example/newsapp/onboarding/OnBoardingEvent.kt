package com.example.newsapp.onboarding

sealed class OnBoardingEvent {
    object SaveAppEntry : OnBoardingEvent()
}