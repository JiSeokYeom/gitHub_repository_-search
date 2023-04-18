package com.example.myapplication.view

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.bumptech.glide.Glide.init
import com.example.domain.GetGitHubDataUseCase
import com.example.domain.GitHubContent
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val gitHubDataUseCase: GetGitHubDataUseCase
) : ViewModel() {

    private val _gitHubData: MutableLiveData<GitHubContent> = MutableLiveData()
    val gitHubData: LiveData<GitHubContent> = _gitHubData


    init {
        initData()
    }

    private fun initData(){
        viewModelScope.launch {
            gitHubDataUseCase.searchRepositories(
                q = "ygs",
                10,
                1
            ).run {
                if (this.isSuccess){
                    _gitHubData.value = this.getOrNull()
                } else {
                    this.onFailure {
                        Log.d("테스트","실패 ${it.message}")
                    }
                }
            }
        }
    }
}