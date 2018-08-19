package pattern.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/*
    Flyweight показывает, как разделять очень мелкие объекты бех недопустимо высоких издержек.
 */

// FlyweightFactory - фабрика приспособленцев. Позволяет найти подходящего приспособленца.
public class DeveloperFactory {
    private static final Map<String, Developer> developers = new HashMap<>();

    public Developer getDeveloperBySpecialty(String specialty) {
        Developer developer = developers.get(specialty);
        if(developer == null) {
            switch (specialty) {
                case "java" :
                    System.out.println("Hiring java developer...");
                    developer = new JavaDeveloper();
                    break;
                case "c++" :
                    System.out.println("Hiring c++ developer...");
                    developer = new CppDeveloper();
                    break;
            }
            developers.put(specialty, developer);
        }
        return developer;
    }
}
