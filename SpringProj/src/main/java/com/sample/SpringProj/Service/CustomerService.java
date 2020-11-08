package com.sample.SpringProj.Service;

public interface CustomerService {

	void addCustomer();
    
    String addCustomerReturnValue();
    
    void addCustomerThrowException() throws Exception;
    
    void addCustomerAround(String name);
    
}
