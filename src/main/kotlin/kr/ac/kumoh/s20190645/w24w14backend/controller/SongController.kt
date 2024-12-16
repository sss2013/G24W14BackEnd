package kr.ac.kumoh.s20190645.w24w14backend.controller

import kr.ac.kumoh.s20190645.w24w14backend.model.Song
import kr.ac.kumoh.s20190645.w24w14backend.service.SongService
import org.springframework.web.bind.annotation.*

@RestController
@CrossOrigin(origins = ["https://wsp2024teamlistfrontend.netlify.app"])
class SongController {

    @GetMapping
    fun getRoot() = mapOf("status" to "success")

    @GetMapping("/api/message")
    fun getMessage() = mapOf("status" to "success")
}

//@RestController
//@RequestMapping("/api/songs")
//@CrossOrigin(origins = ["http://localhost:3000"])
//class SongController(private val service: SongService) {
//    @PostMapping
//    fun addSong(@RequestBody song: Song): Song = service.addSong(song)
//
//    @GetMapping
//    fun getAllSongs(): List<Song> = service.getAllSongs()
//
//    @GetMapping("/{id}")
//    fun getSongById(@PathVariable id: String): Song? = service.getSongById(id)
//
//    @GetMapping("/singer/{singer}")
//    fun getSongBySinger(@PathVariable singer: String): List<Song> = service.getSongBySinger(singer)
//
//    @PutMapping("/{id}")
//    fun updateSong(@PathVariable id: String, @RequestBody songDetails: Song): Song? =  service.updateSong(id, songDetails)
//
//    @DeleteMapping("/{id}")
//    fun deleteSong(@PathVariable id: String): Map<String, String> {
//        return if (service.deleteSong(id))
//            mapOf("status" to "deleted")
//        else
//            mapOf("status" to "not found")
//    }
//}