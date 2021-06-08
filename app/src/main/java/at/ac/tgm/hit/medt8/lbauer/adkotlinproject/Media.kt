package at.ac.tgm.hit.medt8.lbauer.adkotlinproject

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Media (
    @PrimaryKey val id: Int,
    val url: String
    )