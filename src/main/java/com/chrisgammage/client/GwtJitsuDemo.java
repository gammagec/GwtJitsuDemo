package com.chrisgammage.client;

import com.chrisgammage.client.main_page.MainPagePresenter;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.*;

/**
 * Created by gammagec on 1/29/14.
 */
public class GwtJitsuDemo implements EntryPoint {

    DemoInjector demoInjector;

    public void onModuleLoad() {
        demoInjector = GWT.create(DemoInjector.class);

        MainPagePresenter mainPage = demoInjector.getMainPage();

        RootPanel.get().add(mainPage.getView().asWidget());
    }
}
