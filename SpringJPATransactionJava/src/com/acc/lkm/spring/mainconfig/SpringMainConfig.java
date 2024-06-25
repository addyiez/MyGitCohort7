package com.acc.lkm.spring.mainconfig;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.acc.lkm.db.config.SpringDBConfig;

@Configuration
@ComponentScan({"com.acc.lkm.dao","com.acc.lkm.service"})
@Import(SpringDBConfig.class)
public class SpringMainConfig {

}
