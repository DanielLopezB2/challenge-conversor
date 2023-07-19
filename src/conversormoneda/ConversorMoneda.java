package conversormoneda;

import clases.Moneda;
import javax.swing.JOptionPane;


public class ConversorMoneda {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Moneda miMoneda = new Moneda();
        
        Object[] valores = { "Conversor de moneda", "Conversor de  temperatura"};
        Object valorSeleccionado = JOptionPane.showInputDialog(null,
             "Seleccione un conversor", "Menu",
             JOptionPane.INFORMATION_MESSAGE, null,
             valores, valores[0]);
        
        
        while (valorSeleccionado.equals("Conversor de moneda")) {
            
            String cantidad = JOptionPane.showInputDialog("Ingrese la cantidad de dinero que desea convertir:");
            
            
            
            if (esNumerico(cantidad)) {
                
                double numeroCantidad = Double.parseDouble(cantidad);
                
                Object[] monedas = { "COP a USD", "COP a EUR", "COP a LIBRAS", "COP a YEN", "COP a WON", "USD a COP", "EUR a COP", "LIBRAS a COP", "YEN a COP", "WON a COP"};      
                Object eleccionMoneda = JOptionPane.showInputDialog(null,
             "Seleccione un conversor", "Monedas",
             JOptionPane.INFORMATION_MESSAGE, null,
             monedas, monedas[0]);
                
                if (eleccionMoneda.equals("COP a USD")) {
                   miMoneda.COPtoUSD(numeroCantidad, "COP", "USD");
                }
                
                else if (eleccionMoneda.equals("USD a COP")) {   
                    miMoneda.USDtoCOP(numeroCantidad, "USD", "COP");
                }
                
                else if (eleccionMoneda.equals("COP a EUR")) {
                    miMoneda.COPtoEUR(numeroCantidad, "COP", "EUR");
                }
                
                else if (eleccionMoneda.equals("EUR a COP")) {
                    miMoneda.EURtoCOP(numeroCantidad, "EUR", "COP");
                }
                
                else if (eleccionMoneda.equals("COP a LIBRAS")) {
                    miMoneda.COPtoLIBRAS(numeroCantidad, "COP", "LIBRAS");
                }
                
                else if (eleccionMoneda.equals("LIBRAS a COP")) {
                    miMoneda.LIBRAStoCOP(numeroCantidad, "LIBRAS", "COP");
                }
                
                else if (eleccionMoneda.equals("COP a YEN")) {    
                    miMoneda.COPtoYEN(numeroCantidad, "COP", "YEN");
                }
                
                else if (eleccionMoneda.equals("YEN a COP")) {
                    miMoneda.YENtoCOP(numeroCantidad, "YEN", "COP");
                }
                
                else if (eleccionMoneda.equals("COP a WON")) {
                    miMoneda.COPtoWON(numeroCantidad, "COP", "WON");
                }
                
                else if (eleccionMoneda.equals("WON a COP")) {
                    miMoneda.WONtoCOP(numeroCantidad, "WON", "COP");
                }
                
            }  
            
            else {
                
                JOptionPane.showMessageDialog(null, "El valor debe ser numerico", "Error", JOptionPane.ERROR_MESSAGE);
                
            }
            
            int continuar = JOptionPane.showConfirmDialog(null, "Desea continuar?", "Seleccione una opcion" ,JOptionPane.YES_NO_CANCEL_OPTION);
            
            if (continuar != JOptionPane.YES_OPTION ) {
                
                JOptionPane.showMessageDialog(null, "Programa terminado", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                
                break;
                
            }
            
        }
       
    }
    
    private static boolean esNumerico(String cantidadIngresada) {
        
        try {
            Double.parseDouble(cantidadIngresada);
            return true;
            
        } catch (NumberFormatException e) {
            return false;
        }
    }
    
}
