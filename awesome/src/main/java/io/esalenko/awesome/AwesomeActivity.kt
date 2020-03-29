package io.esalenko.awesome

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import kotlinx.android.synthetic.main.activity_awesome.*
import org.koin.androidx.viewmodel.ext.android.viewModel


class AwesomeActivity : AppCompatActivity(R.layout.activity_awesome) {

    private val viewModel: AwesomeViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel.doSomeAwesome()
        viewModel.awesomeLiveData.observe(this, Observer {
            text_awesome.text = it
        })
        text_awesome.setOnClickListener {
            viewModel.doSomeAwesome()
        }
    }

}