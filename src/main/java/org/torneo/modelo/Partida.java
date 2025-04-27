package org.torneo.modelo;

import java.util.Date;
import java.util.Objects;

public class Partida {
    private int idPartida;
    private Equipo equipo1;
    private Equipo equipo2;
    private String resultado;
    private Date fechaPartida;

    public Partida() {
    }

    public Partida(int idPartida, Equipo equipo1, Equipo equipo2, String resultado, Date fechaPartida) {
        this.idPartida = idPartida;
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
        this.resultado = resultado;
        this.fechaPartida = fechaPartida;
    }

    public int getIdPartida() {
        return idPartida;
    }

    public void setIdPartida(int idPartida) {
        this.idPartida = idPartida;
    }

    public Equipo getEquipo1() {
        return equipo1;
    }

    public void setEquipo1(Equipo equipo1) {
        this.equipo1 = equipo1;
    }

    public Equipo getEquipo2() {
        return equipo2;
    }

    public void setEquipo2(Equipo equipo2) {
        this.equipo2 = equipo2;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public Date getFechaPartida() {
        return fechaPartida;
    }

    public void setFechaPartida(Date fechaPartida) {
        this.fechaPartida = fechaPartida;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Partida partida = (Partida) o;
        return idPartida == partida.idPartida;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(idPartida);
    }
}
