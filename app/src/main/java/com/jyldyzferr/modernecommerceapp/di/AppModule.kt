package com.jyldyzferr.modernecommerceapp.di

import android.app.Application
import android.content.Context.MODE_PRIVATE
import com.google.firebase.auth.FirebaseAuth
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import com.google.firebase.ktx.Firebase
import dagger.hilt.components.SingletonComponent
import com.google.firebase.firestore.ktx.firestore
import com.jyldyzferr.modernecommerceapp.util.Constants.INTRODUCTION_SP
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideFirebaseAuth() = FirebaseAuth.getInstance()

    @Provides
    @Singleton
    fun provideFirebaseFirestoreDatabase() = Firebase.firestore

    @Provides
    fun provideIntroductionSP(
        application: Application
    ) = application.getSharedPreferences(INTRODUCTION_SP, MODE_PRIVATE)

//    @Provides
//    @Singleton
//    fun provideFirebaseCommon(
//        firebaseAuth: FirebaseAuth,
//        firestore: FirebaseFirestore
//    ) = FirebaseCommon(firestore,firebaseAuth)
//
//    @Provides
//    @Singleton
//    fun provideStorage() = FirebaseStorage.getInstance().reference
}