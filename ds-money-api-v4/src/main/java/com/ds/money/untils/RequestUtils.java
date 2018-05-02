package com.ds.money.untils;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.alibaba.fastjson.JSON;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/**
 * 
 * @author 光光
 *
 */
public class RequestUtils {

	protected static final Logger logger = LoggerFactory.getLogger(RequestUtils.class);

	
	public static void showParams(HttpServletRequest request) {
		// 解析参数.
				Enumeration map = request.getParameterNames();
				StringBuffer br = new StringBuffer(">>>客户端(").append(
						request.getRemoteAddr()).append("),请求参数:\r\n");
				while (map.hasMoreElements()) {
					Object o = map.nextElement();
					String key = (o == null ? "" : o.toString());
					br.append(key + "=" + request.getParameter(key)).append("\r\n");
				}
				String param = br.toString();
				logger.info(param);
    }
	/**
	 * 接收json请求参数    错误方法
	 * @param request
	 * @return
	 */
	public static String getParams(HttpServletRequest request) {
		// 解析参数.
		Enumeration map = request.getParameterNames();
		String param =null;
		while (map.hasMoreElements()) {
			Object o = map.nextElement();
			param = (o == null ? "" : o.toString());
		}
		return param;
    }



	public static String getClientIp(HttpServletRequest request) {

        String ip = request.getHeader("x-forwarded-for");
        //String ip = request.getHeader("X-real-ip");

        //logger.debug("x-forwarded-for = {}", ip);
        if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("Proxy-Client-IP"); 
            logger.debug("Proxy-Client-IP = {}", ip); 
        }
        if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("WL-Proxy-Client-IP");
            logger.debug("WL-Proxy-Client-IP = {}", ip);
        }
        if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getRemoteAddr();
            logger.debug("RemoteAddr-IP = {}", ip); 
        }
        if(StringUtils.isNotBlank(ip)) {
            ip = ip.split(",")[0];
        }
        return ip;

    }


}
