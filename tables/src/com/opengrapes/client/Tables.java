package com.opengrapes.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.UListElement;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.MouseOutEvent;
import com.google.gwt.event.dom.client.MouseOutHandler;
import com.google.gwt.event.dom.client.MouseOverEvent;
import com.google.gwt.event.dom.client.MouseOverHandler;
import com.google.gwt.user.client.Element;
import com.google.gwt.user.client.ui.ComplexPanel;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextArea;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;

/**
 * @author Miroslav Genov (mgenov@gmail.com)
 */
public class Tables implements EntryPoint {
  public void onModuleLoad() {


    VerticalPanel vp = new VerticalPanel();

    vp.add(new CommentItem("Test Test1"));
    vp.add(new CommentItem("Test Test2"));
    vp.add(new CommentItem("Test Test3"));
    vp.add(new CommentItem("Test Test4"));
    vp.add(new CommentItem("Test Test5"));

    RootPanel.get("container").add(vp);
  }

  class CommentItem extends Composite {
    private VerticalPanel container = new VerticalPanel();
    private HorizontalPanel panel = new HorizontalPanel();
    private VerticalPanel commentPanel = new VerticalPanel();
    private Label label = new Label();
    private Image image = new Image("comment-edit-icon.png");
    private TextArea commentArea = new TextArea();


    public CommentItem(String comment) {
      initWidget(container);

      container.add(panel);
      container.add(commentPanel);

      panel.add(label);
      panel.add(new HTML("&nbsp;"));
      panel.add(new HTML("&nbsp;"));
      panel.add(new HTML("&nbsp;"));
      panel.add(new HTML("&nbsp;"));
      panel.add(new HTML("&nbsp;"));
      label.setText(comment);

      panel.setStyleName("gwt-CommentPanel");

      label.addMouseOverHandler(new MouseOverHandler() {
        public void onMouseOver(MouseOverEvent event) {
          panel.add(image);
        }
      });

      label.addMouseOutHandler(new MouseOutHandler() {
        public void onMouseOut(MouseOutEvent event) {
          panel.remove(image);
        }
      });

      label.addClickHandler(new ClickHandler() {
        public void onClick(ClickEvent event) {
           commentPanel.add(commentArea);
        }
      });
    }
  }

  public class ULPanel extends ComplexPanel {

    private UListElement list;

    public ULPanel() {
        list = Document.get().createULElement();
        setElement(list);
    }

    @Override
    public void add(Widget child) {
        Element li = Document.get().createLIElement().cast();
        list.appendChild(li);
        super.add(child, li);
    }
}
}
