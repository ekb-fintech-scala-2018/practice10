package ru.tinkoff.fintech.crwlr.crawler.actor
import akka.actor.{Actor, ActorLogging, ActorRef}

import scala.util.{Failure, Success}
import ru.tinkoff.fintech.crwlr.httpclient._

class Worker(http: Http, parser: Parsr, master: ActorRef) extends Actor with ActorLogging {
  ???
}
