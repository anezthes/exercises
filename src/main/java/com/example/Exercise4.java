package com.example;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Main;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.dom.Style;
import com.vaadin.flow.router.Menu;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.theme.lumo.LumoUtility;

@Route("4")
@PageTitle("Exercise 4")
@Menu(order = 3, icon = "vaadin:clipboard-check", title = "Exercise 4")
class Exercise4 extends Main {

    /**
     * Task: Create a semantic `.card` class in styles.css
     * or extract this styling into a reusable class/component.
     */

    Exercise4() {
        addClassNames(LumoUtility.Display.FLEX, LumoUtility.Gap.MEDIUM, LumoUtility.Padding.MEDIUM);

        Div card1 = new Div("Card A");
        card1.addClassNames(LumoUtility.Background.BASE, LumoUtility.BorderRadius.MEDIUM, LumoUtility.BoxShadow.XSMALL, LumoUtility.Padding.MEDIUM);

        Div card2 = new Div("Card B");
        card2.addClassNames(LumoUtility.Background.BASE, LumoUtility.BorderRadius.MEDIUM, LumoUtility.BoxShadow.XSMALL, LumoUtility.Padding.MEDIUM);

        Div card3 = new Div("Card C");
        card3.addClassNames(LumoUtility.Background.BASE, LumoUtility.BorderRadius.MEDIUM, LumoUtility.BoxShadow.XSMALL, LumoUtility.Padding.MEDIUM);

        add(card1, card2, card3);
    }

}
