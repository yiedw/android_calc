package com.example.calc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var number = findViewById(R.id.TextView_number) as TextView
        var temp: String = number.text.toString()
        var temp_number: Double = temp.toDouble()
        var condition: Int = 0
        //0 1+ 2- 3x 4/ 5%






//          ===============================number

        var one: Button = findViewById(R.id.one)
        var two: Button = findViewById(R.id.two)
        var three: Button = findViewById(R.id.three)
        var four: Button = findViewById(R.id.four)
        var five: Button = findViewById(R.id.five)
        var six: Button = findViewById(R.id.six)
        var seven: Button = findViewById(R.id.seven)
        var eight: Button = findViewById(R.id.eight)
        var nine: Button = findViewById(R.id.nine)
        var zero: Button = findViewById(R.id.zero)

        one.setOnClickListener {
            if (temp.equals("0"))
                temp = "1"
            else if(temp.length==2 && temp.first()=='-' &&temp.get(1)=='0'){
                temp="-1"
            }
            else
                temp += "1"
            TextView_number.setText(temp)
        }
        two.setOnClickListener {
            if (temp.equals("0"))
                temp = "2"
            else if(temp.length==2 && temp.first()=='-' &&temp.get(1)=='0'){
                temp="-2"
            }
            else
                temp += "2"
            TextView_number.setText(temp)
        }
        three.setOnClickListener {
            if (temp.equals("0"))
                temp = "3"
            else if(temp.length==2 && temp.first()=='-' &&temp.get(1)=='0'){
                temp="-3"
            }
            else
                temp += "3"
            TextView_number.setText(temp)
        }
        four.setOnClickListener {
            if (temp.equals("0"))
                temp = "4"
            else if(temp.length==2 && temp.first()=='-' &&temp.get(1)=='0'){
                temp="-4"
            }
            else
                temp += "4"
            TextView_number.setText(temp)
        }
        five.setOnClickListener {
            if (temp.equals("0"))
                temp = "5"
            else if(temp.length==2 && temp.first()=='-' &&temp.get(1)=='0'){
                temp="-5"
            }
            else
                temp += "5"
            TextView_number.setText(temp)
        }
        six.setOnClickListener {
            if (temp.equals("0"))
                temp = "6"
            else if(temp.length==2 && temp.first()=='-' &&temp.get(1)=='0'){
                temp="-6"
            }
            else
                temp += "6"
            TextView_number.setText(temp)
        }
        seven.setOnClickListener {
            if (temp.equals("0"))
                temp = "7"
            else if(temp.length==2 && temp.first()=='-' &&temp.get(1)=='0'){
                temp="-7"
            }
            else
                temp += "7"
            TextView_number.setText(temp)
        }
        eight.setOnClickListener {
            if (temp.equals("0"))
                temp = "8"
            else if(temp.length==2 && temp.first()=='-' &&temp.get(1)=='0'){
                temp="-8"
            }
            else
                temp += "8"
            TextView_number.setText(temp)
        }
        nine.setOnClickListener {
            if (temp.equals("0"))
                temp = "9"
            else if(temp.length==2 && temp.first()=='-' &&temp.get(1)=='0'){
                temp="-9"
            }
            else
                temp += "9"
            TextView_number.setText(temp)
        }
        zero.setOnClickListener {
            if (temp.equals("0"))
                temp = "0"
            else if(temp.length==2 && temp.first()=='-' &&temp.get(1)=='0'){
                temp="-0"
            }
            else
                temp += "0"
            TextView_number.setText(temp)
        }

//        ===============================symbol
        var hidden_number: Double = 0.0
        var plus: Button = findViewById(R.id.plus)
        var minus: Button = findViewById(R.id.minus)
        var mul: Button = findViewById(R.id.mul)
        var div: Button = findViewById(R.id.div)
        var rest: Button = findViewById(R.id.rest)
        var end: Button = findViewById(R.id.end)
        var ac: Button = findViewById(R.id.ac)
        var reverse: Button = findViewById(R.id.reverse)
        var point: Button = findViewById(R.id.point)



        plus.setOnClickListener {
            temp_number=temp.toDouble()
            temp="0"
            hidden_number = decide(condition, temp_number, hidden_number)
            condition = 1
            temp_number = 0.0
            if (hidden_number % 1.0 != 0.0)
                TextView_number.setText(hidden_number.toString())
            else
                TextView_number.setText(hidden_number.toLong().toString())
        }
        minus.setOnClickListener {
            temp_number=temp.toDouble()
            temp="0"
            hidden_number = decide(condition, temp_number, hidden_number)
            condition = 2
            temp_number = 0.0
            if (hidden_number % 1.0 != 0.0)
                TextView_number.setText(hidden_number.toString())
            else
                TextView_number.setText(hidden_number.toLong().toString())
        }
        mul.setOnClickListener {
            temp_number=temp.toDouble()
            temp="0"
            hidden_number = decide(condition, temp_number, hidden_number)
            condition = 3
            temp_number = 0.0
            if (hidden_number % 1.0 != 0.0)
                TextView_number.setText(hidden_number.toString())
            else
                TextView_number.setText(hidden_number.toLong().toString())
        }
        div.setOnClickListener {
            temp_number=temp.toDouble()
            temp="0"
            hidden_number = decide(condition, temp_number, hidden_number)
            condition = 4
            temp_number = 0.0
            if (hidden_number % 1.0 != 0.0)
                TextView_number.setText(hidden_number.toString())
            else
                TextView_number.setText(hidden_number.toLong().toString())
        }
        rest.setOnClickListener {
            temp_number=temp.toDouble()
            temp="0"
            hidden_number = decide(condition, temp_number, hidden_number)
            condition = 5
            temp_number = 0.0
            if (hidden_number % 1.0 != 0.0)
                TextView_number.setText(hidden_number.toString())
            else
                TextView_number.setText(hidden_number.toLong().toString())
        }
        end.setOnClickListener {
            temp_number=temp.toDouble()
            temp="0"
            hidden_number = decide(condition, temp_number, hidden_number)
            condition = 0
            if (hidden_number % 1.0 != 0.0)
                TextView_number.setText(hidden_number.toString())
            else
                TextView_number.setText(hidden_number.toLong().toString())
            temp_number = 0.0
        }
        ac.setOnClickListener {
            temp="0"
            condition = 0
            temp_number = 0.0
            hidden_number = 0.0
            TextView_number.setText("0")
        }
        reverse.setOnClickListener {
            if(temp.first().equals('-')){
                temp.removeRange(0,1)
            }
            else{
                temp="-".plus(temp)
            }
            TextView_number.setText(temp)

        }
        point.setOnClickListener {

            if(temp.indexOf('.')==-1){
                temp=temp.plus('.')
            }
            TextView_number.setText(temp)


        }


    }

    fun onClick(view: View) {
        when(R.id){
            R.id.one ->
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
