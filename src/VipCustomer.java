public class VipCustomer {

    private String name;
    private int creditLimit;
    private String email;

    public VipCustomer() {
        System.out.println("New VIP customer created");
        name = "Default name";
        creditLimit = 10_000;
        email = "default@email.com";
    }

    public String getName() {
        return this.name;
    }

//    public VipCustomer() {
//        this("Default name", 10_000, "default@emial.com");
//    }

//    public VipCustomer() {
//
//    }
//
//    public VipCustomer() {

//    }
}
