import java.awt.*;
import javax.swing.*;

public class Window extends JFrame {

    //Variables
    private double attkPrice = 0;

    //Pannels
    JPanel contentPanel = new JPanel(new BorderLayout());
    JPanel basePanel = new JPanel();
    JPanel itemPanel = new JPanel(new GridBagLayout());
    GridBagConstraints c = new GridBagConstraints();

    //Buttons
    JButton attkBuy = new JButton("Buy");
    JButton speeBuy = new JButton("Buy");
    JButton defBuy = new JButton("Buy");
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

        //adds itemPanel and the buttons plus labels
        this.contentPanel.add(itemPanel, BorderLayout.WEST);

        //adding buy button and labels
        this.itemPanel.add(attkBuy);
        this.contentPanel.add(basePanel, BorderLayout.EAST);
        this.setVisible(true);
    }
    
}
