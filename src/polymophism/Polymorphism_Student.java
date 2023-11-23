
package polymophism;

public class Polymorphism_Student { //parent class
    String name;    
    Polymorphism_Student(String name){
        this.name = name;
    }    
    void eat(){
        System.out.println(name + " kay gakaon ug saging");
    }    
    void sleep(){
        System.out.println(name + " kay gatulog nga gasiga ang mata");
    }    
    void tae(){
        System.out.println(name + " kay kalibangon");
    }
    void coding(){
        System.out.println(name + " kay galabad ang ulo sa sigeg code");
    }       
    public void studentCute(){
        System.out.println("Nagpa CUTE si " + name);
    }
}
