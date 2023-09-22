fun main() {
    panggilNama() // berfungsi untuk memanggil fungsi panggilNama()
    tambah(2, 10) // berfungsi untuk memanggil fungsi tambah()
    println(namaLengkap("Dian", "Setiawan")) // berfungsi untuk memanggil fungsi namaLengkap()
}

// fungsi panggilNama() adalah contoh fungsi tanpa parameter
fun panggilNama() {
    println("Halo!! Nama Saya Dian")
}

// fungsi tambah() adalah contoh fungsi dengan parameter
fun tambah(angka1: Int, angka2: Int) {
    println("jumlah angka: " + (angka1 + angka2))
}

// fungsi namaLengkap() adalah contoh dari fungsi dengan parameter dan return-value
fun namaLengkap(firstName: String = "Rover", lastName: String): String {
    return "Halo, Nama Saya $firstName $lastName"
}
