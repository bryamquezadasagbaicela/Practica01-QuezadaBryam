/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.est.principal;

import ec.edu.est.clases.Comensal; //importa datos de la clase Comensal 
import ec.edu.est.clases.Menu; //importa datos de la clase Menu
import ec.edu.est.clases.Mesa; //importa datos de la clase Mesa
import ec.edu.est.clases.Reservacion; //importa datos de la clase Reservacion
import ec.edu.est.clases.Tiquet; //importa datos de la clase Tiquet 
import java.util.Date; //importa datos de la clase Comensal 
import java.util.Scanner; // Importa el escaner para leer datos ingresados por el teclado

/**
 * clase principal
 *
 * @author Bryam Quezada
 * @since 2019
 * @version 2.0
 */
public class Principal {

    private static String s;

    public static void main(String[] args) { // Es el punto de entrada a un proceso o programa en la clase principal

        Scanner l = new Scanner(System.in); // Sirve para crear un vinculo de la clase Scanner y obtener datos (System.in)

        System.out.println("");
        do {
            // Nos permite imprimir algo por pantalla en una ventana de consola
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
                    Scanner scc = new Scanner(System.in);
                    Comensal c = new Comensal();
                    String nombre = scc.nextLine();
                    String cedula = scc.nextLine();
                    String ubicacion = scc.nextLine();

                    //Seteo o especificación de los datos del objeto Comensal.
                    c.setNombreComensal(nombre);
                    c.setCedulaComensal(cedula);
                    c.setUbicacion(ubicacion);
                    //Recuperación de los valores
                    System.out.println("clase: Comensal");
                    System.out.println("objeto:");
                    System.out.println("\tNombre Comensal: " + c.getNombreComensal());
                    System.out.println("\tCedula Comensal: " + c.getCedulaComensal());
                    System.out.println("\tUbicacion: " + c.getUbicacion());
                    //Mostrar valores a partir de método toString()
                    System.out.println("\ntoString():\n" + c.toString());
                    System.out.println("-----------------------------------------");
                    break;
                case 2:
                    System.out.println("-----------------------------------------");
                    //Crear objeto (instanciar)
                    Scanner scv = new Scanner(System.in);
                    Reservacion r = new Reservacion();
                    String numero = scv.nextLine();
                    String fecha = scv.nextLine();
                    String hora = scv.nextLine();
                    //Seteo o especificación de los datos del objeto Reservacion.
                    r.setNumeroReservacion(numero);
                    r.setFechaReservacion(fecha);
                    r.setHoraReservacion(hora);
                    System.out.println("clase: Mesa");
                    System.out.println("objeto:");
                    System.out.println("\tnumero reservacion: " + r.getNumeroReservacion());
                    System.out.println("\tfecha reservacion: " + r.getFechaReservacion());
                    System.out.println("\thora reservacion: " + r.getHoraReservacion());
                    //Mostrar valores a partir de método toString()
                    System.out.println("\ntoString():\n" + r.toString());
                    System.out.println("-----------------------------------------");
                    break;
                case 3:
                    System.out.println("-----------------------------------------");
                    //Crear objeto (instanciar)
                    Scanner scvb = new Scanner(System.in);
                    Mesa m = new Mesa();
                    String ubi = scvb.nextLine();
                    String numesa = scvb.nextLine();
                    String numpiso = scvb.nextLine();
                    //Seteo o especificación de los datos del objeto Mesa.
                    m.setUbicacionSucursal(ubi);
                    m.setNumeroMesa(numesa);
                    m.setNumeroPiso(numpiso);
                    System.out.println("clase: Mesa");
                    System.out.println("objeto:");
                    System.out.println("\tUbicacion:" + m.getUbicacionSucursal());
                    System.out.println("\tNumero Mesa:" + m.getNumeroMesa());
                    System.out.println("\tNumero Piso:" + m.getNumeroPiso());
                    //Mostrar valores a partir de método toString()
                    System.out.println("\ntoString():\n" + m.toString());
                    System.out.println("-----------------------------------------");
                    break;
                case 4:
                    System.out.println("-----------------------------------------");
                    //Crear objeto (instanciar)
                    Scanner s = new Scanner(System.in);
                    Menu mn = new Menu();
                    String nomplato = s.nextLine();
                    String nmplato = s.nextLine();
                    String contenido = s.nextLine();
                    //Seteo o especificación de los datos del objeto Menu.
                    mn.setNombrePlato(nomplato);
                    mn.setNumeroPlatos(nmplato);
                    mn.setContenidoPlato(contenido);
                    System.out.println("clase: Menu");
                    System.out.println("objeto:");
                    System.out.println("\tNombre Plato:" + mn.getNombrePlato());
                    System.out.println("\tNumero Platos:" + mn.getNumeroPlatos());
                    System.out.println("\tContenido:" + mn.getContenidoPlato());
                    //Mostrar valores a partir de método toString()
                    System.out.println("\ntoString():\n" + mn.toString());
                    System.out.println("-----------------------------------------");
                    break;
                case 5:
                    System.out.println("-----------------------------------------");
                    //Crear objeto (instanciar)
                    Scanner scn = new Scanner(System.in);
                    Tiquet t = new Tiquet();
                    String ubic = scn.nextLine();
                    String usd = scn.nextLine();
                    String fech = scn.nextLine();
                    //Seteo o especificación de los datos del objeto Tiquet.
                    t.setUbicacionSucursal(ubic);
                    t.setUsdDescripcion(usd);
                    t.setFecha(fech);
                    System.out.println("clase: Tiquet");
                    System.out.println("objeto:");
                    System.out.println("\tUbicacionSucursal:" + t.getUbicacionSucursal());
                    System.out.println("\tUsdDescripcion:" + t.getUsdDescripcion());
                    System.out.println("\tFecha:" + t.getFecha());
                    //Mostrar valores a partir de método toString()
                    System.out.println("\ntoString():\n" + t.toString());
                    System.out.println("-----------------------------------------");
                    break;
            }
            System.out.print("decea repetir proceso si/no: ");
            s = l.next();
        } while (s.equalsIgnoreCase("si"));
        System.out.println("");
    }
}
