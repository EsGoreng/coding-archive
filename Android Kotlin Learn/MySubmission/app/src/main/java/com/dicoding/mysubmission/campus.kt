package com.dicoding.mysubmission

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Campus(
    val name: String,
    val description: String,
    val photo: Int,
    val activityClass: Class<*>
) : Parcelable
