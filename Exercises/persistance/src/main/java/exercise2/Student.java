package exercise2;

import javax.persistence.*;

@Entity
@Table(name = "exercise2")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;

    @Embedded
    private Address address;

    public Student(){
        address = new Address();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String street, String city, String zipcode) {
        this.address.setStreet(street);
        this.address.setCity(city);
        this.address.setZipcode(zipcode);
    }
}
