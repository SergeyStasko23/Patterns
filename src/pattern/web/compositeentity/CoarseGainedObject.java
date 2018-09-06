package pattern.web.compositeentity;

public class CoarseGainedObject {
    DependentObject1 dependentObject1 = new DependentObject1();
    DependentObject2 dependentObject2 = new DependentObject2();

    public String[] getData() {
        return new String[]{dependentObject1.getData(), dependentObject2.getData()};
    }
}
