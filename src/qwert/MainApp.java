package qwert;

public class MainApp {
    public static void main(String[] args) {
      Run[] animals = {
              new Cat("Cat", 100, 9),
              new Robot("Robot", 11,3),
              new Human("Human" , 12, 12)
      };
        Obstacles [] let  = {
                new Wall(WallH.high),
                new Wall(WallH.low),
                new Treadmill(88)
        };

        for (Run a:animals){
            int i =0;
            for(Obstacles l:let){
                if (l instanceof Wall){
                    if (a.run()<l.distance)
                    {
                        System.out.println(a.name()+" проиграл");
                        i++;
                        break;
                    }
                }
                if (l instanceof Treadmill){
                    if (a.jump()<l.distance)
                    {
                        System.out.println(a.name()+" проиграл");
                        i++;
                        break;
                    }
                }
            }
            if(i==0)
                System.out.println(a.name()+" Выйграл");
        }
    }
}
