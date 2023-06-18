import java.awt.*;
import java.awt.event.*;
import java.awt.color.*;


class converter extends Frame implements ActionListener {
     Label l1, l2, l3;
    TextField tf1;
    Button b1;
     Choice c1, c2;

	public converter() {
         super("Currency Converter");
        
      l1 = new Label("From Currency of:");
      l2 = new Label("To Currency of:");
      l3 = new Label("Result:");
        
       tf1 = new TextField();
        b1 = new Button("Convert");
        b1.addActionListener(this);

        b1.setBackground(Color.pink);
	l1.setForeground(Color.BLACK);
	l2.setForeground(Color.BLACK);
	setBackground(Color.orange);

	
	
        
        c1 = new Choice();
        c1.add("Choose country");
        c1.add("USA");
        c1.add("Brazil");
        c1.add("India");
        c1.add("Nigeria");
        
        c2 = new Choice();
	 c2.add("Choose country");
        c2.add("USA");
        c2.add("Brazil");
        c2.add("India");
        c2.add("Nigeria");
        
        setLayout(new GridLayout(5,3, 5, 3));
        add(l1);
        add(c1);
        add(l2);
        add(c2);
        add(tf1);
        add(b1);
        add(l3);
        
        setSize(300, 150);
        setVisible(true);
}
 public void actionPerformed(ActionEvent e)
 {
        double amount = Double.parseDouble(tf1.getText());
        double result = 0;
        
        if (c1.getSelectedItem().equals("USD") && c2.getSelectedItem().equals("Brazil"))
          {
            result = amount * 4.81;
        }
	 else if (c1.getSelectedItem().equals("USD") && c2.getSelectedItem().equals("India")) 
	{
            result = amount * 81.92;
        } 
	else if (c1.getSelectedItem().equals("USD") && c2.getSelectedItem().equals("Nigeria")) {
            result = amount * 655.23;
        }
	 else if (c1.getSelectedItem().equals("Brazil") && c2.getSelectedItem().equals("USA")) {
            result = amount * 0.21;
        } 
	else if (c1.getSelectedItem().equals("Brazil") && c2.getSelectedItem().equals("India")) {
            result = amount * 17.02;
        }
	 else if (c1.getSelectedItem().equals("Brazil") && c2.getSelectedItem().equals("Nigeria")) {
            result = amount * 96.70;
        }
	 else if (c1.getSelectedItem().equals("India") && c2.getSelectedItem().equals("USA")) {
            result = amount * 0.012;
        }
	 else if (c1.getSelectedItem().equals("India") && c2.getSelectedItem().equals("Brazil")) {
            result = amount * 0.059;
        }
	 else if (c1.getSelectedItem().equals("India") && c2.getSelectedItem().equals("Nigeria")) {
            result = amount * 5.68;
        }
	 else if (c1.getSelectedItem().equals("Nigeria") && c2.getSelectedItem().equals("USA")) {
            result = amount * 0.0015;
        }
	 else if (c1.getSelectedItem().equals("Nigeria") && c2.getSelectedItem().equals("Brazil")) {
            result = amount * 0.0007;
        }
	 else if (c1.getSelectedItem().equals("Nigeria") && c2.getSelectedItem().equals("India")) {
            result = amount * 0.13;
        }
 l3.setText("Result: " + result);
}
  public static void main(String[] args) {
        new converter();
    }
}