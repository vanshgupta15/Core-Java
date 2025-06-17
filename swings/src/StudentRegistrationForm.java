import java.awt.*;
import java.awt.event.*;
import java.util.regex.*;
import javax.swing.*;

public class StudentRegistrationForm extends JFrame {
    // Form components
    private JTextField nameField, emailField, ageField;
    private JRadioButton maleRadio, femaleRadio;
    private JComboBox<String> courseCombo;
    private JCheckBox programmingCheck, sportsCheck, musicCheck;
    private ButtonGroup genderGroup;

    public StudentRegistrationForm() {
        initializeComponents();
        setupLayout();
        // addEventListeners();
        configureFrame();
    }

    private void initializeComponents() {
        // Text fields
        nameField = new JTextField(20);
        emailField = new JTextField(20);
        ageField = new JTextField(5);

        // Radio buttons for gender
        maleRadio = new JRadioButton("Male");
        femaleRadio = new JRadioButton("Female");
        genderGroup = new ButtonGroup();
        genderGroup.add(maleRadio);
        genderGroup.add(femaleRadio);

        // Combo box for course
        String[] courses = { "Computer Science", "Engineering",
                "Mathematics", "Physics" };
        courseCombo = new JComboBox<>(courses);

        // Checkboxes for interests
        programmingCheck = new JCheckBox("Programming");
        sportsCheck = new JCheckBox("Sports");
        musicCheck = new JCheckBox("Music");
    }

    private void setupLayout() {
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);

        // Title
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        JLabel titleLabel = new JLabel("Student Registration");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 18));
        add(titleLabel, gbc);

        // Name field
        gbc.gridwidth = 1;
        gbc.gridy++;
        gbc.gridx = 0;
        add(new JLabel("Name:"), gbc);
        gbc.gridx = 1;
        add(nameField, gbc);

        // Email field
        gbc.gridy++;
        gbc.gridx = 0;
        add(new JLabel("Email:"), gbc);
        gbc.gridx = 1;
        add(emailField, gbc);

        // Age field
        gbc.gridy++;
        gbc.gridx = 0;
        add(new JLabel("Age:"), gbc);
        gbc.gridx = 1;
        add(ageField, gbc);

        // Gender radio buttons
        gbc.gridy++;
        gbc.gridx = 0;
        add(new JLabel("Gender:"), gbc);
        gbc.gridx = 1;
        JPanel genderPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        genderPanel.add(maleRadio);
        genderPanel.add(femaleRadio);
        add(genderPanel, gbc);

        // Course combo box
        gbc.gridy++;
        gbc.gridx = 0;
        add(new JLabel("Course:"), gbc);
        gbc.gridx = 1;
        add(courseCombo, gbc);

        // Interests checkboxes
        gbc.gridy++;
        gbc.gridx = 0;
        add(new JLabel("Interests:"), gbc);
        gbc.gridx = 1;
        JPanel interestsPanel = new JPanel(new GridLayout(3, 1));
        interestsPanel.add(programmingCheck);
        interestsPanel.add(sportsCheck);
        interestsPanel.add(musicCheck);
        add(interestsPanel, gbc);

        // Buttons
        gbc.gridy++;
        gbc.gridx = 0;
        gbc.gridwidth = 2;
        JPanel buttonPanel = new JPanel();
        JButton registerBtn = new JButton("Register");
        JButton clearBtn = new JButton("Clear");
        buttonPanel.add(registerBtn);
        buttonPanel.add(clearBtn);
        add(buttonPanel, gbc);

        // Add event listeners
        registerBtn.addActionListener(this::registerStudent);
        clearBtn.addActionListener(this::clearForm);
    }

    private void registerStudent(ActionEvent e) {
        // Validate input
        if (!validateInput())
            return;

        // Collect data
        String name = nameField.getText();
        String email = emailField.getText();
        int age = Integer.parseInt(ageField.getText());
        String gender = maleRadio.isSelected() ? "Male" : "Female";
        String course = (String) courseCombo.getSelectedItem();

        // Show confirmation
        String message = String.format(
                "Registration Successful!\nName: %s\nEmail: %s\nAge: %d\nGender: %s\nCourse: %s",
                name, email, age, gender, course);

        JOptionPane.showMessageDialog(this, message,
                "Registration Complete", JOptionPane.INFORMATION_MESSAGE);
    }

    private boolean validateInput() {
        // Name validation
        if (nameField.getText().trim().isEmpty()) {
            showError("Name is required!");
            return false;
        }

        // Email validation
        String email = emailField.getText();
        Pattern emailPattern = Pattern.compile(
                "^[A-Za-z0-9+_.-]+@(.+)$");
        if (!emailPattern.matcher(email).matches()) {
            showError("Invalid email format!");
            return false;
        }

        // Age validation
        try {
            int age = Integer.parseInt(ageField.getText());
            if (age < 16 || age > 100) {
                showError("Age must be between 16 and 100!");
                return false;
            }
        } catch (NumberFormatException ex) {
            showError("Age must be a valid number!");
            return false;
        }

        // Gender validation
        if (!maleRadio.isSelected() && !femaleRadio.isSelected()) {
            showError("Please select gender!");
            return false;
        }

        return true;
    }

    private void showError(String message) {
        JOptionPane.showMessageDialog(this, message,
                "Validation Error", JOptionPane.ERROR_MESSAGE);
    }

    private void clearForm(ActionEvent e) {
        nameField.setText("");
        emailField.setText("");
        ageField.setText("");
        genderGroup.clearSelection();
        courseCombo.setSelectedIndex(0);
        programmingCheck.setSelected(false);
        sportsCheck.setSelected(false);
        musicCheck.setSelected(false);
    }

    private void configureFrame() {
        setTitle("Student Registration System");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new StudentRegistrationForm().setVisible(true);
        });
    }
}