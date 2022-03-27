/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.eduardocoteron08_entornosexev2;

/**
 *
 * @author Eduardo Coterón Sobrino
 * @version 1.0
 * @since 27-03-2022
 */
public class Reloj {

    //Atributos de la clase Reloj
    int hora, MM, SS;
    private String mes;
    private String anio;

    //Constructor con parámetros
    public Reloj(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.MM = minuto;
        this.SS = segundo;
    }
    //Métodos para asignar valores a los atributos hora, MM y SS
    
    public void setHora(int hora) {
        this.hora = hora;
    }

    public void setMinuto(int minuto) {
        this.MM = minuto;
    }

    
    public void setSegundo(int segundo) {    
        this.SS = segundo;
    }
 //Métodos para devolver valores de los atributos hora, MM y SS

    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return MM;
    }

    public int getSegundo() {
        return SS;
    }
    
    
    
    //Método que incrementa 1 SS la hora
    public void incrementa() {
        boolean cambio_m, cambio_h;
        cambio_m = (SS + 1 > 59);
        cambio_h = ((cambio_m) && (MM + 1 > 59));
        MM = (cambio_m) ? MM + 1 : MM;
        MM = (MM > 59) ? 0 : MM;
        hora = (cambio_h) ? hora + 1 : hora;
        hora = (hora > 23) ? 0 : hora;
        SS = (SS + 1 > 59) ? 0 : SS + 1;
    }
    //Método que decrementa un SS la hora
    public void decrementa() {
        boolean cambio_m, cambio_h;

        cambio_m = (SS - 1 < 0);
        cambio_h = ((cambio_m) && (MM - 1 < 0));

        MM = (cambio_m) ? MM - 1 : MM;
        MM = (MM < 0) ? 59 : MM;
        hora = (cambio_h) ? hora - 1 : hora;
        hora = (hora < 0) ? 23 : hora;

        SS = (SS - 1 < 0) ? 59 : SS - 1;

    }
    //Método que da la hora en formato 12H
    public String hora12() {
        
        String mediodia, cadena;
        int hora12;
        mediodia = (hora >= 12) ? "PM" : "AM";
        hora12 = (hora > 12) ? hora - 12 : hora;

    //Forma de poner un 0 en los minutos y segundos si es menor de 10
        cadena = hora12 + ":";
        cadena += (MM < 10) ? "0" : "";
        cadena += MM + ":";
        cadena += (SS < 10) ? "0" : "";
        cadena += SS;
        cadena += " " + mediodia;
        return cadena;

    }
    //Método que da la hora en formato 24H
    public String hora24() {
        
        String cadena;

        //Forma de poner un 0 en los minutos y segundos si es menor de 10
        cadena = hora + ":";
        cadena += (MM < 10) ? "0" : "";
        cadena += MM + ":";
        cadena += (SS < 10) ? "0" : "";
        cadena += SS;
        return cadena;

    }

    /**
     * @return the mes
     */
    public String getMes() {
        return mes;
    }

    /**
     * @see Reloj#getMes() 
     */
    public void setMes(String mes) {
        this.mes = mes;
    }

    /**
     * @param anio -
     * @return Este método asigna un valor a la variable anio
     */
    public String getAnio() {
        return anio;
    }

    /**
     * @deprecated Este método no se utiliza ya que es el añadido del examen.
     */
    public void setAnio(String anio) {
        this.anio = anio;
    }
    
}
