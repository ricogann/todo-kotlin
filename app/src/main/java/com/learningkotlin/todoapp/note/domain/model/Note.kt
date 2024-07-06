package com.learningkotlin.todoapp.note.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.learningkotlin.todoapp.ui.theme.BabyBlue
import com.learningkotlin.todoapp.ui.theme.LightGreen
import com.learningkotlin.todoapp.ui.theme.RedOrange
import com.learningkotlin.todoapp.ui.theme.RedPink
import com.learningkotlin.todoapp.ui.theme.Violet

@Entity
data class Note(
    val title: String,
    val content: String,
    val timestamp: Long,
    val color: Int,
    @PrimaryKey val id:Int? = null
) {
    companion object {
        val noteColors = listOf(RedOrange, LightGreen, Violet, BabyBlue, RedPink)
    }
}
