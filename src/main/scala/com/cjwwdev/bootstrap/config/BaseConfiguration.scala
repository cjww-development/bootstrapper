// Copyright (C) 2016-2017 the original author or authors.
// See the LICENCE.txt file distributed with this work for additional
// information regarding copyright ownership.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
package com.cjwwdev.bootstrap.config

import com.typesafe.config.ConfigFactory

trait BaseConfiguration {
  val config                    = ConfigFactory.load

  val env                       = config.getString("environment")

  val appName                   = config.getString("appName")

  val APPLICATION_ID            = config.getString(s"$env.application-ids.$appName")
  val DEVERSITY_ID              = config.getString(s"$env.application-ids.deversity-frontend")
  val DIAG_ID                   = config.getString(s"$env.application-ids.diagnostics-frontend")
  val HUB_ID                    = config.getString(s"$env.application-ids.hub-frontend")
  val AUTH_SERVICE_ID           = config.getString(s"$env.application-ids.auth-service")
  val AUTH_MICROSERVICE_ID      = config.getString(s"$env.application-ids.auth-microservice")
  val ACCOUNTS_MICROSERVICE_ID  = config.getString(s"$env.application-ids.accounts-microservice")
  val SESSION_STORE_ID          = config.getString(s"$env.application-ids.session-store")
}
