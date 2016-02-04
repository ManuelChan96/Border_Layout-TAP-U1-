import javax.swing.*;
import java.awt.*;

public class Ejemplo2 extends JFrame{
	public Ejemplo2(){
		JFrame ventana = new JFrame("BorderLayout");
		ventana.setSize(345,200);
		ventana.setDefaultCloseOperation(EXIT_ON_CLOSE);
		ventana.setVisible(true);
		JButton boton1 = new JButton("North");
		boton1.setBounds(new Rectangle(10,10,325,45));
 		JButton boton2 = new JButton("South");
		boton2.setBounds(new Rectangle(10,140,325,45));
 		JButton boton3 = new JButton("East");
		boton3.setBounds(new Rectangle(240,65,95,65));
 		JButton boton4 = new JButton("West");
		boton4.setBounds(new Rectangle(10,65,95,65));
		JButton boton5 = new JButton("Center");
		boton5.setBounds(new Rectangle(115,65,115,65));
		ventana.add(boton1);
		ventana.add(boton2);
		ventana.add(boton3);
		ventana.add(boton4);
		ventana.add(boton5);
		ventana.setLayout(null);
	}
	public static void main(String ar[]){
		Ejemplo2 e= new Ejemplo2();
	}
}
