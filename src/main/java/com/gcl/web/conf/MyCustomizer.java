package com.gcl.web.conf;

import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.context.embedded.ErrorPage;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

/**
 * 
 * @ClassName: MyCustomizer 
 * @Description: 修改服务器自定义错误页面
 * @author: guoconglin
 * @date: 2017年5月16日 上午10:54:44
 */
@Component //（把普通实例化到spring容器中，相当于配置文件中的<bean id="" class=""/>）
public class MyCustomizer implements EmbeddedServletContainerCustomizer {

    @Override
    public void customize(ConfigurableEmbeddedServletContainer container) {
        ErrorPage error401Page = new ErrorPage(HttpStatus.UNAUTHORIZED,
                        "/static/401.html");
                ErrorPage error404Page = new ErrorPage(HttpStatus.NOT_FOUND,
                        "/static/404.html");
                ErrorPage error500Page = new ErrorPage(
                        HttpStatus.INTERNAL_SERVER_ERROR, "/static/500.html");
                container.addErrorPages(error401Page, error404Page, error500Page);
            }
    }

