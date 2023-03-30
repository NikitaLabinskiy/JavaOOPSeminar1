package HomeWorkSeminar2;

public class Cat implements Action {
    Double maxRun = 25.0;
    Double maxJump = 2.0;
    public boolean Run(Double size){
        if(size > 0 && size <= maxRun) {
            System.out.println("Кот пробежал! (максимальное расстояние = " + maxRun + ")");
            return true;
        }
        else {
            System.out.println("Кот не смог пробежать! (максимальное расстояние = " + maxRun + ")");
            return false;
        }
    }
    public void Jump(Double size){
        if(size > 0 && size <= maxJump) {
            System.out.println("Кот перепрыгнул! (максимальный прыжок = " + maxJump + ")");
        } else
            System.out.println("Кот не смог перепрыгнуть! (максимальный прыжок = " + maxJump + ")");
    }
}
