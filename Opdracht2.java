import javax.swing.*;

public class Opdracht2 {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter a name.");

        String hborder = "";
        for (int i = 0; i < name.length() + 4; ++i) hborder += "*";

        String empty = "*";
        for (int i = 0; i < name.length() + 2; ++i) empty += " ";
        empty += "*";

        System.out.println(hborder);
        System.out.println(empty);
        System.out.println("* " + name + " *");
        System.out.println(empty);
        System.out.println(hborder);
    }
}
