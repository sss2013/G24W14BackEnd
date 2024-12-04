package kr.ac.kumoh.s20190645.w24w14backend.controller

import kr.ac.kumoh.s20190645.w24w14backend.model.Song
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import kr.ac.kumoh.s20190645.w24w14backend.service.SongService

@RestController
class SongController(private val service: SongService) {
    @GetMapping("/api/songs")
    fun getAllSongs():List<Song> = service.getAllSongs()
}