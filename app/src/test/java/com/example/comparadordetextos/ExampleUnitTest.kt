package com.example.comparadordetextos

import android.content.Context
import android.os.Bundle
import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.test.*
import org.junit.After
import org.junit.Assert.*
import org.junit.Before
import org.junit.Rule
import org.junit.Test

@OptIn(kotlinx.coroutines.ExperimentalCoroutinesApi::class)
class ExampleUnitTest {

    private lateinit var viewModel: MainActivity

    @get:Rule
    val instantTaskRule = InstantTaskExecutorRule()
    private val dispatcher = StandardTestDispatcher()

    @Before
    fun setup(){
        Dispatchers.setMain(dispatcher)
        viewModel = MainActivity()
    }

    @After
    fun tearDown(){
        Dispatchers.resetMain()
    }

    @Test
    fun textsAreNotEmpty() = runTest{
        //No supe como conectar este test con la MainActivity para verificar si los textos estaban vacios
    }

}