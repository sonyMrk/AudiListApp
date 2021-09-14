package com.example.carsaudi

class Datasource {
    fun loadCars(): List<Car>{
        return listOf(
            Car(R.string.name1, R.string.price1, R.drawable.audi_a4_2021),
            Car(R.string.name2, R.string.price2, R.drawable.audi_a5_2021),
            Car(R.string.name3, R.string.price3, R.drawable.audi_a6_2021),
            Car(R.string.name4, R.string.price4, R.drawable.audi_a7_2021),
            Car(R.string.name5, R.string.price5, R.drawable.audi_a8_2021),
            Car(R.string.name6, R.string.price6, R.drawable.audi_q3_2021),
            Car(R.string.name7, R.string.price7, R.drawable.audi_q5_2021),
            Car(R.string.name8, R.string.price8, R.drawable.audi_q7_2021),
            Car(R.string.name9, R.string.price9, R.drawable.audi_q8_2021),
            Car(R.string.name10, R.string.price10, R.drawable.audi_s6_2021),
            Car(R.string.name11, R.string.price11, R.drawable.audi_s8_2021)
        )
    }
}