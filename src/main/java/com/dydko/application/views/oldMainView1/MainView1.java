package com.dydko.application.views.oldMainView1;

import com.vaadin.flow.component.Key;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.checkbox.Checkbox;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;


@Route("mainView")
public class MainView1 extends VerticalLayout {

    public MainView1() {
        VerticalLayout todoList = new VerticalLayout();
        TextField textField = new TextField();
        Button addButton = new Button("Add");
        addButton.addClickShortcut(Key.ENTER);
        addButton.addClickListener(e -> {
            Checkbox checkbox = new Checkbox(textField.getValue());
            todoList.add(checkbox);
        });
        add(
          new H1("Vaadin todo"),
          todoList,
          new VerticalLayout(textField,
                  addButton)
        );
    }


}
