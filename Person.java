package New;

public class Person {
    
    private String name, surname, email;
    
    public Person(){
        setName("");
        setSurname("");
        setEmail("");
    }
    
    public Person(String na, String su, String em){
        setName(na);
        setSurname(su);
        setEmail(em);
    }
    
    public Person(Person other){
        setName(other.name);
        setSurname(other.surname);
        setEmail(other.email);
    }
    
    public void setName(String na){
        if(na.length()>=3){
            name=na;
        }
    }
    
    public void setSurname(String su){
        su.trim();
        su.toUpperCase();
        surname=su;
    }
    
    public void setEmail(String em){
        if(em.contains("@")){
            if(em.endsWith(".es") || em.endsWith(".com")){
                email=em;
            }
        }
    }
    
    public String getName(){
        return name;
    }
    
    public String getSurname(){
        return surname;
    }
    
    public String getEmail(){
        return email;
    }
    
    public String toString(){
        return "This person with name: " + getName() + "" + getSurname()+ " his email is: " + getEmail();
    }
    
    public boolean equals(Person other){
        boolean comp=false;
        
        if(getName()==other.getName()){
            if(getSurname()==other.getSurname()){
                if(getEmail()==other.getEmail()){
                    comp=true;
                }
            }
        }
        
        return comp;
    }
    
    public Person clone(Person other){
        setName(other.getName());
        setSurname(other.getSurname());
        setEmail(other.getEmail());
        
        return other;
    }
}
