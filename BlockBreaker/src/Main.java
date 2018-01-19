import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("Block Breaker"); //Name of the window
		
		BlockBreakerPanel panel = new BlockBreakerPanel();  //在调用该Constructor的时候，blocks在Constructor里已经全部建立
		
		frame.getContentPane().add(panel);
		frame.setVisible(true);
		frame.setSize(500, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
	}

}
