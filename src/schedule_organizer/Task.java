/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package schedule_organizer;

import java.time.LocalTime;

/**
 *
 * @author swetha
 */
public class Task {
    private String description;
    private LocalTime StartTime;
    private LocalTime EndTime;
    private String prioritylvl;
    private boolean completed;
    
    public Task(String description,String StartTime,String EndTime,String prioritylvl){
     this.description=description;
     this.StartTime=LocalTime.parse(StartTime);
     this.EndTime=LocalTime.parse(EndTime);
     this.prioritylvl=prioritylvl;
     this.completed=false;
    }
    public void display()
    {
        System.out.println("Description"+description);
        System.out.println(":StartTime "+StartTime);
        System.out.println("EndTime: "+EndTime);
        System.out.println("prioritylvl: "+prioritylvl);
        System.out.println("Completed: "+completed);

    }
    public String getDesc(){
        return this.description;
    }
    public void setDesc(String newDesc){
        this.description=newDesc;
    }
    public void setPriority(String newPriority){
        this.prioritylvl=newPriority;
    }
    public void setSttime(String newSttime){
        this.StartTime = LocalTime.parse(newSttime);
    }
    public void setEdtime(String newEdtime){
        this.EndTime = LocalTime.parse(newEdtime);
    }
    public boolean getComp(){
        return this.completed;
    }
    public void setComp(boolean Status){
        this.completed= Status;
    }
    public String getPriority(){
        return this.prioritylvl;
    }
}

