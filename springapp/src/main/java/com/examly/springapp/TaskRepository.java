package com.examly.springapp;
import org.springframework.data.jpa.repository.JpaRepository;
public interface TaskRepo extends JpaRepository<Task,String>
{
    
}
