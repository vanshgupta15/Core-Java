import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class SimpleCalculator extends JFrame 
{
    private JTextField display;
    private double result = 0;
    private String operator = "";
    private boolean calculating = false;

    public SimpleCalculator() {
        initializeGUI();
    }

    private void initializeGUI() 
    {
        // Create display
        display = new JTextField("0");
        display.setEditable(false);
        display.setHorizontalAlignment(JTextField.RIGHT);
        display.setFont(new Font("Arial", Font.BOLD, 50));

        // Create button panel
        JPanel buttonPanel = new JPanel(new GridLayout(5, 4, 5, 5));

        // Button labels
        String[] buttons = {
                "C", "±", "%", "÷",
                "7", "8", "9", "x",
                "4", "5", "6", "-",
                "1", "2", "3", "+",
                "0", ".", "="
        };

        // Create and add buttons
        for (String text : buttons) {
            JButton button = new JButton(text);
            button.setFont(new Font("Arial", Font.BOLD, 16));
            button.addActionListener(this::buttonClicked);
            buttonPanel.add(button);
        }

        // Layout
        setLayout(new BorderLayout());
        add(display, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.CENTER);

        // Frame settings
        setTitle("Simple Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 400);
        setLocationRelativeTo(null);
    }

    private void buttonClicked(ActionEvent e) {
        String command = e.getActionCommand();

        if (command.matches("[0-9]")) {
            // Number button clicked
            if (calculating) {
                display.setText(command);
                calculating = false;
            } else {
                display.setText(display.getText().equals("0") ? command : display.getText() + command);
            }
        } else if (command.equals("C")) {
            // Clear
            display.setText("0");
            result = 0;
            operator = "";
        } else if (command.equals("=")) {
            // Calculate result
            calculate();
        } else {
            // Operator button
            if (!operator.isEmpty()) {
                calculate();
            } else {
                result = Double.parseDouble(display.getText());
            }
            operator = command;
            calculating = true;
        }
    }

    private void calculate() {
        double current = Double.parseDouble(display.getText());

        switch (operator) {
            case "+":
                result += current;
                break;
            case "-":
                result -= current;
                break;
            case "x":
                result *= current;
                break;
            case "÷":
                result /= current;
                break;
            case "%":
                result = result*(current/100);
                break;
        }

        display.setText(String.valueOf(result));
        operator = "";
        calculating = true;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new SimpleCalculator().setVisible(true);
        });
    }
}