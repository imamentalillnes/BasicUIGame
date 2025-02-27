import java.awt.*;
import javax.swing.*;

public class Window extends JFrame {

    //Variables
    private double attkPrice = 0;

    //Pannels
    JPanel contentPanel = new JPanel(new BorderLayout());
    JPanel basePanel = new JPanel();
    JPanel itemPanel = new JPanel(new GridBagLayout());
    GridBagConstraints cLabels = new GridBagConstraints();
    GridBagConstraints cButtons = new GridBagConstraints();

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

        //adds the two main panels too the layout
        this.contentPanel.add(itemPanel, BorderLayout.WEST);
        this.contentPanel.add(basePanel, BorderLayout.EAST);

        //adding buy button and labels
        this.itemPanel.add(attkLabel, cLabels);
        cLabels.gridx = 0;
        cLabels.gridy = 0;
        cLabels.gridwidth = 2;
        cLabels.gridheight = 1;
        this.itemPanel.add(attkBuy, cButtons);
        cButtons.gridx = 3;
        cButtons.gridy = 0;
        cButtons.gridheight = 2;
        this.setVisible(true);
    }
    
}
