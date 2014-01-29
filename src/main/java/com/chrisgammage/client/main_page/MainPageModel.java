package com.chrisgammage.client.main_page;

import com.chrisgammage.client.main_page.impl.MainPageModelImpl;
import com.chrisgammage.gwtjitsu.client.Model;
import com.google.inject.ImplementedBy;

/**
 * Created by gammagec on 1/29/14.
 */

@ImplementedBy(MainPageModelImpl.class)
public interface MainPageModel extends Model {
    String getWelcomeText();
    void setWelcomeText(String welcomeText);
}
