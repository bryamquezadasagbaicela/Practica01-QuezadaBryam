/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.est.clases;

/**
 * clase con el nombre Comensal
 *
 * @author Bryam Quezada
 * @since 2019
 * @version 2.0
 *
 */
public class Comensal {// clase Comensal

    @Override
    public String toString() {
        return "Comensal{" + "nombreComensal=" + nombreComensal + ", cedulaComensal=" + cedulaComensal + ", ubicacion=" + ubicacion + '}';
    }

    private String nombreComensal;//nombre de comensal de cada objeto Comensal
    private String cedulaComensal;//cedula de comensal de cada objeto Comensal
    private String ubicacion;//ubicacion de cada objeto Comensal

    /**
     * metodo para establecer el nombre del comensal construccion del setter de
     * la variable nombreComensal
     */
    public void setNombreComensal(String nombreComensal) {
        this.nombreComensal = nombreComensal;
    }

    /**
     * metodo para establecer la cedula del comensal construccion del setter de
     * la variable cedulaComensal
     */
    public void setCedulaComensal(String cedulaComensal) {
        this.cedulaComensal = cedulaComensal;
    }

    /**
     * metodo para establecer la ubicacion construccion del setter de la
     * variable ubicacion
     */
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    /**
     *
     * metodo para obtener el nombre del comensal del objeto nombreComensal
     */
    public String getNombreComensal() {
        return nombreComensal;
    }

    /**
     *
     * metodo para obtener la cedula del comensal del objeto cedulaComensal
     */
    public String getCedulaComensal() {
        return cedulaComensal;
    }

    /**
     *
     * metodo para obtener la ubicacion del objeto ubicacion
     */
    public String getUbicacion() {
        return ubicacion;
    }
}//cierre clase
