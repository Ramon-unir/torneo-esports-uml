package org.torneo.modelo;

public class Premio {
    private String nombre;
    private String descripcion;
    private Equipo equipoGanador;

    public Premio(String nombre, String descripcion, Equipo equipoGanador) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.equipoGanador = equipoGanador;
    }

    public Premio() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Equipo getEquipoGanador() {
        return equipoGanador;
    }

    public void setEquipoGanador(Equipo equipoGanador) {
        this.equipoGanador = equipoGanador;
    }


}
