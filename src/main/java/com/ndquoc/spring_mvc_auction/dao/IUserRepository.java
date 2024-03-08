package com.ndquoc.spring_mvc_auction.dao;

import com.ndquoc.spring_mvc_auction.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface IUserRepository extends JpaRepository<User, Integer> {
}
