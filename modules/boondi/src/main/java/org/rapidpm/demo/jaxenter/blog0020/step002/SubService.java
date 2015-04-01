package org.rapidpm.demo.jaxenter.blog0020.step002;

import org.boon.di.PostConstruct;
import org.rapidpm.demo.jaxenter.blog0020.PrintInfo;

/**
 * Created by Sven Ruppert on 30.11.2014.
 */
public class SubService {


  public void printInfo(){
    PrintInfo.printInfo(this.getClass());
  }

  @PostConstruct
  public void printInfoPostconstruct(){
    System.out.println("printInfoPostconstruct = " + this.getClass().getSimpleName());
  }

}
