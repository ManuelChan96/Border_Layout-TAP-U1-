//Bibliotecas.
import javax.swing.*;
import java.awt.*;
//Clase Ejemplo.
public class Ejemplo extends JFrame{
protected JPanel p;
	public Ejemplo(){
		p = new JPanel();
		//Esto es solo una prueba para el uso de GitHub
		setLayout(new BorderLayout());
		add("North", new JButton("Norte."));
 		add("South", new JButton("Sur."));
 		add("East", new JButton("Este."));
 		add("West", new JButton("Oeste."));
		p.setLayout(new BorderLayout());
		
		p.add("Center",new JButton("Boton."));
                p.add("South", new JLabel("Sur.",JLabel.CENTER));
                p.add("East", new JLabel("Este."));
                p.add("West", new JLabel("Oeste."));
		p.add("North", new JLabel("Norte.",JLabel.CENTER));

		add("Center", p);
 		setVisible(true);
		setBounds(0,0,500,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String args[]){
		Ejemplo r = new Ejemplo();	
	}
}
