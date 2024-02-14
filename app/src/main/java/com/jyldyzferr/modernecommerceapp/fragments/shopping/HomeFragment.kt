package com.jyldyzferr.modernecommerceapp.fragments.shopping

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.google.android.material.tabs.TabLayoutMediator
import com.jyldyzferr.modernecommerceapp.R
import com.jyldyzferr.modernecommerceapp.adapters.HomeViewpagerAdapter
import com.jyldyzferr.modernecommerceapp.databinding.FragmentHomeBinding
import com.jyldyzferr.modernecommerceapp.fragments.categories.AccessoryFragment
import com.jyldyzferr.modernecommerceapp.fragments.categories.ChairFragment
import com.jyldyzferr.modernecommerceapp.fragments.categories.CupboardFragment
import com.jyldyzferr.modernecommerceapp.fragments.categories.FurnitureFragment
import com.jyldyzferr.modernecommerceapp.fragments.categories.MainCategoryFragment
import com.jyldyzferr.modernecommerceapp.fragments.categories.TableFragment

class HomeFragment : Fragment(R.layout.fragment_home) {
    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val categoriesFragments = arrayListOf(
            MainCategoryFragment(),
            ChairFragment(),
            CupboardFragment(),
            TableFragment(),
            AccessoryFragment(),
            FurnitureFragment()
        )

        binding.viewpagerHome.isUserInputEnabled = false

        val viewPager2Adapter =
            HomeViewpagerAdapter(categoriesFragments, childFragmentManager, lifecycle)
        binding.viewpagerHome.adapter = viewPager2Adapter
        TabLayoutMediator(binding.tabLayout, binding.viewpagerHome) { tab, position ->
            when (position) {
                0 -> tab.text = "Main"
                1 -> tab.text = "Chair"
                2 -> tab.text = "Cupboard"
                3 -> tab.text = "Table"
                4 -> tab.text = "Accessory"
                5 -> tab.text = "Furniture"
            }
        }.attach()
    }
}