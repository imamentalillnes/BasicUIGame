import java.awt.*;
import javax.swing.*;

public class Window extends JFrame {

    //Pannels
    JPanel contentPanel = new JPanel(new BorderLayout());
    JPanel basePanel = new JPanel();
    JPanel itemPanel = new JPanel(new BorderLayout());
    JPanel namePanel = new JPanel(new GridLayout(6,1));
    JPanel buyPanel = new JPanel(new GridLayout(3,1));


    //Buttons
    JButton attkBuy = new JButton("Buy");
    JButton speeBuy = new JButton("Buy");
    JButton healBuy = new JButton("Buy");

    //Labels
    JLabel attkLabel = new JLabel("Attack Damage");
    JLabel attkPriceText = new JLabel("Attack Price");
    

    public Window() {
        
        //calls the original constructor
        super();

        //Takes care of setting up the frame properly
        this.setSize(500, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Adds all the need pannels 
        this.setContentPane(contentPanel);

        //Sets up all the panels
        this.contentPanel.add(itemPanel, BorderLayout.WEST);
        this.contentPanel.add(basePanel, BorderLayout.EAST);
        this.itemPanel.add(namePanel, BorderLayout.WEST);
        this.itemPanel.add(buyPanel, BorderLayout.EAST);

        //Adds the labels to the item panel
        namePanel.add(attkLabel);
        namePanel.add(attkPriceText);

        //Adds the buy buttons
        buyPanel.add(attkBuy);
        buyPanel.add(speeBuy);
        buyPanel.add(healBuy);

        this.setVisible(true);
    }
    
}
