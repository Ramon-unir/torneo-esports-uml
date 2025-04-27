package org.torneo.control;

import org.torneo.modelo.Equipo;
import org.torneo.modelo.Jugador;

import java.util.List;
import java.util.ArrayList;

public class ControlEquipo {

    private List<Equipo> equipos;
    private int contadorIdEquipo;



    public ControlEquipo(List<Equipo> equipos) {
        this.equipos = equipos;
    }
    public ControlEquipo() {
        equipos = new ArrayList<>();
        contadorIdEquipo = 1;
    }

    public Equipo registrarEquipo(String nombreEquipo) {
        Equipo equipo = new Equipo(int contadorIdEquipo++,String nombreEquipo);
        equipos.add(equipo);
        return equipo;
    }


    public Equipo buscarEquipoPorNombre(String nombreEquipo) {
        for (Equipo equipo: equipos) {
            if (equipo.getNombreEquipo().equalsIgnoreCase(nombreEquipo)) {
                return equipo;
            }
        }
        return null;
    }

    public boolean añadirJugadorAEquipo(int idEquipo, Jugador jugador) {
            for (Equipo equipo : equipos);
            if (equipo.getIdEquipo() == idEquipo) {
                equipo.getJugador(jugador);
                return true;
            }
            return false;
    }

    public List<Equipo> listarEquipos() {
        return equipos;
    }

}
