package kg.unicapp.my_color

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val red_btn = findViewById<Button>(R.id.red_btn)
        val yellow_btn = findViewById<Button>(R.id.yellow_btn)
        val green_btn = findViewById<Button>(R.id.green_btn)
        val colorView = findViewById<TextView>(R.id.mainView)
        val colorrext = findViewById<TextView>(R.id.colorText)


        red_btn.setOnClickListener{
            colorView.setBackgroundColor(Color.RED)
            red_btn.setBackgroundColor(Color.RED)
            colorrext.text = "КРАСНЫЙ" }

        yellow_btn.setOnClickListener {
            colorView.setBackgroundColor(Color.YELLOW)
            yellow_btn.setBackgroundColor(Color.YELLOW)
            colorrext.text = "ЖЕЛТЫЙ" }

        green_btn.setOnClickListener {
            colorView.setBackgroundColor(Color.GREEN)
            green_btn.setBackgroundColor(Color.GREEN)
            colorrext.text = "ЗЕЛЕНЫЙ" }


    }
}