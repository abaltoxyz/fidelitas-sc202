
package practica2;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        String nombre;
        String apellido;
        byte edad;
        int telefono;
        
        nombre = JOptionPane.showInputDialog(null, "Escriba su nombre");
        apellido = JOptionPane.showInputDialog(null, "Escriba su apellido");
        edad = Byte.parseByte(JOptionPane.showInputDialog(null, "Escriba su edad"));
        telefono = Integer.parseInt(JOptionPane.showInputDialog(null, "Escriba su telefono"));
        
        JOptionPane.showMessageDialog(null, "Bienvenido al curso de Programación Orientada a Objetos " + nombre + " " + apellido
        + ". Tenemos que su edad es " + edad + " y la forma de contactarle es mediante el número de teléfono " + telefono
        + ". Si la información es correcta presione Y de lo contrario presione N.");
        
    }
    
    public static void parImpar(String[] args){
        int numeroEntero;
        int resultado;
        
        numeroEntero = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite un número"));
        resultado = numeroEntero%2;
        
        if (resultado == 0){
            JOptionPane.showMessageDialog(null, "El número es par.");
        }
        else {
            JOptionPane.showMessageDialog(null, "El número es impar.");
        }
    }
    
    public static void multiploDiez(String[] args) {
        int numeroEntero;
        int resultado;
        
        numeroEntero = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite un número"));
        
        resultado = numeroEntero%10;
        
        if (resultado == 0){
            JOptionPane.showMessageDialog(null, "El número es múltiplo de 10.");
        }
        else {
            JOptionPane.showMessageDialog(null, "El número NO es múltiplo de 10.");
        }
    }
    
    public static void ordenarMayorMenor(String[] args) {
          short numeroPrimero = Short.parseShort(JOptionPane.showInputDialog(null, "Escriba un primer número"));
          short numeroSegundo = Short.parseShort(JOptionPane.showInputDialog(null, "Escriba un segundo número"));
          short numeroTercero = Short.parseShort(JOptionPane.showInputDialog(null, "Escriba un tercer número"));
          short numeroMayor = 0;
          short numeroMedio = 0;
          short numeroMenor = 0;
          
          // definir el mayor
          if (numeroPrimero > numeroSegundo && numeroPrimero > numeroTercero){
              numeroMayor = numeroPrimero;
          }
          if (numeroSegundo > numeroPrimero && numeroSegundo > numeroTercero){
              numeroMayor = numeroSegundo;
          }
          if (numeroTercero > numeroPrimero && numeroTercero > numeroSegundo){
              numeroMayor = numeroTercero;
          }
          
          // definir el menor
          if (numeroPrimero < numeroSegundo && numeroPrimero < numeroTercero){
              numeroMenor = numeroPrimero;
          }
          if (numeroSegundo < numeroPrimero && numeroSegundo < numeroTercero){
              numeroMenor = numeroSegundo;
          }
          if (numeroTercero < numeroPrimero && numeroTercero < numeroSegundo){
              numeroMenor = numeroTercero;
          }  
          
          // definir el del medio
          if ((numeroMayor == numeroPrimero && numeroMenor == numeroSegundo) ||
             (numeroMayor == numeroSegundo && numeroMenor == numeroPrimero)){
              numeroMedio = numeroTercero;
          }
          if ((numeroMayor == numeroTercero && numeroMenor == numeroPrimero) ||
             (numeroMayor == numeroPrimero && numeroMenor == numeroTercero)){
              numeroMedio = numeroSegundo;
          }
          if ((numeroMayor == numeroTercero && numeroMenor == numeroSegundo) ||
             (numeroMayor == numeroSegundo && numeroMenor == numeroTercero)){
              numeroMedio = numeroPrimero;
          }
          
          // Imprimir resultados
          JOptionPane.showMessageDialog(null, "El orden (de mayor a menor) de los números ordenados es: " 
                  + numeroMayor + ", "
                  + numeroMedio + ", "
                  + numeroMenor + ".");

    }
        
    public static void contarCien(String[] args) {
        byte i = 1;
        String cadena = "";
        String numeroString;
        
        for (i = 1; i <= 100; i++){
            numeroString = Byte.toString(i);
            cadena  = cadena.concat(numeroString).concat(", ");
        }
        
        JOptionPane.showMessageDialog(null, cadena); 
    }
    
}
