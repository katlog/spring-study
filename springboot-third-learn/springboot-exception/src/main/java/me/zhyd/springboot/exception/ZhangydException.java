package me.zhyd.springboot.exception;

/**
 * 自定义的异常类
 *
 * @author <a href="mailto:zjjlive123@163.com">zjjlive</a>
 * @date 2019年3月12日 上午9:27:29
 * @version V1.0
 * @since JDK ： 1.8
 */
public class ZhangydException extends Exception {

	private static final long serialVersionUID = 3720658094018235765L;

	private Integer code;

	public ZhangydException() {
		super();
	}

	public ZhangydException(String message) {
		super(message);
	}

	public ZhangydException(Integer code, String message) {
		super(message);
		this.code = code;
	}

	public Integer getCode() {
		return code;
	}

}
