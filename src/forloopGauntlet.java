import javax.swing.JOptionPane;

public class forloopGauntlet {
public static void main(String[] args) {
	for (int i = 100; i < 0; i--) {
		JOptionPane.showMessageDialog(null, i);
	}
}
}
