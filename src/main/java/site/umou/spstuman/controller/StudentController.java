package site.umou.spstuman.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;
import site.umou.spstuman.entity.Student;
import site.umou.spstuman.service.StudentService;

import java.util.HashMap;
import java.util.List;

@Controller
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("/students")
    public ModelAndView findStudents() {
        var students = (List<Student>) studentService.findAll();

        var hm = new HashMap<String, List<Student>>();
        hm.put("students", students);

        return new ModelAndView("students", hm);
    }
}
