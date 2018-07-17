import Entity.Person;

import java.util.ArrayList;
import java.util.logging.Logger;

public class Verefication {

    ArrayList<Person> allPeople = new ParseXMLUser().runParse();
    private static Logger log = Logger.getLogger(Verefication.class.getName());


    private boolean checkPerson(String eMail) {
        boolean rezult = false;

        for (Person human : allPeople) {

            if (human.geteMail().equals(eMail)) {
                rezult = true;
                log.info("Пользователь найден");
                break;
            }
        }

        return rezult;

    }

}
