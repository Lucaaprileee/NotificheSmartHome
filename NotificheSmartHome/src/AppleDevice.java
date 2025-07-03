public interface AppleDevice {
    void addObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObserver(String message);
    void changeState(String newState);
}
