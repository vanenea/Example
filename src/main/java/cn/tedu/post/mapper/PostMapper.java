package cn.tedu.post.mapper;

import org.apache.ibatis.annotations.Param;

import cn.tedu.post.bean.Post;

public interface PostMapper {
	
	Post getPostById(@Param("id") Integer id);

}
