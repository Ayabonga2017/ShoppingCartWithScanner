package variables;
import java.util.Scanner;
public class ShoppingCart{
    public static void main(String[] args) {
        
        while(true){
        Scanner customer = new Scanner(System.in);
        System.out.println("enter your name ");
        String custName = customer.next();
    
        StringBuilder message = new StringBuilder();
        message.append(custName);
        message.append(" wants to buy ");
        
        Scanner item = new Scanner(System.in);

        StringBuilder welcome = new StringBuilder(); 
        welcome.append("Welcome ");
        welcome.append(custName);
        welcome.append("");
        welcome.append("\nWhat would you like to buy ? ");
        System.out.println(welcome);

        String itemName = item.next();

        if(itemName.equalsIgnoreCase("j")){
        message.append("a pair of Jeans.");
        }else if (itemName.equalsIgnoreCase("s")){
        message.append("a pair of Shoes.");
        }else if (itemName.equalsIgnoreCase("t")){
        message.append("a T-Shirt.");
        }else if (itemName.equalsIgnoreCase("sw")){
            message.append("a Sweater.");
        }else if (itemName.equalsIgnoreCase("sw")){
            message.append("a Sweater.");
        }else if (itemName.equalsIgnoreCase("sh")){
            message.append("a pair of Shorts.");
        }else if (itemName.equalsIgnoreCase("c")){
            message.append("a Coat.");
        }else if (itemName.equalsIgnoreCase("menu")){

            StringBuilder menu = new StringBuilder();
            menu.append("\n.............menu.............\n");
            menu.append("j - Jeans\n");
            menu.append("t - T- Shirt\n");
            menu.append("s - Shoes\n");
            menu.append("sw - Sweater\n");
            menu.append("sh - Shorts\n");
            menu.append("c - Coat\n");
            System.out.println(menu);
            }
        else{
        StringBuilder error = new StringBuilder();
        error.append("Wrong input data !!");
        error.append("\ntype [j] for Jean.");
        error.append("\ntype [s] for a pair of Shoes.");
        error.append("\ntype [t] for T-Shirt.");

        System.out.println(error);
        }
        System.out.println(message);
        customer.close();
        item.close();
        break;
        }

    }
}