package com.songxh.ironMan.dao.mysql;

import com.songxh.ironMan.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * 用户dao
 *
 * @author hexiaosong
 * @date 2019-04-09
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
