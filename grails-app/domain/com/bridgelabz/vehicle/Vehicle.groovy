package com.bridgelabz.vehicle

class Vehicle {

    String name 
    Model model
    Make make

    static constraints = {

        year min: 1900
        name maxSize: 255
        
    }
}
