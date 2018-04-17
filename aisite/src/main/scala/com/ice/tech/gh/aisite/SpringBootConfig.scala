package com.ice.tech.gh.aisite

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.ComponentScan


@SpringBootApplication
@ComponentScan(basePackages = Array("com.ice.tech.gh.aisite", "com.winche.framework.core"))
class SpringBootConfig{}
