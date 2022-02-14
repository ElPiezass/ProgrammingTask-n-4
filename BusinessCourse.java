# ProgrammingTask-n-4
  public class BusinessCourse extends OnlineCourse{
    
    public BusinessCourse() {
        name = id = teacher = "";
        duration = 0;
    }

    public BusinessCourse(String name, String id, String teacher, String duration) {
        this.name = name = "";
        this.id = id = "";
        this.teacher = teacher = "";

        int dur = Integer.parseInt(duration);
        if (checkDurationB(dur)) {
            this.duration = dur *= 15;
        }
    }

    public BusinessCourse(OnlineCourse other){
        this.duration = other.duration;
        this.id = other.id;
        this.name = other.name;
        this.teacher = other.teacher;
    }
    
    public boolean checkDurationB(int duration) {
        if (duration > 30) {
            return true;
        }
        return false;
    }

    public BusinessCourse clone() {
        BusinessCourse clon;
        clon = new BusinessCourse(this);
        return clon;
    }

    public boolean equals(BusinessCourse other) {
        if (this.duration == other.duration && this.id == other.id && this.name == other.name && this.teacher == other.teacher) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "Name of the course: " + this.name + ", Teacher: " + this.teacher + ", duration: " + this.duration + ", ID: " + this.id;
    }
}
