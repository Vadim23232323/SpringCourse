package by.dubovskiy.springcourse.dao;

import by.dubovskiy.springcourse.models.Person;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PersonDAO {

    private static int PEOPLE_COUNT;
    private List<Person> people;
    {
        people = new ArrayList<>();

        people.add(new Person(++PEOPLE_COUNT,"Dima"));
        people.add(new Person(++PEOPLE_COUNT,"Maksim"));
        people.add(new Person(++PEOPLE_COUNT,"Tanya"));
    }

    // Получаем весь список людей
    public List<Person> index() {
        return people;
    }

    // Получаем одного человека
    public Person show(int id) {
        return people.stream().filter(person->person.getId() == id).findAny().orElse(null);
    }

    // Сохранение нового человека
    public void save(Person person) {
        person.setId(++PEOPLE_COUNT);
        people.add(person);
    }


    // Изменение человека
    public void update(int id, Person updatedPerson) {
        Person personToBeUpdated = show(id);
        personToBeUpdated.setName(updatedPerson.getName());
    }

    // Удаление человека
    public void delete(int id) {
        people.removeIf(p->p.getId() ==id);
    }


}
