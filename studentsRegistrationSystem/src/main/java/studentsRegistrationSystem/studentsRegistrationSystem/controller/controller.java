package studentsRegistrationSystem.studentsRegistrationSystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import studentsRegistrationSystem.studentsRegistrationSystem.Repository.StudentsRepository;
import studentsRegistrationSystem.studentsRegistrationSystem.entity.Students;

import java.util.List;

@Controller
public class controller {

    @Autowired
    public StudentsRepository repo;
    @GetMapping("/")
    public String home(Model theModel){
        List<Students> student=repo.findAll();
        theModel.addAttribute("student",student);
        return "index";
    }

    @GetMapping("/add")
    public String addStudents(Model theModel){
        Students  student=new Students();
        theModel.addAttribute("student",student);
        return "addStudents";
    }
    @PostMapping("/save")
    public String save(@ModelAttribute("student") Students student){
        repo.save(student);
        return "redirect:/";
    }

    @GetMapping("/edit")
    public String edit(Model theModel, @RequestParam int id){
        Students student=repo.findById(id).get();
        theModel.addAttribute("student",student);
        return "edit";
    }
    @PostMapping("/update")
    public String update(@ModelAttribute("student") Students student , @RequestParam int id ){
        repo.save(student);
        return "redirect:/";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam int id, Model theModel){
        Students student=repo.findById(id).get();
        repo.delete(student);
        theModel.addAttribute("student",student);
        return "redirect:/";
    }


}
