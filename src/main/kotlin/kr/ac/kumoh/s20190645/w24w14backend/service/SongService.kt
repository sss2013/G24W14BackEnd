package kr.ac.kumoh.s20190645.w24w14backend.service

import kr.ac.kumoh.s20190645.w24w14backend.model.Song
import org.springframework.stereotype.Service
import kr.ac.kumoh.s20190645.w24w14backend.repository.SongRepository

@Service
class SongService(private val songRepository: SongRepository) {
    fun getAllSongs(): List<Song> = songRepository.findAll()
}