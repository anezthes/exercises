package com.example;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Main;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.router.Menu;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.theme.lumo.LumoUtility;

@Route("3")
@PageTitle("Exercise 3")
@Menu(order = 2, icon = "vaadin:clipboard-check", title = "Exercise 3")
class Exercise3 extends Main {

    /**
     * Tasks:
     * 1. Use a success-related color for the icon.
     * 2. Place the two <span> elements in a column (stacked vertically) using flexbox.
     * 3. Make the first text a bit bolder.
     * 4. Make the second text smaller.
     * 5. Add space between the icon and the text column.
     * 6. Add some padding around the container.
     * 7. Add a border to the container.
     */

    Exercise3() {
        addClassNames(LumoUtility.Padding.MEDIUM);

        /* Exercise start here */
        Icon icon = VaadinIcon.CHECK.create();

        Span span1 = new Span("Success!");
        Span span2 = new Span("File uploaded");

        /* "Text column" */
        Div column = new Div(span1, span2);

        /* "Container" */
        Div div = new Div(icon, column);
        add(div);
    }

}
