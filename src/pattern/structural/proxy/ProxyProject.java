package pattern.structural.proxy;

/*
    Proxy - заместитель.
    Хранит ссылку, которая позволяет Proxy обратиться к RealSubject.
    Proxy разрешает или запрещает доступ к функциональности RealSubject.
 */
public class ProxyProject implements Project {
    private String url;
    private RealProject realProject;

    public ProxyProject(String url) {
        this.url = url;
    }

    @Override
    public void run() {
        if(realProject == null) {
            realProject = new RealProject(url);
        }
        realProject.run();
    }
}
