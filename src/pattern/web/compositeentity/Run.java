package pattern.web.compositeentity;

public class Run {
    public static void main(String[] args) {
        CompositeEntity compositeEntity = new CompositeEntity();
        for(String s : compositeEntity.getData()) {
            System.out.println(s);
        }
    }
}
