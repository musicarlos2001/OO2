package main;

import javax.swing.JFrame;
import javax.swing.JLabel;
//Poderia ser melhor
import processador.Leitura;
/**
 * 
 * @author RuiHenrique
 * @author ThalesRibeiro
 * @author VictorSilva
 * 
 * 
 *
 */
public class main extends JFrame{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new main();
		
		//Leitura.ler();
	}
	
	main() {
		JLabel jlbHelloWorld;
		/**
		 * @see Leitura.ler()
		 */
		if(Leitura.ler())
		{
			jlbHelloWorld = new JLabel("Sucesso");
		}
		else
		{
			jlbHelloWorld = new JLabel("Deu Ruim");
		}
		add(jlbHelloWorld);
		this.setSize(100, 100);
		// pack();
		setVisible(true);
	}
}
