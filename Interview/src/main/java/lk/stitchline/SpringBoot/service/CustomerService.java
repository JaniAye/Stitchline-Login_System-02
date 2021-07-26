package lk.stitchline.SpringBoot.service;


import lk.stitchline.SpringBoot.dto.CustomerDTO;

import java.util.ArrayList;

public interface CustomerService {
    boolean addCustomer(CustomerDTO dto);
    CustomerDTO searchCustomer(String userName);

}
