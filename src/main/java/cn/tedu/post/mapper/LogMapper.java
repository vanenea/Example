package cn.tedu.post.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.tedu.post.bean.Log;

public interface LogMapper {
	
	List<Log> getLogByUserId(
			@Param("userId") Integer userId,
			@Param("month") Integer month); 

}
