package com.example.sfera_ed

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.sfera_ed.databinding.PhotoItemBinding

class Photo_adapter : RecyclerView.Adapter<Photo_adapter.Photo_holder>() {
    val photoList = ArrayList<Photo>()

    class Photo_holder(item : View) : RecyclerView.ViewHolder(item){
        val binding = PhotoItemBinding.bind(item)
        fun bind(photo: Photo) = with(binding){
            photoImage.setImageResource(photo.imageId)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Photo_holder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.photo_item, parent, false)
        return Photo_holder(view)
    }

    override fun onBindViewHolder(holder: Photo_adapter.Photo_holder, position: Int) {
        holder.bind(photoList[position])
    }

    override fun getItemCount(): Int {
        return photoList.size
    }

    fun addPhoto(photo: Photo){
        photoList.add(photo)
        notifyDataSetChanged()
    }
}