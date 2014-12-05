/*
 * Copyright [2014] [www.rapidpm.org / Sven Ruppert (sven.ruppert@rapidpm.org)]
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package org.rapidpm.demo.jaxenter.blog0020.business.subservice.impl_a;


import org.boon.di.Inject;
import org.rapidpm.demo.jaxenter.blog0020.business.subservice.BaseSubService;
import org.rapidpm.demo.jaxenter.blog0020.business.subservice.subsubservice.SubSubService;


/**
 * Created by Sven Ruppert on 17.11.2014.
 */
public class SubServiceA extends BaseSubService {

  @Inject SubSubService service;

  @Override
  public String work(String input) {
    return input + "_A_" + service.work(input);
  }
}
