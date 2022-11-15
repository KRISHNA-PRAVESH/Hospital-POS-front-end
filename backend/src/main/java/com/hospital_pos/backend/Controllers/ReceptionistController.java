package com.hospital_pos.backend.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
//@RequestMapping("/receptionlist")
public class ReceptionistController {


    //Receptionist dashboard
    @GetMapping("/receptionist")
    public String receptionist(){
        return "Receptionist-page/dashboard";
    }

    //New patient
    @GetMapping("/receptionist/new-patient")
    public String newPatient(){
        return "Receptionist-page/new-patient";
    }

   

    
    
}
