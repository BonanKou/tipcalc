package edu.us.ischool.koub2.tipcalc

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button2 = findViewById<Button>(R.id.button2)


       val money = findViewById<EditText>(R.id.amountInput)

      button2.setOnClickListener{

       if (money.text.toString() !="$") {
                val input = money.text.toString().substring(1)
                val input1 = input.toDouble()
                Toast.makeText(this, "$" + doMath(input1), Toast.LENGTH_SHORT).show()
            }
        }
    }

    public fun doMath(money:Double):String {
        var result = (money * 100).toInt()
        var result2 = result * 0.15
        result = result2.toInt()
        result2 = String.format("%.2f", result.toDouble()).toDouble()

        return (result2 /100).toString()

    }
}
