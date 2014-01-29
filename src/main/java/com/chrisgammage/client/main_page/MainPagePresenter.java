package com.chrisgammage.client.main_page;

import com.chrisgammage.ginjitsu.client.AfterInject;
import com.chrisgammage.gwtjitsu.client.impl.PresenterBase;
import com.chrisgammage.gwtjitsu.shared.PresenterModel;

import javax.inject.Inject;

/**
 * Created by gammagec on 1/29/14.
 */
public abstract class MainPagePresenter extends PresenterBase {

    @Inject
    private MainPageView view;

    @Inject
    @PresenterModel
    private MainPageModel model;

    @AfterInject
    protected final void afterInject() {
        view.setWelcomeText(model.getWelcomeText());
    }

    public MainPageView getView() {
        return view;
    }
}
