package id.ac.polbeng.fahmi

// Keyword this merujuk pada konstruktor kelas saat ini yang bersesuaian.
// Pada contoh diatas this(_firstName, _lastName) merujuk pada konstruktor yang berwarna kuning
// dan akan memanggilnya terlebih dahulu sebelum kode didalam konstruktor yang berwarna hijau dieksekusi.

class PersonE {
    var firstName: String
    var lastName: String
    var age: Int = 25
    constructor(_firstName: String, _lastName: String){
        firstName = _firstName
        lastName = _lastName
    }
    constructor(_firstName: String, _lastName: String, _age: Int): this(_firstName, _lastName){
        age = _age
    }
    fun cetakInfo(){
        println("Name : ${firstName} ${lastName}")
        println("Age : ${age}")
    }
}
fun main(){
    val anton = PersonE("Frank", "Lampard")
    anton.cetakInfo()
    println()
    val budi = PersonE("Budi", "Gunawan", 21)
    budi.cetakInfo()
}