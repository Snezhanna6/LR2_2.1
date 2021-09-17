package Main;

import java.util.ArrayList;

/**
 * Класс "Пользователи", некое подобее базы данных
 */
public class Users {

    /**
     * Динамический массив объектов класса User
     */
    private ArrayList<User> mass = new ArrayList<>();
    /**
     * Размер базы данных
     */
    private int size = 0;

    /**
     * Функция, добавляющая нового пользователя в БД
     * @param name логин пользователя
     * @param password пароль пользователя
     */
    public void addUser(String name, int password){
        //id пользователя становится размер БД + 1
        mass.add(new User(++size,name,password));
    }

    /**
     * Функция возвращает размер БД
     * @return размер БД
     */
    public int getSize() {
        return size;
    }

    /**
     * Функция ищет пользователя в массиве по совпадению логина и пароля
     * @param name Искомый логин
     * @param password Искомый пароль
     * @return id пользователя или -1, если он не найден
     */
    public int searchUser(String name, int password){

        for (int i = 0; i < mass.size(); i++){
            if (mass.get(i).getName().equals(name) &&
                    mass.get(i).getPassword() == password) return mass.get(i).getId();
        }
        return -1;
    }
}
