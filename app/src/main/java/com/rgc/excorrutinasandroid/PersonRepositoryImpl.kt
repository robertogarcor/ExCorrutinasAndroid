package com.rgc.excorrutinasandroid

class PersonRepositoryImpl : PersonRepository {

    private val listPerson = ArrayList<Person>()

    init {
        listPerson.add(Person("Roberto", "Garcia", 40))
        listPerson.add(Person("Pepe", "Lopez", 25))
        listPerson.add(Person("Jose", "Marin", 27))
        listPerson.add(Person("Maria", "Venitez", 44))
        listPerson.add(Person("Lola", "Roman", 52))
    }

    override fun getPersons(): ArrayList<Person> {
        return listPerson
    }


}