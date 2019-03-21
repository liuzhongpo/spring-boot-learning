package com.lzplzp;

import com.lzplzp.sync.Task;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.concurrent.Future;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Chapter1Application.class)
public class ApplicationTests {

	@Autowired
	private Task task;

	@Resource(name="asyncTask")
	private com.lzplzp.async.Task taskByAsync;

	@Test
	public void test() throws Exception {
		task.doTaskOne();
		task.doTaskTwo();
		task.doTaskThree();
	}
	@Test
	public void test01() throws Exception {
		taskByAsync.doTaskOne();
		taskByAsync.doTaskTwo();
		taskByAsync.doTaskThree();
	}

	@Test
	public void test02() throws Exception {

		long start = System.currentTimeMillis();

		Future<String> task1 = taskByAsync.doTaskOne();
		taskByAsync.doTaskTwo();
		taskByAsync.doTaskThree();

		while(true) {
			if(task1.isDone()) {
				// 三个任务都调用完成，退出循环等待
				break;
			}
			Thread.sleep(1000);
		}

		long end = System.currentTimeMillis();

		System.out.println("任务全部完成，总耗时：" + (end - start) + "毫秒");

	}

}