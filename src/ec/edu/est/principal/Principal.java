/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.est.principal;

import ec.edu.est.clases.Comensal;
import ec.edu.est.clases.Menu;
import ec.edu.est.clases.Mesa;
import ec.edu.est.clases.Reservacion;
import ec.edu.est.clases.Tiquet;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Bryam Quezada
 * @since 2019
 * @version 2.0
 */
public class Principal {

    private static String s;

    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);

        System.out.println("");
        do {
            System.out.println("----------------------------------------");
            System.out.println("              MENU OPCIONES             ");
            System.out.println("1. Crear un objeto de tipo comensal");
            System.out.println("2. Crear un objeto de tipo reservacion");
            System.out.println("3. Crear un objeto de tipo mesa");
            System.out.println("4. Crear un objeto de tipo menu");
            System.out.println("5. Crear un objeto de tipo tiquet");
            System.out.println("            Escoga una opcion            ");
            int n = l.nextInt();
            System.out.println("-----------------------------------------");
            switch (n) {
                case 1:
                    System.out.println("-----------------------------------------");
                    //Crear objeto (instanciar)
                    Comensal c = new Comensal();
                    //Seteo o especificación de los datos del objeto Comensal.
                    c.setNombreComensal("Quezada Bryam");
                    c.setCedulaComensal("010713669-9");
                    c.setUbicacion("Ricaurte");
                    //Recuperación de los valores
                    System.out.println("clase: Comensal");
                    System.out.println("objeto:");
                    System.out.println("\tNombreComensal:" + c.getNombreComensal());
                    System.out.println("\tCedulaComensal:" + c.getCedulaComensal());
                    System.out.println("\tUbicacion:" + c.getUbicacion());
                    //Mostrar valores a partir de método toString()
                    System.out.println("\ntoString():\n"+ c.toString());
                    System.out.println("-----------------------------------------");
                    break;
                case 2:
                    System.out.println("-----------------------------------------");
                     //Crear objeto (instanciar)
                    Reservacion r = new Reservacion();
                     //Seteo o especificación de los datos del objeto Reservacion.
                    r.setNumeroReservacion("54");
                    r.setFechaReservacion(null);
                    System.out.println("clase: Mesa");
                    System.out.println("objeto:");
                    System.out.println("\tnumero reservacion:" + r.getNumeroReservacion());
                    System.out.println("\tfecha reservacion:" + r.getFechaReservacion());
                    //Mostrar valores a partir de método toString()
                    System.out.println("\ntoString():\n"+ r.toString());
                    System.out.println("-----------------------------------------");
                    break;
                case 3:
                    System.out.println("-----------------------------------------");
                     //Crear objeto (instanciar)
                    Mesa m = new Mesa();
                     //Seteo o especificación de los datos del objeto Mesa.
                    m.setUbicacionSucursal("Av. Remigio Crespo y Remigio Romero Esq.");
                    m.setNumeroMesa("12");
                    m.setNumeroPiso("2 ");
                    System.out.println("clase: Mesa");
                    System.out.println("objeto:");
                    System.out.println("\tUbicacion:" + m.getUbicacionSucursal());
                    System.out.println("\tNumero Mesa:" + m.getNumeroMesa());
                    System.out.println("\tNumero Piso:" + m.getNumeroPiso());
                    //Mostrar valores a partir de método toString()
                    System.out.println("\ntoString():\n"+ m.toString());
                    System.out.println("-----------------------------------------");
                    break;
                case 4:
                    System.out.println("-----------------------------------------");
                     //Crear objeto (instanciar)
                    Menu mn = new Menu();
                     //Seteo o especificación de los datos del objeto Menu.
                    mn.setNombrePlato("Seco de Pollo");
                    mn.setNumeroPlatos("4");
                    mn.setContenidoPlato("arroz, pollo, ensalada y papas fritas");
                    System.out.println("clase: Menu");
                    System.out.println("objeto:");
                    System.out.println("\tNombre Plato:" + mn.getNombrePlato());
                    System.out.println("\tNumero Platos:" + mn.getNumeroPlatos());
                    System.out.println("\tContenido:" + mn.getContenidoPlato());
                    //Mostrar valores a partir de método toString()
                    System.out.println("\ntoString():\n"+ mn.toString());
                    System.out.println("-----------------------------------------");
                    break;
                case 5:
                    System.out.println("-----------------------------------------");
                     //Crear objeto (instanciar)
                    Tiquet t = new Tiquet();
                     //Seteo o especificación de los datos del objeto Tiquet.
                    t.setUbicacionSucursal("Av de las América y Abelardo J. Andrade");
                    t.setUsdDescripcion("1 arroz con pollo y 1 cola cola personal");
                    t.setFecha(null);
                    System.out.println("clase: Tiquet");
                    System.out.println("objeto:");
                    System.out.println("\tUbicacionSucursal:" + t.getUbicacionSucursal());
                    System.out.println("\tUsdDescripcion:" + t.getUsdDescripcion());
                    System.out.println("\tFecha:" + t.getFecha());
                    //Mostrar valores a partir de método toString()
                    System.out.println("\ntoString():\n"+ t.toString());
                    System.out.println("-----------------------------------------");
                    break;
            }
            System.out.print("decea repetir proceso si/no: ");
            s = l.next();
        } while (s.equalsIgnoreCase("si"));
        System.out.println("");
    }
}
