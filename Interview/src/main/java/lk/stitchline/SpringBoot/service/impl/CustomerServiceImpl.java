package lk.stitchline.SpringBoot.service.impl;

import lk.stitchline.SpringBoot.dto.CustomerDTO;
import lk.stitchline.SpringBoot.model.customer;
import lk.stitchline.SpringBoot.repo.CustomerRepo;
import lk.stitchline.SpringBoot.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service

public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerRepo customerRepo;

    @Override
    public boolean addCustomer(CustomerDTO dto){

        customer customer = new customer(dto.getUserName(),dto.getName(),dto.getEmail(),dto.getMobile(),dto.getPassword(),dto.getAddress(),dto.getNic(),dto.getEmpNo(),dto.getUserType());

        customerRepo.save(customer);
        return true;
    }



    @Override
    public CustomerDTO searchCustomer(String userName) {
        Optional<customer> byId =  customerRepo.findById(userName);
       if (byId.isPresent()){
           customer c=byId.get();
           return  new CustomerDTO(c.getUserName(),c.getName(),c.getEmail(),c.getMobile(),c.getPassword(),c.getAddress(),c.getNic(),c.getEmpNo(),c.getUserType());
       }



        return null;
    }





}
