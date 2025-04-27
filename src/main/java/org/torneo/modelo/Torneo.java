package org.torneo.modelo;

import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Torneo {
    private int idTorneo;
    private String nombre;
    private Date fInicio;
    private List<Equipo> equiposInscritos;
    private List<Partida> partidas;



    public Torneo() {
    }

    public Torneo(int idTorneo, String nombre, Date fInicio) {
        this.idTorneo = idTorneo;
        this.nombre = nombre;
        this.fInicio = fInicio;
    }

    public int getIdTorneo() {
        return idTorneo;
    }

    public void setIdTorneo(int idTorneo) {
        this.idTorneo = idTorneo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getfInicio() {
        return fInicio;
    }

    public void setfInicio(Date fInicio) {
        this.fInicio = fInicio;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Torneo torneo = (Torneo) o;
        return idTorneo == torneo.idTorneo;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(idTorneo);
    }
}
