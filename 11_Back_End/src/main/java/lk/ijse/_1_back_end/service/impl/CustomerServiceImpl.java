package lk.ijse._1_back_end.service.impl;

import lk.ijse._1_back_end.dto.CustomerDTO;
import lk.ijse._1_back_end.entity.Customer;
import lk.ijse._1_back_end.repository.CustomerRepository;
import lk.ijse._1_back_end.service.CustomerService;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public void saveCustomer(CustomerDTO customerDTO){
        customerRepository.save(
                new Customer(customerDTO.getcId(),
                customerDTO.getcName(),
                customerDTO.getcAddress())
        );
    }


}
