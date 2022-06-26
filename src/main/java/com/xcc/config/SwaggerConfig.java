package com.xcc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.core.env.Profiles;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

import static springfox.documentation.service.ApiInfo.DEFAULT_CONTACT;

/**
 * @author xuhe
 * @PackageName:com.xcc.config
 * @ClassName:SwaggerConfig
 * @Description:
 * @data 2022/4/6 22:15
 */
@Configuration
@EnableSwagger2//开启Swagger2
public class SwaggerConfig {
    //配置了swagger docket的bean实例
    @Bean
    public Docket docket(Environment environment){

        //设置要显示的swagger环境
        Profiles profiles = Profiles.of("dev","test");
        //获取项目的环境,判断是否开启
        boolean flag = environment.acceptsProfiles(profiles);

        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .groupName("xccDemo")
                .enable(flag)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.xcc.controller"))   //配置要扫描接口的方式
                .build();
    }
    //配置swagger信息
    private ApiInfo apiInfo(){
        Contact contact = new Contact("xcc", "", "");

        return  new ApiInfo("xcc的Swagger接口文档",
                "Api Documentation",
                "1.0", "urn:tos",
                contact, "Apache 2.0",
                "http://www.apache.org/licenses/LICENSE-2.0", new ArrayList());
    }
}
