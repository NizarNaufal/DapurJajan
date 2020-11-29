package id.dapurjajan.dapur.view.reservasi

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import id.dapurjajan.dapur.R
import id.dapurjajan.dapur.service.showToast
import id.dapurjajan.dapur.view.ActivityCartDetails
import id.dapurjajan.dapur.view.reservasi.support.ReservasiModels
import kotlinx.android.synthetic.main.activity_reservasi_details.*

class ActivityReservasiDetails : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reservasi_details)
        initView()
    }
    private fun initView(){
        val data = intent?.getParcelableExtra<ReservasiModels>("data")
        title_details?.text = data?.reservasi_title
        data?.image_reservasi?.let { image_coupon_details?.setImageResource(it) }
        checkin_edits?.setOnClickListener {
            datePicker()
        }
        tambahkan_barang?.setOnClickListener {
            val i = Intent(this, ActivityCartDetails::class.java)
            i.putExtra("title", data)
            startActivity(i)
            showToast("Barang Berhasil Di tambahkan")
        }
    }
    private fun datePicker(){

    }
}