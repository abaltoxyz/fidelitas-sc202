/*
PRACTICA 1: Jugadores de un equipo de fútbol
Estudiante: K. Andrés Baltodano Ramírez
Facultad de Ingeniería, Universidad Fidélitas
SC-202: Introducción a la Programación con Objetos
Profesores: Melanie Benavides, Javier Montoya
Enero, 2026
*/

package jugadoresfidelitas;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        String nombre;
        int edad;
        int dorsal;
        int posicionInput; // Se usarán opciones predefinidas para facilitar la introducción de los datos
        /* Posiciones:
        1: Portero
        2: Defensa
        3: Mediocampo
        4: Delantero
        */
        String posicion="";
        int titularInput; // Opciones predefinidas para facilitar la introducción de los datos
        /* ¿Banca o titular?:
        1: Banca
        2: Titular
        */
        String titular = "";
        
        // Recoger los datos del jugador
        nombre = JOptionPane.showInputDialog(null, "Escriba el nombre del jugador:");
        edad = Integer.parseInt(
                JOptionPane.showInputDialog(null, "Escriba la edad del jugador:"));
        dorsal = Integer.parseInt(
                JOptionPane.showInputDialog(null, "Escriba el dorsal (número de camiseta) del jugador:"));
        
        // Determinar la posición
        posicionInput = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Cuál es la posición del jugador? "
                + "\n1. Portero \n2. Defensa \n3. Mediocampo \n4. Delantero"));
        if (posicionInput == 1){ 
            posicion = "Portero";
        }
        else if (posicionInput == 2){
            posicion = "Defensa";
        } 
        else if (posicionInput == 3){
            posicion = "Mediocampo";
        }
        else if (posicionInput == 4){
            posicion = "Delantero";
        }
        else{
            posicion = "No se seleccionó una posición válida"; // Atrapar algunos inputs incorrectos y mostrar error.
        }
        
        // Determinar si es titular o no
        titularInput = Integer.parseInt(JOptionPane.showInputDialog(null, "¿El jugador es banca o titular? \n1. Banca \n2. Titular"));
        if (titularInput == 1){
            titular = "Banca";
        }
        else if (titularInput == 2){
            titular = "Titular";
        }
        else {
            titular = "No se definió si es banca o titular"; // Atrapar algunos inputs incorrectos y mostrar error.
        }
        
        // Mostrar el resumen de los datos ingresados
        JOptionPane.showMessageDialog(null, "Los datos del jugador son: "
                + "\nNombre: " + nombre
                + "\nEdad: " + edad
                + "\nDorsal: " + dorsal
                + "\nPosición: " + posicion
                + "\n¿Banca o titular?: " + titular);
    }
    
}


