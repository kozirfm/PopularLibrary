package ru.geekbrains.kozirfm.popularlibrary.lesson5;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "table_users_list")
public class User {

    public User(String name, String surname, String age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    @PrimaryKey(autoGenerate = true)
    public int id;

    public String name;

    public String surname;

    public String age;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
