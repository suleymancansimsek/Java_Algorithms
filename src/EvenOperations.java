import java.util.Scanner;

public class EvenOperations {

    static int number;

    public static void main(String[] args) {

        EvenOperations evenOperations = new EvenOperations();
        evenOperations.getTheNumber();
        if(evenOperations.isEvenNumber(number)){
            System.out.println("the given number is even number");
        }
        else {
            System.out.println("the given number is odd number");
        }

    }

    public void getTheNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");
        number = scanner.nextInt();
        scanner.close();
    }

    public boolean isEvenNumber(int number){
        boolean isEvenNumber = false;
        while(true){
            number = number - 2;
            if(number == 0){
                isEvenNumber = true;
                break;
            }
            else if(number == -1){
                break;
            }
        }
        return isEvenNumber;
    }

}
