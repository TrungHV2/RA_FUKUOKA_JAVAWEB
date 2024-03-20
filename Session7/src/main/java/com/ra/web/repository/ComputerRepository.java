package com.ra.web.repository;

import com.ra.web.entity.Computer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface ComputerRepository extends JpaRepository<Computer, String> {
    List<Computer> findAllByNameContains(String name);
    @Query(value = "select c from Computer c where c.name = :name", nativeQuery = false)
    List<Computer> findByComputerName(@Param("name") String name);

    @Query(value = "select * from computers where name like :name", nativeQuery = true)
    List<Computer> findAllByComputerNameContains(@Param("name") String name);

    @Transactional
    @Modifying
    @Query("update Computer c set c.status = :stt where c.id = :id")
    void updateComputerStatus(@Param("id") String id, @Param("stt") boolean status);
}
