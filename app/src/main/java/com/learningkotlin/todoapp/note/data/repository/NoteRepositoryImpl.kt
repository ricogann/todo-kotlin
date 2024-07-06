package com.learningkotlin.todoapp.note.data.repository

import com.learningkotlin.todoapp.note.data.source.NoteDao
import com.learningkotlin.todoapp.note.domain.model.Note
import com.learningkotlin.todoapp.note.domain.repository.NoteRepository
import kotlinx.coroutines.flow.Flow

class NoteRepositoryImpl(
    private val dao: NoteDao
) : NoteRepository {
    override fun getNotes(): Flow<List<Note>> {
        return dao.getNotes()
    }

    override suspend fun getNoteById(id: Int): Note? {
        return dao.getNoteById(id)
    }

    override suspend fun insertNote(note: Note) {
        return dao.insertNote(note)
    }

    override suspend fun deleteNote(note: Note) {
        return dao.deleteNote(note)
    }

}