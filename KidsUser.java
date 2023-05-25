import java.util.Scanner;

public class KidsUser implements LibraryUser{
    int age;
    String bookType; 
    Scanner sc;

    @Override
    public int registerAccount() {
        System.out.println("Kids only user account");
        sc = new Scanner(System.in);
        System.out.println("Enter age:");
        age = sc.nextInt();

        if(age <= 12){
            System.out.println("You have successfully registered under a Kids Account");
        }
        else{
            System.out.println("Sorry, Age must be less than 12 to register as a kid");
        }

        return age;
    }

    @Override
    public String requestBook() {
        sc = new Scanner(System.in);
        System.out.println("Enter book type:");
        bookType = sc.nextLine();

        if(bookType.equals("Kids") || bookType.equals("kids")){
            System.out.println("Book Issued succesfully, please return the book within 10 days");
        }
        else{
            System.out.println("Oops, you are allowed to take only kids books");
        }

        return bookType;
    }
    
}
