/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.est.clases;

import java.util.Date;

/**
 * clase con el nombre Reservacion
 *
 * @author Bryam Quezada
 * @since 2019
 * @version 2.0
 *
 */
public class Reservacion {// clase con nombre Reservacion

    @Override
    public String toString() {
        return "Reservacion{" + "numeroReservacion=" + numeroReservacion + ", fechaReservacion=" + fechaReservacion + ", horaReservacion=" + horaReservacion + '}';
    }

    private String numeroReservacion;//numero de reservacion de cada objeto Reservacion
    private String fechaReservacion;//fecha de reservacion de cada objeto Reservacion
    private String horaReservacion;//hora  de reservacion de cada objeto Reservacion

    /**
     * metodo para establecer el numero de reserva construccion del setter de la
     * variable numeroReservacion
     */
    public void setNumeroReservacion(String numeroReservacion) {
        this.numeroReservacion = numeroReservacion;
    }

    /**
     * metodo para establecer la fecha de reservacion construccion del setter de
     * la variable fechaReservacion
     */
    public void setFechaReservacion(String fechaReservacion) {
        this.fechaReservacion = fechaReservacion;
    }

    /**
     * metodo para establecer la hora de la reservacion construccion del setter
     * de la variable horaReservacion
     */
    public void setHoraReservacion(String horaReservacion) {
        this.horaReservacion = horaReservacion;
    }

    /**
     *
     * metodo para obtener el numero de reservacion del objeto numeroReservacion
     */
    public String getNumeroReservacion() {
        return numeroReservacion;
    }

    /**
     *
     * metodo para obtener la fecha de reservacion del objeto fechaReservacion
     */
    public String getFechaReservacion() {
        return fechaReservacion;
    }

    /**
     *
     * metodo para obtener la hora de reservacion del objeto horaReservacion
     */
    public String getHoraReservacion() {
        return horaReservacion;
    }

}
