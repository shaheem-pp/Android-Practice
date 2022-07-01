package the.codeholic.dicee

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import the.codeholic.dicee.R.drawable

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var dice1 = findViewById<ImageView>(R.id.img1)
        var dice2 = findViewById<ImageView>(R.id.img2)
        var btn = findViewById<Button>(R.id.roll)
        var text = findViewById<TextView>(R.id.win)




        btn.setOnClickListener {
            var dice1Val = rollButton()
            var dice2Val = rollButton()
            dice1.setImageResource(dice1Val)
            dice2.setImageResource(dice2Val)

        }

    }

    fun rollButton(): Int {
        val rnds = (0..5).random()
        var drawableResource: Int = when (rnds) {
            0 -> R.drawable.dice_1
            1 -> R.drawable.dice_2
            2 -> R.drawable.dice_3
            3 -> R.drawable.dice_4
            4 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        return drawableResource
    }

}