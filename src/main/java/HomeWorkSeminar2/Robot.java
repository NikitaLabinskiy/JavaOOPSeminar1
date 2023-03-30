package HomeWorkSeminar2;

public class Robot implements Action {
    Double maxRun = 1000.0;
    Double maxJump = 0.5;
    public boolean Run(Double size){
        if(size > 0 && size <= maxRun){
            System.out.println("Робот пробежал! (максимальное расстояние = " + maxRun + ")");
            return true;
        }
        else {
            System.out.println("Робот не смог пробежать! (максимальное расстояние = " + maxRun + ")");
            return false;
        }
    }
    public void Jump(Double size){
        if(size > 0 && size <= maxJump)
            System.out.println("Робот перепрыгнул! (максимальный прыжок = " + maxJump + ")");
        else
            System.out.println("Робот не смог перепрыгнуть! (максимальный прыжок = " + maxJump + ")");
    }
}
