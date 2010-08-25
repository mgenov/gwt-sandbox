package com.opengrapes.client.activity;

import com.google.gwt.requestfactory.shared.RequestObject;
import com.google.gwt.requestfactory.shared.Service;
import com.opengrapes.server.activity.Employee;

import java.util.List;

/**
 * 
 * @author Miroslav Genov (mgenov@gmail.com)
 */
@Service(Employee.class)
public interface EmployeeRequests {
  
  RequestObject<List<EmployeeRecord>> findAllEmployees();

}