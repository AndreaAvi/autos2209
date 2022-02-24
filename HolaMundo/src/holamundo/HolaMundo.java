/*
Autora: Andrea Marcela Cáceres Avitia (Código de clase POO2209 2022-II)
Fecha de última modificación:  24/02/2022
 */

package holamundo;

import java.awt.Color;

import poo.conceptos.basicos.Automovil;

public class HolaMundo {

    public static void main(String[] args) {

        System.out.println("Hola Mundo Java");

        Persona per1 = new Persona();
        per1.setNombre("Andrea CA");
        System.out.println("Nombre per1: " + per1.getNombre());
        per1.comer("hamburguesa hawaiana");

        Persona per2 = new Persona();
        per2.setNombre("Felipe");
        System.out.println("Nombre per2: " + per2.getNombre());
        per2.comer("pizza hawaiana");

        //Objeto Automóvil Bocho
        Automovil miBocho = new Automovil(); //<-Creación del objeto
        System.out.println("\nmiBocho");

        //Asignación de Estado a Atributos de objeto Bocho
        miBocho.setMarca("VW");
        System.out.println("Marca: " + miBocho.getMarca());
        miBocho.setsubMarca("Sedan");
        System.out.println("Submarca: " + miBocho.getsubMarca());
        miBocho.setModelo(1970);
        System.out.println("Modelo: " + miBocho.getModelo());
        miBocho.setColor(Color.BLUE);
        System.out.println("Color: " + miBocho.getColor());


        //Objeto Automóvil Akura
        Automovil miAkura = new Automovil(); //<-Creación del objeto
        System.out.println("\nmiAkura");

        //Asignación de Estado a Atributos de objeto Akura
        miAkura.setMarca("Akura");
        System.out.println("Marca: " + miAkura.getMarca());
        miAkura.setsubMarca("NSX");
        System.out.println("Submarca: " + miAkura.getsubMarca());
        miAkura.setModelo(2013);
        System.out.println("Modelo: " + miAkura.getModelo());
        miAkura.setColor(Color.GRAY);
        System.out.println("Color: " + miAkura.getColor());


        //Objeto Automóvil Mustang
        Automovil miMustang = new Automovil(); //<-Creación del objeto
        System.out.println("\nmiMustang");

        //Asignación de Estado a Atributos de objeto Mustang
        miMustang.setMarca("Ford");
        System.out.println("Marca: " + miMustang.getMarca());
        miMustang.setsubMarca("Mustang");
        System.out.println("Submarca: " + miMustang.getsubMarca());
        miMustang.setModelo(2010);
        System.out.println("Modelo: " + miMustang.getModelo());
        miMustang.setColor(Color.YELLOW);
        System.out.println("Color: " + miMustang.getColor());

    }
}
