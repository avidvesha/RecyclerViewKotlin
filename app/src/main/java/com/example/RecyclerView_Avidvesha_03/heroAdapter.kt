package com.example.RecyclerView_Avidvesha_03

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class HeroAdapter (private val context: Context, private val hero: List<hero>, val listener: (hero) -> Unit)
    : RecyclerView.Adapter<HeroAdapter.HeroViewHolder>() {

    class HeroViewHolder(view: View): RecyclerView.ViewHolder(view) {

        val imgHero = view.findViewById<ImageView>(R.id.img_item_photo)
        val nameHero = view.findViewById<TextView>(R.id.tv_item_name)
        val descHero = view.findViewById<TextView>(R.id.tv_item_description)

        fun bindView(superhero: hero, listener: (hero) -> Unit) {
            imgHero.setImageResource(superhero.imgHero)
            nameHero.text = superhero.nameHero
            descHero.text = superhero.descHero
            itemView.setOnClickListener {
                listener(superhero)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HeroViewHolder {
        return HeroViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_superhero, parent, false)
        )
    }

    override fun onBindViewHolder(holder: HeroViewHolder, position: Int) {
        holder.bindView(hero[position], listener)
    }

    override fun getItemCount(): Int = hero.size
}