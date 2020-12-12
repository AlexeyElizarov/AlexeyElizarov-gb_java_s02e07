package backend;

public interface Chat {
    void broadcastMessage(String message);
    boolean isNicknameOccupied(String nickname);
    void subscribe(ClientHandler client);
    void unsubscribe(ClientHandler client);
    void sendPrivateMessage(String nickname, String message);
    AuthenticationService getAuthenticationService();

}
