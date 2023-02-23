import java.util.Scanner;
public class Principal 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		double dPeso, dAltura, dIMC;
		String sDiagnostico;
		
		//
		
		System.out.println("Introduzca su peso (Kg):");
		dPeso = entrada.nextDouble();
		
		System.out.println("Ahora introduzca su altura (m)");
		dAltura = entrada.nextDouble();
		
		dIMC = dPeso/(dAltura*dAltura);
		
		if(dIMC < 18.5)
		{
			sDiagnostico = "Bajo peso";
		}
		else if (dIMC <= 24.9)
		{
			sDiagnostico = "Peso normal (saludable)";
		}
		else if (dIMC <= 29.9)
		{
			sDiagnostico = "Sobrepeso";
		}
		else if (dIMC <= 40)
		{
			sDiagnostico = "Obesidad premórbida";
		}
		else
		{
			sDiagnostico = "Obesidad mórbida";
		}
		
		System.out.printf("El paciente de %.2f kg y %.2f m de altura tiene un IMC de %.2f y tiene un diagnóstico de: %s", dPeso, dAltura, dIMC, sDiagnostico);
	}

}