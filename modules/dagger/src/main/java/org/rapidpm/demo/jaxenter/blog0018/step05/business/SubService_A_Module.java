package org.rapidpm.demo.jaxenter.blog0018.step05.business;

import dagger.Module;
import dagger.Provides;
import org.rapidpm.demo.jaxenter.blog0018.business.subservice.SubService;
import org.rapidpm.demo.jaxenter.blog0018.business.subservice.impl_a.SubServiceA;

import javax.inject.Named;

/**
 * Created by Sven Ruppert on 19.11.2014.
 */
@Module(library = true,
    includes = SubSubServiceModule.class,
    complete = true)
public class SubService_A_Module {
  @Provides
  @Named("A")
  SubService provideSubServiceA(SubServiceA subService) {
    return subService;
  }

}
