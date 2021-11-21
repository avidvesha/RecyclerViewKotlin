package com.example.RecyclerView_Avidvesha_03

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.hide()

        val superheroList = listOf<hero>(
            hero(
                R.drawable.avid,
                nameHero = "Avidvesha",
                descHero = "Spesies primata dengan populasi yang terbesar, persebaran yang paling luas, dan dicirikan dengan kemampuannya untuk berjalan di atas dua kaki serta otak yang kompleks yang mampu membuat peralatan, budaya, dan bahasa yang rumit."
            ),hero(
                R.drawable.krisna,
                nameHero = "Krisna",
                descHero = "Spesies primata dengan populasi yang terbesar, persebaran yang paling luas, dan dicirikan dengan kemampuannya untuk berjalan di atas dua kaki serta otak yang kompleks yang mampu membuat peralatan, budaya, dan bahasa yang rumit."
            ),hero(
                R.drawable.fafa,
                nameHero = "Fahrizal",
                descHero = "Spesies primata dengan populasi yang terbesar, persebaran yang paling luas, dan dicirikan dengan kemampuannya untuk berjalan di atas dua kaki serta otak yang kompleks yang mampu membuat peralatan, budaya, dan bahasa yang rumit."
            ),hero(
                R.drawable.bila,
                nameHero = "Nabila",
                descHero = "Spesies primata dengan populasi yang terbesar, persebaran yang paling luas, dan dicirikan dengan kemampuannya untuk berjalan di atas dua kaki serta otak yang kompleks yang mampu membuat peralatan, budaya, dan bahasa yang rumit."
            ),hero(
                R.drawable.alya,
                nameHero = "Alya",
                descHero = "Spesies primata dengan populasi yang terbesar, persebaran yang paling luas, dan dicirikan dengan kemampuannya untuk berjalan di atas dua kaki serta otak yang kompleks yang mampu membuat peralatan, budaya, dan bahasa yang rumit."
            ),hero(
                R.drawable.arel,
                nameHero = "Auerella",
                descHero = "Spesies primata dengan populasi yang terbesar, persebaran yang paling luas, dan dicirikan dengan kemampuannya untuk berjalan di atas dua kaki serta otak yang kompleks yang mampu membuat peralatan, budaya, dan bahasa yang rumit."
            )
            )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_hero)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = HeroAdapter(this, superheroList){
            val intent = Intent(this, DetailHeroActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)

        }
    }
}