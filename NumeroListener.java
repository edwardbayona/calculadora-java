package Proyectos1;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

import java.awt.event.ActionEvent;


public class NumeroListener implements ActionListener{
private String texto;
private JTextField pantalla;
	
	public NumeroListener(String texto, JTextField pantalla) {
		this.texto = texto;
		this.pantalla = pantalla;
	}
	
		
	@Override
	public void actionPerformed(ActionEvent e) {
		
		String expresion = pantalla.getText();
		int pos;
		
		if(texto.equals("=")) {
			if(expresion.indexOf("+") != -1) {
				pos = expresion.indexOf("+");
				determinarNumeros(expresion,pos,"+");
			}else if(expresion.indexOf("-") != -1) {
				pos = expresion.indexOf("-");
				determinarNumeros(expresion,pos,"-");
			}else if(expresion.indexOf("*") != -1) {
				pos = expresion.indexOf("*");
				determinarNumeros(expresion,pos,"*");
			}else if (expresion.indexOf("/") != -1) {
				pos = expresion.indexOf("/");
				determinarNumeros(expresion,pos,"/");
			}else {
				
			}
		}else {
			pantalla.setText(pantalla.getText() + texto);
		}
		
		
		//System.out.println("Boton presionado " + texto);
	}
	
	public void determinarNumeros(String expresion,  int pos , String operador) {
		String numeroUnoString;
		String numeroDosString;
		
		numeroUnoString=  expresion.substring(0, pos);
		numeroDosString= expresion.substring(pos + 1);
		
		double num1=Double.parseDouble(numeroUnoString);
		double num2=Double.parseDouble(numeroDosString);
		double resultado =0;
		
		switch(operador){
			
			case "+" : resultado=num1+num2;
			break;
			case "-": resultado = num1-num2;
			break;
			case "*": resultado = num1* num2;
			break;
			case "/": if(num2 != 0) {
				resultado = num1/num2;
			}else {
				pantalla.setText("Error: division por 0");
				return;
			}
			
			
		}
		
		pantalla.setText(String.valueOf(resultado));
	}

}
