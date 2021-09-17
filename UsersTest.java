package Main;

import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

//Класс тестов для методов класса Users
class UsersTest {

    Users users = new Users();

    @Before
    public void init(){
        users.addUser("Пользователь1","Пароль1".hashCode());
        users.addUser("Пользователь2","Пароль2".hashCode());
        users.addUser("Пользователь3","Пароль3".hashCode());
        users.addUser("Пользователь4","Пароль4".hashCode());
        users.addUser("Пользователь5","Пароль5".hashCode());
    }

    //Тест метода getSize класса Users
    @Test
    void getSizeMethodUsersTest() {
        
        init();
        int expected = users.getSize();
        int actual = 5;

        Assert.assertEquals(expected, actual);
    }

    //Тест метода searchUser класса Users
    @Test
    void searchUserMethodUsersTest() {

        init();
        int expected = users.searchUser("Пользователь5", "Пароль5".hashCode());
        int actual = 5;

        Assert.assertEquals(expected, actual);

        expected = users.searchUser("Пользователь6", "Пароль6".hashCode());
        actual = -1;

        Assert.assertEquals(expected, actual);
    }
}