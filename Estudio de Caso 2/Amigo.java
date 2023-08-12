/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlgastos;

/**
 *
 * @author yusme
 */
public class Amigo {
    private String nombre;
    private double deudaTotal;

    public Amigo(String nombre) {
        this.nombre = nombre;
        this.deudaTotal = 0;
    }

    public void agregarDeuda(double cantidad) {
        deudaTotal += cantidad;
    }

    public double obtenerDeudaCon(Amigo amigo) {
        return amigo.deudaTotal - deudaTotal;
    }

    public String getNombre() {
        return nombre;
    }
}

