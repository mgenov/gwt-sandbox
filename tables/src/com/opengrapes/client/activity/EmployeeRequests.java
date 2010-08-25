package com.opengrapes.client.activity;

import com.google.gwt.requestfactory.shared.RecordListRequest;
import com.google.gwt.requestfactory.shared.Service;
import com.opengrapes.server.activity.Employee;

/**
 * 
 * @author Miroslav Genov (mgenov@gmail.com)
 */
@Service(Employee.class)
public interface EmployeeRequests {

  RecordListRequest<EmployeeRecord> findAllEmployees();  

}