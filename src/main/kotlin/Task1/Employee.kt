package Task1

data class Employee(var name: String? = null, var surname: String? = null, var salary: Double? = null) {

    fun filterBySalaryGreaterThan(employees: ArrayList<Employee>?, greaterThan: Double?): ArrayList<Employee>? {

        return employees?.filter {

            it.salary?.let { salary ->
                greaterThan?.let { threshold ->
                    salary > threshold
                }
            } ?: false
        }?.toCollection(ArrayList())
    }
}
