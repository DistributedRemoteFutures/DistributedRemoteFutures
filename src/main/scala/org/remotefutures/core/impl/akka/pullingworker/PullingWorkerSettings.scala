package org.remotefutures.core.impl.akka.pullingworker

/*
 * Copyright (c) 2014 Martin Senne
 */

import scala.concurrent.duration.Duration
import com.typesafe.config.Config
import org.remotefutures.util.Helpers.ConfigOps
import akka.util.Helpers.Requiring


class PullingWorkerSettings(config: Config) {

  val masterSystemname: String = config.getString("master.systemname")
  val masterAkkaSettings = config.getConfig("master")

  val workerSystemname = config.getString("worker.systemname")
  val workerAkkaSettings = config.getConfig("worker")
}

object PullingWorkerSettings {
  def apply(c:Config) : PullingWorkerSettings = {
    new PullingWorkerSettings(c)
  }
}