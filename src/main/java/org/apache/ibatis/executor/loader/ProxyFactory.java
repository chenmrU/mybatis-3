/**
 *    Copyright 2009-2015 the original author or authors.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package org.apache.ibatis.executor.loader;

import java.util.List;
import java.util.Properties;

import org.apache.ibatis.reflection.factory.ObjectFactory;
import org.apache.ibatis.session.Configuration;

/**
 * 代理工厂，创建需要延迟加载的结果对象的代理
 * @author Eduardo Macarron
 */
public interface ProxyFactory {

  /**
   * 空实现，无用
   * @param properties
   */
  void setProperties(Properties properties);

  /**
   * 创建代理对象
   * @param target
   * @param lazyLoader
   * @param configuration
   * @param objectFactory
   * @param constructorArgTypes
   * @param constructorArgs
   * @return
   */
  Object createProxy(Object target, ResultLoaderMap lazyLoader, Configuration configuration, ObjectFactory objectFactory, List<Class<?>> constructorArgTypes, List<Object> constructorArgs);
  
}
