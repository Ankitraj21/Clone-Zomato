package com.clone.zomato.Repository;

import com.clone.zomato.Entity.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserInfo,String> {
}
