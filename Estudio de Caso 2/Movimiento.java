/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlgastos;

/**
 *
 * @author yusme
 */
public class Movimiento {
    
    private String descripcion;
    private Amigo quienPago;
    private Amigo[] participantes;
    private double monto;

    public Movimiento(String descripcion, Amigo quienPago, Amigo[] participantes, double monto) {
        this.descripcion = descripcion;
        this.quienPago = quienPago;
        this.participantes = participantes;
        this.monto = monto;
    }

    public void actualizarDeudas() {
        double deudaPorPersona = monto / (participantes.length + 1);
        quienPago.agregarDeuda(-monto);
        for (Amigo amigo : participantes) {
            amigo.agregarDeuda(deudaPorPersona);
        }
    }

    public Amigo getQuienPago() {
        return quienPago;
    }

    public Amigo[] getParticipantes() {
        return participantes;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
    
