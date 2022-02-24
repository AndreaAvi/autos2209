
package poo.conceptos.basicos;

import java.awt.Color;

public class Automovil {

    String marca;
    String subMarca;
    int modelo;
    Color color;

    public Automovil() {
    }

    public Automovil(String marca, String subMarca, int modelo, Color color) {
        this.marca = marca;
        this.subMarca = subMarca;
        this.modelo = modelo;
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getsubMarca() {
        return subMarca;
    }

    public void setsubMarca(String submarca) {
        this.subMarca = submarca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public void encender() {
        System.out.println("El auto " + this.subMarca + "está encendiendo");
    }

    public void acelerar() {
        System.out.println("Acelerando al auto " + this.subMarca);
    }

    public void avanzar() {
        System.out.println("Avanzando al auto " + this.subMarca);
    }
}
