import ru.macakov.linkSaver.entity.Link;
import ru.macakov.linkSaver.entity.Person;
import ru.macakov.linkSaver.services.PersonService;

public class Main {

    public static void main(String[] args) {

        PersonService personService = new PersonService();

        Person user = new Person("user", "1234", "user@gmail.com");
        Link habr = new Link("habr", "habr.com");
        user.addLink(habr);
        personService.savePerson(user);

    }
}
