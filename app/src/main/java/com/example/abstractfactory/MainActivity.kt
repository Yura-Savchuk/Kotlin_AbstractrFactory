package com.example.abstractfactory

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.example.abstractfactory.factory.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView: TextView = findViewById(R.id.textView) as TextView
        val imageView: ImageView = findViewById(R.id.imageView) as ImageView

        val factory: AbstractFactory = getFactory(Role.GUEST)
        val title: Title = factory.createTitle()
        val content: Content = factory.createContent()

        textView.setText(title.getTitle(this))
        imageView.setImageDrawable(content.getImage(this))
    }
}
