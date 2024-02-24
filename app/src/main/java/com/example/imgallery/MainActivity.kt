package com.example.imgallery

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.imgallery.R

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var photoAdapter: PhotoAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize RecyclerView
        recyclerView = findViewById(R.id.recyclerViewPhotos)
        recyclerView.layoutManager = GridLayoutManager(this, 3) // Adjust the span count as needed

        // Sample list of image URLs (replace with your actual data)
        val imageUrls = listOf(
            "https://upload.wikimedia.org/wikipedia/en/a/a9/Example.jpg",
            "https://upload.wikimedia.org/wikipedia/commons/3/3f/JPEG_example_flower.jpg",
            "https://upload.wikimedia.org/wikipedia/commons/b/b2/JPEG_compression_Example.jpg",
            "https://upload.wikimedia.org/wikipedia/en/2/25/Channel_digital_image_CMYK_color.jpg",
            "https://upload.wikimedia.org/wikipedia/commons/b/b4/JPEG_example_JPG_RIP_100.jpg",
            "https://upload.wikimedia.org/wikipedia/commons/b/be/Tree_example_IR.jpg",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/3/3a/Cat03.jpg/481px-Cat03.jpg",
            "https://upload.wikimedia.org/wikipedia/commons/4/45/A_small_cup_of_coffee.JPG",
            "https://upload.wikimedia.org/wikipedia/commons/0/01/Jonquil_flowers_at_f5.jpg",
            "https://upload.wikimedia.org/wikipedia/commons/b/b2/Gary_Winnick_and_President_Ronald_Reagan_%2814442536058%29.jpg",
            "https://nothing.com/nothing.jpg",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/b/b7/Universum_TV_Multispiel_2006.jpg/1920px-Universum_TV_Multispiel_2006.jpg",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/6/6d/Good_Food_Display_-_NCI_Visuals_Online.jpg/1920px-Good_Food_Display_-_NCI_Visuals_Online.jpg",
            "https://upload.wikimedia.org/wikipedia/commons/f/f6/Bright_green_tree_-_Waikato.jpg",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/7/79/Josh_Hartnett_SDCC_2014.jpg/1280px-Josh_Hartnett_SDCC_2014.jpg",
            "https://upload.wikimedia.org/wikipedia/commons/e/e5/Eros_-_PIA02923_%28color%29.jpg",
            "https://upload.wikimedia.org/wikipedia/commons/c/c9/Ranch_style_home_in_Salinas%2C_California.JPG",
            // Add more image URLs as needed
        )

        // Initialize and set the adapter with the list of image URLs
        photoAdapter = PhotoAdapter(this, imageUrls)
        recyclerView.adapter = photoAdapter
    }
}
