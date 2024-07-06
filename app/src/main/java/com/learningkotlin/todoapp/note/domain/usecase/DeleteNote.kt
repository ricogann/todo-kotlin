package com.learningkotlin.todoapp.note.domain.usecase

import com.learningkotlin.todoapp.note.domain.model.Note
import com.learningkotlin.todoapp.note.domain.repository.NoteRepository

class DeleteNote (
    private val repository: NoteRepository
) {

    suspend operator fun invoke(note: Note) {
        repository.deleteNote(note)
    }
}