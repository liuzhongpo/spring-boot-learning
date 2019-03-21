package com.lzplzp.convert;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;
import org.springframework.http.converter.xml.MappingJackson2XmlHttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.List;

/**
 * Spring MVC中有一个消息转换器这个概念，它主要负责处理各种不同格式的请求数据进行处理，并包转换成对象，以提供更好的编程体验。
 * 在Spring MVC中定义了HttpMessageConverter接口，抽象了消息转换器对类型的判断、对读写的判断与操作
 * HTTP请求的Content-Type有各种不同格式定义，如果要支持Xml格式的消息转换，就必须要使用对应的转换器。
 * Spring MVC中默认已经有一套采用Jackson实现的转换器MappingJackson2XmlHttpMessageConverter
 *
 *
 * 第一步：引入Xml消息转换器
 *      传统项目，配置这个。
 *      springboot引入jackson-dataformat-xml 依赖
 *
 * 第二步：定义对象与Xml的关系
 */
//@Configuration
public class MessageConverterConfig1 extends WebMvcConfigurerAdapter {
    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        Jackson2ObjectMapperBuilder builder = Jackson2ObjectMapperBuilder.xml();
        builder.indentOutput(true);
        converters.add(new MappingJackson2XmlHttpMessageConverter(builder.build()));
    }
}
