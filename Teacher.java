
package ClassPerson;

/**
 *
 * @author usuario
 */
public class Teacher extends Person{
    private Student class[];
    private Course teach;
    private int tam;
    
    public Teacher(){
        class=new Student[0];
        teach=new Course();
        int tam=0;
    }
    
    public Teacher(Teacher copy){
        this.tam=copy.tam;
        for(int i; i<this.tam; i++){
            this.class[i]=copy.class[i];
        }
        this.teach=copy.teach;
        this.class=copy.class;
    }
    
    public Teacher(Course teach, Student[] class, String tama?o){
        this.tam=Integer.parseInt(tama?o);
        for(int i; i<this.tam; i++){
            this.class[i]=class[i];
        }
        this.class=class;
    }
    
    public void setTam(int tam){
        this.tam=tam;
    }
    
    public int getTam(){
        return this.tam;
    }
    
    public void setClass(Student[] class){
    for(int i; i<this.tam; i++){
            this.class[i]=class[i];
        }
    }
    
    public Student[] getClass(){
        return this.class;
    }
    
    public void setTeach(Course teach){
        this.teach=teach;
    }
    
    public Course getTeach(){
        return this.teach;
    }
    
    public String toString(){
        return "This teacher teaches a " + this.teach.toString + " class with this students " + for(int i; i<tam; i++){ System.out.println(class[i].toString + " ")};
    }
        
    public Teacher clone(){
        Teacher clon=new Teacher(this);
        return clon;
    }
    
    public boolean equals(Teacher other){
        if(this.tam==other.tam && this.class==other.class && this.teach==other.teach){
            return true;
        }
        return false;
    }
}
