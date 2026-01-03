import java.util.Scanner;
import java.util.ArrayList;
public class Todo{
    public static void main(String[] args) {
        
        ArrayList<String> tasks = new ArrayList<>();
        int choice;
        do{
            System.out.println("\n To do list menu");
            System.out.println("\n 1. Add task");
            System.out.println("\n 2. view task");
            System.out.println("3.remove task");
            System.out.println("\n 4. exit");
            Scanner sc = new Scanner(System.in);
            choice = sc.nextInt();
            sc.nextLine();
            switch(choice) {
                case 1:
                    System.out.println("enter task description : ");
                    String task = sc.nextLine();
                    tasks.add(task);
                    System.out.println("Task added");
                    break;
                    case 2:
                        System.out.println("your task");
                        if(tasks.isEmpty()) {
                            System.out.println("No task");


                        }
                        else{
                            for (int i=0; i < tasks.size(); i++){
                                System.out.println(i+1 +" " +tasks.get(i));
                            }
                            
                        }
                        break;
case 3 :
   if(tasks.isEmpty()){
  System.out.println("NO TASK TO REMOVE");

 }
  else{
  System.out.println("enter the tasks number to remove");
 for(int i=0; i<tasks.size(); i++){
    System.out.println(i+1 + " " + tasks.get(i));
 }


                                        

   int removeindex = sc.nextInt();
   sc.nextLine();
   if(removeindex>0 && removeindex <=tasks.size()){
                                            tasks.remove(removeindex-1);        
                                               System.out.println("Tasks remove successfully");
                                        }
                                        else{
                                            System.out.println("Tasks number is invalid ");
                                        }
                                    }
                                    
                                    
                                    break;
                                    case 4 :
                                        System.out.println("goodbye!");
                                        break;
                                        default:
                                            System.out.println("invalid choice! Please enter 1 to 4.");
                                }
                            }
                                

                            while (choice !=4);
                            Scanner sc = new Scanner(System.in);
                            sc.close();
                            
                    }
                }
                            
                            
                                
                            
                        
                        
                
            




                                
                                    
                            