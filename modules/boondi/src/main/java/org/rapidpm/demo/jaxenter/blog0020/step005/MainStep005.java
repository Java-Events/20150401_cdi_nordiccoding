package org.rapidpm.demo.jaxenter.blog0020.step005;


import org.boon.di.Context;
import org.boon.di.DependencyInjection;
import org.boon.di.Module;
import org.boon.di.ProviderInfo;

import javax.inject.Named;

/**
 * Created by Sven Ruppert on 02.12.2014.
 */
public class MainStep005 {

  public static void main(String[] args) {
    //geht nicht mit Interfaces , class.getSupertypes()... null
//    final Module suppliers = DependencyInjection.suppliers(
//        ProviderInfo.providerOf(Service.class, ServiceA::new),//default
//        ProviderInfo.providerOf("A", Service.class, ServiceA::new),
//        ProviderInfo.providerOf("B", Service.class, ServiceB::new)
//    );
//
//    final Context context = DependencyInjection.context(suppliers);
//
//    System.out.println(context.get(Service.class).getClass().getSimpleName());
//    System.out.println(context.get(Service.class, "A").getClass().getSimpleName());
//    System.out.println(context.get(Service.class, "B").getClass().getSimpleName());

    final Module suppliers = DependencyInjection.suppliers(
        ProviderInfo.providerOf(ServiceImpl.class, ServiceImplA::new),//default
        ProviderInfo.providerOf("ImplA", ServiceImpl.class, ServiceImplA::new),
        ProviderInfo.providerOf("ImplB", ServiceImpl.class, ServiceImplB::new)
    );

    final Context context = DependencyInjection.context(suppliers);

    System.out.println(context.get(ServiceImpl.class).getClass().getSimpleName());
    System.out.println(context.get(ServiceImpl.class, "ImplA").getClass().getSimpleName());
    System.out.println(context.get(ServiceImpl.class, "ImplB").getClass().getSimpleName());

    //with interfaces
    final Module module = DependencyInjection.module(new Object() {
      public Service provide(){  return new ServiceA();}
      @Named("A") public Service provideA(){ return new ServiceA();}
      @Named("B") public Service provideB(){ return new ServiceB();}
    });

    final Context ctx = DependencyInjection.context(module);
    System.out.println(ctx.get(Service.class).getClass().getSimpleName());
    System.out.println(ctx.get(Service.class, "A").getClass().getSimpleName());
    System.out.println(ctx.get(Service.class, "B").getClass().getSimpleName());


    //Ueberlappung bei Named



  }

   //provider



  //interfaces
  public static interface Service{
    public String work(String txt);
  }
  public static class ServiceA implements Service{
    public String work(String txt){
      return "ServiceA - " + txt;
    }
  }
  public static class ServiceB implements Service{
    public String work(String txt){
      return "ServiceB - " + txt;
    }
  }

  //no interfaces
  public static class ServiceImpl{
    public String work(String txt){
      return "ServiceImpl - " + txt;
    }
  }
  public static class ServiceImplA extends ServiceImpl{
    public String work(String txt){
      return "ServiceImplA - " + txt;
    }
  }
  public static class ServiceImplB extends ServiceImpl{
    public String work(String txt){
      return "ServiceImplB - " + txt;
    }
  }



}
