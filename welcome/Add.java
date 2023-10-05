
package add;
import javax.swing.JOptionPane;

public class Add {

    public static void main(String[] args) {
        // TODO code application logic here
        String value1;
        String value2;
        int result, number1, number2;
        
        value1 = JOptionPane.showInputDialog("enter first number");
        value2 = JOptionPane.showInputDialog("Enter second number");
        
        number1 = Integer.parseInt(value1);
        number2 = Integer.parseInt(value2);
        
        result = number1 + number2;
        
        JOptionPane.showMessageDialog(null, "result is: " + result, "result", JOptionPane.PLAIN_MESSAGE);
        System.exit(0);
    }
    
}
