import javax.swing.*;
public class RPGCharacter {
    public static void main(String[] args) {
    /*Create a program that calculates an RPG Character's battle stats based on the character's physical stats.
    The physical and battle stat can be anything you wish provided it meets these criteria:

        The physical stats (Strength, Dexterity, Spirit etc ...) will be entered by the user
        The battle stats (damage, armor, mana capacity, spell strength ...) will be calculated based on the physical stats.

     We will continue to expand on this program throughout the year, so give it some thought. There should be some complexity.

     The program should run using dialog boxes and the output should show ALL the character's stats including a name.
     * */
        
        String characterStrength = JOptionPane.showInputDialog("what is your character strength ?") ;
        String characterDexterity = JOptionPane.showInputDialog("what is your character dexterity ?");
        String characterSpirit = JOptionPane.showInputDialog("what is your character spirit ?");
        String characterDiversity = JOptionPane.showInputDialog("what is your character diversity ?");
        String characterFlexibility = JOptionPane.showInputDialog("what is your character flexibility ?");
        String characterJump = JOptionPane.showInputDialog("what is your characters jumping ability ?");




    }
}