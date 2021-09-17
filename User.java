package Main;

/**
 * Класс "Пользователь", который хранит в себе id, пароль и логин пользователя
 */
public class User {

    /**
     * id пользователя
     */
    private int id;
    /**
     * Логин
     */
    private String name;
    /**
     * Пароль
     */
    private int password;

    /**
     * Конструктор
     * @param id id
     * @param name Логин
     * @param password Пароль
     */
    public User(int id, String name, int password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    public void setLogin(String name) {
        this.name = name;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public int getPassword() {
        return password;
    }

    public int getId() {
        return id;
    }
}
