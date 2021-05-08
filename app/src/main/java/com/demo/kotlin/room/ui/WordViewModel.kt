package com.demo.kotlin.room.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import androidx.lifecycle.viewModelScope
import com.demo.kotlin.room.database.Word
import com.demo.kotlin.room.repository.WordRepository
import kotlinx.coroutines.launch

class WordViewModel(private val repository: WordRepository) : ViewModel() {

    val allWords: LiveData<List<Word>> = repository.allWords.asLiveData()

    fun insertWord(word: Word) = viewModelScope.launch {
            repository.insertWord(word)
        }

}