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
        InputData inputData = new InputData();

        Verefication verefication = new Verefication();
        verefication.checkPerson(inputData.getLogin(), inputData.getPassword());
        user = verefication.getFoundPerson();
        System.out.println(user.toString());

    }

}
