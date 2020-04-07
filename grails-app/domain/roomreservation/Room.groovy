package roomreservation

class Room {

    String name
    int max

    @Override
    String toString() {
        "$name ($max)"
    }

    static constraints = {
        name(blank: false)
        max(min: 1)
    }
}
