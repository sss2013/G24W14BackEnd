package kr.ac.kumoh.s20190645.w24w14backend.repository

import kr.ac.kumoh.s20190645.w24w14backend.model.Song
import org.springframework.data.mongodb.repository.MongoRepository


interface SongRepository : MongoRepository<Song, String> {
    fun findBySinger(singer: String) : List<Song>
}