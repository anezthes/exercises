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

@Route("7")
@PageTitle("Exercise 7")
@Menu(order = 6, icon = "vaadin:clipboard-check", title = "Exercise 7")
class Exercise7 extends Main {

    /**
     * Task: Make the text field take up any available horizontal space.
     */

    Exercise7() {
        addClassNames(LumoUtility.Padding.MEDIUM);

        TextField textField = new TextField();
        textField.setPlaceholder("Search");

        Button button = new Button("Search");

        HorizontalLayout hl = new HorizontalLayout(textField, button);
        add(hl);
    }

}
