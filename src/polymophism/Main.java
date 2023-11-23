package polymophism;

public class Main {
    public static void main(String[] args){
        Polymorphism_Student my_student = new Polymorphism_Student("Si Nanan ");
        Polymorphism_Jay my_Jay = new Polymorphism_Jay ("Jay");
        Polymorphism_Jelpo my_Jelpo = new Polymorphism_Jelpo ("Jelpo");
        
        my_student.eat();
        my_Jay.sleep();
        my_Jelpo.coding();
        
        System.out.println("---------------------------------------");
        
        my_student.eat();
        my_Jay.studentCute();
        my_Jelpo.studentCute();
    }
}

