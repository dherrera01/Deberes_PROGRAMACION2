/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemahotel;

/**
 *
 * @author David Herrera
 */
public class Factura {
    
   private Integer idFactura;
   private String Hotel;   
   private Double Descuentos;
   private Double Subtotal;
   private Double IVA;
   private Double Total;
   private Cliente cliente;   

    public Integer getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(Integer idFactura) {
        this.idFactura = idFactura;
    }

    public String getHotel() {
        return Hotel;
    }

    public void setHotel(String Hotel) {
        this.Hotel = Hotel;
    }

    public Double getDescuentos() {
        return Descuentos;
    }

    public void setDescuentos(Double Descuentos) {
        this.Descuentos = Descuentos;
    }

    public Double getSubtotal() {
        return Subtotal;
    }

    public void setSubtotal(Double Subtotal) {
        this.Subtotal = Subtotal;
    }

    public Double getIVA() {
        return IVA;
    }

    public void setIVA(Double IVA) {
        this.IVA = IVA;
    }

    public Double getTotal() {
        return Total;
    }

    public void setTotal(Double Total) {
        this.Total = Total;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
   
}
