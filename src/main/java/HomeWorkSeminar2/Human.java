package HomeWorkSeminar2;

public class Human implements Action {
    Double maxRun = 15.0;
    Double maxJump = 1.0;
    public boolean Run(Double size){
        if(size > 0 && size <= maxRun) {
            System.out.println("Человек пробежал! (максимальное расстояние = " + maxRun + ")");
            return true;
        }
        else {
            System.out.println("Человек не смог пробежать! (максимальное расстояние = " + maxRun + ")");
            return false;
        }
}
    public void Jump(Double size){
        if(size > 0 && size <= maxJump)
            System.out.println("Человек перепрыгнул! (максимальный прыжок = " + maxJump + ")");
        else
            System.out.println("Человек не смог перепрыгнуть! (максимальный прыжок = " + maxJump + ")");
    }
}
