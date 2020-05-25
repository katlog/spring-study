package com.baobaotao.resource;

import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
// 3-17
public class PatternResolverTest {

	public static void main(String[] args) throws Throwable{
		
		ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
		//①加载所有类包com.baoabaotao(含子目录)下的以xml结尾的资源
		Resource resources[] =resolver.getResources("classpath*:com/baobaotao/**/*.xml");
		for(Resource resource:resources){
			System.out.println(resource.getDescription());
			System.out.println(resource.getFilename());
		}
	}
}
