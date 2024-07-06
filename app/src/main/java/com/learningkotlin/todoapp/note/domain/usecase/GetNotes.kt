package com.learningkotlin.todoapp.note.domain.usecase

import com.learningkotlin.todoapp.note.domain.model.Note
import com.learningkotlin.todoapp.note.domain.repository.NoteRepository
import com.learningkotlin.todoapp.note.domain.util.NoteOrder
import com.learningkotlin.todoapp.note.domain.util.OrderType
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class GetNotes(
    private val repository: NoteRepository
) {

    operator fun invoke(
        noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending)
    ): Flow<List<Note>> {
        return repository.getNotes().map { notes ->
            when(noteOrder.orderType) {
                is OrderType.Ascending -> {
                    when (noteOrder) {
                        is NoteOrder.Title ->  notes.sortedBy { it.title.lowercase() }
                        is NoteOrder.Date -> notes.sortedBy { it.timestamp }
                        is NoteOrder.Color -> notes.sortedBy { it.color }
                    }
                }
                is OrderType.Descending -> {
                    when (noteOrder) {
                        is NoteOrder.Title ->  notes.sortedByDescending { it.title.lowercase() }
                        is NoteOrder.Date -> notes.sortedByDescending { it.timestamp }
                        is NoteOrder.Color -> notes.sortedByDescending { it.color }
                    }
                }
            }
        }
    }
}