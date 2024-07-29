
package model;

public class Auto implements java.io.Serializable{
    //todas las clases son privadas
    private int id;
    private String modelo;
    private String marca;
    private String color;

    public Auto() {
    }

    
    public Auto(int id, String modelo, String marca, String color) {
        this.id = id;
        this.modelo = modelo;
        this.marca = marca;
        this.color = color;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    
    void arrancar(){
        System.out.println("Encendido");
        
    }

    @Override
    public String toString() {
        return String.format("%-5d %-15s %-15s %-15s", id, marca, modelo, color);
    }
    
}
