package org.torneo.modelo;

import java.util.Date;
import java.util.Objects;

public class Jugador {
    private int id;
    private String nombre;
    private String apellidos;
    private String email;
    private Date fNacimiento;
    private String nickname;

    public Jugador() {
    }

    public Jugador(int id, String nombre, String apellidos, String email, Date fNacimiento, String nickname) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
        this.fNacimiento = fNacimiento;
        this.nickname = nickname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getfNacimiento() {
        return fNacimiento;
    }

    public void setfNacimiento(Date fNacimiento) {
        this.fNacimiento = fNacimiento;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Jugador jugador = (Jugador) o;
        return id == jugador.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
