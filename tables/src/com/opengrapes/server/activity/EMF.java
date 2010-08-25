package com.opengrapes.server.activity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Miroslav Genov (mgenov@gmail.com)
 */
public class EMF {

  private static EntityManagerFactory factory;

  public static EntityManagerFactory getFactory() {
    if (factory == null) {

      Map properties = new HashMap();
      properties.put("hibernate.connection.driver_class", "org.h2.Driver");
      properties.put("hibernate.connection.url", "jdbc:h2:test");
      properties.put("hibernate.connection.username", "sa");
      properties.put("hibernate.connection.password", "");
      properties.put("hibernate.connection.pool_size", "1");
      properties.put("hibernate.dialect", "org.hibernate.dialect.H2Dialect");
      properties.put("hibernate.hbm2ddl.auto", "create");
      factory = Persistence.createEntityManagerFactory("db-manager", properties);
    }

    return factory;
  }
  
  public static EntityManager createEntityManager() {
    return getFactory().createEntityManager();
  }
}
