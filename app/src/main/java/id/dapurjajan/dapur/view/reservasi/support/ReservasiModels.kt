package id.dapurjajan.dapur.view.reservasi.support

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class ReservasiModels(
    val image_reservasi: Int,
    val reservasi_title: String,
) : Parcelable