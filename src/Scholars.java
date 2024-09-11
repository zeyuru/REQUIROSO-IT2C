
import java.util.Scanner;


public class Scholars {
    
    
    public void newScholars() {
        
    Scanner input = new Scanner(System.in);
    
    ScholarApp[]  sc = new ScholarApp[];
       
        System.out.println("Enter number of Applications: ");
         int appl = input.nextInt();
        
    for (int i = 0; i < appl; i++){
        
        System.out.println("Enter details of Application" + (i+1) + ":");
        
        
        System.out.println("Enter ID: ");
         int id = input.nextInt();  
         
         System.out.println("Name: ");
            String name = input.next(); 
            
            System.out.println("GPA: ");
           double GPA = input.nextDouble();  
           
           System.out.println("Annual Family Income: ");
          double income = input.nextDouble();  
          
          System.out.println("Community Service Hours: ");
           int hours = input.nextInt();  
           
    }
    if (GPA >= 3.5) {
                System.out.println("Application " + (i + 1) + ": Approved");
            } else {
                System.out.println("Application " + (i + 1) + ": Denied");
            }
    
    
}
    
    
    
}
