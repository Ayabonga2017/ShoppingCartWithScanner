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