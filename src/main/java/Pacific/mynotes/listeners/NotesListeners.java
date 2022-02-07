package Pacific.mynotes.listeners;

import Pacific.mynotes.entities.Note;

public interface NotesListeners {
    void onNoteClicked(Note note, int position);
}
