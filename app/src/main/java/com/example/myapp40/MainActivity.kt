package com.example.myapp40

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.example.myapp40.databinding.ActivityMainBinding
import timber.log.Timber



const val KEY_NAME ="name"


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    lateinit var name: String


    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Timber.i("onSaveInstanceState called")
        outState.putString(KEY_NAME, name)


    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        name = savedInstanceState.getString("name").toString()
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        Timber.i("onCreate called")
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        name = "unknown"
        binding.button.setOnClickListener { view: View? ->
            name = binding.editTextTextPersonName.text.toString()
            binding.textView.text = name
        }

        Timber.i("name=" + name)

        if (savedInstanceState != null) {
            name = savedInstanceState.getString(KEY_NAME).toString()

        }
        binding.textView.text = name

        override fun onResume() {
            super.onResume()
            Timber.i("onResume Called")
        }

        override fun onPause() {
            super.onPause()
            Timber.i("onPause Called")
        }

        override fun onStop() {
            super.onStop()
            Timber.i("onStop Called")
        }

        override fun onDestroy() {
            super.onDestroy()
            Timber.i("onDestroy Called")
        }

        override fun onRestart() {
            super.onRestart()
            Timber.i("onRestart Called")
        }
    }
}