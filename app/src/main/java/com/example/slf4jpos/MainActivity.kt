package com.example.slf4jpos

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.testaar.Log4oFactory
import org.slf4j.impl.StaticLoggerBinder
import java.util.logging.Logger.getLogger


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



//        // SLF4J
//        val LOG: org.slf4j.impl.StaticLoggerBinder = StaticLoggerBinder.getSingleton(MainActivity::class.java)
//        LOG?.info("hello world")


    }
}