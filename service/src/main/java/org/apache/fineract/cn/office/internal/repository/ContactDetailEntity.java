/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.fineract.cn.office.internal.repository;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "horus_contact_details")
public class ContactDetailEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private Long id;
  @OneToOne(fetch = FetchType.LAZY, optional = true)
  @JoinColumn(name = "employee_id")
  private EmployeeEntity employee;
  @Column(name = "a_type")
  private String type;
  @Column(name = "a_group")
  private String group;
  @Column(name = "a_value")
  private String value;
  @Column(name = "preference_level")
  private Integer preferenceLevel;

  public ContactDetailEntity() {
    super();
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public EmployeeEntity getEmployee() {
    return employee;
  }

  public void setEmployee(final EmployeeEntity employee) {
    this.employee = employee;
  }

  public String getType() {
    return this.type;
  }

  public void setType(final String type) {
    this.type = type;
  }

  public String getGroup() {
    return this.group;
  }

  public void setGroup(final String group) {
    this.group = group;
  }

  public String getValue() {
    return this.value;
  }

  public void setValue(final String value) {
    this.value = value;
  }

  public Integer getPreferenceLevel() {
    return this.preferenceLevel;
  }

  public void setPreferenceLevel(final Integer preferenceLevel) {
    this.preferenceLevel = preferenceLevel;
  }
}
