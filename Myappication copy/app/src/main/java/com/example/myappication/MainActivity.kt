package com.example.myappication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    var num1:Int = 0
    var ch = 0
    var pl = ""
    var sum = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn1.setOnClickListener{
            if (textView.text.toString() == "0"){

                textView.setText("1")
            }
            else{
                var str = textView.text.toString().plus(1)
                textView.setText(str)

            }
        }
        btn2.setOnClickListener{
            if (textView.text.toString() == "0"){
                textView.setText("2")
            }
            else{
                var str = textView.text.toString().plus(2)
                textView.setText(str)
            }
        }
        btn3.setOnClickListener{
            if (textView.text.toString() == "0"){
                textView.setText("3")
            }
            else{
                var str = textView.text.toString().plus(3)
                textView.setText(str)
            }
        }
        btn4.setOnClickListener{
            if (textView.text.toString() == "0"){
                textView.setText("4")
            }
            else{
                var str = textView.text.toString().plus(4)
                textView.setText(str)
            }
        }
        btn5.setOnClickListener{
            if (textView.text.toString() == "0"){
                textView.setText("5")
            }
            else{
                var str = textView.text.toString().plus(5)
                textView.setText(str)
            }
        }
        btn6.setOnClickListener{
            if (textView.text.toString() == "0"){
                textView.setText("6")
            }
            else{
                var str = textView.text.toString().plus(6)
                textView.setText(str)
            }
        }
        btn7.setOnClickListener{
            if (textView.text.toString() == "0"){
                textView.setText("7")
            }
            else{
                var str = textView.text.toString().plus(7)
                textView.setText(str)
            }
        }
        btn8.setOnClickListener{
            if (textView.text.toString() == "0"){
                textView.setText("8")
            }
            else{
                var str = textView.text.toString().plus(8)
                textView.setText(str)
            }
        }
        btn9.setOnClickListener{
            if (textView.text.toString() == "0"){
                textView.setText("9")
            }
            else{
                var str = textView.text.toString().plus(9)
                textView.setText(str)
            }
        }
        btn0.setOnClickListener{
            if (textView.text.toString() == "0"){

            }
            else {
                var str = textView.text.toString().plus(0)
                textView.setText(str)
            }
        }

        btnclear.setOnClickListener{
            textView.setText("0")
        }

        btndel.setOnClickListener{
            if(textView.text.toString().length<=1){
                textView.setText("0")
            }
            else if(textView.text.isNotEmpty()) {
                textView.text=textView.text.dropLast(1)
            }
        }
        bplus.setOnClickListener {
            num1 = textView.text.toString().toInt()
            ch = 1
            pl = "plus"
        }

        bminus.setOnClickListener {
            num1 = textView.text.toString().toInt()
            ch = 1
            pl = "minus"
        }

        bmul.setOnClickListener {
            num1 = textView.text.toString().toInt()
            ch = 1
            pl = "mul"
        }

        bdiv.setOnClickListener {
            num1 = textView.text.toString().toInt()
            ch = 1
            pl = "div"
        }

        bmod.setOnClickListener {
            num1 = textView.text.toString().toInt()
            ch = 1
            pl = "mod"
        }
        bequal.setOnClickListener {
            if(pl == "plus") {
                sum = num1 + textView.text.toString().toInt()
                textView.setText(sum.toString())
            }
            else if (pl == "minus"){
                sum = num1 - textView.text.toString().toInt()
                textView.setText(sum.toString())

            }
            else if (pl == "mul"){
                sum = num1 * textView.text.toString().toInt()
                textView.setText(sum.toString())
            }
            else if (pl == "div"){
                sum = num1 / textView.text.toString().toInt()
                textView.setText(sum.toString())
            }
            else if (pl == "mod"){

                sum = num1 % textView.text.toString().toInt()

                textView.setText(sum.toString())
            }

        }
        }
    }