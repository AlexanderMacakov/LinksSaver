import java.util.ArrayList;

public class Application {

    public static void main(String[] args) {
        ArrayList<Person> personArrayList = new ArrayList<>();
        personArrayList = new ParseXMLUser().runParse();

        for (Person p: personArrayList){
            System.out.println(p.getLastName());
            System.out.println(p.getFirstName());
            System.out.println(p.geteMail());
            System.out.println(p.getPassword());
        }
    }

}
