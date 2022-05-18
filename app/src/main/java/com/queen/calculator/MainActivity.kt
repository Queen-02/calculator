package com.queen.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    //initializing edit texts
    lateinit var etNumberOne: EditText
    lateinit var etNumberTwo: EditText

    //initializing buttons
    lateinit var btnAdd: Button
    lateinit var btnSub: Button
    lateinit var btnMode: Button
    lateinit var btnMulti: Button

    //initializing texviews
    lateinit var tvResults : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //casting the edit texts
        etNumberOne = findViewById(R.id.etNumberOne)
        etNumberTwo = findViewById(R.id.etNumber2)

        //casting the buttons
        btnAdd = findViewById(R.id.btnAdd)
        btnSub = findViewById(R.id.btnSub)
        btnMode = findViewById(R.id.btnModulus)
        btnMulti = findViewById(R.id.btnMultiply)

        //casting the text view
        tvResults = findViewById(R.id.tvResult)


        //setting click listeners for each button
        btnAdd.setOnClickListener {
            val num1 = etNumberOne.text.toString()
            val num2 = etNumberTwo.text.toString()

            if (num1.isBlank()){
                etNumberOne.error = "First number required"
                return@setOnClickListener
            }
            if (num2.isBlank()){
                etNumberTwo.error = "Second number required"
                return@setOnClickListener
            }

            addValues(num1.toInt(), num2.toInt())
        }

        //subtract button
        btnSub.setOnClickListener {
            val num1 = etNumberOne.text.toString()
            val num2 = etNumberTwo.text.toString()

            if (num1.isBlank()){
                etNumberOne.error = "First number required"
                return@setOnClickListener
            }
            if (num2.isBlank()){
                etNumberTwo.error = "Second number required"
                return@setOnClickListener
            }
            subtractValues(num1.toInt(), num2.toInt())
        }

        //modulos button
        btnMode.setOnClickListener {
            val num1 = etNumberOne.text.toString()
            val num2 = etNumberTwo.text.toString()

            if (num1.isBlank()){
                etNumberOne.error = "First number required"
                return@setOnClickListener
            }
            if (num2.isBlank()){
                etNumberTwo.error = "Second number required"
                return@setOnClickListener
            }
            modulusValues(num1.toInt(), num2.toInt())
        }

        //multiply button
        btnMulti.setOnClickListener {
            val num1 = etNumberOne.text.toString()
            val num2 = etNumberTwo.text.toString()

            if (num1.isBlank()){
                etNumberOne.error = "First number required"
                return@setOnClickListener
            }
            if (num2.isBlank()){
                etNumberTwo.error = "Second number required"
                return@setOnClickListener
            }

            multipyValues(num1.toInt(), num2.toInt())
        }
    }

    fun addValues(num1: Int, num2: Int){
        val add = num1 + num2
        tvResults.text = add.toString()

    }

    fun subtractValues(num1: Int, num2: Int){
        val add = num1 - num2
        tvResults.text = add.toString()
    }

    fun modulusValues(num1: Int, num2: Int){
        val add = num1 % num2
        tvResults.text = add.toString()
    }

    fun multipyValues(num1: Int, num2: Int){
        val add = num1 * num2
        tvResults.text = add.toString()

    }
}