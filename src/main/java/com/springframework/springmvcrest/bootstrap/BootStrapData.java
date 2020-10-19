package com.springframework.springmvcrest.bootstrap;

import com.springframework.springmvcrest.domain.Customer;
import com.springframework.springmvcrest.repositories.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    private final CustomerRepository customerRepository;

    public BootStrapData(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }


    @Override
    public void run(String... args) throws Exception {

        Customer c1 = new Customer();
        c1.setFirstName("Batman");
        c1.setLastName("BatmanBat");
        customerRepository.save(c1);

        Customer c2 = new Customer();
        c1.setFirstName("Catbat");
        c1.setLastName("Catbat2");
        customerRepository.save(c2);

        Customer c3 = new Customer();
        c1.setFirstName("Superman");
        c1.setLastName("Superman2");
        customerRepository.save(c3);

        System.out.println("Customers Saved: " + customerRepository.count());
    }
}
