package com.crud.demo.repositories;

import com.crud.demo.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository  // Đánh dấu lớp là Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

    // Phương thức tìm Client theo tên (firstName hoặc full name, tùy thuộc vào yêu cầu)
    Client findByEmail(String email);
}

