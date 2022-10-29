import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    static String userName;
    String input;
    String alice;
    String bob;
    public Main(String userName){
        this.userName = userName;
        this.input = input;
        this.alice = alice;
        this.bob = bob;
    }
    //method for checking input
    public static void getUserName(){
        Scanner input = new Scanner(System.in); //scans your name in the input
        System.out.println("What is your name?");
        String userName = input.nextLine();
        System.out.println("Hello, " + userName + "!");
        System.out.println("Bring me Alice or Bob!!!");
    }
    public static void checkUserName(){
        String bob = "Bob";
        String alice = "Alice";
        if (userName.equals(alice)){
            getUserName();
        } else if (userName.equals(bob)){
            getUserName();
        } else {
            System.out.println("Bring me Alice or Bob!!!");
        }
    }
    //method for greeting Alice and Bob


    public static void main(String[] args ){
        getUserName();
        checkUserName();
    }
}
