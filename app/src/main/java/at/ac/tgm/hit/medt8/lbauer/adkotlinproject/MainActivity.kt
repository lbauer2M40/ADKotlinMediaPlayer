package at.ac.tgm.hit.medt8.lbauer.adkotlinproject

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    private val eintrag: List<String> = arrayListOf<String>("Eintrag 1", "Eintrag 2", "Eintrag 3", "Eintrag 4", "Eintrag 5", "Eintrag 6")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var setListAdapter = ArrayAdapter(
                this,
                android.R.layout.simple_list_item_1, eintrag
            )

        var listView: ListView = findViewById(R.id.list)
        listView.adapter = setListAdapter

        val onClick : (AdapterView<*>?,View?,Int,Long) -> Unit = { parent: AdapterView<*>?, v: View?, position: Int, id: Long ->
            Toast.makeText(
                this, "Ihre Auswahl : " + eintrag[position],
                Toast.LENGTH_LONG
            ).show()
        }
        listView.setOnItemClickListener(onClick)
    }



}