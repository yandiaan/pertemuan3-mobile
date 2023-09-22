// Codelab 4: Soal Latihan:Dasar-Dasar Kotlin
// saya membuat aplikasi mengenai program sederhana yang mencetak informasi mengenai buku

fun main() {
    // Perintah dibawah merupakan cara memanggil fungsi printBookInfo() yang telah dibuat di bawah
    printBookInfo("The Catcher in the Rye", "J.D. Salinger", 1951)
    printBookInfo("To Kill a Mockingbird", "Harper Lee", 1960)
    printBookInfo("1984", "George Orwell", 1949)
    printBookInfo("The Great Gatsby", "F. Scott Fitzgerald", 1925)
}

fun printBookInfo(title: String, author: String, yearPublished: Int) {
    println("Title: $title") // cetak judul dari buku yang dipanggil dari parameter
    println("Author: $author") // cetak penulis dari buku yang dipanggil dari parameter
    println("Year Published: $yearPublished")  // cetak tahun dipublish dari buku yang dipanggil dari parameter
    println()
}
