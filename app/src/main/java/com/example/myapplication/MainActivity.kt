package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    var ageResult : Int=0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (savedInstanceState!=null){
            ageResult=savedInstanceState.getInt("Age")
            AgeResult.setText(""+ageResult)

        }
        Calculate_btn.setOnClickListener {
            ageResult= Calendar.getInstance().get(Calendar.YEAR)-Integer.parseInt(firstname_edittxt.text.toString())
            AgeResult.setText(""+ageResult)

        }


    }
   override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt("Age",ageResult)
    }


}
