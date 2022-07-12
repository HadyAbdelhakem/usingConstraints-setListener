package com.hady.constraints

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

import com.hady.constraints.databinding.ActivityMainBinding
import androidx.databinding.DataBindingUtil

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        /*etContentView(R.layout.activity_main)*/
        binding = DataBindingUtil.setContentView(this , R.layout.activity_main)
        setListeners()
    }

    private fun setListeners(){
        val Clickableview: List<View> =
            listOf(binding.box1 , binding.box2 , binding.box3 ,
            binding.box4 , binding.box5 , binding.constraintsLayout ,
            binding.greenButton , binding.redButton , binding.yellowButton)

        for (item in Clickableview){
            item.setOnClickListener { makeColored(it) }
        }
     }

    private
    fun makeColored(view: View){
        when (view.id){
            R.id.box1 -> view.setBackgroundColor(Color.GREEN)
            R.id.box2 -> view.setBackgroundColor(Color.GRAY)
            R.id.box3 -> view.setBackgroundColor(Color.BLUE)
            R.id.box4 -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box5 -> view.setBackgroundColor(Color.LTGRAY)
            R.id.redButton -> binding.box3.setBackgroundColor(Color.RED)
            R.id.greenButton -> binding.box4.setBackgroundColor(Color.GREEN)
            R.id.yellowButton -> Toast.makeText(this , "Yellow OWW" , Toast.LENGTH_SHORT).show()
            /*binding.box5.setBackgroundColor(Color.YELLOW)*/


            else -> view.setBackgroundColor(Color.WHITE)
        }
    }
}