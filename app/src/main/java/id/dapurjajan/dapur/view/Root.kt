package id.dapurjajan.dapur.view

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import id.dapurjajan.dapur.R
import id.dapurjajan.dapur.service.showActivity
import me.ibrahimsn.lib.CirclesLoadingView
import java.util.*


class Root : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        (findViewById<View>(R.id.loader1) as CirclesLoadingView)
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
