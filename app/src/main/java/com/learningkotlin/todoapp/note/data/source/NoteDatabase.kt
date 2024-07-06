package com.learningkotlin.todoapp.note.data.source

import androidx.room.Database
import androidx.room.RoomDatabase
import com.learningkotlin.todoapp.note.domain.model.Note

@Database(
    entities = [Note::class],
    version = 1
)
abstract class NoteDatabase: RoomDatabase() {

    abstract val noteDao: NoteDao
}