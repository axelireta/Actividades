package com.example.actividades

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class Heroe(val nombre: String, val nivel: Int, val vida: Int) : Parcelable