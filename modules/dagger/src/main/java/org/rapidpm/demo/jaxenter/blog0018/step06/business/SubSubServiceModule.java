package org.rapidpm.demo.jaxenter.blog0018.step06.business;

import dagger.Module;
import dagger.Provides;
import org.rapidpm.demo.jaxenter.blog0018.business.subservice.subsubservice.SubSubService;
import org.rapidpm.demo.jaxenter.blog0018.business.subservice.subsubservice.SubSubServiceImpl;

import javax.inject.Singleton;

/**
 * Created by Sven Ruppert on 19.11.2014.
 */
@Module(library = true, complete = true)
public class SubSubServiceModule {

  //da kein Inject in Impl... new verwenden
  @Provides @Singleton
  SubSubService provideSubSubService() {
    return new SubSubServiceImpl();
  }

}
