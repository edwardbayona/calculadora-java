package Proyectos1;

import javax.swing.JOptionPane;

public class Calculadora {

	public static void main(String[] args) {
		double primerNumero = leerNumeros("Por favor digite el primer numero");
		String operador = validarOperador("Por favor digite el operador (+ - * /)");
		double segundoNumero = leerNumeros("Por favor digite el segundo numero");
		
		
		operar(primerNumero,segundoNumero,operador);
		

	}
	
	public static void operar (double primerNumero, double segundoNumero, String operador) {
		
		switch(operador) {
		case "+":
			sumarNumeros(primerNumero,segundoNumero);
			break;
		case "-":
			restarNumeros(primerNumero,segundoNumero);
			break;
		case "*":
			multiplicarNumeros(primerNumero,segundoNumero);
			break;
		case "/":
			if(validarDivision(primerNumero,segundoNumero)) {
				dividirNumeros(primerNumero,segundoNumero);
			}else {
				JOptionPane.showMessageDialog(null, "Division no valida");
			}
			break;
			
		default:
			JOptionPane.showMessageDialog(null, "Operador no valido por favor corregir");
		}
		
		
		
		
	}
	
	public static void sumarNumeros(double primerNumero, double segundoNumero) {
		JOptionPane.showMessageDialog(null, "El resultado de la suma es: " + (primerNumero+segundoNumero));
	}
	public static void restarNumeros(double primerNumero, double segundoNumero) {
		JOptionPane.showMessageDialog(null, "La diferencia de la resta es: " + (primerNumero-segundoNumero));
	}
	public static void multiplicarNumeros(double primerNumero, double segundoNumero) {
		JOptionPane.showMessageDialog(null, "El producto de la multiplicacion es: " + (primerNumero*segundoNumero));
	}
	public static void dividirNumeros(double primerNumero, double segundoNumero) {
		JOptionPane.showMessageDialog(null, "El cociente de la division es: " + (primerNumero/segundoNumero));
	}
	
	public static boolean validarDivision(double dividendo, double divisor) {
		if(dividendo == 0 && divisor == 0) {
			JOptionPane.showMessageDialog(null, "Cero entre cero no esta definido");
			return false;
		}else if(dividendo != 0 && divisor == 0) {
			JOptionPane.showMessageDialog(null, "NO se puede dividir entre cero");
			return false;
		}else{
			return true;
		}
		
	}
	
	public static double  leerNumeros(String mensaje) {
		
		while(true) {
			try {
				String input = JOptionPane.showInputDialog(mensaje);
			
				return Double.parseDouble(input);
			}catch(NumberFormatException e){
				JOptionPane.showMessageDialog(null, "Por favor ingrese un numero valido");
			}
		}
		
		
		
	}
	public static String validarOperador(String operador) {
		
		while(true) {
			String input = JOptionPane.showInputDialog(operador);
			
			if(input.equals("+") || input.equals("-") || input.equals("*")|| input.equals("/")) {
				return input;
				
			}else {
				JOptionPane.showMessageDialog(null, "Por favor digite un operador valido (+ , -, *, /)"); 
			}
			
		}
		
		
		
	}

}


	
	
	
