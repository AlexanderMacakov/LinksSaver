public class Person implements ActionUser {


    private String firstName;
    private String lastName;
    private String eMail;
    private String password;

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
    public void addLink() {

    }

    @Override
    public void delLink() {

    }

    @Override
    public void editLink() {

    }
}
