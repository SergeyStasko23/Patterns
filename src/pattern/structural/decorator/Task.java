package pattern.structural.decorator;

class Task {
    public static void main(String[] args) {
        Developer javaTeamLead = new JavaTeamLead(new SeniorJavaDeveloper(new JavaDeveloper()));
        System.out.println(javaTeamLead.makeJob());

        Developer seniorJavaDeveloper = new SeniorJavaDeveloper(new JavaDeveloper());
        System.out.println(seniorJavaDeveloper.makeJob());

        Developer javaDeveloper = new JavaDeveloper();
        System.out.println(javaDeveloper.makeJob());
    }
}
