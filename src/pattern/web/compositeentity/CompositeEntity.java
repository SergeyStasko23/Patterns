package pattern.web.compositeentity;

public class CompositeEntity {
    CoarseGainedObject coarseGainedObject = new CoarseGainedObject();
    public String[] getData() {
        return coarseGainedObject.getData();
    }
}
