package iut.but2.tp1

import org.junit.jupiter.api.Test
import univ.nantes.UMLChecker

class TestUMLFileChainee {
    val uml = UMLChecker.create(FileChainee::class)

    @Test
    fun extend() {
        uml.extend("File")
    }

    @Test
    fun attNumber() {
        uml.attributeNumber(2)
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
    fun attribute_debut() {
        uml.attributeCheck("debut", Cellule::class, nullable = true)
    }

    @Test
    fun attribute_fin() {
        uml.attributeCheck("fin", Cellule::class, nullable = true)
    }

    @Test
    fun attribut_debut_value() {
        uml.attributeValueCheck(FileChainee<Int>(), "debut", null)
    }

    @Test
    fun attribut_fin_value() {
        uml.attributeValueCheck(FileChainee<Int>(), "fin", null)
    }

}