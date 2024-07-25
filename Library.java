import java. util.Scanner;
public class Library{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        books ob=new books();
        students obStudent=new students();
        int choice;
        int searchChoice;
        do{
            ob.dispMenu();
            choice=input.nextInt();
            switch (choice){
                case 1:
                book b=new book();
                ob.addBook(b);
                break;
                case 2:
                    ob.upgradeBookQty();
                    break;
                case 3:
                    System.out.println(" press 1 to Search with Book Serial No.");
                    System.out.println(" Press 2 to Search with Book's Author Name.");
                    searchChoice = input.nextInt();
 
                
                switch (searchChoice) {
 
                    // Case
                case 1:
                    ob.searchBySno();
                    break;
 
                    // Case
                case 2:
                    ob.searchByAuthorName();
                }
                break;
 
                // Case
            case 4:
                ob.showAllBooks();
                break;
 
                // Case
            case 5:
                student s = new student();
                obStudent.addStudent(s);
                break;
 
                // Case
            case 6:
                obStudent.showAllStudents();
                break;
 
                // Case
            case 7:
                obStudent.checkOutBook(ob);
                break;
 
                // Case
            case 8:
                obStudent.checkInBook(ob);
                break;
 
                
            default:
 
                
                System.out.println("ENTER BETWEEN 0 TO 8.");
            }
 
        }
 
        
        while (choice != 0);
    }

}
    
