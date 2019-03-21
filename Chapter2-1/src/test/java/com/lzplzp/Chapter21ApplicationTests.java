package com.lzplzp;

import com.lzplzp.constant.ConstantProperties;
import com.lzplzp.web.HelloController;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockServletContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.hamcrest.Matchers.equalTo;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Chapter21Application.class)
public class Chapter21ApplicationTests {

    @Autowired
    ConstantProperties constantProperties;

    @Test
    public void getHello() throws Exception {
        Assert.assertEquals(constantProperties.getName(), "lzp");
        Assert.assertEquals(constantProperties.getWorker(), "java");

        System.out.println(constantProperties.getValue());
        System.out.println(constantProperties.getNumber());
        System.out.println(constantProperties.getBignumber());
        System.out.println(constantProperties.getTest1());
        System.out.println(constantProperties.getTest2());
    }

}
