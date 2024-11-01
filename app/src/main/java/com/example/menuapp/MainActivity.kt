package com.example.menuapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menufile, menu)

        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId){
            R.id.search -> {
                Toast.makeText(this, "You clicked search button!", Toast.LENGTH_LONG).show()
                true
            }
            R.id.folder -> {
                Toast.makeText(this, "You clicked folder button!", Toast.LENGTH_LONG).show()
                true
            }

            R.id.share -> {
                Toast.makeText(this, "You clicked share button!", Toast.LENGTH_LONG).show()
                true
            }

            R.id.addtofav -> {
                Toast.makeText(this, "You added this item to favourites!", Toast.LENGTH_LONG).show()
                true
            }
            else -> super.onOptionsItemSelected(item)

        }


    }
}