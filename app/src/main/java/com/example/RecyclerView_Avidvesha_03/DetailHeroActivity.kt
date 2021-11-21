package com.example.RecyclerView_Avidvesha_03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailHeroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_hero)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val hero = intent. getParcelableExtra<hero>(MainActivity.INTENT_PARCELABLE)

        val imgHero = findViewById<ImageView>(R.id.img_item_photo)
        val nameHero = findViewById<TextView>(R.id.tv_item_name)
        val descHero = findViewById<TextView>(R.id.tv_item_description)

        imgHero.setImageResource(hero?.imgHero!!)
        nameHero.text = hero.nameHero
        descHero.text = hero.descHero

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

}