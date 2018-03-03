
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Kevin Ortiz
 */
public class EVA1_15_ARREGLOS_MULTI_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int[][] aiEdades;
        int iNoGrp, iNoAli;// Cantidad de grupos, cantidad de alumnos
        Scanner scCaptu = new Scanner(System.in);
        System.out.println("Introduce el # de grupos: ");
        iNoGrp = scCaptu.nextInt();// EL # DE GRUPOS SON LAS FILAS DEL ARREGLO
        //(MATRIZ)
        aiEdades = new int[iNoGrp][];
        //FOR PARA PREGUNTAR PARA CADA GRUPO LA CANTIDAD DE ALUMNOS
        for (int i = 0; i < aiEdades.length; i++) {
            System.out.println("Cuantos alumnos tiene el grupo " + i + ":");
            iNoAli = scCaptu.nextInt();
            aiEdades[i] = new int[iNoAli];
        }
        //CAPTURAR LAS EDADES}: RECORRER EL ARREGLO
        for (int i = 0; i < aiEdades.length; i++) {//FILAS (GRUPOS)
            for (int j = 0; j < aiEdades[i].length; j++) {// ALUMNOS PARA EL GPO ACTUAL
                System.out.println("Cual es la edad Grupo " + i + " -Alumno " + j + " ?");
                aiEdades[i][j] = scCaptu.nextInt(); // CAPTURAMOS LA EDAD
            }
        }

        for (int i = 0; i < aiEdades.length; i++) {//FILAS (GRUPOS)
            for (int j = 0; j < aiEdades[i].length; j++) {// ALUMNOS PARA EL GPO ACTUAL
                System.out.println("La edad de grupo " + i + " - Alumno" + j + "es" + aiEdades[i][j] );
            }
        }
        //CALCULAR EL PROMEDIO DE EDADES
        int iAcum, iAcumTodos = 0, iAcumNoAlu= 0;
        for (int i = 0; i < aiEdades.length; i++) {
            iAcum = 0;
            iAcumNoAlu = iAcumNoAlu + aiEdades[i].length; //CANTIDAD DE ALUMNOS
            for (int j = 0; j < aiEdades[i].length; j++) {
                iAcum = iAcum + aiEdades[i][j];
                iAcumTodos = iAcumTodos + aiEdades[i][j];
                
            }   
            System.out.println("EL promedio para el grupo "
                    + i + " = " + (iAcum / aiEdades[i].length));
        }
        System.out.println("El promedio de todos los grupos es: " + (iAcumTodos/iAcumNoAlu));
        
    }
}
