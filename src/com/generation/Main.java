package com.generation;

import com.generation.paquete2.Animal;

public class Main {

    public static void main(String[] args) {
        //cuando es private solamente la misma clase pueda acceder a sus variables.
        //desde otro lad no se puede acceder
       /*Persona persona = new persona();
       persona.nombre ="carlos";*/
	//modificador de acceso por default

        Animal animal = new Animal();
        animal.nombre = "iguana";
    }
}
