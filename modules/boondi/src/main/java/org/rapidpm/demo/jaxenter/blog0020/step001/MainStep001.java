package org.rapidpm.demo.jaxenter.blog0020.step001;

import org.boon.di.Context;
import org.boon.di.DependencyInjection;
import org.boon.di.Module;


/**
 * Created by Sven Ruppert on 30.11.2014.
 */
public class MainStep001 {
  public static void main(String[] args) {
    final Service service = new Service();
    service.printInfo();
    //CDi not working
    final Module module = DependencyInjection.classes(Service.class);
    final Service service1 = module.get(Service.class);
    service1.printInfo();
    //factory Methods are now available
    final Context context = DependencyInjection.context(module);
    final Service service2 = context.get(Service.class);
    service2.printInfo();
  }
}
