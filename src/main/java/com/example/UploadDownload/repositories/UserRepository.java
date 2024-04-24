package com.example.UploadDownload.repositories;

import com.example.UploadDownload.enities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
