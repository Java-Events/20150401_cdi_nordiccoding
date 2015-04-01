package org.rapidpm.demo.jaxenter.blog0020.step001;

import org.boon.di.Inject;
import org.boon.di.PostConstruct;
import org.rapidpm.demo.jaxenter.blog0020.PrintInfo;

/**
 * Created by Sven Ruppert on 30.11.2014.
 */
public class Service {
  @Inject SubService subService;
  public void printInfo(){
    PrintInfo.printInfo(this.getClass());
    if(subService == null){
      System.out.println("subService = " + subService);
    } else{
      subService.printInfo();
    }
  }
  @PostConstruct
  public void printInfoPostconstruct(){
    System.out.println("printInfoPostconstruct() "
        + this.getClass().getSimpleName());
  }
}
