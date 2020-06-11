package com.uabc.edu.mx.cicloActivity



import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        saludo.text="Ciclo de Vida de un Activity"


    }

    override fun onStart() {
        println("OnStart!!!!!!!!")

        super.onStart()
    }
    override fun onPause() {
        println("OnPause!!!!!!!!")

        super.onPause()
    }

    override fun onRestart() {
        println("OnRestart!!!!!!!!")

        super.onRestart()
    }

    override fun onResume() {
        println("OnRestart!!!!!!!!")

        super.onResume()
    }

    override fun onDestroy() {
        println("OnDestroy!!!!!!!!")

        super.onDestroy()
    }

    override fun onStop() {
        println("OnStop!!!!!!!!")

        super.onStop()
    }
}

