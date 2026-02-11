package com.example;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.html.Main;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.router.Menu;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.theme.lumo.LumoUtility;

@Route("")
@PageTitle("Exercise 1")
@Menu(order = 0, icon = "vaadin:clipboard-check", title = "Exercise 1")
class Exercise1 extends Main {

    /**
     * Turn this into a card using only utility classes:
     * 1. Add padding around the content
     * 2. Give it a base background color
     * 3. Add a medium border radius
     * 4. Add a subtle shadow
     */

    Exercise1() {
        addClassName(LumoUtility.Padding.MEDIUM);

        /* Exercise start here */
        H3 h3 = new H3("Card title");

        Span span = new Span("This is some card content.");

        Div div = new Div(h3, span);
        add(div);
    }

}
