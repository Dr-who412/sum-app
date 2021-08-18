package com.example.sumapp
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    lateinit var num1:EditText
    lateinit var num2:EditText
    lateinit var bt1:Button
    var tts=""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        num1=findViewById(R.id.num_1)
        num2=findViewById(R.id.num_2)
        bt1=findViewById(R.id.bt1)
        bt1.setOnClickListener {
            if (num1.text.toString().isEmpty() && num2.text.toString().isEmpty())
                Toast("pls Enter  frist value & second value ", this)
             else if (num1.text.toString().isEmpty())
                Toast("pls Enter  frist value", this)
             else if (num2.text.toString().isEmpty())
                Toast("pls Enter  socend value ", this)

            if (num1.text.toString().isNotEmpty() && num2.text.toString().isNotEmpty()) {
                Toast("sum=${(num1.text.toString().toDouble() + num2.text.toString().toDouble()).toString()}", this)
            }


                }
            }
        }
