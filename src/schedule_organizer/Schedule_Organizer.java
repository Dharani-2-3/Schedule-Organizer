/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package schedule_organizer;

import java.util.Scanner;

/**
 *
 * @author swetha
 */
public class Schedule_Organizer {

    public static void main(String[] args) {
        TasksCollections tasksObj =new TasksCollections();
        Scanner in = new Scanner(System.in);
        while(true){
            System.out.print("""
                             1.Add New Task
                             2.Remove Task
                             3.Edit Task
                             4.view All Task
                             5.view task based on priority
                             6.set Status of task
                             7.Exit!!
                             Enter your Choice""");
            int ch = in.nextInt();
            in.nextLine();
            switch(ch){
                case 1->{
                    System.out.print("Enter Description of the task :");
                    String desc = in.nextLine();
                    System.out.print("Enter Start Time of the task :");
                    String sttime = in.nextLine();
                    System.out.print("Enter End Time of the task :");
                    String ettime = in.nextLine();
                    System.out.print("Enter Priority of the task :");
                    String priority = in.nextLine();
                    Task newTask = new Task(desc,sttime,ettime,priority);
                    boolean status = tasksObj.addTask(newTask);
                    if(status){
                        System.out.print("Task added successfully");
                    }
                    else{
                        System.out.print("Task already exist");
                    }   
                   }
                case 2->{
                    System.out.print("Enter the description of the task to be removed :");
                    String desc = in.nextLine();
                    boolean status = tasksObj.removeTask(desc);
                    if(status){
                        System.out.print("Task removed successfully");
                    }
                    else{
                        System.out.print("Task not available");
                    } 
                   }
                case 3->{
                    System.out.print("Enter the description of the task to be edited:");
                    String desc = in.nextLine();
                    boolean status = tasksObj.editTask(desc);
                    if(status){
                        System.out.print("Task Edited successfully");
                    }
                    else{
                        System.out.print("Task not available");
                    } 
                   }
                case 4->{
                    tasksObj.display();
                   }
                case 5->{
                    System.out.print("Enter the Priority of the task :");
                    String priority = in.nextLine();
                    tasksObj.viewTask(priority);
                   }
                case 6 ->{
                    System.out.print("Enter the description of the task to mark it's status :");
                    String desc = in.nextLine();
                    boolean status = tasksObj.markCompleted(desc);
                    if(status){
                        System.out.print("Task Status marked successfully\n");
                    }
                    else{
                        System.out.print("Task not available\n");
                    } 
                   }
                case 7->{
                     System.out.print("Exited..");
                     return ;
                }
                default ->{
                    System.out.print("Invalid Choice");
                }
              }
        }
    }
}
                
            
        
