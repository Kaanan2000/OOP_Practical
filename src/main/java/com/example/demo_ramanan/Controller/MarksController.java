package com.example.demo_ramanan.Controller;

import com.example.demo_ramanan.Entity.MarksEntity;
import com.example.demo_ramanan.Service.MarksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class MarksController {

    @Autowired
    private MarksService marksServiceObj;

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/view_marks")
    public ModelAndView getStudentsMarks(){
        List<MarksEntity> marksList = marksServiceObj.marksEntityList();
        return new ModelAndView("ViewMarks", "marks", marksList);
    }

    @PostMapping("/save_to_db")
    public String addMarksToDB(@ModelAttribute MarksEntity marksEntity){
        marksServiceObj.SaveMarks(marksEntity);
        return "index";
    }

    @PostMapping("/show_table")
    public String ViewMarks(){
        return "redirect:/view_marks";
    }

}
