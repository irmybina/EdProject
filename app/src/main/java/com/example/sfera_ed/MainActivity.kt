package com.example.sfera_ed

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.bumptech.glide.Glide
import com.example.sfera_ed.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var bindingClass : ActivityMainBinding
    private val image = "https://i.pinimg.com/originals/a8/87/03/a8870315e9d5d084722ff9c1ab5d2bee.jpg"

    private val adapter_chronicles = Chronicles_card_adapter()
    private val chroniclesCardsList = listOf(R.drawable.photo_1_q,
        R.drawable.photo_2_q,
        R.drawable.photo_3_q,
        R.drawable.photo_4_q,
        R.drawable.photo_5_q,
        R.drawable.photo_6_q,
        R.drawable.photo_7_q,
        R.drawable.photo_8_q,
        R.drawable.photo_5_q,
        R.drawable.photo_6_q,
        R.drawable.photo_7_q,
        R.drawable.photo_8_q)
    private var chroniclesCardIndex = 0

    private val adapter_moments = Moment_adapter()
    private val momentList = listOf(
        R.drawable.photo_1_moments,
        R.drawable.photo_2_moments,
        R.drawable.photo_3_moments,
        R.drawable.photo_1_moments,
        R.drawable.photo_2_moments,
        R.drawable.photo_3_moments
        )
    private var momentIndex = 0

    private val adapter_photoes = Photo_adapter()
    private val photoesList = listOf(R.drawable.photo_1,
    R.drawable.photo_2,
    R.drawable.photo_3,
    R.drawable.photo_3)
    private var photoesIndex = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)

        chr_card_init()
        moment_init()
        photo_init()


        bindingClass.apply {
            rcview2.adapter = adapter_chronicles
            rcviewMoments.adapter = adapter_moments
            rcview.adapter = adapter_photoes

            for (c in chroniclesCardsList){
                adapter_chronicles.addChroniclesCard(Chronicles_card(c))
            }

            for (m in momentList){
                adapter_moments.addMoment(Moment(m))
            }

            for (p in photoesList){
                adapter_photoes.addPhoto(Photo(p))
            }

        }



        Glide.with(this)
            .load(image)
            .fitCenter()
            .circleCrop()
            .into(bindingClass.avatar)

    }

    private fun chr_card_init(){
        bindingClass.apply {
            bindingClass.rcview2.layoutManager = GridLayoutManager(this@MainActivity, 3)
            rcview2.adapter = adapter_chronicles
//            butt.setOnClickListener {
//                if (chroniclesCardIndex>8) chroniclesCardIndex = 1
//                val chroniclesCard = Chronicles_card(chroniclesCardsList[chroniclesCardIndex])
//                adapter.addChroniclesCard(chroniclesCard)
//                chroniclesCardIndex++
//            }
        }
    }

    private fun moment_init(){
        bindingClass.apply {
//            bindingClass.rcview.layoutManager = LinearLayoutManager(this@MainActivity)
            rcviewMoments.adapter = adapter_moments
//            rcview_moment.adapter = adapter_moments
//            momentsAdd.setOnClickListener {
//                if (momentIndex>2) momentIndex = 2
//                val moment = Moment(momentList[momentIndex])
//                adapter_moments.addMoment(moment)
//                momentIndex++
//            }
        }
    }

    private fun photo_init(){
        bindingClass.apply {
//            bindingClass.rcview.layoutManager = LinearLayoutManager(this@MainActivity)
            rcview.adapter = adapter_photoes
//            rcview_moment.adapter = adapter_moments
//            momentsAdd.setOnClickListener {
//                if (momentIndex>2) momentIndex = 2
//                val moment = Moment(momentList[momentIndex])
//                adapter_moments.addMoment(moment)
//                momentIndex++
//            }
        }
    }
}