package pattern.web.businessdelegate;

public interface BusinessService {
    void doJob();
}

class EJBService implements BusinessService {
    @Override
    public void doJob() {
        System.out.println("do ejb job");
    }
}

class JMSService implements BusinessService {
    @Override
    public void doJob() {
        System.out.println("do jms job");
    }
}

class LookupService {
    public BusinessService getService(String serviceType) {
        BusinessService service = null;
        switch (serviceType) {
            case "ejb" : service = new EJBService(); break;
            case "jms" : service = new JMSService(); break;
        }
        return service;
    }
}

class BusinessDelegate {
    LookupService lookupService = new LookupService();
    BusinessService businessService;

    public void doTask(String serviceType) {
        businessService = lookupService.getService(serviceType);
        businessService.doJob();
    }
}
