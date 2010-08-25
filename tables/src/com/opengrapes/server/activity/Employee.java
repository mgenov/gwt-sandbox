package com.opengrapes.server.activity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Version;
import java.util.List;

/**
 * @author Miroslav Genov (mgenov@gmail.com)
 */
@Entity
public class Employee {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "id")
  private Long id;

  @Version
  @Column(name = "version")
  private Integer version;

  @Column(name="displayName")
  private String displayName;

  public Employee() {
  }

  public static List<Employee> findAllEmployees() {
    EntityManager em = EMF.createEntityManager();
    return (List<Employee>) em.createQuery("from Employee").getResultList();
  }
  
  public Employee(Long id, Integer version, String displayName) {
    this.id = id;
    this.version = version;
    this.displayName = displayName;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Integer getVersion() {
    return version;
  }

  public void setVersion(Integer version) {
    this.version = version;
  }

  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }
}
