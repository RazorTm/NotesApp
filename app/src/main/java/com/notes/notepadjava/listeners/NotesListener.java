package com.notes.notepadjava.listeners;

import com.notes.notepadjava.entity.Note;

public interface NotesListener {
    void onNoteClicked(Note note, int position);
}
