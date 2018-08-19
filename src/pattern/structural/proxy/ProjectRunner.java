package pattern.structural.proxy;

public class ProjectRunner {
    public static void main(String[] args) {
        Project project = new ProxyProject("https://github.com/SergeyStasko23/Patterns");
        project.run();
    }
}
