/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package schedule_organizer;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author swetha
 */
public class TasksCollections {
   Scanner in =new Scanner(System.in);
   private ArrayList <Task> Tasks;
   public TasksCollections(){
       this.Tasks= new ArrayList();
   }
   public boolean addTask(Task newTask){
      if(isPresent(newTask.getDesc())){
          return false;
      }
      Tasks.add(newTask);
      return true;
   }
   public boolean removeTask(String desc)
   {
       for(Task i:Tasks){
           if(i.getDesc().equals(desc)){
               Tasks.remove(i);
               return true;
           }
       }
       return false;
   }
   public void display(){
       if(Tasks.isEmpty())
       {
           System.out.println("No tasks available");
       }
       for(Task i:Tasks){
           i.display();
       }
   }
   public boolean isPresent(String desc){
       for(Task i:Tasks){
           if(i.getDesc().equals(desc)){
               return true;
           }
       }
       return false;
   }
   public boolean editTask(String desc){
       for(Task i:Tasks)
       {
           if(i.getDesc().equals(desc)){
               System.out.println("Enter the choice you want to edit\n");
               System.out.println("1.Description\n2.Start time\n3.End time\n4.priority level\n");
               int ch = in.nextInt();
               switch(ch){
                   case 1:
                       System.out.println("enter new description");
                       String newDesc= in.nextLine();
                       i.setDesc(newDesc);
                       break;
                   case 2:
                       System.out.println("enter new Start Time");
                       String newSttime= in.nextLine();
                       i.setSttime(newSttime);
                       break;
                   case 3:
                       System.out.println("enter End Time");
                       String newEdtime= in.nextLine();
                       i.setEdtime(newEdtime);
                       break;
                   case 4:
                       System.out.println("enter priority level");
                       String newpriority= in.nextLine();
                       i.setPriority(newpriority);
                       break;
               }
               return true;
           }
       }
        return false;
   }
   public boolean markCompleted(String desc){
       for(Task i :Tasks){
           if(i.getDesc().equals(desc)){
               boolean status =i.getComp();
               i.setComp(!status);
               return true;
           }
       }
       return false;
   }
   public void viewTask(String priority){
       int count =0;
       for(Task i:Tasks){
           if(i.getPriority().equals(priority)){
               i.display();
               count++;
           }
       }
       if(count==0)
       {
           System.out.println("No task available");
       }
   }
}
