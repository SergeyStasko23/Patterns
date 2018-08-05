package pattern.creational.abstractfactory;

/* Интерфейсы работников команды */
interface Developer {
    void writeCode();
}

interface ProjectManager {
    void manageProject();
}

interface Tester {
    void testCode();
}

interface ProjectTeamFactory {
    Developer getDeveloper();
    Tester getTester();
    ProjectManager getProjectManager();
}

/* Из этих интерфейсов можно создать команду для любой организации */
class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Java developer writes java code...");
    }
}

class BankingPM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Banking PM manages banking project...");
    }
}

class QATester implements Tester {
    @Override
    public void testCode() {
        System.out.println("QA tester tests banking code...");
    }
}

class BankingTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }
    @Override
    public Tester getTester() {
        return new QATester();
    }
    @Override
    public ProjectManager getProjectManager() {
        return new BankingPM();
    }
}

/* Создав команду банка, можно создать банковскую систему */
public class SuperBankSystem {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new BankingTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        ProjectManager projectManager = projectTeamFactory.getProjectManager();
        System.out.println("Creating bank system...");
        developer.writeCode();
        tester.testCode();
        projectManager.manageProject();
    }
}
