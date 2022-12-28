package com.open_bootcamp;

public class Main {
    public static void main(String[] args) {
                                                       //  Punto 1 : CLIENTE
        Cliente cliente = new Cliente();
        cliente.setEdad(24);
        cliente.setNombre("Lionel");
        cliente.setTelefono(22148732);
        cliente.setCredito(5520.38);
        mostrarDatos(cliente);
        System.out.println("crédito: "+ cliente.getCredito());
                                                        //  Punto 2 : TRABAJADOR
        Trabajador trabajador = new Trabajador();
        trabajador.setEdad(27);
        trabajador.setNombre("Belen");
        trabajador.setTelefono(11432538);
        trabajador.setSalario(94800.99);
        mostrarDatos(trabajador);
        System.out.println("salario: "+ trabajador.getSalario());


    }
    public static void mostrarDatos(Persona tipoPersona){
        System.out.println("edad: "+ tipoPersona.edad);
        System.out.println("nombre: "+ tipoPersona.nombre);
        System.out.println("teléfono: "+ tipoPersona.telefono);
    }
}

class Persona {
    int edad;
    String nombre;
    int telefono;

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}

class Cliente extends Persona{
    private double credito;

    public void setCredito(double credito) {
        this.credito = credito;
    }

    public double getCredito() {
        return credito;
    }
}

class Trabajador extends Persona{
    private double salario;

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }
}