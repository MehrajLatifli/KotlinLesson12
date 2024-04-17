package Task2

data class Cargo(var name: String? = null, var price: Double? = null) {

    fun calculateAvgCargo(cargos: ArrayList<Cargo>?): Double {

        return cargos?.let { list ->

            var sum = 0.0
            list.forEach { cargo ->
                cargo.price?.let { price ->
                    sum += price
                }
            }

            sum / list.size
        } ?: 0.0
    }
}
