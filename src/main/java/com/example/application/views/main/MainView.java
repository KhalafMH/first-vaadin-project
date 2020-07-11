package com.example.application.views.main;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.datepicker.DatePicker;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.NumberField;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.PWA;
import com.vaadin.flow.theme.Theme;
import com.vaadin.flow.theme.lumo.Lumo;
import com.vaadin.flow.theme.material.Material;

import java.util.List;

/**
 * The main view is a top-level placeholder for other views.
 */
@PWA(name = "First Project", shortName = "First Project")
@Theme(value = Lumo.class, variant = Material.LIGHT)
@Route
public class MainView extends VerticalLayout {
    public MainView() {
        add(new ProductForm());
    }
}

class ProductForm extends VerticalLayout {

    public ProductForm() {
        var name = new TextField("Name");
        var description = new TextArea("Description");
        var available = new DatePicker("Available");
        var category = new ComboBox<>("Category", List.of("A", "B", "C"));

        var price = new NumberField("Price");
        price.setSuffixComponent(new Span("€"));
        price.setStep(0.01);

        var save = new Button("Save");
        save.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        var cancel = new Button("Cancel");
        var buttons = new HorizontalLayout(save, cancel);

        add(
                name,
                description,
                price,
                available,
                category,
                buttons
        );
    }
}
