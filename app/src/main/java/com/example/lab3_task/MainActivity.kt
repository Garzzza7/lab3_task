package com.example.lab3_task

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
/*
        val A:EditText=findViewById(R.id.Ainput);
        val B:EditText=findViewById(R.id.Binput);
        val C:EditText=findViewById(R.id.Cinput);

        val txt:TextView=findViewById(R.id.textView2)

        val AA: Double=A.text.toString().toDouble()
        val BB: Double=B.text.toString().toDouble()
        val CC: Double=C.text.toString().toDouble()

        val btn: Button=findViewById(R.id.calculate_button)

        btn.setOnClickListener{
            txt.text=dicriminant(AA,BB,CC)
        }
*/
        val A = findViewById<EditText>(R.id.Ainput)
        val B = findViewById<EditText>(R.id.Binput)
        val C = findViewById<EditText>(R.id.Cinput)


        val button = findViewById<Button>(R.id.calculate_button)

        val result = findViewById<TextView>(R.id.textView2)

        button.setOnClickListener{

            var vala = A.text.toString().toInt()
            var valb = B.text.toString().toInt()
            var valc = C.text.toString().toInt()
            var root1: Double
            var root2: Double
            var result1: String;

            var dicriminant = valb*valb-4*vala*valc
            val realPart = -valb / (2 * vala)
            val imaginaryPart = Math.sqrt((-dicriminant).toDouble()) / (2 * vala)

            if(dicriminant>0){
                root1= ((-valb + Math.sqrt(dicriminant.toDouble()))/(2*vala));
                root2= ((-valb - Math.sqrt(dicriminant.toDouble()))/(2*vala));
                result1 = "root1 is %.2f and root2 is %.2f".format(root1,root2);
                result.setText(root1.toString()+" and "+root2.toString())
                //result.setText(determinant.toString())
            }
            else if(dicriminant==0){
                root1 = ((-valb/(2*vala)).toDouble())
                result1="There is only one root %.2f".format(root1);
                result.setText("Only one solution: "+root1.toString())
                //result.setText(determinant.toString())
            }
            else if(dicriminant<0.0){
                result.setText(realPart.toString()+"+"+imaginaryPart.toString()+"i  and  "+realPart.toString()+"-"+imaginaryPart.toString()+"i")
            }
        }
    }
}


