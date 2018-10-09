import ru.macakov.linkSaver.entity.Link;
import ru.macakov.linkSaver.entity.Person;
import ru.macakov.linkSaver.services.PersonService;

public class Main {

    public static void main(String[] args) {
        PersonService personService = new PersonService();
        Person person = new Person("admin", "admin", "admin@gmail.com");
        personService.savePerson(person);
        Link linkGoogle = new Link("Ссылка на гугл", "www.google.com");
        linkGoogle.setPerson(person);
        person.addLink(linkGoogle);
        Link linkYandex = new Link("Это яндекс", "www.yandex.ru");
        linkYandex.setPerson(person);
        person.addLink(linkYandex);
        personService.updatePerson(person);
    }
}
