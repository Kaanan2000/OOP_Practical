package com.example.demo_ramanan.Repository;

import com.example.demo_ramanan.Entity.MarksEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MarksRepository extends JpaRepository<MarksEntity, Integer> {
}
