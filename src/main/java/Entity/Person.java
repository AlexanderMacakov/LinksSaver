package Entity;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class Person implements ActionUser {


    private String firstName;
    private String lastName;
    private String eMail;
    private String password;
    private List <Link> personListLink = new ArrayList();

    private Person() {

    }

    public Person(String firstName, String lastName, String eMail, String password) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.eMail = eMail;
        this.password = password;

    }

    @Override
    public void read() {

    }

    @Override
    @Autowired
    public void addLink(Link link) {
        personListLink.add(link);
    }

    @Override
    @Autowired
    public void delLink(String tittle) {

    }

    @Override
    @Autowired
    public void editLink(Link link) {

    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String geteMail() {
        return eMail;
    }

    public String getPassword() {
        return password;
    }
}
