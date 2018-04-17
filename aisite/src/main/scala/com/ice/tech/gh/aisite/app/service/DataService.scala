package com.ice.tech.gh.aisite.app.service

import com.sksamuel.elastic4s.ElasticsearchClientUri
import com.sksamuel.elastic4s.http.HttpClient
import com.sksamuel.elastic4s.http.search.SearchResponse

class DataService {

  import com.sksamuel.elastic4s.http.ElasticDsl._

  val client = HttpClient(ElasticsearchClientUri("192.168.1.143", 9200))

  def SayHello(): Unit ={
    val result: SearchResponse = client.execute {
      search("item").matchQuery("title", "ad")
    }.await
    result.hits.hits.foreach(println)
  }
}
