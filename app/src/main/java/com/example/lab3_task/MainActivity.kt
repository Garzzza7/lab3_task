package com.example.lab3_task

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

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

    }

    fun dicriminant(a: Double, b: Double, c: Double): String {
        val root1: Double;
        val root2: Double;
        val result: String;
        val determinant = a*a;
        if(determinant>0){
            root1=(-b + Math.sqrt(determinant))/(2*a);
            root2=(-b - Math.sqrt(determinant))/(2*a);
            result = "root1 is %.2f and root2 is %.2f".format(root1,root2);
            return result;


        }
        else if(determinant==0.0){
            root1 = -b/(2*a);
            result="There is only one root %.2f".format(root1);
            return result;


        }
        else {
            result="AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA";
            return result;

        }


    }
}
