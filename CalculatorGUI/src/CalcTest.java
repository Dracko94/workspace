//Calvin LaClair//

import javax.swing.JFrame;

public class CalcTest
{
	public static void main(String[] args)
	{
		CalcButton calcButton = new CalcButton();
		CalcFieldText calcTextField = new CalcFieldText();
		CalcFrame calcFrame = new CalcFrame();
		calcFrame.add(calcTextField);
		calcFrame.add(calcButton);
		calcFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		calcFrame.setVisible(true);
		calcFrame.setSize(200, 200);	
	}
}

