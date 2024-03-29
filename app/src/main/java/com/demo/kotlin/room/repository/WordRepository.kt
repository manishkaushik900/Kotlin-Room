package com.demo.kotlin.room.repository

import androidx.annotation.WorkerThread
import com.demo.kotlin.room.database.Word
import com.demo.kotlin.room.database.WordDao
import kotlinx.coroutines.flow.Flow

class WordRepository(private val wordDao: WordDao) {

    val allWords:Flow<List<Word>> = wordDao.getAlphabetizedWords()

    @WorkerThread
    suspend fun insertWord(word: Word){
        wordDao.insert(word)
    }
}