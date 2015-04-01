package org.rapidpm.demo.jaxenter.blog0020.step003.info;

import java.lang.reflect.Method;

/**
 * Created by Sven Ruppert on 02.12.2014.
 */
public class ReflectionDemo {
  public static void main(String[] args) {
    final Method[] declaredMethods = DemoKlasse.class.getDeclaredMethods();
    for (final Method declaredMethod : declaredMethods) {
      System.out.println("declaredMethod = " + declaredMethod);
    }
  }

  private static class DemoKlasse{
    public void methodA(){}
    public void methodB(){}
    public void methodC(){}
  }
}
