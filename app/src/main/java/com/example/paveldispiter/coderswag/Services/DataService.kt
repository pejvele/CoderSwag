package com.example.paveldispiter.coderswag.Services

import com.example.paveldispiter.coderswag.Model.Category
import com.example.paveldispiter.coderswag.Model.Product

/**
 * Created by paveldispiter on 3/12/18.
 */
object DataService {

    val categories = listOf(
            Category(title = "SHIRTS", image = "shirtimage"),
            Category(title = "HOODIES", image="hoodieimage"),
            Category(title= "HATS", image="hatimage"),
            Category(title = "DIGITAL" , image = "digitalgoodsimage")

    )

    val hats = listOf<>(
            Product(title = "Devslopes Graphic Beanie", price="18$", image = "hat1"),
            Product(title = "Devslopes Hat Black" , price = "$20", image = "hat2"),
            Product(title = "Devslopes Hat White", price="18$", image = "hat3"),
            Product(title = "Devslopes Hat Snapback", price="22$", image = "hat4")

    )



    val hoodies = listOf(
            Product(title = "Devslopes Hoodie Gray", price = "$28", image = "hoodie1"),
            Product(title = "Devslopes Hoodie Red", price = "$32", image = "hoodie2"),
            Product(title = "Devslopes Gray Hoodie", price = "$28", image = "hoodie3"),
            Product(title = "Devslopes Black Hoodie", price = "$32", image = "hoodie4"),
    )


    val shirts = listOf(
            Product(title = "Devslopes Shirt Black", price = "$18", image = "shirt1"),
            Product(title = "Devslopes Badge Light Gray ", price = "$20", image = "shirt2"),
            Product(title = "Devslopes Logo Shirt Red", price = "$22", image = "shirt3"),
            Product(title = "Devslopes Hustle", price = "$22", image = "shirt4"),
            Product(title = "Kickflip Studios", price = "$18", image = "shirt5"),

    )


}

