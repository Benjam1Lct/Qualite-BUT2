package iut.but2.tp1

class FileArrayList<E> : File<E> {

    private val list = ArrayList<E>()

    override fun insererEnQueue(element : E) {
        list.add(element)
    }

    override fun supprimerEnTete() {
        if (list.isEmpty()) {
            throw NoSuchElementException()
        } else {
            list.removeAt(0)
        }
    }

    override fun listerDepuisDebut() : MutableList<E> {
        return list.toMutableList()
    }

    override fun taille() : Int {
        return list.size
    }

    override fun consulter(position: Int):E {
        if (position >= taille()) {
            throw IndexOutOfBoundsException()
        }else{
            return list[position]
        }
    }

    override fun listerDepuisFin() : MutableList<E> {
        return list.reversed().toMutableList()
    }


}