/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.est.clases;

import java.util.Date;

/**
 *
 * @author 59398
 */
public class Tiquet {// clase con nombre Tiquet

    @Override
    public String toString() {
        return "Tiquet{" + "ubicacionSucursal=" + ubicacionSucursal + ", usdDescripcion=" + usdDescripcion + ", fecha=" + fecha + '}';
    }

    private String ubicacionSucursal;//ubicacion de sucursal de cada objeto Tiquet
    private String usdDescripcion;//usd descripcion de cada objeto Tiquet
    private Date fecha;//fecha de cada objeto Tiquet

    /**
     * metodo para establecer la ubicacion de la Sucursal construccion del
     * setter de la variable ubicacionSucursal
     */
    public void setUbicacionSucursal(String ubicacionSucursal) {
        this.ubicacionSucursal = ubicacionSucursal;
    }

    /**
     * metodo para establecer el usd describiendo lo ordenado construccion del
     * setter de la variable usdDescripcion
     */
    public void setUsdDescripcion(String usdDescripcion) {
        this.usdDescripcion = usdDescripcion;
    }

    /**
     * metodo para establecer la fecha construccion del setter de la variable
     * fecha
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    /**
     *
     * metodo para obtener la ubicacion de la sucursal del objeto
     * ubicacionSucursal
     */
    public String getUbicacionSucursal() {
        return ubicacionSucursal;
    }

    /**
     *
     * metodo para obtener el usd del objeto usdDescripcion
     */
    public String getUsdDescripcion() {
        return usdDescripcion;
    }

    /**
     *
     * metodo para obtener la fecha del objeto fecha
     */
    public Date getFecha() {
        return fecha;
    }

}//cierre clase 
