package io.esalenko.diinteraction.main

import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import io.esalenko.awesome.AwesomeActivity
import io.esalenko.diinteraction.AwesomeApplication
import io.esalenko.diinteraction.R
import io.esalenko.horrible.HorribleActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity(R.layout.activity_main) {

    private val viewModel: MainViewModel by viewModels()

    private val app by lazy { application as AwesomeApplication }

    override fun onCreate(savedInstanceState: Bundle?) {
        app.activityDelegate.inject(this)
        super.onCreate(savedInstanceState)
        viewModel.doSome()
        viewModel.mainLiveData.observe(this, Observer {
            random_word.text = it
        })
        random_word.setOnClickListener {
            viewModel.doSome()
        }
        btn_open_awesome.setOnClickListener {
            startActivity(Intent(this, AwesomeActivity::class.java))
        }
        btn_open_horrible.setOnClickListener {
            startActivity(Intent(this, HorribleActivity::class.java))
        }
    }
}
