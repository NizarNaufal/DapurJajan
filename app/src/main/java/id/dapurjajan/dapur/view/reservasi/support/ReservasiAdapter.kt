package id.dapurjajan.dapur.view.reservasi.support

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.card.MaterialCardView
import id.dapurjajan.dapur.R
import id.dapurjajan.dapur.view.reservasi.ActivityReservasiDetails

class ReservasiAdapter(val context : Context, private val reservasiList: ArrayList<ReservasiModels>) : RecyclerView.Adapter<ReservasiAdapter.ViewHolder>() {

    override fun onBindViewHolder(p0: ViewHolder, p1: Int) {
        p0.txtTitleReservasi?.text = reservasiList[p1].reservasi_title
        p0.imageReservasi.setImageResource(reservasiList[p1].image_reservasi)
        p0.lytPosition.setOnClickListener { view1: View ->
            val intent = Intent(view1.context, ActivityReservasiDetails::class.java)
            intent.putExtra("data", reservasiList[p1])
            context.startActivity(intent)
        }
    }

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ViewHolder {
        val v = LayoutInflater.from(p0.context).inflate(R.layout.row_content_reservasi, p0, false)
        return ViewHolder(
            v
        )
    }

    override fun getItemCount(): Int {
        return reservasiList.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val txtTitleReservasi = itemView.findViewById<TextView>(R.id.sudah_jajan_belum)
        val lytPosition = itemView.findViewById<MaterialCardView>(R.id.material_reservasi)
        val imageReservasi = itemView.findViewById<ImageView>(R.id.image_content_reservasi)
    }
}