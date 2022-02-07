package FourthTask;

import java.time.LocalTime;

public abstract class OnlineCourse {
    
    private String name, ID, teacher;
    private int duration;
    
    public boolean checkName(String na){
        boolean comp=false;
        
        if(na.length()>=4){
            comp=true;
        }
        
        return comp;
    }
    
    public boolean checkTeacher(String te){
        boolean comp=false;
        
        int account=0;
        if(te.length()>1){
            for(int i=0; i<te.length(); i++){
                if(te.charAt(i)==' '){
                    if(account==0){
                        te.replace(' ',',');
                        account++;
                    }    
                }
            }
            comp=true;
        }   
        return comp;
    }
    
    public boolean checkID(String oo){
        boolean comp=false;
        
        for(int i=0; i<oo.length(); i++){
            if(oo.charAt(0)==name.charAt(0)){
                if(oo.charAt(oo.length()-1)==teacher.charAt(0)){
                    comp=true;
                }
            }
        }
        return comp;
    }
    
    public boolean checkDuration(int du){
        boolean comp=false;
        
        if(du>=30){
            comp=true;
        }
        
        return comp;
    }
    
    public void setName(String na){
        if(checkName(na)){
            name=na;
        }
    }
    
    public void setID(String i){
        if(checkID(i)){
            ID=i;
        }
    }
    
    public void setTeacher(String te){
        if(checkTeacher(te)){
            teacher=te;
        }
    }
    
    public void setDuration(int du){
        if(checkDuration(du)){
            duration=du;
        }
    }
    
    public String getName(){
        return name;
    }
    
    public String getTeacher(){
        return teacher;
    }
    
    public String getID(){
        return ID;
    }
    
    public int getDuration(){
        return duration;
    }
    
    public abstract String toString();
    
    public abstract OnlineCourse clone();
    
    public abstract boolean equals(OnlineCourse other);
        
}
