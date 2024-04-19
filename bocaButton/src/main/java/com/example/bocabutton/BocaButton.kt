package com.example.bocabutton

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.ImageButton
import android.widget.LinearLayout
import android.widget.Toast

class BocaButton @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyle: Int = 0,
    defStyleRes: Int = 0
):LinearLayout(context, attrs,defStyle,defStyleRes) {

    init{
        LayoutInflater.from(context).inflate(R.layout.component_button_boca,this, true)
        val btn = findViewById<ImageButton>(R.id.btnBoca)
        btn.setOnClickListener {
            Toast.makeText(context, "BOCAAAAAAAA", Toast.LENGTH_SHORT).show()
        }
    }
}