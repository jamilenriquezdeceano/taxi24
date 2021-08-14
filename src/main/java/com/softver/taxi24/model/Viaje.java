package com.softver.taxi24.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;


@Entity(name = "viajes")
public class Viaje {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "fecha")
    private LocalDate fecha;
    @Column(name = "hora_inicio")
    private LocalDateTime hora_inicio;
    @Column(name =  "hora_fin")
    private LocalDateTime hora_fin;
    @Column(name = "estatus")
    private String estatus;
    @ManyToOne
    @JoinColumn(name = "id_conductor")
    private Conductor conductor;
    @ManyToOne
    @JoinColumn(name ="id_pasajero")
    private Pasajero pasajero;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalDateTime getHora_inicio() {
        return hora_inicio;
    }

    public void setHora_inicio(LocalDateTime hora_inicio) {
        this.hora_inicio = hora_inicio;
    }

    public LocalDateTime getHora_fin() {
        return hora_fin;
    }

    public void setHora_fin(LocalDateTime hora_fin) {
        this.hora_fin = hora_fin;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }

    public Conductor getConductor() {
        return conductor;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
    }

    public Pasajero getPasajero() {
        return pasajero;
    }

    public void setPasajero(Pasajero pasajero) {
        this.pasajero = pasajero;
    }

    @Override
    public String toString() {
        return "Viaje{" +
                "id=" + id +
                ", fecha=" + fecha +
                ", hora_inicio=" + hora_inicio +
                ", hora_fin=" + hora_fin +
                ", estatus='" + estatus + '\'' +
                ", conductor=" + conductor +
                ", pasajero=" + pasajero +
                '}';
    }
}
