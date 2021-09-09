package com.example.kotlinfundamental.kotlinfundamentalidn.oop

class Animal {
    var nama: String? = null
    private var berat: Float? = null
    var berbulu: Boolean? = null
    private var umur: Int? = null

    fun info() {
        println("Nama: $nama \nBerat: $berat \nHewan Berbulu: $berbulu \nUmur: $umur tahun")
    }
}