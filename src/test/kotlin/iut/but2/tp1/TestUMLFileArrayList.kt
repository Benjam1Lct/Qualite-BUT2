package iut.but2.tp1

import org.junit.jupiter.api.Test
import univ.nantes.UMLChecker

class TestUMLFileArrayList {
    val uml = UMLChecker.create(FileArrayList::class)

    @Test
    fun extend() {
        uml.extend("File")
    }

    @Test
    fun attNumber() {
        uml.attributeNumber(1)
    }

    @Test
    fun abstract() {
        uml.isAbstract(false)
    }

    @Test
    fun open() {
        uml.isOpen(false)
    }

    @Test
    fun methNumber() {
        uml.methodNumber(6)
    }

    @Test
    fun construct() {
        uml.constructorCheck()
    }

    @Test
    fun attribute_list() {
        uml.attributeCheck("list",  ArrayList::class, nullable = false)
    }

    @Test
    fun attribut_list_value() {
        uml.attributeValueCheck(FileArrayList<Int>(), "list", mutableListOf<Int>())
    }


}