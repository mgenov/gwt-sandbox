package com.opengrapes.client.activity;

import com.google.gwt.requestfactory.shared.DataTransferObject;
import com.google.gwt.valuestore.shared.Record;
import com.opengrapes.server.activity.Employee;

/**
 * @author Miroslav Genov (mgenov@gmail.com)
 */
@DataTransferObject(Employee.class)
interface EmployeeRecord extends Record {

  Long getId();

  Integer getVersion();

  String getDisplayName();
}
