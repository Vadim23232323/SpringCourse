package by.dubovskiy.springcourse.dao;

import by.dubovskiy.springcourse.models.Person;
import com.mysql.jdbc.Driver;
import org.springframework.stereotype.Component;

import javax.swing.plaf.nimbus.State;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Component
public class PersonDAO {

    private static int PEOPLE_COUNT;
    private static final String URL = "jdbc:mysql://localhost:3306/spring";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "11111111";

    private static Connection connection;

    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    private List<Person> people;
    {
//        people = new ArrayList<>();
//
//        people.add(new Person(++PEOPLE_COUNT, "Tom", 24, "tom@mail.ru"));
//        people.add(new Person(++PEOPLE_COUNT, "Bob", 52, "bob@mail.ru"));
//        people.add(new Person(++PEOPLE_COUNT, "Mike", 18, "mike@yahoo.com"));
//        people.add(new Person(++PEOPLE_COUNT, "Katy", 34, "katy@gmail.com"));
    }

    // Получаем весь список людей
    public List<Person> index() {
        List<Person> people = new ArrayList<>();

        try {
            Statement statement = connection.createStatement();
            String SQL = "SELECT * FROM Person";
            ResultSet resultSet = statement.executeQuery(SQL);

            while (resultSet.next()){
                Person person = new Person();

                person.setId(resultSet.getInt("id"));
                person.setName(resultSet.getString("name"));
                person.setAge(resultSet.getInt("age"));
                person.setEmail(resultSet.getString("email"));

                people.add(person);
            }

        } catch (SQLException throwables){
            throwables.printStackTrace();
        }
        return people;
    }

    // Получаем одного человека
    public Person show(int id) {
   //     return people.stream().filter(person->person.getId() == id).findAny().orElse(null);
        return null;
    }

    // Сохранение нового человека
    public void save(Person person) {
//        person.setId(++PEOPLE_COUNT);
//        people.add(person);

        try {
            Statement statement = connection.createStatement();
            String SQL = "INSERT INTO Person VALUES (" + 1 + ",'" + person.getName()  + "'," + person.getAge() + ",'" + person.getEmail() +"')";
            statement.executeUpdate(SQL);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    // Изменение человека
    public void update(int id, Person updatedPerson) {
        Person personToBeUpdated = show(id);
        personToBeUpdated.setName(updatedPerson.getName());
        personToBeUpdated.setAge(updatedPerson.getAge());
        personToBeUpdated.setEmail(updatedPerson.getEmail());
    }

    // Удаление человека
    public void delete(int id) {
        people.removeIf(p->p.getId() ==id);
    }


}
