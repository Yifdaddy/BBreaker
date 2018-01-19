import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Toolkit;

public class Block extends Rectangle{
	Image pic;
	Block(int a, int b, int w, int h, String s) {
		 super.x = a;
		 super.y = b;
		 super.width = w;
		 super.height = h;
		 pic = Toolkit.getDefaultToolkit().getImage(s);
	}
	
	public void draw(Graphics g, Component c){
		g.drawImage(pic, x, y, width, height, c);
		}
}
