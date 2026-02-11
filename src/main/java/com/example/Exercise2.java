package com.example;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Main;
import com.vaadin.flow.router.Menu;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.theme.lumo.LumoUtility;

@Route("2")
@PageTitle("Exercise 2")
@Menu(order = 1, icon = "vaadin:clipboard-check", title = "Exercise 2")
class Exercise2 extends Main {

    /**
     * Style this so that:
     * 1. The text and button are on the same row
     * 2. They are vertically centered
     * 3. There is space between them
     * 4. The container has some padding
     */

    Exercise2() {
        addClassName(LumoUtility.Padding.MEDIUM);

        /* Exercise start here */
        H2 h2 = new H2("Username");

        Button button = new Button("Edit");

        /* "Container" */
        Div div = new Div(h2, button);
        add(div);
    }

}
