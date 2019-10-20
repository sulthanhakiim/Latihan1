package com.example.coffe.latihan1.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.coffe.latihan1.R

class ProfileFragment : Fragment(), View.OnClickListener {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater!!.inflate(R.layout.fragment_profile, container, false)
        val btn: Button = view.find(R.id.detail)
        btn.setOnClickListener(this)
        return view
    }
    companion object{
        fun newInstance(): ProfileFragment {
            val fragment = ProfileFragment()
            val args = Bundle()
            fragment.arguments = args
            return fragment
        }
    }

    override fun onClck(v: View?){
        when (v?.id){
            toast("Masuk Ke Detail Activity")
        }

        else -> {
            val intent = Intent(this@ProfileFragment.context, DetailProfilActivity::class.java)
            startActivity(intent)
        }
    }
}