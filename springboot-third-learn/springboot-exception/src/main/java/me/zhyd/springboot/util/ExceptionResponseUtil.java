package me.zhyd.springboot.util;

/**
 * 异常响应信息工具类
 *
 * @author <a href="mailto:zjjlive123@163.com">zjjlive</a>
 * @date 2019年3月12日 上午9:27:29
 * @version V1.0
 * @since JDK ： 1.8
 */
public class ExceptionResponseUtil {

	/**
	 * 
	 * init: <br/>
	 *
	 * @author <a href="mailto:zjjlive123@163.com">zjjlive</a>
	 * @date 2019年3月12日 上午9:27:29
	 * @version V1.0
	 * @since JDK ： 1.8
	 */
	public static ExceptionResponse init(Integer code, String message) {
		return new ExceptionResponse(code, message);
	}

}
