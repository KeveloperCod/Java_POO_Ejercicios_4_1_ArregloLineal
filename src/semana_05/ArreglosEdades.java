package semana_05;

public class ArreglosEdades {
	
	private int edad [] = {27,22,13,12,25,11,29,70,15,21};
	
	public ArreglosEdades() {
		
	}
	
	public int tamanio(){
		return edad.length;
	}
	
	public int obtener(int i){
		return edad[i];
	}
	
	
	public int sumaEdades(){
		int suma=0;
		for (int i = 0; i < edad.length; i++) 
			suma+=edad[i];
		return suma;
		}
	
	public int edadPromedio(){
	  return sumaEdades() / tamanio();
		
	}
	
	public int edadMayor(){
		int edadMay = edad[0];
		for (int i = 0; i < edad.length; i++) {
			if (edad[i]>edadMay)
			 edadMay= edad[i];
		}
			return edadMay;	 
		}
	
	public int edadMenor(){
		int edadMen = edad[0];
		for (int i = 0; i < edad.length; i++) {
			if (edad[i]<edadMen)
			 edadMen= edad[i];
		}
			return edadMen;	 
		}
	
	public int mayorEdad(){
		int mayEdad=0; //contador de edades
	    for (int i = 0; i < tamanio(); i++) {
			if (edad[i] >= 18) 
				mayEdad++;
		}
	    	return mayEdad; 
	  	}
	
	public int menorEdad(){
		int menorEdad=0; //contador de edades
	    for (int i = 0; i < tamanio(); i++) {
			if (edad[i] < 18) 
				menorEdad++;	
		}
	    	return menorEdad; 
		}
	
	public int posPrimeraEdadAdolescente (){
		int contSueldo=0;
		for (int i = 0; i < edad.length; i++) //recorrido ascendente
		{
			if(edad[i]>850)
				contSueldo++;
				return i;	
		}
		return -1;
	
	}
 	
}