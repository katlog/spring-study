package me.zhyd.springboot.exception;

/**
 * 模拟404错误处理异常类
 *
 * @author <a href="mailto:zjjlive123@163.com">zjjlive</a>
 * @date 2019年3月12日 上午9:27:29
 * @version V1.0
 * @since JDK ： 1.8
 */
public class NotFoundException extends Exception {

	private static final long serialVersionUID = -3337173015423201991L;

	public NotFoundException() {
		super();
	}

	public NotFoundException(String message) {
		super(message);
	}

}
