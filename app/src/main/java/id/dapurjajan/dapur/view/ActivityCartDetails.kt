package id.dapurjajan.dapur.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import id.dapurjajan.dapur.R
import id.dapurjajan.dapur.view.reservasi.support.ReservasiModels
import kotlinx.android.synthetic.main.activity_cart.*

class ActivityCartDetails : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cart)
        val data = intent?.getParcelableExtra<ReservasiModels>("data")

        data?.image_reservasi?.let { image_pesanan?.setImageResource(it) }
        data?.reservasi_title?.let { text_title_rv?.setText(it) }

    }
}