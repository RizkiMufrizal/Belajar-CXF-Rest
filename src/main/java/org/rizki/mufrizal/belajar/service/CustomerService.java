package org.rizki.mufrizal.belajar.service;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.rizki.mufrizal.belajar.domain.Customer;

@Path("/api")
public class CustomerService {

    @GET
    @Path("/customers")
    @Produces("application/json")
    public List<Customer> getCustomers() {
        List<Customer> customers = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            customers.add(new Customer(i, "nama " + i));
        }

        return customers;
    }

}