package ru.geekbrains.kozirfm.popularlibrary.lesson5;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

import io.reactivex.rxjava3.core.Single;

@Dao
public interface UserDao {

    @Query("SELECT * FROM table_users_list")
    Single<List<User>> getAll();

    @Insert
    Single<Long> insert(User user);

    @Insert
    Single<List<Long>> insertList(List<User> users);

    @Query("DELETE FROM table_users_list WHERE ID = (SELECT MAX(ID) FROM table_users_list)")
    Single<Integer> delete();

    @Update(onConflict = OnConflictStrategy.REPLACE)
    Single<Integer> update(User user);

}
