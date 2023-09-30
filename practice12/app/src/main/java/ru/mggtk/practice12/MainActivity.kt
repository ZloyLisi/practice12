package ru.mggtk.practice12

import android.opengl.Visibility
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.ImageView
import android.widget.RadioButton
import android.widget.RadioGroup
import androidx.core.view.isGone


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onRadioButtonClicked(view: View) {
        val image: ImageView = findViewById(R.id.imageView)
        val rb1: RadioButton = findViewById(R.id.radioButton1)
        val rb2: RadioButton = findViewById(R.id.radioButton2)

        if (rb1.isChecked)
        {
            image.setImageResource(R.drawable.apple)
        }
        else if(rb2.isChecked)
        {
            image.setImageResource(R.drawable.pear)
        }
        else {
            image.setImageResource(R.drawable.grape)
        }
    }
    fun onRadioCheckboxClicked(view: View) {
        val image1: ImageView = findViewById(R.id.imageView1)
        val image2: ImageView = findViewById(R.id.imageView2)
        val image3: ImageView = findViewById(R.id.imageView3)
        val checkBox: CheckBox = findViewById(R.id.checkBox)
        val checkBox2: CheckBox = findViewById(R.id.checkBox2)
        val checkBox3: CheckBox = findViewById(R.id.checkBox3)
        if (checkBox.isChecked){
            image1.setImageResource(R.drawable.apple)
            image1.visibility = View.VISIBLE
        }
        else {image1.visibility = View.INVISIBLE}
        if (checkBox2.isChecked){
            image2.setImageResource(R.drawable.pear)
            image2.visibility = View.VISIBLE
        }
        else {image2.visibility = View.INVISIBLE}
        if (checkBox3.isChecked){
            image3.setImageResource(R.drawable.grape)
            image3.visibility = View.VISIBLE
        }
        else {image3.visibility = View.INVISIBLE}
    }

}