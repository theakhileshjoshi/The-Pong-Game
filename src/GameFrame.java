
import javax.swing.*;

public class GameFrame extends JFrame{
	private static final long serialVersionUID = 1L;
	GamePanel panel;
	
	GameFrame(){
		panel = new GamePanel();
		this.add(panel);
		this.setTitle("The Pong Game");
		this.setResizable(false);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pack();
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		this.setBackground(getForeground());
	}
}
