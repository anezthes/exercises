package com.example;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Main;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Menu;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.theme.lumo.LumoUtility;

@Route("5")
@PageTitle("Exercise 5")
@Menu(order = 4, icon = "vaadin:clipboard-check", title = "Exercise 5")
class Exercise5 extends Main {

    /**
     * Task: Using the ::part selector, make the text field's label bold.
     */

    Exercise5() {
        addClassNames(LumoUtility.Padding.MEDIUM);

        TextField textField = new TextField("First name");
        add(textField);
    }

}
