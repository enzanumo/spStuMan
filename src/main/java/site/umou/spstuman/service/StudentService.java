package site.umou.spstuman.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import site.umou.spstuman.entity.Student;
import site.umou.spstuman.repository.StudentRepo;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepo repository;

    public List<Student> findAll() {
        return (List<Student>) repository.findAll();
    }
}
