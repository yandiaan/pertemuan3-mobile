fun main() {
    var angka: Int = 1  // Deklarasi variable dengan tipe data Integer
    var nama: String = "Dian" // Deklarasi variable dengan tipe data String
    var bilanganBulat: Double = 3.14 // Deklarasi variable dengan tipe data Double
    var isValid: Boolean = false // Deklarasi variable dengan tipe data Boolean

    val age = 5 // Deklarasi variable tanpa memberi keterangan tipe data
    // variable age diatas juga dibuat dengan deklarasi "val" yang artinya value/nilai tidak dapat diubah (constant)

    var nilai = 95
    nilai = nilai + 5 // variable "nilai" dapat diubah nilainya karena menggunakan deklarasi "var"


    // Kode println dibawah digunakan untuk menampilkan seluruh variable yang telah di deklarasikan diatasnya
    println("angka: $angka")
    println("nama: $nama")
    println("Phi: $bilanganBulat")
    println("is valid : $isValid")

    println("umur: $age")

    println("nilai: $nilai")
}