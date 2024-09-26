import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Planet>planets=new ArrayList<>();
        planets.add(new Planet("Меркурий",3.302e23 )) ;
        planets.add(new Planet("Венера",4.8685e24));
        planets.add(new Planet("Земля",5.9736e24));
        planets.add(new Planet("марс",6.419e23));
        planets.add(new Planet("Юпитер",1.8986e27));
        planets.add(new Planet("Сатурн",5.6846e26));
        planets.add(new Planet("Уран",8.6832e25));
        planets.add(new Planet("Нептун",1.0243e26));
        System.out.println(planets);







    }

}

class Planet {
    String name;
    double masse;

    @Override
    public String toString() {
        return "Planet{" +
                "name='" + name + '\'' +
                ", masse=" + masse +
                '}';
    }

    public Planet(String name, double masse) {
        this.name = name;
        this.masse = masse;
    }

}

class Moon{
    String name;
    double mass;
    String color;

    Moon(String name, double mass, String color){
        this.name = name;
        this.mass = mass;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Moon{" +
                "name='" + name + '\'' +
                ", mass=" + mass +
                ", color='" + color + '\'' +
                '}';
    }
}





