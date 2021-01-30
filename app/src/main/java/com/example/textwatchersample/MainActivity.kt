package com.example.textwatchersample

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val watcher = DynamicTextWatcher(
                onChanged = { s, _, _, _ ->
                    Toast.makeText(this, s, Toast.LENGTH_SHORT).show()
                })
        editText.addTextChangedListener(watcher)
    }
}
