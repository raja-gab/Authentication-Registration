package org.sid.web;

import lombok.Data;

import org.sid.FeignClient.RestAuth;
import org.sid.common.UserForm;
import org.sid.entities.AppUser;
import org.sid.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private AccountService accountService;
    
    @Autowired
    private RestAuth restAuthservice ;
    
    @PostMapping("/registerUser")
    public AppUser registerUser(@RequestBody  UserForm userForm){
    	restAuthservice.postClientDetails(userForm);
        return  accountService.saveUser(userForm.getUsername(), userForm.getPassword(),userForm.getConfirmedPassword()
        		    ,userForm.getPhoneNumber() ,userForm.getGender(),userForm.getAddress(), userForm.getCin());
    }
    @PostMapping("/registerFour")
    public AppUser registerFournisseur(@RequestBody  UserForm userForm){
    	restAuthservice.postFournisseurDetails(userForm);
        return  accountService.saveFournisseur(userForm.getUsername(), userForm.getPassword(),userForm.getConfirmedPassword()
        		    ,userForm.getPhoneNumber() ,userForm.getGender(),userForm.getAddress(), userForm.getCin());
    }
    
}
/*
@Data
public class UserForm{
    private String username;
    private String password;
    private String confirmedPassword;
    private String phoneNumber ;
    private String gender;
    private String address;
    private String cin ;
    
}
*/

