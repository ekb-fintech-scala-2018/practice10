package ru.tinkoff.fintech.crwlr.crawler.mnix

import monix.eval.{Fiber, Task}
import ru.tinkoff.fintech.crwlr.httpclient._

trait Worker {
  def http: Http
  def parseLinks: Parsr

  def worker(workerQueue: MQueue[Url], crawlerQueue: MQueue[CrawlerMessage]): Task[Fiber[Unit]] = ???
}
