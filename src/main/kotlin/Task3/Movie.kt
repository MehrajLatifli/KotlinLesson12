package Task3

data class Movie(var name: String? = null, var director: String? = null, var year: Int? = null, var point: Double? = null) {

    fun filterByYearGreaterThan(movies: ArrayList<Movie>?, greaterThan: Int?): ArrayList<Movie>? {
        return movies?.filter {
            it.year?.let { year ->
                greaterThan?.let { threshold ->
                    year > threshold
                }
            } ?: false
        }?.toCollection(ArrayList())
    }

    fun filterByYearLessThan(movies: ArrayList<Movie>?, lessThan: Int?): ArrayList<Movie>? {
        return movies?.filter {
            it.year?.let { year ->
                lessThan?.let { threshold ->
                    year < threshold
                }
            } ?: false
        }?.toCollection(ArrayList())
    }

    fun findTopTwoMoviesByPoints(movies: ArrayList<Movie>?): ArrayList<Movie>? {

        if (movies.isNullOrEmpty()) {
            return null
        }

        val sortedMovies = movies.sortedByDescending { it.point }

        return if (sortedMovies.size >= 2) {
            ArrayList(sortedMovies.take(2))
        } else {
            ArrayList(sortedMovies)
        }
    }
}
