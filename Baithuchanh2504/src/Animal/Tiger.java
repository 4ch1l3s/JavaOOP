package Animal;

public class Tiger extends Animal {
    @Override
    public void Eat() {
        System.out.println("Con ho " + super.getEat());   
    }
    @Override
    public void Sleep() {
        System.out.println("Con ho " + super.getSleep());      
    }
    @Override
    public void Walk() {
        System.out.println("Con ho " + super.getWalk());      
    }
    @Override
    public void Run() {
        System.out.println("Con ho " + super.getRun());       
    }
    @Override
    public void Roar() {
        System.out.println("Con ho " + super.getRoar());   
    }
}
