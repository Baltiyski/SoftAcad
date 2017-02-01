package lesson20;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class ButtonsPanel extends JPanel{
    private static final int CALC_ROWS = 4;
    private static final int CALC_COLS = 4;
    private static final int DIGIT_BUTTONS_NUMBER = 10;
    private static final int H_GAP = 10;
    private static final int V_GAP = 10;
    
    JButton[] digitButtons;
    JButton plus = new JButton("+");
    JButton minus = new JButton("-");
    JButton multi = new JButton("*");
    JButton division = new JButton("/");
    JButton equals = new JButton("=");
    JButton c = new JButton("C");

    public ButtonsPanel() {
        setLayout(new GridLayout(CALC_ROWS, CALC_COLS, H_GAP, V_GAP));
        
        digitButtons = new JButton[DIGIT_BUTTONS_NUMBER];
        
        for (int i = 0; i < DIGIT_BUTTONS_NUMBER; i++) {
            digitButtons[i] = new JButton("" + i);
        }
        
        //row 1
        add(digitButtons[7]);
        add(digitButtons[8]);
        add(digitButtons[9]);
        add(plus);
        
        //row 2
        add(digitButtons[4]);
        add(digitButtons[5]);
        add(digitButtons[6]);
        add(minus);
        
        //row 3
        add(digitButtons[1]);
        add(digitButtons[2]);
        add(digitButtons[3]);
        add(multi);
        
        //row 4
        add(digitButtons[0]);
        add(c);
        add(equals);
        add(division);
        
    }
}
