package com.zkong.familybucket.test;

import com.zkong.familybucket.web.controller.HelloController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 *  SpringJUnit4ClassRunner.class: Spring 运行环境
 *  JUnit4.class: JUnit 运行环境
 *  SpringRunner.class: Spring Boot 运行环境
 */
@RunWith(SpringRunner.class) // @RunWith: 运行器
@SpringBootTest // 标记为当前类为 SpringBoot 测试类，加载项目的 ApplicationContext 上下文环境
public class FamilybucketApplicationTests {

	@Resource
	private HelloController helloController;

	@Test
	public void contextLoads() {
		System.out.println(helloController.hello());
		System.out.println("test");
	}

}
