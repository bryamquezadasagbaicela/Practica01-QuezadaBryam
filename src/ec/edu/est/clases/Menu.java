/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.est.clases;

/**
 * clase con el nombre Menu
 *
 * @author Bryam Quezada
 * @since 2019
 * @version 2.0
 */
public class Menu {

    @Override
    public String toString() {
        return "Menu{" + "nombrePlato=" + nombrePlato + ", numeroPlatos=" + numeroPlatos + ", contenidoPlato=" + contenidoPlato + '}';
    }
/**
 * nombre de plato de cada objeto Menu
 * numero de platos de cada objeto Menu
 * contenido de platos de cada objeto Menu
 */
    private String nombrePlato;
    private String numeroPlatos;
    private String contenidoPlato;

    /**
     * metodo para establecer el nombre del plato 
     * construccion del setter de la variable nombrePlato
     */
    public void setNombrePlato(String nombrePlato) {
        this.nombrePlato = nombrePlato;
    }

    /**
     * metodo para establecer el numero de platos 
     * construccion del setter de la variable numeroPlatos
     */
    public void setNumeroPlatos(String numeroPlatos) {
        this.numeroPlatos = numeroPlatos;
    }

    /**
     * metodo para establecer el contenido del plato 
     * construccion del setter de la variable contenidoPlato
     */
    public void setContenidoPlato(String contenidoPlato) {
        this.contenidoPlato = contenidoPlato;
    }

    /**
     *
     * metodo para obtener el nombre del plato del objeto nombrePlato
     */
    public String getNombrePlato() {
        return nombrePlato;
    }

    /**
     *
     * metodo para obtener el numero de platos del objeto numeroPlatos
     */
    public String getNumeroPlatos() {
        return numeroPlatos;
    }

    /**
     *
     * metodo para obtener el contenido del plato del objeto contenidoPlato
     */
    public String getContenidoPlato() {
        return contenidoPlato;
    }

}
