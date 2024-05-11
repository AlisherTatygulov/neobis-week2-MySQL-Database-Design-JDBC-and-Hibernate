package neobis.week2.pojo;

public class Customer {
    private int id;
    private String name;
    private String contactInformation;

    public Customer() {
    }

    public Customer(int customerId, String name, String contactInformation) {
        this.id = customerId;
        this.name = name;
        this.contactInformation = contactInformation;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactInformation() {
        return contactInformation;
    }

    public void setContactInformation(String contactInformation) {
        this.contactInformation = contactInformation;
    }
}

