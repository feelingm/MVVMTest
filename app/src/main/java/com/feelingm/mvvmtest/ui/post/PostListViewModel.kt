package com.feelingm.mvvmtest.ui.post

import com.feelingm.mvvmtest.base.BaseViewModel
import com.feelingm.mvvmtest.network.PostApi
import javax.inject.Inject

class PostListViewModel : BaseViewModel() {

    @Inject
    lateinit var postApi: PostApi


}