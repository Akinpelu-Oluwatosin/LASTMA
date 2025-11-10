package data.models;

public class Owner {
    private String id;
    private String name;
    private String email;
    private String address;
    private String phoneNumber;
    private Gender gender;


    public Owner(String id, String name, String email, String address, String phoneNumber, Gender gender) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}