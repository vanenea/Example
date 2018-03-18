import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.tedu.post.bean.Log;
import cn.tedu.post.bean.Post;
import cn.tedu.post.mapper.LogMapper;
import cn.tedu.post.mapper.PostMapper;

public class PostMapperTest {
	ClassPathXmlApplicationContext ctx;
	PostMapper mapper;
	LogMapper logMapper;
	
	@Before
	public void init(){
		ctx = new ClassPathXmlApplicationContext(
				"spring-dao.xml");
		mapper = ctx.getBean("postMapper",
				PostMapper.class);
		logMapper = ctx.getBean("logMapper",
				LogMapper.class);
	}
	
	@Test
	public void testGetPostById(){
		Post post=mapper.getPostById(1);
		System.out.println(post);
	}
	
	@Test
	public void testGetLogByUserId(){
		List<Log> list=
				logMapper.getLogByUserId(1, 2);
		for (Log log : list) {
			System.out.println(log);
		}
		list=logMapper.getLogByUserId(1, 1);
		for (Log log : list) {
			System.out.println(log);
		}
	}
	
	
}





