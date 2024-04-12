/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

/**
 *
 * @author wilbe
 */
public class Facultad {
     private String codigo_facultad;
    private String nombre_facultad;
    private String estatus_facultad;

    public Facultad() {
    }

    @Override
    public String toString() {
        return "Facultad{" + "codigo_facultad=" + codigo_facultad + ", nombre_facultad=" + nombre_facultad + ", estatus_facultad=" + estatus_facultad + '}';
    }

    public String getCodigo_facultad() {
        return codigo_facultad;
    }

    public void setCodigo_facultad(String codigo_facultad) {
        this.codigo_facultad = codigo_facultad;
    }

    public String getNombre_facultad() {
        return nombre_facultad;
    }

    public void setNombre_facultad(String nombre_facultad) {
        this.nombre_facultad = nombre_facultad;
    }

    public String getEstatus_facultad() {
        return estatus_facultad;
    }

    public void setEstatus_facultad(String estatus_facultad) {
        this.estatus_facultad = estatus_facultad;
    }

    public Facultad(String codigo_facultad, String nombre_facultad) {
        this.codigo_facultad = codigo_facultad;
        this.nombre_facultad = nombre_facultad;
    }

    public Facultad(String codigo_facultad) {
        this.codigo_facultad = codigo_facultad;
    }

    public Facultad(String codigo_facultad, String nombre_facultad, String estatus_facultad) {
        this.codigo_facultad = codigo_facultad;
        this.nombre_facultad = nombre_facultad;
        this.estatus_facultad = estatus_facultad;
    }
}
