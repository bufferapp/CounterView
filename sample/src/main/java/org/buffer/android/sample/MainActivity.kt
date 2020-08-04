package org.buffer.android.sample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import org.buffer.android.counterview.CounterMode

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        view_counter.counterMode = CounterMode.ASCENDING
        view_counter.charactersRemainingUntilCounterDisplay = 5
        view_counter.counterMaxLength = 10
        view_counter.attachToEditText(view_input)
    }
}
