package sample;

public class Student extends Study {
    public void go(String name){
        System.out.println(name +"let go");
    }

    @Override
    public void timeStudy() {
        System.out.println("Dang hoc");
    }
}
