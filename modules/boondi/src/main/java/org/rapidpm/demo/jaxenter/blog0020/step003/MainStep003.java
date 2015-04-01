package org.rapidpm.demo.jaxenter.blog0020.step003;


import org.boon.di.Context;
import org.boon.di.DependencyInjection;
import org.boon.di.Module;

/**
 * Created by Sven Ruppert on 01.12.2014.
 */
public class MainStep003 {

  public static void main(String[] args) {
    //NPE
//        final Module module = DependencyInjection.classes(Service.class);
//    final Service service1 = module.get(Service.class);
//    service1.printInfo();

    final Module moduleA = DependencyInjection.module(new ServiceModuleA());
    final Module moduleB = DependencyInjection.module(new ServiceModuleB());
//    final Context context = DependencyInjection.context(moduleA);
//    final Context context = DependencyInjection.context(moduleA,moduleB);
    final Context context = DependencyInjection.context(moduleB,moduleA);

//    System.out.println("service? = " + context.has(Service.class));

//    context.remove(moduleB);
//    context.remove(moduleA);

    final Service service2 = context.get(Service.class);
    service2.printInfo();
  }


  public static class ServiceModuleA{

    public Service provideServiceA(){
      System.out.println("provideServiceAA ...");
      return new ServiceImpl();
    }
    public Service provideServiceB(){
      System.out.println("provideServiceAB ...");
      return new ServiceImpl();
    }
    public Service provideServiceC(){
      System.out.println("provideServiceAC ...");
      return new ServiceImpl();
    }
//
//    public ServiceImpl provideServiceImpl(){
//      System.out.println("provideServiceImplA ...");
//      return new ServiceImpl();
//    }


  }
  public static class ServiceModuleB{

    public Service provideServiceA(){
      System.out.println("provideServiceBA ...");
      return new ServiceImpl();
    }

    public Service provideServiceB(){
      System.out.println("provideServiceBB ...");
      return new ServiceImpl();
    }

    public Service provideServiceC(){
      System.out.println("provideServiceBC ...");
      return new ServiceImpl();
    }

    public ServiceImpl provideServiceImpl(){
      System.out.println("provideServiceImplB ...");
      return new ServiceImpl();
    }


  }


}
