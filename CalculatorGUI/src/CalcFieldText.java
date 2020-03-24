//Calvin LaClair//

import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.BorderLayout;


class CalcFieldText extends JPanel
{
	private final JTextField calcField;
	
	public CalcFieldText()
	{
	calcField = new JTextField("0", 16);
	calcField.setEnabled(true);
	add(calcField, BorderLayout.NORTH);
	}
	
}
