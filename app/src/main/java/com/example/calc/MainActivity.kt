package com.example.calc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.system.exitProcess

class MainActivity : AppCompatActivity() {

    var condition: Int = 0
    var hidden_number: Double = 0.0
    var zero_check: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClick(view: View) {
        var number = findViewById(R.id.TextView_number) as TextView
        var temp: String = number.text.toString()
        if(temp.equals("Error"))
            temp="0"
        var temp_number: Double = temp.toDouble()

        var check: Boolean = false
        when (view.id) {
            R.id.one -> {
                if (temp.equals("0") || zero_check) {
                    zero_check = false
                    temp = "1"
                } else if (temp.length == 2 && temp.first() == '-' && temp.get(1) == '0') {
                    temp = "-1"
                } else
                    temp += "1"

            }
            R.id.two -> {
                if (temp.equals("0") || zero_check) {
                    temp = "2"
                    zero_check = false
                } else if (temp.length == 2 && temp.first() == '-' && temp.get(1) == '0') {
                    temp = "-2"
                } else
                    temp += "2"
            }
            R.id.three -> {
                if (temp.equals("0") || zero_check) {
                    temp = "3"
                    zero_check = false
                } else if (temp.length == 2 && temp.first() == '-' && temp.get(1) == '0') {
                    temp = "-3"
                } else
                    temp += "3"
            }
            R.id.four -> {
                if (temp.equals("0") || zero_check) {
                    temp = "4"
                    zero_check = false
                } else if (temp.length == 2 && temp.first() == '-' && temp.get(1) == '0') {
                    temp = "-4"
                } else
                    temp += "4"
            }
            R.id.five -> {
                if (temp.equals("0") || zero_check) {
                    temp = "5"
                    zero_check = false
                } else if (temp.length == 2 && temp.first() == '-' && temp.get(1) == '0') {
                    temp = "-5"
                } else
                    temp += "5"
            }
            R.id.six -> {
                if (temp.equals("0") || zero_check) {
                    temp = "6"
                    zero_check = false
                } else if (temp.length == 2 && temp.first() == '-' && temp.get(1) == '0') {
                    temp = "-6"
                } else
                    temp += "6"
                TextView_number.setText(temp)
            }
            R.id.seven -> {
                if (temp.equals("0") || zero_check) {
                    temp = "7"
                    zero_check = false
                } else if (temp.length == 2 && temp.first() == '-' && temp.get(1) == '0') {
                    temp = "-7"
                } else
                    temp += "7"
            }
            R.id.eight -> {
                if (temp.equals("0") || zero_check) {
                    temp = "8"
                    zero_check = false
                } else if (temp.length == 2 && temp.first() == '-' && temp.get(1) == '0') {
                    temp = "-8"
                } else
                    temp += "8"
            }
            R.id.nine -> {
                if (temp.equals("0") || zero_check) {
                    temp = "9"
                    zero_check = false
                } else if (temp.length == 2 && temp.first() == '-' && temp.get(1) == '0') {
                    temp = "-9"
                } else
                    temp += "9"
            }
            R.id.zero -> {
                if (temp.equals("0") || zero_check) {
                    temp = "0"
                    zero_check = false
                } else if (temp.length == 2 && temp.first() == '-' && temp.get(1) == '0') {
                    temp = "-0"
                } else
                    temp += "0"
            }

            R.id.plus -> {
                check = true
                hidden_number = decide(condition, temp_number, hidden_number)
                condition = 1
            }
            R.id.minus -> {
                check = true
                hidden_number = decide(condition, temp_number, hidden_number)
                condition = 2
            }
            R.id.mul -> {
                check = true
                hidden_number = decide(condition, temp_number, hidden_number)
                condition = 3
            }
            R.id.div -> {
                check = true
                hidden_number = decide(condition, temp_number, hidden_number)
                condition = 4
            }
            R.id.rest -> {
                check = true
                hidden_number = decide(condition, temp_number, hidden_number)
                condition = 5
            }
            R.id.end -> {
                check = true
                hidden_number = decide(condition, temp_number, hidden_number)
                condition = 0
            }
            R.id.ac -> {
                temp = "0"
                condition = 0
                hidden_number = 0.0
            }
            R.id.reverse -> {
                if (temp.first().equals('-')) {
                    temp.removeRange(0, 1)
                } else {
                    temp = "-".plus(temp)
                }
            }
            R.id.point -> {
                if (temp.indexOf('.') == -1) {
                    temp = temp.plus('.')
                }
                TextView_number.setText(temp)
            }
        }
        if (!check) {
//            TextView_number.textSize=1


            if (temp.length > 9)
                TextView_number.setTextSize(40f)
            else if (temp.length > 6)
                TextView_number.setTextSize(70f)
            else
                TextView_number.setTextSize(100f)
            if (temp.length > 18)
                TextView_number.setText("Error")
            else

                TextView_number.setText(temp)
        } else {
            zero_check = true
            if (hidden_number.toString().length > 18)
                TextView_number.setText("Error")
            if (hidden_number.toString().length > 9)
                TextView_number.setTextSize(40f)
            else if (hidden_number.toString().length > 6)
                TextView_number.setTextSize(70f)
            else
                TextView_number.setTextSize(100f)
            if (hidden_number.toString().length > 18)
                TextView_number.setText("Error")
            else {
                if (hidden_number % 1.0 != 0.0)
                    TextView_number.setText(hidden_number.toString())
                else
                    TextView_number.setText(hidden_number.toLong().toString())
            }
        }

    }


    fun decide(condition: Int, temp_number: Double, hidden_number: Double): Double {
        if (condition == 0) {
            return temp_number
        } else if (condition == 1)
            return temp_number + hidden_number
        else if (condition == 2)
            return hidden_number - temp_number
        else if (condition == 3)
            return hidden_number * temp_number
        else if (condition == 4)
            return hidden_number / temp_number
        else {
            return hidden_number % temp_number
        }

    }


}
