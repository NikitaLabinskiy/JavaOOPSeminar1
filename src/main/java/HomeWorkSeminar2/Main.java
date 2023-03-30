//1)Создайте три класса: Человек, Кот, Робот, которые не наследуются от одного класса.
//Эти классы должны уметь бегать и прыгать, все также с выводом информации о действии в консоль.
//2) Создайте два класса: беговая дорожка и стена, при прохождении через которые, участники
//должны выполнять соответствующие действия (бежать или прыгать), результат выполнения
//печатаем в консоль (успешно пробежал, не смог пробежать и т.д.). У препятствий есть длина
//(для дорожки) или высота (для стены), а участников ограничения на бег и прыжки.
//3) Создайте два массива: с участниками и препятствиями, и заставьте всех участников пройти
//этот набор препятствий. Если участник не смог пройти одно из препятствий, то дальше по
//списку он препятствий не идет.

package HomeWorkSeminar2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Human human = new Human();
        Cat cat = new Cat();
        Robot robot = new Robot();

        Action[] actions = new Action[3];
        actions[0] = human;
        actions[1] = cat;
        actions[2] = robot;

        Wall wall = new Wall(2.0);
        RunningTrack runningTrack = new RunningTrack(16.0);

        Parameter[] parameters = new Parameter[2];
        parameters[1] = wall;
        parameters[0] = runningTrack;

        System.out.println("Высота стены = " + wall);
        System.out.println("Длина беговой дорожки = " + runningTrack);
        Competition(actions, parameters);
    }
    public static void Competition(Action[] actions, Parameter[] parameters){
        System.out.println();
        for (Action action : actions) {
            boolean checkRun = action.Run(parameters[0].getParameterSize());
            if(checkRun)
                action.Jump(parameters[1].getParameterSize());
        }
    }
}
