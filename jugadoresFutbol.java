package jugadoresfidelitas;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        String nombre;
        int edad;
        int numeroCamiseta;
        String posicion;
        boolean banca;
        
        nombre = JOptionPane.showInputDialog(null, "Escriba el nombre del jugador:");
        JOptionPane.showMessageDialog(null,"Los datos del jugador son: Nombre: " + nombre);
    }
    
}
