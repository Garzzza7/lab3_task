package com.example.lab3_task

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val A = findViewById<EditText>(R.id.Ainput)
        val B = findViewById<EditText>(R.id.Binput)
        val C = findViewById<EditText>(R.id.Cinput)


        val button = findViewById<Button>(R.id.calculate_button)
        val clearButton = findViewById<Button>(R.id.clear_button)

        val result1 = findViewById<TextView>(R.id.textView2)
        val result2 = findViewById<TextView>(R.id.textView3)

        clearButton.setOnClickListener{
            A.setText("")
            B.setText("")
            C.setText("")
            result1.setText("")
            result2.setText("")
        }

        button.setOnClickListener{
            var vala = A.text.toString().toDouble()
            if(vala==0.0){
                result1.setText("It is a linear equation")
                result2.setText("A cannot be 0!!!")
            } else {
                var valb = B.text.toString().toDouble()
                var valc = C.text.toString().toDouble()
                var root1: Double
                var root2: Double

                var dicriminant = valb*valb-4*vala*valc
                val realPart = -valb / (2 * vala)
                val imaginaryPart = Math.sqrt((-dicriminant)) / (2 * vala)


                if(dicriminant>0.0){
                    root1= ((-valb + Math.sqrt(dicriminant))/(2*vala));
                    root2= ((-valb - Math.sqrt(dicriminant))/(2*vala));
                    result1.setText(root1.toString())
                    result2.setText(root2.toString())
                }
                else if(dicriminant==0.0){
                    root1 = ((-valb/(2*vala)))
                    result1.setText("Only one solution: "+root1.toString())
                    result2.setText("/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\")

                }
                else if(dicriminant<0.0){
                    result1.setText(realPart.toString()+"+"+imaginaryPart.toString()+"i")
                    result2.setText(realPart.toString()+"-"+imaginaryPart.toString()+"i")
                }
            }

        }
    }
}


