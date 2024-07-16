package com.igortech.schoolservice.controller;

import com.igortech.schoolservice.entity.School;
import com.igortech.schoolservice.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import java.util.List;

//You can enable cross-origin resource sharing (CORS) from either in individual controllers or globally. The following topics describe how to do so:
//Controller Method CORS Configuration
//@CrossOrigin(origins = "http://localhost:9000")
//Global CORS configuration : corsConfigurer
//This is similar to using a Filter but can be declared within Spring MVC and combined with fine-grained @CrossOrigin configuration.
// By default, all origins and GET, HEAD, and POST methods are allowed.


//@CrossOrigin("*")
@RequestMapping(value = "/school")
@RestController
public class SchoolController {
    @Autowired
    private SchoolService schoolService;

    @PostMapping
    public School addSchool(@RequestBody School school){
        return schoolService.addSchool(school);
    }
    @GetMapping
    public List<School> fetchSchools(){
        return  schoolService.fetchSchools();
    }
    @GetMapping("/{id}")
    public School fetchSchoolById(@PathVariable int id){
        return schoolService.fetchSchoolById(id);
    }
}
