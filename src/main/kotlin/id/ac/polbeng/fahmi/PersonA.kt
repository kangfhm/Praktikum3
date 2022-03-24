package id.ac.polbeng.fahmi

class PersonA (_firstName: String, _lastName: String, _age: Int) {
    var firstName:String
    var lastName:String
    var age:Int
    init {
        firstName = _firstName
        lastName = _lastName
        age = _age
    }
}

fun main(){
    val budi = PersonA("Budi", "Gunawarman", 21)
    println("Name : ${budi.firstName} ${budi.lastName}")
    println("Age : ${budi.age}")
}