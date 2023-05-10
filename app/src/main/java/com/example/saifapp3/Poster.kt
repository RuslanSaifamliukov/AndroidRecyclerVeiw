package com.example.saifapp3

data class Poster(val imageId: Int, val title: String)
class PosterList {val list = arrayListOf(
    Poster(R.drawable.`as`, "Assassin’s Creed Syndicate"),
    Poster(R.drawable.bf, "Battlefield: Bad Company 2"),
    Poster(R.drawable.bs, "BioShock Infinite"),
    Poster(R.drawable.gh, "Call of Duty: Ghosts"),
    Poster(R.drawable.cp, "Cyberpunk 2077"),
    Poster(R.drawable.ds, "Dark Souls"),
    Poster(R.drawable.dm, "DOOM"),
    Poster(R.drawable.fo, "Fallout 4"),
    Poster(R.drawable.fc, "Far Cry 3"),
    Poster(R.drawable.sa, "Grand Theft Auto: San Andreas"),
    Poster(R.drawable.hr, "Horizon Zero Dawn"),
    Poster(R.drawable.mk, "Mortal Kombat 11"),
    Poster(R.drawable.ow, "Overwatch"),
    Poster(R.drawable.rd, "Red Dead Redemption 2"),
    Poster(R.drawable.ss, "Serious Sam"),
    Poster(R.drawable.wc, "Warcraft III: The Frozen Throne"))}