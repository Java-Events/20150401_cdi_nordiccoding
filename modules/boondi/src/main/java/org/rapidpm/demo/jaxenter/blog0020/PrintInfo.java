package org.rapidpm.demo.jaxenter.blog0020;

import java.lang.reflect.Method;

/**
 * Created by Sven Ruppert on 01.12.2014.
 */
public class PrintInfo {
  public static void printInfo(Class aClass){
    final Method[] declaredMethods = aClass.getDeclaredMethods();
    String txt = "";
    for (final Method declaredMethod : declaredMethods) {
      txt = txt + " - " + declaredMethod.getName();
    }
    System.out.println(aClass.getSimpleName() + " -> " + txt);
  }
}
