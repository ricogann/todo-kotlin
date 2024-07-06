package com.learningkotlin.todoapp.note.domain.usecase

import com.learningkotlin.todoapp.note.domain.model.InvalidNoteException
import com.learningkotlin.todoapp.note.domain.model.Note
import com.learningkotlin.todoapp.note.domain.repository.NoteRepository
import kotlin.jvm.Throws

class AddNote (
    private val repository: NoteRepository
) {
    @Throws(InvalidNoteException::class)
    suspend operator fun invoke(note: Note) {
        if (note.title.isBlank()) {
            throw InvalidNoteException("The title of the note can't be empty!")
        }
        if (note.content.isBlank()) {
            throw InvalidNoteException("The conteng of the note can't be empty!")
        }
        repository.insertNote(note)
    }
}