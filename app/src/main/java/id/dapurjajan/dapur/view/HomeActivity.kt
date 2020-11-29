package id.dapurjajan.dapur.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isGone
import androidx.fragment.app.FragmentTransaction
import id.dapurjajan.dapur.R
import id.dapurjajan.dapur.service.showActivity
import id.dapurjajan.dapur.view.chat.ActivityChat
import id.dapurjajan.dapur.view.reservasi.FragmentReservasi
import id.dapurjajan.dapur.view.riwayat.ActivityRiwayat
import kotlinx.android.synthetic.main.activity_main.*


class HomeActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
    }
    private fun initView(){
        card_reservasi?.setOnClickListener {
            val fragment = FragmentReservasi()
            val transaction: FragmentTransaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.contaner, fragment)
            transaction.commit()
            tvNameProduct?.isGone = true
        }
        chat?.setOnClickListener {
            showActivity(ActivityChat::class.java)
        }
        riwayat?.setOnClickListener {
            showActivity(ActivityRiwayat::class.java)
        }
    }
}