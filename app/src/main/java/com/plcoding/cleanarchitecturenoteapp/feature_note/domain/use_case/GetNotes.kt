package com.plcoding.cleanarchitecturenoteapp.feature_note.domain.use_case

import com.plcoding.cleanarchitecturenoteapp.feature_note.domain.repository.NoteRepository

class GetNotes(
    private val repository: NoteRepository
) {
}