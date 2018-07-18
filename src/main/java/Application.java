import Entity.Person;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Application {

    private static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        Person user = null;

        TextMassage.tittle();
        TextMassage.dialogLogin();

        String login = bufferedReader.readLine();
        String password = bufferedReader.readLine();

        Verefication verefication = new Verefication();
        if (verefication.checkPerson(login, password)) {
            user = verefication.getFoundPerson();
        }

    }

}
