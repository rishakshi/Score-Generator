package score.generator;

import java.awt.Checkbox;
import java.awt.FlowLayout;
import java.awt.Panel;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import javax.swing.JFrame;

public class MyFrame extends JFrame implements ItemListener {
    private Panel panel;
    private ArrayList<String> selectedItems;

    public MyFrame() {
        super("Multiple Choice Example");

        // Create a panel with a flow layout
        panel = new Panel(new FlowLayout());

        // Create Checkbox components and add them to the panel
        panel.add(new Checkbox("Option 1"));
        panel.add(new Checkbox("Option 2"));
        panel.add(new Checkbox("Option 3"));

        // Add item listeners to the Checkbox components
        
        Checkbox[] checkboxes = (Checkbox[]) panel.getComponents();
        for (int i = 0; i < checkboxes.length; i++) {
            checkboxes[i].addItemListener(this);
        }

        // Add the panel to the content pane
        getContentPane().add(panel);

        // Set the size and close operation of the frame
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        // Get the source of the event
        Object source = e.getItemSelectable();

        // Check if the source is a Checkbox component
        if (source instanceof Checkbox) {
            Checkbox checkbox = (Checkbox) source;

            // Add or remove the item from the selected items list
            if (checkbox.getState()) {
                selectedItems.add(checkbox.getLabel());
            } else {
                selectedItems.remove(checkbox.getLabel());
            }

            // Print the selected items
            System.out.println("Selected items: " + selectedItems);
        }
    }

    public static void main(String[] args) {
        new MyFrame();
    }
}
