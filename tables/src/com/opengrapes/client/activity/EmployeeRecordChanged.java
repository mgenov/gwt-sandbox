package com.opengrapes.client.activity;

import com.google.gwt.event.shared.EventHandler;
import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.valuestore.shared.RecordChangedEvent;
import com.google.gwt.valuestore.shared.WriteOperation;

/**
 * @author Miroslav Genov (mgenov@gmail.com)
 */
public class EmployeeRecordChanged extends
        RecordChangedEvent<EmployeeRecord, EmployeeRecordChanged.Handler> {

  /**
   * Implemented by handlers of this type of event.
   */
  public interface Handler extends EventHandler {
    void onEmployeeChanged(EmployeeRecordChanged event);
  }

  public static final GwtEvent.Type<Handler> TYPE = new GwtEvent.Type<Handler>();

  public EmployeeRecordChanged(EmployeeRecord record, WriteOperation writeOperation) {
    super(record, writeOperation);
  }

  @Override
  public GwtEvent.Type<Handler> getAssociatedType() {
    return TYPE;
  }

  @Override
  protected void dispatch(Handler handler) {
    handler.onEmployeeChanged(this);
  }
}
