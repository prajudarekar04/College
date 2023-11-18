import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingCalculatorApp {
    // Components
    private JFrame frame;
    private JTextField textField;
    private JButton[] numberButtons;
    private JButton[] functionButtons;
    private JLabel label;  // Added JLabel
    private JButton addButton, subButton, mulButton, divButton, equButton, clrButton;
    private JPanel panel;

    // Variables
    private double num1, num2, result;
    private char operator;

    public SwingCalculatorApp() {
        frame = new JFrame("Swing Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 600);
        frame.setLayout(null); // No layout manager

        textField = new JTextField();
        textField.setBounds(10, 10, 360, 40);
        textField.setFont(new Font("Arial", Font.PLAIN, 18));
        textField.setHorizontalAlignment(SwingConstants.RIGHT);
        textField.setEditable(false);

        label = new JLabel("Result: ");
        label.setBounds(10, 50, 360, 40);
        label.setFont(new Font("Arial", Font.PLAIN, 18));
        label.setHorizontalAlignment(SwingConstants.RIGHT);

        numberButtons = new JButton[10];
        for (int i = 0; i < 10; i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].setFont(new Font("Arial", Font.PLAIN, 18));
        }

        functionButtons = new JButton[6];
        addButton = new JButton("+");
        subButton = new JButton("-");
        mulButton = new JButton("*");
        divButton = new JButton("/");
        equButton = new JButton("=");
        clrButton = new JButton("C");

        functionButtons[0] = addButton;
        functionButtons[1] = subButton;
        functionButtons[2] = mulButton;
        functionButtons[3] = divButton;
        functionButtons[4] = equButton;
        functionButtons[5] = clrButton;

        for (int i = 0; i < 6; i++) {
            functionButtons[i].setFont(new Font("Arial", Font.PLAIN, 18));
            functionButtons[i].setBackground(Color.CYAN);
        }

        panel = new JPanel();
        panel.setBounds(10, 100, 360, 500);
        panel.setLayout(new GridLayout(4, 4, 10, 10));

        // Add components to the panel
        panel.add(numberButtons[1]);
        panel.add(numberButtons[2]);
        panel.add(numberButtons[3]);
        panel.add(addButton);

        panel.add(numberButtons[4]);
        panel.add(numberButtons[5]);
        panel.add(numberButtons[6]);
        panel.add(subButton);

        panel.add(numberButtons[7]);
        panel.add(numberButtons[8]);
        panel.add(numberButtons[9]);
        panel.add(mulButton);

        panel.add(numberButtons[0]);
        panel.add(clrButton);
        panel.add(equButton);
        panel.add(divButton);

        // Add components to the frame
        frame.add(textField);
        frame.add(label);
        frame.add(panel);

        // Add action listeners to number buttons
        for (int i = 0; i < 10; i++) {
            final int digit = i;
            numberButtons[i].addActionListener(e -> textField.setText(textField.getText() + digit));
        }

        // Add action listeners to function buttons
        addButton.addActionListener(e -> handleFunctionButtonClick('+'));
        subButton.addActionListener(e -> handleFunctionButtonClick('-'));
        mulButton.addActionListener(e -> handleFunctionButtonClick('*'));
        divButton.addActionListener(e -> handleFunctionButtonClick('/'));
        equButton.addActionListener(e -> calculateResult());
        clrButton.addActionListener(e -> clearCalculator());

        // Set frame visibility
        frame.setVisible(true);
    }

    private void handleFunctionButtonClick(char newOperator) {
        num1 = Double.parseDouble(textField.getText());
        operator = newOperator;
        textField.setText("");
        label.setText("Result: ");
    }

    private void calculateResult() {
        num2 = Double.parseDouble(textField.getText());
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    textField.setText("Error");
                    label.setText("Result: Error");
                    return;
                }
                break;
        }
        textField.setText(String.valueOf(result));
        label.setText("Result: " + result);
    }

    private void clearCalculator() {
        textField.setText("");
        num1 = 0;
        num2 = 0;
        result = 0;
        operator = '\0';
        label.setText("Result: ");
    }

    public static void main(String[] args) {
        new SwingCalculatorApp();
    }
}
