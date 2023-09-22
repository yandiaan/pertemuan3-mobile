fun main() {
    panggilNama()
    tambah(2, 10)
    println(namaLengkap("Dian", "Setiawan"))
}

fun panggilNama() {
    println("Halo!! Nama Saya Dian")
}

fun tambah(angka1: Int, angka2: Int) {
    println("jumlah angka: " + (angka1 + angka2))
}

fun namaLengkap(firstName: String = "Rover", lastName: String): String {
    return "Halo, Nama Saya $firstName $lastName"
}
