package com.vaadin.tutorial.addressbook;

import com.vaadin.annotations.DesignRoot;
import com.vaadin.ui.Button;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.PopupDateField;
import com.vaadin.ui.TextField;
import com.vaadin.ui.declarative.Design;

@DesignRoot
public class ContactFormLayout extends FormLayout {
    protected Button save;
    protected Button cancel;
    protected TextField firstName;
    protected TextField lastName;
    protected TextField phone;
    protected TextField email;
    protected PopupDateField birthDate;

    public ContactFormLayout() {
        Design.read(this);
    }
}
