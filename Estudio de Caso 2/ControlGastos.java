/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package controlgastos;



/**
 *
 * @author yusme
 */
public class ControlGastos {

   

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Amigo[] amigos = {
            new Amigo("Guillermo"),
            new Amigo("Greivin"),
            new Amigo("Joshua"),
            new Amigo("Andres"),
            new Amigo("David"),
            new Amigo("Tavo")
        };

        double[] deudas = {120, 200, 50, 100, 150, 200};
        double deudaGuillermo = 0;

        for (int i = 1; i < amigos.length; i++) {
            amigos[i].agregarDeuda(deudas[i - 1]);
            deudaGuillermo += deudas[i - 1];
        }
        amigos[0].agregarDeuda(deudaGuillermo);

        Movimiento[] movimientos = {
            new Movimiento("Desayuno coffePrime", amigos[0], new Amigo[]{amigos[2], amigos[1], amigos[3], amigos[5], amigos[4]}, 120),
            new Movimiento("Almuerzo Pig Factory", amigos[0], new Amigo[]{amigos[2], amigos[1], amigos[3], amigos[5]}, 200),
            new Movimiento("Cena FastFood", amigos[4], new Amigo[]{amigos[2], amigos[3]}, 50),
            new Movimiento("Pizza Hut", amigos[0], new Amigo[]{amigos[3], amigos[1], amigos[5], amigos[4]}, 100),
            new Movimiento("Quicksilver store", amigos[0], new Amigo[]{amigos[1]}, 150),
            new Movimiento("Apple store", amigos[2], new Amigo[]{amigos[3]}, 200),
            new Movimiento("Desayuno chillis", amigos[1], new Amigo[]{amigos[0], amigos[2], amigos[3], amigos[5], amigos[4]}, 150),
            new Movimiento("Almuerzo hooters", amigos[3], new Amigo[]{amigos[0], amigos[1], amigos[2], amigos[5], amigos[4]}, 180)
        };

        System.out.println("Amigos: Joshua, Greivin, Guillermo, Andres, Tavo y David fueron de paseo y utilizaron el app");
        System.out.println("En esta agregaron las siguientes movimientos:");

        for (Movimiento movimiento : movimientos) {
            movimiento.actualizarDeudas();
        }

        Amigo guillermo = amigos[0];
        for (Amigo amigo : amigos) {
            if (!amigo.equals(guillermo)) {
                double deuda = amigo.obtenerDeudaCon(guillermo);
                System.out.println(amigo.getNombre() + " le debe a " + guillermo.getNombre() + " un total de " + deuda + " dólares");
            }
        }
    }
}
