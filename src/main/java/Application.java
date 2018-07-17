import Entity.Person;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Application {

    static ArrayList<Person> listPerson = new ParseXMLUser().runParse();
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {
        TextMassage.Tittle();


    }

}
