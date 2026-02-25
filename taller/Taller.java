package taller;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;



interface Especialista {
    void reparar(Reparacion r);
}



abstract class Vehiculo {
    private String matricula;
    private String modelo;
    private List<Reparacion> historialReparaciones;

    public Vehiculo(String matricula, String modelo) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.historialReparaciones = new ArrayList<>();
    }

    public String getMatricula() {
        return matricula;
    }
}



class Coche extends Vehiculo {
    private int numPuertas;

    public Coche(String matricula, String modelo, int numPuertas) {
        super(matricula, modelo);
        this.numPuertas = numPuertas;
    }
}



class Moto extends Vehiculo {

    public Moto(String matricula, String modelo) {
        super(matricula, modelo);
    }
}



class Cliente {
    private String nombre;
    private String telefono;

    public Cliente(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }
}



class Mecanico implements Especialista {

    private String nombre;

    public Mecanico(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void reparar(Reparacion r) {

    }
}



class Reparacion {
    private String descripcion;
    private LocalDate fecha;

    public Reparacion(String descripcion) {
        this.descripcion = descripcion;
        this.fecha = LocalDate.now();
    }
}



class Taller {

    public void asignarTarea(Mecanico m, Reparacion r) {
        m.reparar(r);
    }
}

class Factura {

}
