package clases;

import java.text.NumberFormat;
import java.util.Locale;
import javax.swing.JOptionPane;


public class Moneda {
    
    double cantidad;
    String tipoOrigen;
    String tipoDestino;

    public Moneda(double cantidad, String tipoOrigen, String tipoDestino) {
        this.cantidad = cantidad;
        this.tipoOrigen = tipoOrigen;
        this.tipoDestino = tipoDestino;
    }

    public Moneda() {
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public String getTipoOrigen() {
        return tipoOrigen;
    }

    public void setTipoOrigen(String tipoOrigen) {
        this.tipoOrigen = tipoOrigen;
    }

    public String getTipoDestino() {
        return tipoDestino;
    }

    public void setTipoDestino(String tipoDestino) {
        this.tipoDestino = tipoDestino;
    }
    
    public void COPtoUSD(double cantidad, String tipoOrigen,String tipoDestino) {
        
        double totalConversion = cantidad / 4100;
        
         // Crear el formato de moneda
        NumberFormat formatoMoneda = NumberFormat.getCurrencyInstance(Locale.getDefault());
        String valorFormateado = formatoMoneda.format(totalConversion);
        
        JOptionPane.showMessageDialog(null, "Tienes " + valorFormateado + tipoDestino, "Total", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public void COPtoEUR(double cantidad, String tipoOrigen,String tipoDestino) {
        
        double totalConversion = cantidad / 4500;
        
         // Crear el formato de moneda
        NumberFormat formatoMoneda = NumberFormat.getCurrencyInstance(Locale.getDefault());
        String valorFormateado = formatoMoneda.format(totalConversion);
        
        JOptionPane.showMessageDialog(null, "Tienes " + valorFormateado + tipoDestino, "Total", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public void COPtoLIBRAS(double cantidad, String tipoOrigen,String tipoDestino) {
        
        double totalConversion = cantidad / 5300;
        
         // Crear el formato de moneda
        NumberFormat formatoMoneda = NumberFormat.getCurrencyInstance(Locale.getDefault());
        String valorFormateado = formatoMoneda.format(totalConversion);
        
        JOptionPane.showMessageDialog(null, "Tienes " + valorFormateado + tipoDestino, "Total", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public void COPtoYEN(double cantidad, String tipoOrigen,String tipoDestino) {
        
        double totalConversion = cantidad / 29.47;
        
         // Crear el formato de moneda
        NumberFormat formatoMoneda = NumberFormat.getCurrencyInstance(Locale.getDefault());
        String valorFormateado = formatoMoneda.format(totalConversion);
        
        JOptionPane.showMessageDialog(null, "Tienes " + valorFormateado + tipoDestino, "Total", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public void COPtoWON(double cantidad, String tipoOrigen,String tipoDestino) {
        
        double totalConversion = cantidad / 3.22;
        
         // Crear el formato de moneda
        NumberFormat formatoMoneda = NumberFormat.getCurrencyInstance(Locale.getDefault());
        String valorFormateado = formatoMoneda.format(totalConversion);
        
        JOptionPane.showMessageDialog(null, "Tienes " + valorFormateado + tipoDestino, "Total", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public void USDtoCOP(double cantidad, String tipoOrigen,String tipoDestino) {
        
        double totalConversion = cantidad / 4100;
        
         // Crear el formato de moneda
        NumberFormat formatoMoneda = NumberFormat.getCurrencyInstance(Locale.getDefault());
        String valorFormateado = formatoMoneda.format(totalConversion);
        
        JOptionPane.showMessageDialog(null, "Tienes " + valorFormateado + tipoDestino, "Total", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public void EURtoCOP(double cantidad, String tipoOrigen,String tipoDestino) {
        
        double totalConversion = cantidad / 4500;
        
         // Crear el formato de moneda
        NumberFormat formatoMoneda = NumberFormat.getCurrencyInstance(Locale.getDefault());
        String valorFormateado = formatoMoneda.format(totalConversion);
        
        JOptionPane.showMessageDialog(null, "Tienes " + valorFormateado + tipoDestino, "Total", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public void LIBRAStoCOP(double cantidad, String tipoOrigen,String tipoDestino) {
        
        double totalConversion = cantidad / 5300;
        
         // Crear el formato de moneda
        NumberFormat formatoMoneda = NumberFormat.getCurrencyInstance(Locale.getDefault());
        String valorFormateado = formatoMoneda.format(totalConversion);
        
        JOptionPane.showMessageDialog(null, "Tienes " + valorFormateado + tipoDestino, "Total", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public void YENtoCOP(double cantidad, String tipoOrigen,String tipoDestino) {
        
        double totalConversion = cantidad / 29.47;
        
         // Crear el formato de moneda
        NumberFormat formatoMoneda = NumberFormat.getCurrencyInstance(Locale.getDefault());
        String valorFormateado = formatoMoneda.format(totalConversion);
        
        JOptionPane.showMessageDialog(null, "Tienes " + valorFormateado + tipoDestino, "Total", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public void WONtoCOP(double cantidad, String tipoOrigen,String tipoDestino) {
        
        double totalConversion = cantidad / 3.22;
        
         // Crear el formato de moneda
        NumberFormat formatoMoneda = NumberFormat.getCurrencyInstance(Locale.getDefault());
        String valorFormateado = formatoMoneda.format(totalConversion);
        
        JOptionPane.showMessageDialog(null, "Tienes " + valorFormateado + tipoDestino, "Total", JOptionPane.INFORMATION_MESSAGE);
    }
    
}
