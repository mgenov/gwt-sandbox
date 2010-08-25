package com.opengrapes.client.activity;

import com.google.gwt.requestfactory.shared.RequestFactory;

/**
 * @author Miroslav Genov (mgenov@gmail.com)
 */ 
public interface MyAppRequestFactory extends RequestFactory {

  EmployeeRequests employeeRequest();

}
