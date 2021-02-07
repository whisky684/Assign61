package com.example.assign61

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        bplus.setOnClickListener() {
            var num1 = num1.text.toString()
            var num2 = num2.text.toString()
            var total = 0.00
            if (num1 == "" || num2 == "") {
                Toast.makeText(applicationContext,
                    "กรุณากรอก Number1 และ Number2 ให้ครบ",
                    Toast.LENGTH_LONG).show()
            } else {
                total = num1.toDouble() + num2.toDouble()
                sign.setText("+")
                sum.setText(total.toString())

            }
        }
        bminus.setOnClickListener() {
            var num1 = num1.text.toString()
            var num2 = num2.text.toString()
            var total = 0.00
            if (num1 == "" || num2 == "") {
                Toast.makeText(applicationContext,
                    "กรุณากรอก Number1 และ Number2 ให้ครบ",
                    Toast.LENGTH_LONG).show()
            } else {
                total = num1.toDouble() - num2.toDouble()
                sign.setText("-")
                sum.setText(total.toString())

            }
        }
        bmultiply.setOnClickListener() {
            var num1 = num1.text.toString()
            var num2 = num2.text.toString()
            var total = 0.00
            if (num1 == "" || num2 == "") {
               Toast.makeText(applicationContext,
                    "กรุณากรอก Number1 และ Number2 ให้ครบ",
                    Toast.LENGTH_LONG).show()
            } else {
                total = num1.toDouble() * num2.toDouble()
                sign.setText("x")
                sum.setText(total.toString())

            }

        }
        bdivider.setOnClickListener() {
            var num1 = num1.text.toString()
            var num2 = num2.text.toString()
            var total = 0.00
            if (num1 == "" || num2 == "") {
                Toast.makeText(applicationContext,
                    "กรุณากรอก Number1 และ Number2 ให้ครบ",
                    Toast.LENGTH_LONG).show()
            } else {
                total = num1.toDouble() / num2.toDouble()
                sign.setText("/")
                sum.setText(total.toString())

            }

        }
        bmodulo.setOnClickListener() {
            var num1 = num1.text.toString()
            var num2 = num2.text.toString()
            var total = 0.00
            if (num1 == "" || num2 == "") {
                Toast.makeText(applicationContext,
                    "กรุณากรอก Number1 และ Number2 ให้ครบ",
                    Toast.LENGTH_LONG).show()
            }
            else if(num2=="0") {
                  Toast.makeText(applicationContext, "ห้ามกรอกค่า Number2 = 0", Toast.LENGTH_LONG).show()
            }else {
                total = num1.toDouble() % num2.toDouble()
                sign.setText("%")
                sum.setText(total.toString())

            }

        }
        bclear.setOnClickListener(){
            num1.setText("")
            num2.setText("")
            sign.setText("")
            sum.setText("")
        }
    }
}