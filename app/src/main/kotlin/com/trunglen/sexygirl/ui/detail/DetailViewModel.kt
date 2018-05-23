package com.trunglen.sexygirl.ui.detail

import com.trunglen.sexygirl.data.remote.model.Repo
import com.trunglen.sexygirl.ui.base.AbstractViewModel
import javax.inject.Inject

class DetailViewModel @Inject constructor(val repo: Repo) : AbstractViewModel() {

    fun getName() = repo.fullName

    fun getDescription() = repo.description

    fun getStars() = repo.stars.toString()

    fun getForks() = repo.forks.toString()

    fun getAvatarURL() = repo.owner.avatarUrl

}