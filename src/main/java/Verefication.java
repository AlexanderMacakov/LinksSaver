import Entity.Link;
import Entity.Person;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

public class Verefication {

    private static Logger log = Logger.getLogger(Verefication.class.getName());

    private Map<Person, List<Link>> allPeople = new ParseXMLUser().runParse();
    private Person foundPerson = null;


    public boolean checkPerson(String eMail, String password) {

        for (Map.Entry<Person, List<Link>> man : allPeople.entrySet()) {
            if (eMail.equals(man.getKey().geteMail())) {
                if (password.equals(man.getKey().getPassword())) {
                    log.info("Пользователь найден");
                    foundPerson = man.getKey();
                    return true;
                }
            }
        }
        log.info("Пользователь не существует");
        return false;

    }

    public Person getFoundPerson() {
        return foundPerson;
    }

    public Person createNewPerson(String firstName, String lastName, String eMail, String password){
        return new Person(firstName, lastName, eMail, password);
    }


}
