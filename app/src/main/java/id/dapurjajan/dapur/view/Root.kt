package id.dapurjajan.dapur.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import id.dapurjajan.dapur.R
import id.dapurjajan.dapur.service.showActivity
import java.util.*


class Root : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        val myTimer = Timer()
        myTimer.schedule(object : TimerTask() {
            override fun run() {
                runOnUiThread {
                    showActivity(HomeActivity::class.java)
                }
            }
        }, 500)
    }
}
