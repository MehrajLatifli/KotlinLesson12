package Task3

import java.util.*

fun main(args: Array<String>) {

    val scanner = Scanner(System.`in`)

    val movie = Movie()
    val movieArrayList_1 = ArrayList<Movie>()
    var movieArrayList_2 = ArrayList<Movie>()
    var movieArrayList_3 = ArrayList<Movie>()

    for (i in 1..3) {

        print("Enter name: ")
        val name = scanner.next()

        print("Enter director: ")
        val director = scanner.next()

        print("Enter year: ")
        val year = scanner.nextInt()

        print("Enter point: ")
        val point = scanner.nextDouble()

        print("\n")

        movieArrayList_1.add(Movie(name, director, year, point))

    }

    println("--------- \nMovieArrayList_2: \n")

    movieArrayList_2 = movie.filterByYearGreaterThan(movieArrayList_1, 2000)!!

    movieArrayList_2.forEachIndexed { index, item ->
        println("${index + 1}) $item")
    }

    println("--------- \nMovieArrayList_3: \n")

    movieArrayList_3 = movie.filterByYearLessThan(movieArrayList_1, 2000)!!

    movieArrayList_3.forEachIndexed { index, item ->
        println("${index + 1}) $item")
    }

    println("--------- \nfindTopTwoMoviesByPoints: \n")

    val topTwoMovies = movie.findTopTwoMoviesByPoints(movieArrayList_1)


    println("Top two movies by points:")
    topTwoMovies?.forEachIndexed { index, movie ->
        println("${index + 1}. ${movie.name} - Director: ${movie.director}, Points: ${movie.point}")
    }

}

