package com.example.calc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var number =findViewById(R.id.TextView_number) as TextView
        var temp:String=number.text.toString()
        var temp_number:Long=temp.toLong()


        var one:Button=findViewById(R.id.one)
        var two:Button=findViewById(R.id.two)
        var three:Button=findViewById(R.id.three)
        var four:Button=findViewById(R.id.four)
        var five:Button=findViewById(R.id.five)
        var six:Button=findViewById(R.id.six)
        var seven:Button=findViewById(R.id.seven)
        var eight:Button=findViewById(R.id.eight)
        var nine:Button=findViewById(R.id.nine)
        var zero:Button=findViewById(R.id.zero)

        one.setOnClickListener {
            temp_number=temp_number*10+1
            TextView_number.setText(temp_number.toString())
        }
        two.setOnClickListener {
            temp_number=temp_number*10+2
            TextView_number.setText(temp_number.toString())
        }
        three.setOnClickListener {
            temp_number=temp_number*10+3
            TextView_number.setText(temp_number.toString())
        }
        four.setOnClickListener {
            temp_number=temp_number*10+4
            TextView_number.setText(temp_number.toString())
        }
        five.setOnClickListener {
            temp_number=temp_number*10+5
            TextView_number.setText(temp_number.toString())
        }
        six.setOnClickListener {
            temp_number=temp_number*10+6
            TextView_number.setText(temp_number.toString())
        }
        seven.setOnClickListener {
            temp_number=temp_number*10+7
            TextView_number.setText(temp_number.toString())
        }
        eight.setOnClickListener {
            temp_number=temp_number*10+8
            TextView_number.setText(temp_number.toString())
        }
        nine.setOnClickListener {
            temp_number=temp_number*10+9
            TextView_number.setText(temp_number.toString())
        }
        zero.setOnClickListener {
            temp_number=temp_number*10+0
            TextView_number.setText(temp_number.toString())
        }
    }

}
