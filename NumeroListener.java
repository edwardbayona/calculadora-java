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
		pantalla.setText(pantalla.getText() + texto);
		//System.out.println("Boton presionado " + texto);
	}
}
