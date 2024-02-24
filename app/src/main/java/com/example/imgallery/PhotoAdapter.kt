package com.example.imgallery

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.imgallery.R
import com.squareup.picasso.Picasso

class PhotoAdapter(private val context: Context, private val photoList: List<String>) :
    RecyclerView.Adapter<PhotoAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_photo, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val imageUrl = photoList[position]
        Picasso.get().load(imageUrl).placeholder(R.drawable.placeholder_image).into(holder.imageView)
    }

    override fun getItemCount(): Int {
        return photoList.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.findViewById(R.id.imageViewPhoto)
    }
}
