package Graphics;

import java.awt.*;
import java.awt.event.*;

public class Components extends Frame {

          public Components() {
                    setSize(500, 500);
                    setVisible(true);
                    setLayout(null);

                    // Button
                    Button button = new Button("Button");
                    button.setBounds(100, 100, 100, 100);
                    add(button);

                    // Label
                    Label label = new Label("Label");
                    label.setBounds(100, 200, 100, 100);
                    add(label);

                    Label label2 = new Label("Label 2");
                    label2.setBounds(100, 300, 100, 100);
                    add(label2);

                    // Checkbox
                    Checkbox checkbox = new Checkbox("Checkbox");
                    checkbox.setBounds(100, 300, 100, 100);
                    add(checkbox);

                    // Choice Lists
                    Choice choice = new Choice();
                    choice.add("Choice 1");
                    choice.add("Choice 2");
                    choice.add("Choice 3");
                    choice.setBounds(100, 400, 100, 100);
                    add(choice);

                    // Lists
                    List list = new List();
                    list.add("List 1");
                    list.add("List 2");
                    list.add("List 3");
                    list.setBounds(100, 500, 100, 100);
                    add(list);

                    // TextField
                    TextField textfield = new TextField();
                    textfield.setBounds(100, 600, 100, 100);
                    add(textfield);

                    // Adding event to button
                    button.addActionListener(new ActionListener() {
                              public void actionPerformed(ActionEvent e) {
                                        list.add(textfield.getText());
                              }
                    });

                    // Adding event to checkbox
                    checkbox.addItemListener(new ItemListener() {
                              public void itemStateChanged(ItemEvent e) {
                                        if (e.getStateChange() == ItemEvent.SELECTED) {
                                                  label.setText("Checkbox is selected");
                                        } else {
                                                  label.setText("Checkbox is deselected");
                                        }
                              }
                    });

                    // Adding event to choice
                    choice.addItemListener(new ItemListener() {
                              public void itemStateChanged(ItemEvent e) {
                                        label2.setText("You selected " + choice.getSelectedItem());
                              }
                    });

          }

}
