import javax.swing.JOptionPane;
public class MadLib {
    public static void main(String[] args) {

    /*Create your own MadLibs. (https://www.madtakes.com/) You may use a story or example from the
    website if you don't wish to make up your own. This program must run entirely in the console.
     */


        String place;
        String verb;
        String noun;

        place = JOptionPane.showInputDialog("What's your favorite place to eat ?");
        verb = JOptionPane.showInputDialog("What is something that describes you best ?");
        noun = JOptionPane.showInputDialog("What should I call you ?");
        JOptionPane.showMessageDialog(null, "Hey! + place + verb + noun");

        System.exit(0);
    }


}