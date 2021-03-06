package com.example.project_hotel_california.repository;

import com.example.project_hotel_california.model.Photo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PhotoRepository extends JpaRepository<Photo, Long> {
    List<Photo> getAllByHouseId(Long id);
}
