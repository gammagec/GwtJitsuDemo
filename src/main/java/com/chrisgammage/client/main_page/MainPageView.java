package com.chrisgammage.client.main_page;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;

/**
 * Created by gammagec on 1/29/14.
 */
public class MainPageView implements IsWidget {

    @Override
    public Widget asWidget() {
        return root;
    }

    private Widget root;

    interface MainPageViewUiBinder extends UiBinder<Widget, MainPageView> {
    }

    private static MainPageViewUiBinder ourUiBinder = GWT.create(MainPageViewUiBinder.class);

    @UiField
    Label welcomeLabel;

    public MainPageView() {
        root = ourUiBinder.createAndBindUi(this);
    }

    public void setWelcomeText(String welcomeText) {
        welcomeLabel.setText(welcomeText);
    }
}