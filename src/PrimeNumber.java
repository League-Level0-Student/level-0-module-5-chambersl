import javax.swing.JOptionPane;

public class PrimeNumber {
public static void main(String[] args) {
String number=JOptionPane.showInputDialog("choose a number");
int primenumber = Integer.parseInt(number);
int count=0;
for (int i = 2; i < primenumber; i++) {
	

if(primenumber % i== 0) {

count++;

}
}
if(count == 0) {
	JOptionPane.showMessageDialog(null, "The number is prime");
}
else { JOptionPane.showMessageDialog(null, "that number is not prime!");


}
}
}

