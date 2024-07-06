package com.learningkotlin.todoapp.note.domain.util

sealed class OrderType {
    object Ascending: OrderType()
    object Descending: OrderType()
}
