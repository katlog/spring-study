package com.baobaotao.resource;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

// 3-14
public class FileSourceExample {
	
	public static void main(String[] args) {
		try {
			String filePath = "/conf/file1.txt";
			//①使用系统文件路径方式加载文件
			Resource res1 = new FileSystemResource(new File(filePath));
			//②使用类路径方式加载文件
            Resource res2 = new ClassPathResource("conf/file1.txt");
            
            InputStream ins1 = res1.getInputStream();
            InputStream ins2 = res2.getInputStream();
            System.out.println("res1:"+res1.getFilename());
            System.out.println("res2:"+res2.getFilename());            
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
