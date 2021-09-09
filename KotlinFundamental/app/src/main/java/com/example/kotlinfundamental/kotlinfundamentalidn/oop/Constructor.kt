package com.example.kotlinfundamental.kotlinfundamentalidn.oop

fun main(){
    val penguin = Bird("Penguin",10.4)
    penguin.fly()
    penguin.hunt("Ikan")

    val elang = Bird("Elang",20.1,true)
    elang.fly()
    elang.hunt("Goat")

    val transtv = Gedung("Trans TV", 5, true)
    transtv.acara("Closingan")

    val whiteHouse = Gedung("The White House", 2, false)
    whiteHouse.acara("Maulidan")

    val beta = Hewan("Pussy", 0.0f, true, 2)
    beta.info()
}

class Bird(val kind: String, val weight: Double, val feather: Boolean = false) {
    fun fly(){
        println("$kind apakah bisa terbang? $feather")
    }

    fun hunt(food: String) {
        println("$kind berburu $food untuk mempertahakan berat badannya yang $weight kg")
    }
}

class Gedung(val nama: String, val lantai: Int, val pribadi: Boolean){
    fun acara(acara: String) {
        println("Gedung $nama yang berlantai $lantai akan digunakan untuk acara $acara, gedung bersifat pribadi: $pribadi")
    }
}

class Hewan(nama: String, berat: Float, berbulu: Boolean, umur: Int){
    val nama: String
    val berat: Float
    val berbulu: Boolean
    val umur: Int

    init {
        this.nama = nama
        this.berat = if (berat <= 0) 0.1f else berat
        this.berbulu = berbulu
        this.umur = if (umur < 0) 0 else umur
    }

    fun info(){
        println("Nama: $nama \nBerat: $berat \nHewan Berbulu: $berbulu \nUmur: $umur")
    }
}