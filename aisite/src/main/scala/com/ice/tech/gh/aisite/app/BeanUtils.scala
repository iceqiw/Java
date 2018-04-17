package com.ice.tech.gh.aisite.app

import com.ice.tech.gh.aisite.app.service.DataService
import org.springframework.context.annotation.{Bean, Configuration}


@Configuration
class BeanUtils {

  @Bean
  def getDataService(): DataService ={
    new DataService
  }
}
