/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemahotel;

import java.util.Date;

/**
 *
 * @author David Herrera
 */
public class Reservacion {
      private Integer idReservacion;      
      private Cliente cliente;
      private Habitacion habitacion;
      private Date FechaIngreso;
      private Date FechaSalida;
      private Date HoraIngreso;
      private Date HoraSalida;
      private Integer CantidadDias;

    public Integer getIdReservacion() {
        return idReservacion;
    }

    public void setIdReservacion(Integer idReservacion) {
        this.idReservacion = idReservacion;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }

    public Date getFechaIngreso() {
        return FechaIngreso;
    }

    public void setFechaIngreso(Date FechaIngreso) {
        this.FechaIngreso = FechaIngreso;
    }

    public Date getFechaSalida() {
        return FechaSalida;
    }

    public void setFechaSalida(Date FechaSalida) {
        this.FechaSalida = FechaSalida;
    }

    public Date getHoraIngreso() {
        return HoraIngreso;
    }

    public void setHoraIngreso(Date HoraIngreso) {
        this.HoraIngreso = HoraIngreso;
    }

    public Date getHoraSalida() {
        return HoraSalida;
    }

    public void setHoraSalida(Date HoraSalida) {
        this.HoraSalida = HoraSalida;
    }

    public Integer getCantidadDias() {
        return CantidadDias;
    }

    public void setCantidadDias(Integer CantidadDias) {
        this.CantidadDias = CantidadDias;
    }

  
}
