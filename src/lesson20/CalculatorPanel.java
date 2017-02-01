package lesson20;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class CalculatorPanel extends JPanel{
    private static final int TEXT_SIZE = 20;
    private JTextArea text;
    private ButtonsPanel buttonsPanel;
    private StringBuilder upText;
    private StringBuilder downText;
    private int result;
    private String action;
    
    public CalculatorPanel() {
        setLayout(new BorderLayout());
        text = new JTextArea(2,2);
        Font newFont = new Font(text.getFont().getName(), text.getFont().getStyle(), TEXT_SIZE);
        text.setFont(newFont);
        text.setEditable(false);
        buttonsPanel = new ButtonsPanel();
        
        add(text, BorderLayout.NORTH);
        add(buttonsPanel, BorderLayout.CENTER);
        
        upText = new StringBuilder();
        downText = new StringBuilder();
        
        result = 0;
        action = "+";
        
        addListeners();
        
    }
    
    private void addListeners() {
        DigitListener digitListener = new DigitListener();
        for (int i = 0; i < buttonsPanel.digitButtons.length; i++) {
            buttonsPanel.digitButtons[i].addActionListener(digitListener);
        }
        
        ActionButtonsListener abl = new ActionButtonsListener();
        buttonsPanel.plus.addActionListener(abl);
        buttonsPanel.minus.addActionListener(abl);
        buttonsPanel.division.addActionListener(abl);
        buttonsPanel.multi.addActionListener(abl);
        
    }

    private void refreshTextArea(){
        text.setText(upText.toString() + "\n" + downText.toString());
        System.out.println("Result: " + result);
        System.out.println("Action: " + action);
    }
    
    private class DigitListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton src = (JButton) e.getSource();
            downText.append(src.getText());
            refreshTextArea();
        }
    }
    
    private class ActionButtonsListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            if(downText.length() == 0) {
                return;
            }
            JButton src = (JButton) e.getSource();
            int downTextInt = Integer.parseInt(downText.toString());
            if(action.equals("+")) {
                result += downTextInt;
            } else if (action.equals("-")){
                result -= downTextInt;
            } else if (action.equals("*")){
                result *= downTextInt;
            } else if (action.equals("/")){
                result /= downTextInt;
            }
            action = src.getText();
            downText.setLength(0);
            upText.append(downTextInt).append(action);
            refreshTextArea();
            
        }
    }
    
}
