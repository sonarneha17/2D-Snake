
import java.awt.Color;
import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GamePlay gameplay=new GamePlay();
		JFrame obj=new JFrame();
		obj.setBounds(10,10,905,700);
		obj.setBackground(Color.DARK_GRAY);
		obj.setResizable(false);
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		obj.add(gameplay);
		obj.setVisible(true);
		gameplay.setVisible(true);
	}

}
