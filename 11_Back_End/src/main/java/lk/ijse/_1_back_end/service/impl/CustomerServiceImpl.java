package lk.ijse._1_back_end.service.impl;

import lk.ijse._1_back_end.dto.CustomerDTO;
import lk.ijse._1_back_end.entity.Customer;
import lk.ijse._1_back_end.repository.CustomerRepository;
import lk.ijse._1_back_end.service.CustomerService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    private static CustomerDTO toDTO(Customer customer) {
        return new CustomerDTO(customer.getCId(), customer.getCName(), customer.getCAddress());
    }

    private static Customer toEntity(CustomerDTO dto) {
        return new Customer(dto.getcId(), dto.getcName(), dto.getcAddress());
    }

    @Override
    public void saveCustomer(CustomerDTO customerDTO) {
        customerRepository.save(toEntity(customerDTO));
    }

    @Override
    public void updateCustomer(CustomerDTO customerDTO) {
        if (!customerRepository.existsById(customerDTO.getcId())) {
            throw new RuntimeException("Customer not found: " + customerDTO.getcId());
        }
        customerRepository.save(toEntity(customerDTO));
    }

    @Override
    public void deleteCustomer(String cId) {
        if (!customerRepository.existsById(cId)) {
            throw new RuntimeException("Customer not found: " + cId);
        }
        customerRepository.deleteById(cId);
    }

    @Override
    public CustomerDTO getCustomerById(String cId) {
        return customerRepository.findById(cId)
                .map(CustomerServiceImpl::toDTO)
                .orElseThrow(() -> new RuntimeException("Customer not found: " + cId));
    }

    @Override
    public List<CustomerDTO> getAllCustomers() {
        return customerRepository.findAll().stream()
                .map(CustomerServiceImpl::toDTO)
                .collect(Collectors.toList());
    }
}
