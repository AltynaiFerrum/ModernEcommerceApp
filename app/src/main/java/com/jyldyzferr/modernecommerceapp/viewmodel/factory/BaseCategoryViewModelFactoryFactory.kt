package com.jyldyzferr.modernecommerceapp.viewmodel.factory

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.google.firebase.firestore.FirebaseFirestore
import com.jyldyzferr.modernecommerceapp.data.Category
import com.jyldyzferr.modernecommerceapp.viewmodel.CategoryViewModel

class BaseCategoryViewModelFactoryFactory (
    private val firestore: FirebaseFirestore,
    private val category: Category
): ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return CategoryViewModel(firestore, category) as T
    }
}