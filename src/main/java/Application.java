import Connections.ConnectMongo;
import Entity.Person;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Application {

    private static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));


    public static void main(String[] args) throws IOException {
        TextMassage.tittle();
        ConnectMongo connectMongo = new ConnectMongo();

        System.out.println(connectMongo.getByPerson("admin").toString());

    }

}
