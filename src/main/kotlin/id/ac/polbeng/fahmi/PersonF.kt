package id.ac.polbeng.fahmi

//sebuah kelas terdapat konstruktor utama dan tambahan secara bersamaan,
// maka setiap konstruktor tambahan harus mendelegasi (delegate) konstruktor utama,
// baik secara langsung maupun tidak langsung melalui konstruktor tambahan.
// Delegasi ke konstruktor lain di kelas yang sama dilakukan menggunakan keyword this

class PersonF ( val firstName: String, val lastName: String) {
    init {
        println("Sedang inisialisasi wak!")
    }
    constructor(_firstName: String, _lastName: String, _age: Int): this(_firstName, _lastName){
        println("Name : $_firstName $_lastName")
        println("Age : $_age")
        println()
    }
    constructor(_firstName: String, _lastName: String, _country: String): this(_firstName, _lastName){
        println("Name : $_firstName $_lastName")
        println("Country : $_country")
        println()
    }
    constructor(_firstName: String, _lastName: String, _age: Int, _country: String): this(_firstName, _lastName, _age){
        println("Name : $_firstName $_lastName")
        println("Age : $_age")
        println("Country : $_country")
    }
}
fun main() {
    val anton = PersonF("Anton", "Sejati")
    val budi = PersonF("Budi", "Gunawan", 21)
    val caca = PersonF("Caca", "Andika", "Indonesia")
    val dono = PersonF("Dono", "Putri", 25, "Indonesia")
}
//Note: Terdapat 1 konstruktor utama berwarna kuning dan 3 buah konstruktor tambahan berwarna hijau, merah dan biru.
// Konstruktor tambahan pertama dan kedua mendelegasikan konstruktor utama.
// Sedangkan konstruktor tambahan ketiga medelegasikan konstruktor tambahan pertama yang secara tidak langsung juga mendelegasikan konstruktor utama.