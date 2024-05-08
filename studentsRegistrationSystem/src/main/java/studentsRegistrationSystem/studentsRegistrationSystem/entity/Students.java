package studentsRegistrationSystem.studentsRegistrationSystem.entity;

import jakarta.persistence.*;

@Entity
@Table(name="students")
public class Students {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name="name")
    private String name;

    @Column(name="email")
    private String email;

    @Column(name="lastName")
    private String last;

    public Students(){

    }

    public Students(int id, String name, String email,String last){
        this.id=id;
        this.name=name;
        this.email=email;
        this.last=last;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id=id;
    }
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }
    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email=email;
    }

    public String getLast(){
        return last;
    }

    public void setLast(String last){
        this.last=last;
    }

    @Override
    public String toString(){
        return "Students{"+"id"+"name="+'\''+"email"+'\''+last+"last"+'\''+'}';
    }
}
