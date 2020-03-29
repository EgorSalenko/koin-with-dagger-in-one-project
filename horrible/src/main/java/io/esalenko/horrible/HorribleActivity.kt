package io.esalenko.horrible

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import kotlinx.android.synthetic.main.activity_horrible.*
import org.koin.androidx.viewmodel.ext.android.viewModel


class HorribleActivity : AppCompatActivity(R.layout.activity_horrible) {

    private val viewModel: HorribleViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel.doSomeHorrible()
        viewModel.horribleLiveData.observe(this, Observer {
            text_horrible.text = it
        })
        text_horrible.setOnClickListener {
            viewModel.doSomeHorrible()
        }
    }

}