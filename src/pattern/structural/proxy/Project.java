package pattern.structural.proxy;

/*
    Subject - субъект. Определяет общий для RealSubject и Proxy интерфейс,
    так что класс Proxy можно использовать везде, где ожидается RealSubject.
 */
public interface Project {
    void run();
}
