package com.opengrapes.client.activity;

import com.google.gwt.app.place.IsWidget;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;

/**
 * @author Miroslav Genov (mgenov@gmail.com)
 */
public class CustomerView extends Composite implements IsWidget {

  private VerticalPanel panel = new VerticalPanel();

  public CustomerView() {

    panel.add(new Label("Test Test Test Test Test"));
    panel.add(new Label("Test Test Test Test Test"));
    panel.add(new Label("Test Test Test Test Test"));
    panel.add(new Label("Test Test Test Test Test"));
    panel.add(new Label("Test Test Test Test Test"));
    

    initWidget(panel);
  }

  public Widget asWidget() {
    return this;
  }
}
