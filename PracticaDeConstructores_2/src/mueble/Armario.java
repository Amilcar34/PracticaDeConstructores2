package mueble;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Armario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entradaDeConsola = new Scanner(System.in);
		Muebles armario = new Muebles();
		
		
		armario.alto_usuario(JOptionPane.showInputDialog(JOptionPane.showInputDialog("introduce LO QUE DIRA EL SIG CARTEL")));
		System.out.println("la altura: " + armario.alto_para_usuario());
		
		int ancho_usuario = entradaDeConsola.nextInt();
		armario.ancho_usuario(ancho_usuario);
		System.out.println(armario.ancho_para_usuario());
		
	}

}
