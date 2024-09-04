package iut.but2.tp1

class FileChainee<E> : File<E> {
    private var fin: Cellule<E>? = null
    private var debut: Cellule<E>? = null

    override fun insererEnQueue(element: E) {
        val newCellule = Cellule(element)
        if (debut == null && fin == null) {
            debut = newCellule
            fin = newCellule
        } else {
            fin?.modifieSuivant(newCellule)
            newCellule.modifiePrecedent(fin)
            fin = newCellule
        }
    }

    override fun supprimerEnTete() {
        if (debut == null && fin == null) {
            throw NoSuchElementException()
        } else {
            val saveSuivant = debut!!.suivant()
            debut = saveSuivant
            if (debut != null) {
                debut!!.modifiePrecedent(null)
            } else {
                fin = null
            }
        }
    }

    override fun listerDepuisDebut(): MutableList<E> {
        val result: MutableList<E> = mutableListOf()
        var saveDebut = debut
        while (saveDebut != null) {
            result.add(saveDebut.valeur())
            saveDebut = saveDebut.suivant()
        }
        return result
    }

    override fun taille(): Int {
        var saveDebut = debut
        var count = 0
        while (saveDebut != null) {
            saveDebut = saveDebut.suivant()
            count++
        }
        return count
    }

    override fun consulter(position: Int): E {
        var saveDebut = debut
        if (position >= taille()) {
            throw IndexOutOfBoundsException()
        } else {
            for (i in 0..position) {
                if (i == position) {
                    return saveDebut!!.valeur()
                }
                saveDebut = saveDebut!!.suivant()
            }
        }
        return saveDebut!!.valeur()
    }

    override fun listerDepuisFin(): MutableList<E> {
        val result: MutableList<E> = mutableListOf()
        var saveFin = fin
        while (saveFin != null) {
            result.add(saveFin.valeur())
            saveFin = saveFin.precedent()
        }
        return result
    }
}