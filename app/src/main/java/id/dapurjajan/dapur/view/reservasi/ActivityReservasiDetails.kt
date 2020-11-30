package id.dapurjajan.dapur.view.reservasi

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.datepicker.MaterialDatePicker
import id.dapurjajan.dapur.R
import id.dapurjajan.dapur.service.showToast
import id.dapurjajan.dapur.view.ActivityCartDetails
import id.dapurjajan.dapur.view.reservasi.support.ReservasiModels
import kotlinx.android.synthetic.main.activity_reservasi_details.*
import java.text.SimpleDateFormat
import java.util.*

class ActivityReservasiDetails : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reservasi_details)
        initView()
        initToolbar()
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
        share?.setOnClickListener {
            val shareIntent = Intent(Intent.ACTION_SEND)
            shareIntent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
            shareIntent.type = "text/plain"
            shareIntent.putExtra(Intent.EXTRA_TEXT, "Ayo Pesan ${data?.reservasi_title}, Sekarang Juga di Aplikasi https://play.google.com/store/apps/details?id=id.dapurjajan.dapur")
            startActivity(shareIntent)
        }
    }
    private fun datePicker(){
        val builder = MaterialDatePicker.Builder.datePicker()
        val picker = builder.build()
        picker.addOnCancelListener {

        }
        picker.addOnPositiveButtonClickListener {
            val format = SimpleDateFormat("yyyy-MM-dd")
            val startdate = Date(it)
            val start = format.format(startdate)
            checkin_edits.setText("${start}")
        }

        picker.show(supportFragmentManager, picker.toString())
    }
    private fun initToolbar(){

    }
}