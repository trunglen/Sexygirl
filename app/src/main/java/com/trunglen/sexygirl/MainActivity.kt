package com.trunglen.sexygirl

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import com.trunglen.sexygirl.adapter.GirlListAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val girls = arrayOf<String>(
                "https://www.thescottishsun.co.uk/wp-content/uploads/sites/2/2018/01/applecross-e1515685967768.jpg?strip=all&w=718",
                "https://www.thescottishsun.co.uk/wp-content/uploads/sites/2/2018/01/applecross-e1515685967768.jpg?strip=all&w=718",
                "https://www.thescottishsun.co.uk/wp-content/uploads/sites/2/2018/01/applecross-e1515685967768.jpg?strip=all&w=718",
                "https://www.thescottishsun.co.uk/wp-content/uploads/sites/2/2018/01/applecross-e1515685967768.jpg?strip=all&w=718"
        )
        val girlAdapter = GirlListAdapter(girls, this)
        girlList.layoutManager = GridLayoutManager(this,2)
        girlList.adapter = girlAdapter
        girlList.setHasFixedSize(true)
    }
}
