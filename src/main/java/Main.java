import ru.macakov.linkSaver.entity.Link;
import ru.macakov.linkSaver.entity.Person;
import ru.macakov.linkSaver.services.PersonService;

public class Main {

    public static void main(String[] args) {

        PersonService personService = new PersonService();

        Person person = new Person("lowerCase", "11111", "lower@gmail.com");
        personService.savePerson(person);


    }
}
