package com.satyam.swipenotes

class InMemoryNoteRepository {
    private val notes = mutableListOf<Note>()

    fun getAllNotes(): List<Note> = notes

    fun addNote(note: Note) {
        notes.add(note)
    }

    fun deleteNote(note: Note) {
        notes.remove(note)
    }
}