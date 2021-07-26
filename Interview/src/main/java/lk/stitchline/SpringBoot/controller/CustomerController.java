package lk.stitchline.SpringBoot.controller;


import lk.stitchline.SpringBoot.dto.CustomerDTO;
import lk.stitchline.SpringBoot.service.CustomerService;
import lk.stitchline.SpringBoot.dto.CustomerDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/user")
@CrossOrigin
public class CustomerController {
    @Autowired
    private CustomerService service;



    @PostMapping()
    public String saveCustomer(@RequestBody CustomerDTO customerDTO){
        boolean b = service.addCustomer(customerDTO);
        return b+"";
    }

    @GetMapping(path = "/{userName}")
    public CustomerDTO searchCustomer(@PathVariable String userName){

        return service.searchCustomer(userName);
    }

}
