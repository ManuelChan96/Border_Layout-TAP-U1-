import javax.swing.*;
import java.awt.*;

public class Ejemplo extends JFrame{
	public Ejemplo(){
		setLayout(new BorderLayout());
		add("North", new JButton("Norte."));
 		add("South", new JButton("Sur."));
 		add("East", new JButton("Este."));
 		add("West", new JButton("Oeste."));
		add("Center", new JButton("Centro."));
 		setVisible(true);
		setBounds(0,0,500,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String args[]){
		Ejemplo r = new Ejemplo();	
	}
}
