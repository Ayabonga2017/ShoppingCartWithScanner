package variables;
import java.util.Scanner;
public class ShoppingCart{
    public static void main(String[] args) throws Exception{
        
        while(true){
            
            Scanner input = new Scanner(System.in);
            System.out.println("Would you like to continue [y/n] ? \n");
            String decide = input.next();

        if (decide.equalsIgnoreCase("y")) {
            Scanner customer = new Scanner(System.in);
            System.out.println("\nenter your name:\n");
        String custName = customer.next();
    
        StringBuilder message = new StringBuilder();
            message.append(custName);
            message.append(" wants to buy ");
        
        Scanner item = new Scanner(System.in);

        StringBuilder welcome = new StringBuilder(); 
            welcome.append("Welcome ");
            welcome.append(custName);
            welcome.append(".\n");
            welcome.append("\nWhat would you like to buy ?");
            welcome.append("\nType [menu] for instructions on how to choose an item:\n");
            System.out.println(welcome +"\n");

        String itemName = item.next();

        if(itemName.equalsIgnoreCase("j")){
            message.append("a pair of Jeans.");
        }else if (itemName.equalsIgnoreCase("s")){
            message.append("a pair of Shoes.");
        }else if (itemName.equalsIgnoreCase("t")){
            message.append("a T-Shirt.");
        }else if (itemName.equalsIgnoreCase("so")){
            message.append("a Socks.");
        }else if (itemName.equalsIgnoreCase("sw")){
            message.append("a Sweater.");
        }else if (itemName.equalsIgnoreCase("sh")){
            message.append("a pair of Shorts.");
        }else if (itemName.equalsIgnoreCase("c")){
            message.append("a Coat.");
        }else if (itemName.equalsIgnoreCase("menu")){

            StringBuilder menu = new StringBuilder();
            menu.append("\n.............menu.............\n");
            menu.append("c - Coat\n");
            menu.append("j - Jeans\n");
            menu.append("t - T- Shirt\n");
            menu.append("s - Shoes\n");
            menu.append("sw - Sweater\n");
            menu.append("sh - Shorts\n");
            menu.append("so - Socks\n");

            System.out.println(menu);
         }else{

        StringBuilder error = new StringBuilder();
            error.append("Wrong input data !!\n");
            error.append("\ntype [menu] for instructions.\n");
            System.out.println(error);
        }
            System.out.println(message);
            item.close();
            customer.close();
            break;
        }else if(decide.equalsIgnoreCase("n")){
            System.out.println("\nGood-bye.......\n");
            break;
        }
        input.close();
        }
    }
}