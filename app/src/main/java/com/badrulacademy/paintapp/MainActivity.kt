package com.badrulacademy.paintapp

import android.graphics.Color
import android.graphics.Paint
import android.graphics.Path
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast
import com.badrulacademy.paintapp.PaintView.Companion.colorList
import com.badrulacademy.paintapp.PaintView.Companion.currentBrush
import com.badrulacademy.paintapp.PaintView.Companion.pathList

class MainActivity : AppCompatActivity() {


    //companion object treats like "public static" in Java
    companion object{
        var path = Path()
        var paintBrush = Paint()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.hide()

        val redBtn = findViewById<ImageButton>(R.id.red_color_id)
        val blueBtn = findViewById<ImageButton>(R.id.blue_color_id)
        val blackBtn = findViewById<ImageButton>(R.id.black_color_id)
        val clearBtn = findViewById<ImageButton>(R.id.clear_color_id)

        redBtn.setOnClickListener{
            Toast.makeText(this, "Clicked on RedButton", Toast.LENGTH_SHORT).show()
            paintBrush.setColor(Color.RED)
            currentColor(paintBrush.color)
        }

        blueBtn.setOnClickListener{
            Toast.makeText(this, "Clicked on BlueButton", Toast.LENGTH_SHORT).show()
            paintBrush.setColor(Color.BLUE)
            currentColor(paintBrush.color)

        }

        blackBtn.setOnClickListener{
            Toast.makeText(this, "Clicked on Black", Toast.LENGTH_SHORT).show()
            paintBrush.setColor(Color.BLACK)
            currentColor(paintBrush.color)

        }

        clearBtn.setOnClickListener{
            Toast.makeText(this, "Clicked on ClearButton", Toast.LENGTH_SHORT).show()
            pathList.clear()
            colorList.clear()
            path.reset()

        }

    }

    private fun currentColor(color: Int){
        currentBrush = color
        path = Path()

    }
}