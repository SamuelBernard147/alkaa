package com.escodro.alkaa.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.escodro.alkaa.data.local.converter.DateConverter
import com.escodro.alkaa.data.local.dao.CategoryDao
import com.escodro.alkaa.data.local.dao.TaskDao
import com.escodro.alkaa.data.local.dao.TaskWithCategoryDao
import com.escodro.alkaa.data.local.model.Category
import com.escodro.alkaa.data.local.model.Task

/**
 * [Task] Database class.
 */
@Database(entities = [Task::class, Category::class], version = 1, exportSchema = false)
@TypeConverters(DateConverter::class)
abstract class TaskDatabase : RoomDatabase() {

    /**
     * Gets the [TaskDao].
     *
     * @return the [TaskDao]
     */
    abstract fun taskDao(): TaskDao

    /**
     * Gets the [TaskWithCategoryDao].
     *
     * @return the [TaskWithCategoryDao]
     */
    abstract fun taskWithCategoryDao(): TaskWithCategoryDao

    /**
     * Gets the [CategoryDao].
     *
     * @return the [CategoryDao]
     */
    abstract fun categoryDao(): CategoryDao
}
