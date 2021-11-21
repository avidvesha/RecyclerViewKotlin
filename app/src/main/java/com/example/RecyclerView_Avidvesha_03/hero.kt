package com.example.RecyclerView_Avidvesha_03

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class hero (
    val imgHero: Int,
    val nameHero: String,
    val descHero: String
) : Parcelable
