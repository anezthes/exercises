package com.example;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Main;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Menu;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.theme.lumo.LumoUtility;

@Route("6")
@PageTitle("Exercise 6")
@Menu(order = 5, icon = "vaadin:clipboard-check", title = "Exercise 6")
class Exercise6 extends Main {

    /**
     * Task: Use CSS to make the buttons inside the VerticalLayout have green text.
     */

    Exercise6() {
        addClassNames(LumoUtility.Padding.MEDIUM);

        Button b1 = new Button("I'm blue!");
        Button b2 = new Button("I'm green!");
        Button b3 = new Button("I'm also green!");

        VerticalLayout vl = new VerticalLayout(b2, b3);
        vl.addClassNames(LumoUtility.Background.SUCCESS_10);

        add(b1, vl);
    }

}
