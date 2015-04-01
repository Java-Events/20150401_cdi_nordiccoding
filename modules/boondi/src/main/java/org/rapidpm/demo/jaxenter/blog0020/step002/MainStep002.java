package org.rapidpm.demo.jaxenter.blog0020.step002;

import org.boon.di.Context;
import org.boon.di.DependencyInjection;
import org.boon.di.Module;

/**
 * Created by Sven Ruppert on 30.11.2014.
 */
public class MainStep002 {
  public static void main(String[] args) {
    final Service service = new Service();
    service.printInfo();
    //CDi not working
    final Module module = DependencyInjection.classes(Service.class);
    final Service service1 = module.get(Service.class);
    service1.printInfo();

    final Module module1 = DependencyInjection.module(new ServiceModule());
    final Context context = DependencyInjection.context(module, module1);
    final Service service2 = context.get(Service.class);
    service2.printInfo();
  }

  public static class ServiceModule{
//    public Service provideService(){
//      System.out.println("provideService ...");
//      return new Service();
//    }
    public SubService provideSubService(){
      System.out.println("provideSubService ...");
      return new SubService();
    }
  }
}
