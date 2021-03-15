package serverside.interfaces;

import serverside.service.ClientHandler;

public interface AuthService {
    void start();
    void stop();
    String getNickByLoginAndPassword(String login, String password);
}