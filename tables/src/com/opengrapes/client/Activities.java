package com.opengrapes.client;

import com.google.gwt.app.client.NotificationMole;
import com.google.gwt.app.place.Activity;
import com.google.gwt.app.place.Place;
import com.google.gwt.app.place.PlaceController;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.opengrapes.client.activity.CustomerView;
import com.opengrapes.client.activity.MyAppRequestFactory;

/**
 * @author Miroslav Genov (mgenov@gmail.com)
 */
public class Activities implements EntryPoint {
  public void onModuleLoad() {

    HandlerManager eventBus = new HandlerManager(null);

    MyAppRequestFactory request = GWT.create(MyAppRequestFactory.class);
    
    PlaceController controller = new PlaceController(eventBus);

    controller.goTo(new CustomersPlace());


    final NotificationMole mole = new NotificationMole();


    Button button = new Button("Click Me!");
    button.addClickHandler(new ClickHandler() {
      public void onClick(ClickEvent event) {
        mole.showDelayed(5);
        mole.show("Show me the money");

      }
    });


    RootPanel.get("container").add(new Label("Hello !"));
    RootPanel.get("container").add(mole);
    RootPanel.get("container").add(button);

  }

  class CustomerActivity implements Activity {

    public String mayStop() {

      return null;
    }

    public void onCancel() {

    }

    public void onStop() {

    }

    public void start(Display panel, EventBus eventBus) {
      panel.showActivityWidget(new CustomerView());
    }
  }

  class CustomersPlace extends Place {
    
  }
}
