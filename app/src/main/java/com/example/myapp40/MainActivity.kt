package com.example.myapp40

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.myapp40.databinding.ActivityMainBinding
import timber.log.Timber

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    lateinit var  name:string


    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        timber.i("onSaveInstanceState called")
        outState.putString("name",name)


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
        binding.button.setOnClickListener(view: view? ->
               name = binding.editTextTextPersonName.text.toString()
    }

      Timber.i("name="+name)

    override fun onStart() {
        super.onStart()
        Timber.i("onStart called")
        Timber.i("name="+name)
    }

    override fun onRestart() {
        super.onRestart()
        Timber.i("onRestart called")

    }

    override fun onPause() {
        super.onPause()
        Timber.i("onPause called")
    }

    override fun onStop() {
        super.onStop()
        Timber.i("onStop called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Timber.i("onDestroy called")
    }
}