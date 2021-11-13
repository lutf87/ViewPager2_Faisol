package com.faisol.viewpager2_faisol

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPagerAdapter(fragmentActivity: MainActivity) :
        FragmentStateAdapter(fragmentActivity){
            private val menu = 3
    override fun createFragment(position: Int): Fragment {
        when (position){
            0 -> {return FriendsFragment()}
            1 -> {return GithubFragment()}
            2 -> {return ProfileFragment()}
            else -> {return GithubFragment()}
        }
    }

    override fun getItemCount(): Int {
        return menu
    }
        }