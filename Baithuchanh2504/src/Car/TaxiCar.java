package Car;

public class TaxiCar implements Car {
 
    @Override
    public void move() {
        System.out.println("Xe taxi " + move);
    }
    public void stop() {
        System.out.println("Xe taxi " + stop);
    }
    public void TurnRight() {
        System.out.println("Xe taxi " + TurnRight);
    }
    public void TurnLeft() {
        System.out.println("Xe taxi " + TurnLeft);
    }
    public void Reverse() {
        System.out.println("Xe taxi " + Reverse);
    }
     
}