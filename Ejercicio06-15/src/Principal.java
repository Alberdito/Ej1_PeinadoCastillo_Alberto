/* 15. Programa que lea una cadena que contiene el nombre y apellidos de una persona, y lo
devuelva en formato «Apellidos, Iniciales». Ejemplo:
		Entrada -> Juan Francisco García Ruiz
		Salida -> García Ruiz, J. F. */

import java.util.Scanner;

public class Principal {
/**
 * Función principal
 * @param args
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		String sCadena1, sApellido1, sApellido2, sNombre, sIniciales;
		int iUltimoespacio, iPosespacio, iPos;
		
		System.out.println("Inserte su nombre completo y apellidos:");
		sCadena1 = entrada.nextLine();
		iUltimoespacio = sCadena1.length();
		
		iUltimoespacio = sCadena1.lastIndexOf(' ');
		sApellido2 = sCadena1.substring(iUltimoespacio+1, sCadena1.length());
		sCadena1 = sCadena1.substring(0, iUltimoespacio);
		
		iUltimoespacio = sCadena1.lastIndexOf(' ');
		sApellido1 = sCadena1.substring(iUltimoespacio+1, sCadena1.length());
		sCadena1 = sCadena1.substring(0, iUltimoespacio);
		
		sIniciales = sCadena1.substring(0, 1) + ". ";
		
		iPosespacio=0;
		do
		{
			iPos= sCadena1.indexOf(" ", iPosespacio);
			if (iPos != -1)
			{
				sIniciales = sIniciales + sCadena1.substring(iPos+1, iPos+2) + ". ";
				iPosespacio = iPos + 1;
			}
			
		}while (iPos != -1);
		
		System.out.println(sApellido1 + " " + sApellido2 + ", " + sIniciales);
		
		
		entrada.close();
	}

}
