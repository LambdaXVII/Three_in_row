/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package three_in_row;

import three_in_row.logic.ObservableGame;
import three_in_row.ui.text.TextUI;
import three_in_row.ui.gui.ThreeInRowView;

public class Three_in_row {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // GUI
       // ThreeInRowView GUI = new ThreeInRowView(new ObservableGame());
        
        
        // == Text == //
        TextUI textUI = new TextUI(new ObservableGame());
        textUI.run();
        
    }
    
}
