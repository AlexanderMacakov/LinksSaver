package ru.macakov.linkSaver.OldFile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputData {
    private BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    private String login;
    private String password;

    public InputData() throws IOException {
        System.out.println("Введите почту");
        login();
        System.out.println("Введите пароль");
        password();
    }

    private void login() throws IOException {
        login = bufferedReader.readLine();
        if (login.isEmpty() || login.equals(" ")) {
            System.out.println("Вы ничего не ввели, повторите попытку или введите \"Выход\" для выхода в меню");
            login();
            if (login.equals("Выход") || login.equals("выход")) {
                login = null;
                return;
            }
        }
    }

    private void password() throws IOException {
        password = bufferedReader.readLine();
        if (password.isEmpty()) {
            System.out.println("Вы ничего не ввели, повторите попытку или введите \"Выход\" для выхода в меню");
            password();
            if (password.equals("Выход") || password.equals("выход")) {
                password = null;
                return;
            }
        }
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }
}
