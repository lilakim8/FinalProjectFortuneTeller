import javax.swing.*;
import java.awt.*;

public class App {

    private FortuneTeller manager;
    private JFrame frame;
    private JTextArea displayArea;
    private JTextField inputField;

    public App() {

        manager = new FortuneTeller();
        frame = new JFrame("Fortune Teller");
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        JLabel title = new JLabel("Welcome to the Fortune Teller!", JLabel.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 20));
        JLabel subheader = new JLabel("Type in the box, then click a button!", JLabel.CENTER);
        JPanel topPanel = new JPanel(new GridLayout(2, 1));
        topPanel.add(title);
        topPanel.add(subheader);
        frame.add(topPanel, BorderLayout.NORTH);

        displayArea = new JTextArea();
        displayArea.setEditable(false);
        frame.add(new JScrollPane(displayArea), BorderLayout.CENTER);

        inputField = new JTextField();

        JButton randomBtn = new JButton("Random Fortune");
        JButton addBtn = new JButton("Add Fortune");
        JButton removeBtn = new JButton("Remove Fortune");
        JButton showAllBtn = new JButton("Show All");

        JPanel bottomPanel = new JPanel(new BorderLayout());
        bottomPanel.add(inputField, BorderLayout.NORTH);
        JPanel buttonPanel = new JPanel(new GridLayout(1, 4));
        buttonPanel.add(randomBtn);
        buttonPanel.add(addBtn);
        buttonPanel.add(removeBtn);
        buttonPanel.add(showAllBtn);

        bottomPanel.add(buttonPanel, BorderLayout.SOUTH);

        frame.add(bottomPanel, BorderLayout.SOUTH);

//button interactions
        randomBtn.addActionListener(e -> {
            displayArea.setText(manager.getRandomFortune());
        });

        addBtn.addActionListener(e -> {
            try {
                String input = inputField.getText();
                if (input.isEmpty()) {
                    throw new IllegalArgumentException("Input cannot be empty.");
                }

                manager.addFortune(input);
                displayArea.setText("Fortune added!");
                inputField.setText("");
            } catch (Exception ex) {
                displayArea.setText("Error: " + ex.getMessage());
            }
        });
        removeBtn.addActionListener(e -> {
            try {
                String input = inputField.getText();
                if (input.isEmpty()) {
                    throw new IllegalArgumentException("Input cannot be empty.");
                }

                manager.removeFortune(input);

                displayArea.setText("Fortune removed (if it existed).");
                inputField.setText("");
            } catch (Exception ex) {
                displayArea.setText("Error: " + ex.getMessage());
            }
        });
        showAllBtn.addActionListener(e -> {
            String all = "";
            for (String f : manager.getAllFortunes()) {
                all += f + "\n";
            }
            displayArea.setText(all);
        });
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new App();
    }
}
