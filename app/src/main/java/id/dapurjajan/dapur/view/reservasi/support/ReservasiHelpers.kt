package id.dapurjajan.dapur.view.reservasi.support

import id.dapurjajan.dapur.R


class ReservasiHelpers{
    companion object {
        fun <ArrayList> getVersionsList(): ArrayList {
            var reservasiList = ArrayList<ReservasiModels>()
            reservasiList.add(
                ReservasiModels(
                    R.drawable.paket_hajatan_details,
                    "Paket Hajatan",

                )
            )
            reservasiList.add(
                ReservasiModels(
                    R.drawable.paket_ulang_tahun,
                    "Paket Ulang Tahun",

                    )
            )
            reservasiList.add(
                ReservasiModels(
                    R.drawable.paket_hari_raya,
                    "Paket Hari Raya",

                    )
            )
            return reservasiList as ArrayList
        }
    }
}