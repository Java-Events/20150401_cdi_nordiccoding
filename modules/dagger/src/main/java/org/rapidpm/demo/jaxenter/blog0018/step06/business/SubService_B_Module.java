package org.rapidpm.demo.jaxenter.blog0018.step06.business;

import dagger.Module;
import dagger.Provides;
import org.rapidpm.demo.jaxenter.blog0018.business.subservice.SubService;
import org.rapidpm.demo.jaxenter.blog0018.business.subservice.impl_b.SubServiceB;

import javax.inject.Named;

/**
 * Created by Sven Ruppert on 19.11.2014.
 */

@Module(library = true,
    includes = SubSubServiceModule.class,
    complete = true)
public class SubService_B_Module {

  @Provides
  @Named("B")
  SubService provideSubServiceB(SubServiceB subService) {
    return subService;
  }

}
