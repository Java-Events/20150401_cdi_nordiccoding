package org.rapidpm.demo.jaxenter.blog0020.step003;

import org.rapidpm.demo.jaxenter.blog0020.PrintInfo;

/**
 * Created by Sven Ruppert on 01.12.2014.
 */
public class ServiceImpl implements Service {
  @Override
  public void printInfo() {
    PrintInfo.printInfo(this.getClass());
  }
}
