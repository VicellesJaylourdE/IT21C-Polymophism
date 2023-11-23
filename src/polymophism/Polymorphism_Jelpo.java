
package polymophism;

public class Polymorphism_Jelpo extends Polymorphism_Student{   //child class
    
    Polymorphism_Jelpo(String name){
        super(name);
    }
    void coding(){
        System.out.println(name + " kay galabad ang ulo sa sigeg code");
    }    
    public void studentCute(){
        System.out.println("Pangit si " + name);
    }
}
