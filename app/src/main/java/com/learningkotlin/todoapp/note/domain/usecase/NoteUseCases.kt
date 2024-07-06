package com.learningkotlin.todoapp.note.domain.usecase

data class NoteUseCases (
    val getNotes: GetNotes,
    val deleteNote: DeleteNote,
)