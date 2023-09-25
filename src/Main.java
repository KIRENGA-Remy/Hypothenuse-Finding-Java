import javax.swing.JOptionPane;
public class Main {
public static void main(String[] args){
    double height = Double.parseDouble(JOptionPane.showInputDialog("Enter the height of the triangle:"));
    JOptionPane.showMessageDialog(null,height);
    double base = Double.parseDouble(JOptionPane.showInputDialog("Enter the base of the triangle:"));
    JOptionPane.showMessageDialog(null,base);
    double hyp = Math.sqrt((height * height)+(base*base));
    System.out.println(hyp);
    JOptionPane.showMessageDialog(null, "The hyp is: "+ hyp);

}
}