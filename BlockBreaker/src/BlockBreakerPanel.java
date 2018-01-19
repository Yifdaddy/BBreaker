import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JPanel;

public class BlockBreakerPanel extends JPanel{
	ArrayList<Block> blocks = new ArrayList<Block>(); 
	
	BlockBreakerPanel() {
		for (int i = 0; i < 8; i++) {
			blocks.add(new Block((i * 60 + 2), 0, 60, 25, "blue.png"));
		}
		for (int i = 0; i < 8; i++) {
			blocks.add(new Block((i * 60 + 2), 25, 60, 25, "green.png"));
		}
		for (int i = 0; i < 8; i++) {
			blocks.add(new Block((i * 60 + 2), 50, 60, 25, "red.png"));
		}
		for (int i = 0; i < 8; i++) {
			blocks.add(new Block((i * 60 + 2), 75, 60, 25, "yellow.png"));
		}
	}
	public void paintComponent(Graphics g){
		for (Block b : blocks) {
			b.draw(g, this);
		}
	}
}
