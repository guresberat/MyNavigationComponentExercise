package com.example.mynavigationcomponentexercise

import android.annotation.SuppressLint
import android.os.Parcel
import android.os.Parcelable
import java.math.BigDecimal

@SuppressLint("ParcelCreator")
data class Money(val amount: BigDecimal) : Parcelable {
    override fun describeContents(): Int {
        TODO("Not yet implemented")
    }

    override fun writeToParcel(dest: Parcel?, flags: Int) {
        TODO("Not yet implemented")
    }

}


