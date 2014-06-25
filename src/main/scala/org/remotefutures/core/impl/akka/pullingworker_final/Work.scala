package org.remotefutures.core.impl.akka.pullingworker_final

/**
 * Execute case class. Used from caller site.
 * @param body is the code to execute on callee (remote node) site.
 */
case class Execute[T](body: () => T)

case class Work(workId: String, body: () => Any)

case class WorkResult(workId: String, result: Any)