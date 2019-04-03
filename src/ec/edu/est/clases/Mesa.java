/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.est.clases;

/**
 * clase con el nombre Mesa
 *
 * @author Bryam Quezada
 * @since 2019
 * @version 2.0
 */
public class Mesa {//clase con nombre Mesa

    @Override
    public String toString() {
        return "Mesa{" + "ubicacionSucursal=" + ubicacionSucursal + ", numeroMesa=" + numeroMesa + ", numeroPiso=" + numeroPiso + '}';
    }

    private String ubicacionSucursal;//ubicacion de cada objeto Menu
    private String numeroMesa;//numero de mesa de cada objeto Menu
    private String numeroPiso;//numero de piso de cada objeto Menu

    /**
     * metodo para establecer la ubicacion de la Sucursal construccion del
     * setter de la variable ubicacionSucursal
     */
    public void setUbicacionSucursal(String ubicacionSucursal) {
        this.ubicacionSucursal = ubicacionSucursal;
    }

    /**
     * metodo para establecer el numero de mesa construccion del setter de la
     * variable numeroMesa
     */
    public void setNumeroMesa(String numeroMesa) {
        this.numeroMesa = numeroMesa;
    }

    /**
     * metodo para establecer el numero de piso construccion del setter de la
     * variable numeroPiso
     */
    public void setNumeroPiso(String numeroPiso) {
        this.numeroPiso = numeroPiso;
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
     * metodo para obtener el numero de mesa del objeto numeroMesa
     */
    public String getNumeroMesa() {
        return numeroMesa;
    }

    /**
     *
     * metodo para obtener el numero de piso del objeto numeroPiso
     */
    public String getNumeroPiso() {
        return numeroPiso;
    }

}//cierre clase
