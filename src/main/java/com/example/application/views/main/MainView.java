package com.example.application.views.main;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.PWA;
import com.vaadin.flow.theme.Theme;
import com.vaadin.flow.theme.lumo.Lumo;
import com.vaadin.flow.theme.material.Material;

import static com.vaadin.flow.component.notification.Notification.Position.TOP_CENTER;

/**
 * The main view is a top-level placeholder for other views.
 */
@PWA(name = "First Project", shortName = "First Project")
@Theme(value = Lumo.class, variant = Material.LIGHT)
@Route
public class MainView extends VerticalLayout {

    public MainView() {
        var button = new Button("Hello");
        button.addClickListener(buttonClickEvent -> {
            Notification.show("Hello", 2000, TOP_CENTER);
        });
        add(button);
    }
}
