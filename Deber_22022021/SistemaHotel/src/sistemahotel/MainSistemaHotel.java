/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemahotel;

import java.text.ParseException;
import java.text.SimpleDateFormat;


/**
 *
 * @author David Herrera
 */
public class MainSistemaHotel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        Reservacion reserva1=new Reservacion();
        SimpleDateFormat fmt=new SimpleDateFormat("dd-MM-yyyy");   
        SimpleDateFormat fmt2=new SimpleDateFormat("HH:mm:ss");
        reserva1.setFechaIngreso(fmt.parse("01-03-2021"));
        reserva1.setFechaSalida(fmt.parse("05-03-2021"));
        reserva1.setHoraIngreso(fmt2.parse("10:15"));
        reserva1.setHoraSalida(fmt2.parse("12:00"));   
        Habitacion habitaciondeBDD=obtenerHabitacionBDD();
        reserva1.setHabitacion(habitaciondeBDD);
        Cliente clientedeBDD=obtenerClienteBDD();
        reserva1.setCliente(clientedeBDD);
    }
    public static Habitacion obtenerHabitacionBDD(){
        Habitacion habitacion =new Habitacion();
        habitacion.setIdHabitacion(1);
        habitacion.setEstado(true);
        habitacion.setDescripcion("Habitación Doble con Aire Acondicionado");
        habitacion.setPrecio(Double.parseDouble("60"));
        return habitacion;
    } 
    public static Cliente obtenerClienteBDD(){
        Cliente cliente =new Cliente();
        Persona persona =new Persona();
        persona.setIdPersona(Integer.parseInt("1712467899"));
        persona.setNombres("David Herrera");
        persona.setDireccion("Av. Napo y Villaflora");
        persona.setEmail("david1985@yahoo.com");
        cliente.setProcedencia("Quito");
        cliente.setTelefono("0935763213");
        return cliente;
    } 
}


