package com.chrisgammage.client.main_page.impl;

import com.chrisgammage.client.main_page.MainPageModel;
import com.chrisgammage.gwtjitsu.client.impl.ModelBase;
import com.chrisgammage.gwtjitsu.shared.Property;

/**
 * Created by gammagec on 1/29/14.
 */
public abstract class MainPageModelImpl extends ModelBase implements MainPageModel {

    @Property
    String welcomeText = "Hello World!";
}
