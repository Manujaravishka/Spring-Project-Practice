package lk.ijse._1_back_end.service;

import lk.ijse._1_back_end.dto.CustomerDTO;

import java.util.List;

public interface CustomerService {
    void saveCustomer(CustomerDTO customerDTO);
    void updateCustomer(CustomerDTO customerDTO);
    void deleteCustomer(String cId);
    CustomerDTO getCustomerById(String cId);
    List<CustomerDTO> getAllCustomers();
}
