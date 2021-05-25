package com.example.yddc.model.database;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.yddc.BaseApp;
import com.example.yddc.model.bean.Word;

import kotlin.jvm.Synchronized;

/**
 * Author: RayleighZ
 * Time: 2021-05-25 16:42
 */
@Database(entities = {Word.class}, version = 1, exportSchema = false)
public abstract class WordsDatabase extends RoomDatabase {
    private static WordsDatabase database = null;

    abstract WordsDao wordsDao();

    @Synchronized
    public static WordsDatabase getInstance() {
        if (database == null) {
            synchronized (WordsDatabase.class) {
                if (database == null) {
                    database = Room.databaseBuilder(BaseApp.context,
                            WordsDatabase.class, "words_database")
                            .fallbackToDestructiveMigration()
                            .build();
                }
                return database;
            }
        } else {
            return database;
        }
    }
}
