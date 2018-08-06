package pattern.structural.composite;

/*
    Компонует объекты в древовидные структуры для представления иерархий часть-целое.
*/

import java.util.ArrayList;
import java.util.List;

// Client
public class Project {
    public static void main(String[] args) {
        Team team = new Team();

        Developer firstJavaDeveloper = new JavaDeveloper();
        Developer secondJavaDeveloper = new JavaDeveloper();
        Developer cppDeveloper = new CppDeveloper();

        team.addDeveloper(firstJavaDeveloper);
        team.addDeveloper(secondJavaDeveloper);
        team.addDeveloper(cppDeveloper);

        team.createProject();
    }
}

// Компонент
interface Developer {
    void writeCode();
}

class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Java developer writes java code...");
    }
}

class CppDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("C++ developer writes c++ code...");
    }
}

// Составной объект
class Team {
    private List<Developer> developers = new ArrayList<>();

    public void addDeveloper(Developer developer) {
        developers.add(developer);
    }

    public void removeDeveloper(Developer developer) {
        developers.remove(developer);
    }

    public void createProject() {
        System.out.println("Team creates project...\n");

        for(Developer developer : developers) {
            developer.writeCode();
        }
    }
}
