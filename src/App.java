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

        JLabel subheader = new JLabel("Click a button below!", JLabel.CENTER);

        JPanel topPanel = new JPanel(new GridLayout(2,1));
        topPanel.add(title);
        topPanel.add(subheader);

        frame.add(topPanel, BorderLayout.NORTH);

        displayArea = new JTextArea();
        displayArea.setEditable(false);
        frame.add(new JScrollPane(displayArea), BorderLayout.CENTER);

        inputField = new JTextField();
        frame.add(inputField, BorderLayout.SOUTH);

        JPanel buttonPanel = new JPanel(new GridLayout(4,2));

        JButton randomBtn = new JButton("Random Fortune");
        JButton addBtn = new JButton("Add Fortune");
        JButton removeBtn = new JButton("Remove Fortune");
        JButton showAllBtn = new JButton("Show All");

        buttonPanel.add(randomBtn);
        buttonPanel.add(addBtn);
        buttonPanel.add(removeBtn);
        buttonPanel.add(showAllBtn);

        frame.add(buttonPanel, BorderLayout.EAST);

        frame.setVisible(true);
    }
        public static void main(String[] args) {
        new App();
    
    }
}