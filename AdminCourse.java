package Github;

/**
 *
 * @author JulioCabeza
 */
public class AdminCourse extends OnlineCourse {
    String [] documents;
    
    public AdminCourse(int tam){
        documents= new String[tam];
        this.duration=40;
    }
    
    public AdminCourse(){
        this.documents=new String[0];
    }
    
    public AdminCourse(AdminCourse copia){
        this.documents=copia.documents;
    }
    
    public String toString(){
        String curso="";
        
        for (int i=0; i<documents.length; i++){
            curso+=documents[i]+ ", ";
        }
        return curso;
    }
    
    public AdminCourse clone(){
        AdminCourse copia=new AdminCourse(this);
        return copia;
    }
    
    public boolean equals(AdminCourse compa){
        if(compa.name.equals(this.name) && compa.ID.equals(this.ID) && compa.duration==this.duration && compa.teacher.equals(this.teacher) && documents.equals(compa.documents)){
            return true;
        }
        return false;
    }
}