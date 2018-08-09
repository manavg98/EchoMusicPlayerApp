package com.internshala.echo

import android.annotation.SuppressLint
import android.os.Parcel
import android.os.Parcelable

@SuppressLint("ParcelCreator")
class Songs(var songID: Long, var songTitle: String, var artist: String,
            var songData: String, var dateAdded: Long) : Parcelable {
    override fun writeToParcel(p0: Parcel?, p1: Int) {
    }

    override fun describeContents(): Int {
        return 0
    }

    object Statified {
        var nameComparator: Comparator<Songs> = Comparator<Songs> { song1, song2 ->
            val songOne = song1.songTitle.toUpperCase()
            val songTwo = song2.songTitle.toUpperCase()
            songOne.compareTo(songTwo)
        }
        var dateComparator: Comparator<Songs> = Comparator<Songs> { song1, song2 ->
            val songOne = song1.dateAdded.toDouble()
            val songTwo = song2.dateAdded.toDouble()
            songTwo.compareTo(songOne)
        }
    }

}