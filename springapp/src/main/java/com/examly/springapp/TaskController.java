package com.examly.springapp;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Task_Controller {
    @Autowired
    TaskRepo taskrepo;
       @PostMapping("/saveTask")
       public Task create(@Value(value="") @RequestBody Task taskobj)
       {
           
           return taskrepo.save(taskobj);
       }
       @GetMapping("/alltasks")
       public List<Task> getAll()
       {
           return taskrepo.findAll();
       }
       @GetMapping("/getTask?id=<taskId>")
       public Optional<Task> getTaskHolderName(@PathVariable(value = "taskHolderName") String taskHolderName)
        {
           return taskrepo.findById(taskHolderName);
        }
        @GetMapping("/deleteTask?id=<taskId>")
       public void deleteTask(@PathVariable(value = "taskId") String taskId)
        {
           taskrepo.deleteById(taskId);
        }
     
        
}
