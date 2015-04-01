package org.rapidpm.demo.jaxenter.blog0018.business.subservice;

import java.time.LocalDateTime;

/**
 * Created by Sven Ruppert on 19.11.2014.
 */
public abstract class BaseSubService implements SubService {

  public BaseSubService() {
    System.out.println(this.getClass().getSimpleName() + " = " + LocalDateTime.now());
  }
}
