package com.bethe.FirstAPI.Models;

import org.springframework.web.bind.annotation.*;

import java.util.Locale;
import java.util.Random;

@RestController
@RequestMapping("/studentID")
public class Controllers {

    @PostMapping("/")
    public String CreateStudentID(@RequestBody Student student) {
        if (student.getFirstName() == null || student.getLastName() == null) {
            return "The first or last name is empty, please check it!";
        }
            char first_letter = student.getFirstName().toUpperCase().charAt(0);
            char second_letter = student.getLastName().toUpperCase().charAt(0);
            Random rnd = new Random();
            int student_id = rnd.nextInt(99999) + 100000;
            String ID = first_letter + "" + second_letter + "-" + student_id;
            student.setID(ID);

System.out.println("Name:"+student.getFirstName());
System.out.println("Last Name:"+student.getLastName());
System.out.println("ID:"+student.getID());
        return ID;

        }


}


