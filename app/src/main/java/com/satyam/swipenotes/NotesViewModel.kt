package com.satyam.swipenotes

import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel

class NotesViewModel : ViewModel() {
    private val _notes = mutableStateListOf<Note>()
    val notes: List<Note> get() = _notes

    fun addNote(title: String, content: String) {
        val note = Note(title = title, content = content)
        _notes.add(0, note) // Add at top
    }

    fun deleteNote(note: Note) {
        val index = _notes.indexOfFirst { it.id == note.id }
        if (index != -1) _notes.removeAt(index)
    }

    fun updateNote(updatedNote: Note) {
        val index = _notes.indexOfFirst { it.id == updatedNote.id }
        if (index != -1) {
            _notes[index] = updatedNote
        }
    }
}
