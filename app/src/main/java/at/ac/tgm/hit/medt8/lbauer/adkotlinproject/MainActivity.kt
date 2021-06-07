package at.ac.tgm.hit.medt8.lbauer.adkotlinproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val scroll : LinearLayout = findViewById(R.id.scrollLayout)
        for(i in 1..100){
            val media = Button(this.applicationContext)
            scroll.addView(media)
        }
    }

}