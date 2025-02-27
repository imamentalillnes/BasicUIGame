import javax.swing.*;

public class Products {

    //Variables
    private JLabel name = new JLabel();
    private JLabel price = new JLabel();
    private JButton buy = new JButton();
    
    //button and label makers
    public void newProducts(String name){
        this.name.setText(name);
        this.price.setText("5");
    }
}
