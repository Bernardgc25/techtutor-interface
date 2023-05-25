import java.util.Scanner;
 

public class AdultUser implements LibraryUser{
    int age;
    String bookType; 
    Scanner sc; //= new Scanner(System.in);
    

    @Override
    public int registerAccount() {
        System.out.println("Adult only user account");
        sc = new Scanner(System.in);
        System.out.println("Enter age:");
        age = sc.nextInt();

        if(age > 12){
            System.out.println("You have successfully registered under an Adult Account");
        }
        else{
            System.out.println("Sorry, Age must be greater than 12 to register as an adult");
        }
        
        return age; 
    }

    @Override
    public String requestBook() {
        sc = new Scanner(System.in);
        System.out.println("Enter book type:");
        bookType = sc.nextLine();

        if(bookType.equals("Fiction") || bookType.equals("fiction")){
            System.out.println("Book Issued succesfully, please return the book withing 7 days");
            
        }
        else{
            System.out.println("Oops, you are allowed to take only adult Fiction books");
            
        }
        return bookType;
    }
    
}
