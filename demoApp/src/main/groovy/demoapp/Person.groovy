package demoapp

import java.text.SimpleDateFormat

/**
 * Created by puneet on 03/10/17.
 */
class Person {
    String name
    String email
    Date birthday
    Integer points
    
    static List<Person> createSomeRecords() {
        [new Person(name: 'Amy', email: 'amy@example.com', birthday: date("1980-02-14"), points: 2),
         new Person(name: 'Brad', email: 'brad@example.com', birthday: date("1984-05-21"), points: 1),
         new Person(name: 'Charlie', email: 'charlie@example.com', birthday: date("1982-08-10"), points: 4),
         new Person(name: 'Diane', email: 'diane@example.com', birthday: date("1979-04-13"), points: 7),
         new Person(name: 'Edward', email: 'edward@example.com', birthday: date("1985-01-29"), points: 2)]
    }

    static Date date(String dateString) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd")
        simpleDateFormat.parse(dateString)
    }
}
