package FourthTask;

public class ITCourse extends OnlineCourse{

    private String specialization;
    
    public ITCourse(){
        setName("");
        setID("");
        setTeacher("");
        setDuration(0);
        if(checkSpecialization("")){
            specialization="";
        }
    }
    
    public ITCourse(String na, String i, String te, String sp, int du){
        setName(na);
        setID(i);
        setTeacher(te);
        setDuration(du);
        if(checkSpecialization(sp)){
            specialization=sp;
        }
    }
    
    public ITCourse(ITCourse other){
        setName(other.getName());
        setID(other.getID());
        setTeacher(other.getTeacher());
        setDuration(other.getDuration());
        specialization=other.specialization;
    }
    
    private boolean checkSpecialization(String sp){
        boolean comp=false;
        
        switch(sp){
            case "Networking":
                setDuration(35);
                comp=true;
            break;
                
            case "Programming":
                setDuration(50);
                comp=true;
            break;
            
            case "Sysadmin":
                setDuration(40);
                comp=true;
            break;
        }
        
        return comp;
    }
    
    public String toString(){
        return "This " + getName() + " ITCourse, of" + specialization + "with ID " + getID() + " have a duration of " + getDuration() + " hours, imparted with the teacher " + getTeacher();
    }
    
    public ITCourse clone() {
        ITCourse clone = new ITCourse(this);
        return clone;
    }


    public boolean equals(ITCourse other) {
        boolean comp=false;
        
        if(getName()==other.getName()){
            if(getID()==other.getID()){
                if(getTeacher()==other.getTeacher()){
                    if(getDuration()==other.getDuration()){
                        if(specialization==other.specialization){
                            comp=true;
                        }
                    }
                }
            }
        }
        
        return comp;
    }

    public boolean equals(OnlineCourse other) {
        boolean comp=false;
        
        if(getName()==other.getName()){
            if(getID()==other.getID()){
                if(getTeacher()==other.getTeacher()){
                    if(getDuration()==other.getDuration()){
                        comp=true;
                    }
                }
            }
        }
        
        return comp;
    }


    
}

    
