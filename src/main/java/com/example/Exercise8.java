package com.example;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Main;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Menu;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.theme.lumo.LumoUtility;

@Route("8")
@PageTitle("Exercise 8")
@Menu(order = 7, icon = "vaadin:clipboard-check", title = "Exercise 8")
class Exercise8 extends Main {

    /**
     * Task: Remove the vertical layout's default spacing and padding and center its items horizontally.
     */

    Exercise8() {
        addClassNames(LumoUtility.Padding.MEDIUM);

        TextField username = new TextField("Username");
        TextField firstName = new TextField("First name");
        TextField lastName = new TextField("Last name");

        Button button = new Button("Save");

        VerticalLayout vl = new VerticalLayout(username, firstName, lastName, button);
        add(vl);
    }

}
