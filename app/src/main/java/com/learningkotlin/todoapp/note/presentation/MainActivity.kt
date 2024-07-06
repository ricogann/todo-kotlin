package com.learningkotlin.todoapp.note.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.learningkotlin.todoapp.ui.theme.TodoAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TodoAppTheme {
                
            }
        }
    }
}
