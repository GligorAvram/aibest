package com.aibest.controllers;


import com.aibest.entities.Company;
import com.aibest.entities.CompanyGroup;
import com.aibest.models.CompanyRegParams;
import com.aibest.services.CompanyService;
import com.aibest.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
public class CompanyController {

    @Autowired
    CompanyService companyService;

    @Autowired
    private UserService userService;


    @GetMapping("/getCompany")
    public String getCompany(@RequestHeader(name="Authorization") String token) {
        return userService.getCompanyByToken(token.substring(7)).getName();
    }


    @GetMapping("/companySearch")
    public ResponseEntity<List<Company>> companySearch(@RequestHeader(name="Authorization") String token){

        CompanyGroup group = CompanyGroup.builder().id(61264).name("test").build();

        List<Company> companies = Arrays.asList(
                Company.builder().id(9999).deni("c1").companyGroup(group).build(),
                Company.builder().id(9992).deni("c2").companyGroup(group).build(),
                Company.builder().id(9993).deni("c3").companyGroup(group).build(),
                Company.builder().id(9994).deni("c4").companyGroup(group).build(),
                Company.builder().id(9959).deni("c5").companyGroup(group).build()
        );
        return ResponseEntity.ok(companies);
    }


    @PostMapping("/addCompany")
    public ResponseEntity<Boolean> addCompany(@RequestHeader(name="Authorization") String token,
                                              @RequestBody CompanyRegParams params){
        System.out.println("here");

        CompanyGroup group = userService.getCompanyByToken(token.substring(7));
        companyService.addCompany(group, params);
        return ResponseEntity.ok(Boolean.TRUE);
    }
}
