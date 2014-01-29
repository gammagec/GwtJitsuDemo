package com.chrisgammage.client;

import com.chrisgammage.client.main_page.MainPagePresenter;
import com.chrisgammage.ginjitsu.client.GinExtension;
import com.chrisgammage.ginjitsu.client.GinExtensions;
import com.chrisgammage.ginjitsu.client.JitsuInjector;
import com.chrisgammage.gwtjitsu.client.impl.ModelBase;
import com.chrisgammage.gwtjitsu.client.impl.PresenterBase;
import com.chrisgammage.gwtjitsu.server.ModelGenerator;
import com.chrisgammage.gwtjitsu.server.PresenterGenerator;

/**
 * Created by gammagec on 1/29/14.
 */
/*@GinExtensions({
    @GinExtension(clazz = ModelBase.class, generator = ModelGenerator.class),
    @GinExtension(clazz = PresenterBase.class, generator = PresenterGenerator.class)
})*/
public interface DemoInjector extends JitsuInjector {
    MainPagePresenter getMainPage();
}
