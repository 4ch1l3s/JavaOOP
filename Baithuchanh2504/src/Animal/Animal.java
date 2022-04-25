package Animal;

public abstract class Animal {
    private String eat = "an thuc an roi chuan bi do an cho ban Lan";
    private String sleep = "ngu trong bui cay va mo ve ban Lan";
    private String walk = "di dao canh ho nuoc va hi vong co the di cung ban Lan";
    private String run = "duoi theo ban Lan";
    private String roar = "dau kho vi ban Lan da yeu nguoi khac :(";
    
    public Animal() {}
    public abstract void Eat();
    public abstract void Sleep();
    public abstract void Walk();
    public abstract void Run();
    public abstract void Roar();
     
    public String getEat() {return eat;}
    public String getSleep() {return sleep;}
    public String getWalk() {return walk;}
    public String getRun() {return run;}
    public String getRoar() {return roar;}
}


