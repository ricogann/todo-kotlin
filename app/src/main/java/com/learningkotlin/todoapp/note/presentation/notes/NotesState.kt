package com.learningkotlin.todoapp.note.presentation.notes

import com.learningkotlin.todoapp.note.domain.model.Note
import com.learningkotlin.todoapp.note.domain.util.NoteOrder
import com.learningkotlin.todoapp.note.domain.util.OrderType

data class NotesState(
    val notes: List<Note> = emptyList(),
    val noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending),
    val isOrderSectionVisible: Boolean = false
)
