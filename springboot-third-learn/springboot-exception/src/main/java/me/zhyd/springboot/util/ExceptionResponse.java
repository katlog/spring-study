package me.zhyd.springboot.util;

/**
 * 异常响应信息，最后会转换成json字符串
 *
 * @author <a href="mailto:zjjlive123@163.com">zjjlive</a>
 * @date 2019年3月12日 上午9:27:29
 * @version V1.0
 * @since JDK ： 1.8
 */
public class ExceptionResponse {

	private Integer code;
	private String message;

	public ExceptionResponse(Integer code, String message) {
		this.message = message;
		this.code = code;
	}

	public Integer getCode() {
		return code;
	}

	public String getMessage() {
		return message;
	}

}
