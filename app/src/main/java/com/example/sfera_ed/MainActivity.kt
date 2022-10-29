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

    private val adapter = Chronicles_card_adapter()
    private val chroniclesCardsList = listOf(R.drawable.add_q, R.drawable.photo_1_q,
        R.drawable.photo_2_q,
        R.drawable.photo_3_q,
        R.drawable.photo_4_q,
        R.drawable.photo_5_q,
        R.drawable.photo_6_q,
        R.drawable.photo_7_q,
        R.drawable.photo_8_q)
    private var chroniclesCardIndex = 0

    private val adapter2 = Moment_adapter()
    private val momentList = listOf(
        R.drawable.add,
        R.drawable.photo_1_moments,
        R.drawable.photo_2_moments,
        R.drawable.photo_3_moments
        )
    private var momentIndex = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)

        chr_card_init()
        moment_init()


        bindingClass.apply {
            rcview2.adapter = adapter
            rcview.adapter = adapter2
            val chroniclesCard = Chronicles_card(chroniclesCardsList[0])
            adapter.addChroniclesCard(chroniclesCard)

            val chroniclesCard1 = Chronicles_card(chroniclesCardsList[1])
            adapter.addChroniclesCard(chroniclesCard1)

            val chroniclesCard2 = Chronicles_card(chroniclesCardsList[2])
            adapter.addChroniclesCard(chroniclesCard2)

            val chroniclesCard3 = Chronicles_card(chroniclesCardsList[3])
            adapter.addChroniclesCard(chroniclesCard3)

            val chroniclesCard4 = Chronicles_card(chroniclesCardsList[4])
            adapter.addChroniclesCard(chroniclesCard4)

            val chroniclesCard5 = Chronicles_card(chroniclesCardsList[5])
            adapter.addChroniclesCard(chroniclesCard5)

            val chroniclesCard6 = Chronicles_card(chroniclesCardsList[6])
            adapter.addChroniclesCard(chroniclesCard6)

            val chroniclesCard7 = Chronicles_card(chroniclesCardsList[7])
            adapter.addChroniclesCard(chroniclesCard1)

            val chroniclesCard8 = Chronicles_card(chroniclesCardsList[8])
            adapter.addChroniclesCard(chroniclesCard8)

            val momentCard = Moment(momentList[0])
            adapter2.addMoment(momentCard)

            val momentCard1 = Moment(momentList[1])
            adapter2.addMoment(momentCard1)

            val momentCard2 = Moment(momentList[2])
            adapter2.addMoment(momentCard2)

            val momentCard3 = Moment(momentList[3])
            adapter2.addMoment(momentCard3)

            val momentCard4 = Moment(momentList[3])
            adapter2.addMoment(momentCard4)

        }



        Glide.with(this)
            .load(image)
            .fitCenter()
            .circleCrop()
            .into(bindingClass.avatar)

        Glide.with(this)
            .load(R.drawable.photo_1)
            .into(bindingClass.photo1)

        Glide.with(this)
            .load(R.drawable.photo_2)
            .into(bindingClass.photo2)

        Glide.with(this)
            .load(R.drawable.photo_3)
            .into(bindingClass.photo3)

        Glide.with(this)
            .load(R.drawable.photo_3)
            .into(bindingClass.photo4)

//        Glide.with(this)
//            .load(R.drawable.add)
//            .into(bindingClass.momentsAdd)

//        Glide.with(this)
//            .load(R.drawable.photo_1_moments)
//            .into(bindingClass.moments1)
//
//        Glide.with(this)
//            .load(R.drawable.photo_2_moments)
//            .into(bindingClass.moments2)
//
//        Glide.with(this)
//            .load(R.drawable.photo_3_moments)
//            .into(bindingClass.moments3)
//
//        Glide.with(this)
//            .load(R.drawable.photo_3_moments)
//            .into(bindingClass.moments4)

//        Glide.with(this)
//            .load(R.drawable.add_q)
//            .into(bindingClass.photoChroniclesAdd)
//
//        Glide.with(this)
//            .load(R.drawable.photo_1_q)
//            .into(bindingClass.photoChronicles1)
//
//        Glide.with(this)
//            .load(R.drawable.photo_2_q)
//            .into(bindingClass.photoChronicles2)
//
//        Glide.with(this)
//            .load(R.drawable.photo_3_q)
//            .into(bindingClass.photoChronicles3)
//
//        Glide.with(this)
//            .load(R.drawable.photo_4_q)
//            .into(bindingClass.photoChronicles4)
//
//        Glide.with(this)
//            .load(R.drawable.photo_5_q)
//            .into(bindingClass.photoChronicles5)
//
//        Glide.with(this)
//            .load(R.drawable.photo_6_q)
//            .into(bindingClass.photoChronicles6)
//
//        Glide.with(this)
//            .load(R.drawable.photo_7_q)
//            .into(bindingClass.photoChronicles7)
//
//        Glide.with(this)
//            .load(R.drawable.photo_8_q)
//            .into(bindingClass.photoChronicles8)


    }

    private fun chr_card_init(){
        bindingClass.apply {
            bindingClass.rcview2.layoutManager = CustomGridLayoutManager(this@MainActivity, 3)
            rcview2.adapter = adapter
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
            rcview.adapter = adapter2
//            momentsAdd.setOnClickListener {
//                if (momentIndex>2) momentIndex = 2
//                val moment = Moment(momentList[momentIndex])
//                adapter2.addMoment(moment)
//                momentIndex++
//            }
        }
    }
}