package Proyectos1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalculadoraVisual {

	public static void main(String[] args) {
		
		JFrame ventana = new JFrame("Calculadora visual");
		ventana.setSize(300, 400);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setLayout(new BorderLayout());
		
		JTextField pantalla = new JTextField();
		pantalla.setEditable(false);
		pantalla.setHorizontalAlignment(JTextField.RIGHT);
		pantalla.setFont(new Font("Arial", Font.PLAIN, 24));
		
		ventana.add(pantalla,BorderLayout.NORTH);
		
		ventana.setVisible(true);
		
		JPanel panelBotones = new JPanel();
		panelBotones.setLayout(new GridLayout(4,4));
		
		JButton boton7 = new JButton("7");
		boton7.addActionListener(new NumeroListener("7",pantalla));
		panelBotones.add(boton7);
		
		JButton boton8 = new JButton("8");
		boton8.addActionListener(new NumeroListener("8",pantalla));
		panelBotones.add(boton8);
		
		JButton boton9 = new JButton("9");
		boton9.addActionListener(new NumeroListener("9",pantalla));
		panelBotones.add(boton9);
		
		JButton botonDividir = new JButton("/");
		botonDividir.addActionListener(new NumeroListener("/",pantalla));
		panelBotones.add(botonDividir);
		
		JButton boton4 = new JButton("4");
		boton4.addActionListener(new NumeroListener("4",pantalla));
		panelBotones.add(boton4);
		
		JButton boton5 = new JButton("5");
		boton5.addActionListener(new NumeroListener("5",pantalla));
		panelBotones.add(boton5);
		
		JButton boton6 = new JButton("6");
		boton6.addActionListener(new NumeroListener("6",pantalla));
		panelBotones.add(boton6);
		
		JButton botonMultiplicar = new JButton("*");
		botonMultiplicar.addActionListener(new NumeroListener("*",pantalla));
		panelBotones.add(botonMultiplicar);
		
		JButton boton1 = new JButton("1");
		boton1.addActionListener(new NumeroListener("1",pantalla));
		panelBotones.add(boton1);
		
		JButton boton2 = new JButton("2");
		boton2.addActionListener(new NumeroListener("2",pantalla));
		panelBotones.add(boton2);
		
		JButton boton3 = new JButton("3");
		boton3.addActionListener(new NumeroListener("3",pantalla));
		panelBotones.add(boton3);
		
		JButton botonRestar = new JButton("-");
		botonRestar.addActionListener(new NumeroListener("-",pantalla));
		panelBotones.add(botonRestar);
		
		JButton botonC = new JButton("C");
		botonC.addActionListener(new NumeroListener("C",pantalla));
		panelBotones.add(botonC);
		
		JButton boton0 = new JButton("0");
		boton0.addActionListener(new NumeroListener("0",pantalla));
		panelBotones.add(boton0);
		
		JButton botonIgual = new JButton("=");
		botonIgual.addActionListener(new NumeroListener("=",pantalla));
		botonIgual.setBackground(Color.GREEN);
		panelBotones.add(botonIgual);
		
		JButton botonSumar = new JButton("+");
		botonSumar.addActionListener(new NumeroListener("+",pantalla));
		panelBotones.add(botonSumar);
		
		ventana.add(panelBotones);

	}

}


