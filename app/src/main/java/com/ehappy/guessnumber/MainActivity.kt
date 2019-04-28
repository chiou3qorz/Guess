package com.ehappy.guessnumber

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val secretnumber=SecretNumber()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    Log.d("MainActivity","secret:"+secretnumber.secret)
    }

    fun check(view: View){
        val n=ed_number.text.toString().toInt()
        println("number: $n")
        Log.d("MainActivity","number"+n)
        val diff=secretnumber.validate(n)
        var message="Yes, You got it!"
        if (diff>0){
            message="Larger"
        }else if(diff<0){
            message="Smaller"
        }
//        Toast.makeText(this,message,Toast.LENGTH_LONG).show()
        AlertDialog.Builder(this)
            .setTitle("Message")
            .setMessage(message)
            .setPositiveButton("ok",null)
            .show()
    }
}
