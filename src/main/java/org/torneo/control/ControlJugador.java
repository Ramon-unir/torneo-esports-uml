package org.torneo.control;

import org.torneo.modelo.Jugador;

import java.util.ArrayList;
import java.util.List;

public class ControlJugador {
    private List<Jugador> jugadores;
    private int contadorId;

    public ControlJugador() {
        jugadores = new ArrayList<>();
        contadorId = 1;
    }

    public Jugador registrarJugador(String nombre, String apellidos, String email,
                                    java.util.Date fechaNacimiento, String nickname) {
        Jugador jugador = new Jugador(contadorId++, nombre, apellidos, email, fechaNacimiento, nickname);
        jugadores.add(jugador);
        return jugador;
    }

    public Jugador buscarJugadorPorNickname(String nickname) {
        for (Jugador jugador : jugadores) {
            if (jugador.getNickname().equals(nickname)) {
                return jugador;
            }
        }
    }
}

