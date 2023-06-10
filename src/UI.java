import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UI extends JFrame {

    private JTextArea textArea;
    private JTextField inputField;

    public UI() {
        setTitle("Planner");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLayout(new BorderLayout());

        // Create components
        textArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(textArea);
        JButton addButton = new JButton("Add");
        inputField = new JTextField();

        // Add components to the frame
        add(scrollPane, BorderLayout.CENTER);

        JPanel bottomPanel = new JPanel();
        bottomPanel.setLayout(new BorderLayout());
        bottomPanel.add(inputField, BorderLayout.CENTER);
        bottomPanel.add(addButton, BorderLayout.EAST);
        add(bottomPanel, BorderLayout.SOUTH);

        // Add action listener to the Add button
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String task = inputField.getText();
                if (!task.isEmpty()) {
                    textArea.append(task + "\n");
                    inputField.setText("");
                }
            }
        });
    }
    }

