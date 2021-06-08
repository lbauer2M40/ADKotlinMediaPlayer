package at.ac.tgm.hit.medt8.lbauer.adkotlinproject

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface MediaDAO {

    @Insert
    fun insert(vararg media: Media)

    @Query("SELECT * FROM media")
    fun getAll(): List<Media>

    @Query("SELECT * FROM media WHERE id = :id")
    fun getOne(id: Int): Media
}