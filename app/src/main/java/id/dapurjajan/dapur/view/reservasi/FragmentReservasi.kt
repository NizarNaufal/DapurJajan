package id.dapurjajan.dapur.view.reservasi

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import id.dapurjajan.dapur.R
import id.dapurjajan.dapur.view.reservasi.support.ReservasiAdapter
import id.dapurjajan.dapur.view.reservasi.support.ReservasiHelpers

class FragmentReservasi :Fragment(){
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        return inflater.inflate(R.layout.activity_reservasi, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }
    private fun initView(){
        val rvRecyclerView2 = view?.findViewById<RecyclerView>(R.id.rvReservasi)
        rvRecyclerView2?.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        val adapter2 = context?.let {
            ReservasiAdapter(
                    it, ReservasiHelpers.getVersionsList())
        }
        rvRecyclerView2?.adapter = adapter2
    }
}