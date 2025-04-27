package org.torneo.modelo;

import java.util.List;
import java.util.Objects;

public class Equipo {
    private int idEquipo;
    private String nombreEquipo;
    private List<Jugador> jugadores;

    public Equipo() {
    }

    public Equipo(String nombreEquipo, int idEquipo) {
        this.nombreEquipo = nombreEquipo;
        this.idEquipo = idEquipo;
    }

    public int getIdEquipo() {
        return idEquipo;
    }

    public void setIdEquipo(int idEquipo) {
        this.idEquipo = idEquipo;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public List<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Equipo equipo = (Equipo) o;
        return idEquipo == equipo.idEquipo;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(idEquipo);
    }
}
