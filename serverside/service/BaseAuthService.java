package serverside.service;

import serverside.interfaces.AuthService;

import java.util.ArrayList;
import java.util.List;

public class BaseAuthService implements AuthService {

    private List<Entry> entryList;

    public BaseAuthService() {
        entryList = new ArrayList<>();
        entryList.add(new Entry("David", "qazwsx", "One"));
        entryList.add(new Entry("Viktor", "qwerty", "Two"));
        entryList.add(new Entry("Vladimir", "123456", "Three"));
    }

    @Override
    public void start() {
        System.out.println("AuthService start");
    }

    @Override
    public void stop() {
        System.out.println("AuthService stop");
    }

    @Override
    public String getNickByLoginAndPassword(String login, String password) {
        for (Entry e : entryList) {
            if (e.login.equals(login) && e.password.equals(password)) {
                return e.nick;
            }
        }
        return null;
    }

    private class Entry {
        private String login;
        private String password;
        private String nick;

        public Entry(String login, String password, String nick) {
            this.login = login;
            this.password = password;
            this.nick = nick;
        }
    }
}