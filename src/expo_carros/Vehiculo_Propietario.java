/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expo_carros;

/**
 *
 * @author Camilo Tinoco
 */
public class Vehiculo_Propietario {
    //ArrayList<Vehiculo_Propietario> x = new ArrayList();
    String nombre, apellido, telefono, marca, color;
    Integer edad, cedula, modelo, valor, puntos;
    
    public Vehiculo_Propietario(String nombre_, String apellido_, Integer edad_, String telefono_, Integer cedula_, String marca_, Integer modelo_, Integer valor_, String color_, Integer puntos_){
        this.nombre=nombre_;
        this.apellido=apellido_;
        this.edad=edad_;
        this.telefono=telefono_;
        this.cedula=cedula_;
        this.marca=marca_;
        this.modelo=modelo_;
        this.valor=valor_;
        this.color=color_;
        this.puntos=puntos_;
    }
        
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Integer getCedula() {
        return cedula;
    }

    public void setCedula(Integer cedula) {
        this.cedula = cedula;
    }

    public Integer getModelo() {
        return modelo;
    }

    public void setModelo(Integer modelo) {
        this.modelo = modelo;
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }

    public Integer getPuntos() {
        return puntos;
    }

    public void setPuntos(Integer puntos) {
        this.puntos = puntos;
    }
}
