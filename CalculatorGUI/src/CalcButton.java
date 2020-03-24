//Calvin LaClair//

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

class CalcButton extends CalcFieldText
{
	private final JPanel calcPanel;

	public CalcButton()
	{
		calcPanel = new JPanel();
		
		calcPanel.setLayout(new GridLayout(4, 4));
		
		JButton k1 = new JButton ("7");
		JButton k2 = new JButton ("8");
		JButton k3 = new JButton ("9");
		JButton k4 = new JButton ("/");
		
		add(k1);
		add(k2);
		add(k3);
		add(k4);
		
		JButton k5 = new JButton ("4");
		JButton k6 = new JButton ("5");
		JButton k7 = new JButton ("6");
		JButton k8 = new JButton ("*");
		
		add(k5);
		add(k6);
		add(k7);
		add(k8);
		
		JButton k9 = new JButton ("1");
		JButton k10 = new JButton ("2");
		JButton k11 = new JButton ("3");
		JButton k12 = new JButton ("-");
		
		add(k9);
		add(k10);
		add(k11);
		add(k12);
		
		JButton k13 = new JButton ("0");
		JButton k14 = new JButton (".");
		JButton k15 = new JButton ("=");
		JButton k16 = new JButton ("+");
		
		add(k13);
		add(k14);
		add(k15);
		add(k16);
	}

}