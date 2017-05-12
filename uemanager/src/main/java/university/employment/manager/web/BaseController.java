package university.employment.manager.web;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;

import university.employment.manager.tool.constants.Constants;
import university.employment.manager.tool.pages.Page;
import university.employment.manager.tool.pages.PageJson;
import university.employment.manager.tool.HtmlUtil;

public class BaseController {

	public final static String SUCCESS = "success";// 成功的请求

	public final static String FAIL = "fail";// 失败的请求

	public final static String ILLEGAL = "illegal";// 不合法的请求

	public final static String ERROR = "error";// 服务器错误

	public final static String MSG = "msg";// 标识返回信息

	public final static String CODE = "code";// 标识请求类型(成功、失败，不合法，服务器错误等)

	public final static String DATA = "data";// 标识请求类型(成功、失败，不合法，服务器错误等)

	/**
	 * 获取IP地址
	 * 
	 * @param request
	 * @return
	 */
	public String getIpAddr(HttpServletRequest request) {
		String ip = request.getHeader("x-forwarded-for");
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("Proxy-Client-IP");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("WL-Proxy-Client-IP");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getRemoteAddr();
		}
		return ip;
	}

	public ModelAndView error(String errMsg) {
		return new ModelAndView(Constants.ERROR_PAGE);
	}

	public void sendObject(HttpServletRequest request,HttpServletResponse response, Object object) {
		sendObject(request,response, object, "yyyy-MM-dd HH:mm:ss");
	}

	@SuppressWarnings("rawtypes")
	public void sendObject(HttpServletRequest request,HttpServletResponse response, Object object,
			String dateFormat) {
		// 判断是否为分页返回
		if (object.getClass() == Page.class) {
			Page page = (Page) object;
			PageJson pageJson = new PageJson();
			pageJson.setRows(page);
			pageJson.setTotal(page.getTotal());
			HtmlUtil.writerJson(request,response, pageJson, dateFormat);
		} else {
			HtmlUtil.writerJson(request,response, object, dateFormat);
		}
	}

	/**
	 * 
	 * @Title: sendMessage
	 * @Description: 发送消息和信息，所有消息 和/或 信息发送都可以适用
	 * @param response
	 * @param result
	 * @return void
	 * @throws
	 */
	public void sendMessage(HttpServletRequest request,HttpServletResponse response, Object result) {
		HtmlUtil.writerJson(request,response, result);
	}

	/**
	 *
	 * 提示成功信息
	 *
	 * @param message
	 *
	 */
	public void sendSuccessMessage(HttpServletRequest request,HttpServletResponse response) {
		Map<String, Object> result = new HashMap<String, Object>();
		result.put(CODE, SUCCESS);
		result.put(MSG, "操作成功");
		HtmlUtil.writerJson(request,response, result);
	}

	/**
	 *
	 * 提示成功信息
	 *
	 * @param message
	 *
	 */
	public void sendSuccessMessage(HttpServletRequest request,HttpServletResponse response, String message) {
		Map<String, Object> result = new HashMap<String, Object>();
		result.put(CODE, SUCCESS);
		result.put(MSG, message);
		HtmlUtil.writerJson(request,response, result);
	}

	/**
	 *
	 * 提示失败信息
	 *
	 * @param message
	 *
	 */
	public void sendFailureMessage(HttpServletRequest request,HttpServletResponse response) {
		Map<String, Object> result = new HashMap<String, Object>();
		result.put(CODE, FAIL);
		result.put(MSG, "操作失败");
		HtmlUtil.writerJson(request,response, result);
	}

	/**
	 *
	 * 提示失败信息
	 *
	 * @param message
	 *
	 */
	public void sendFailureMessage(HttpServletRequest request,HttpServletResponse response, String message) {
		Map<String, Object> result = new HashMap<String, Object>();
		result.put(CODE, FAIL);
		result.put(MSG, message);
		HtmlUtil.writerJson(request,response, result);
	}

	/**
	 * 
	 * @Title: sendIllegal
	 * @Description: 验证用户请求是否合法
	 * @param response
	 * @return void
	 * @throws
	 */
	public void sendIllegal(HttpServletRequest request,HttpServletResponse response) {
		Map<String, Object> result = new HashMap<String, Object>();
		result.put(CODE, ILLEGAL);
		result.put(MSG, "不合法的请求");
		HtmlUtil.writerJson(request,response, result);
	}

	/**
	 * 
	 * @Title: sendRequestInvalid
	 * @Description: 用户操作无效
	 * @param response
	 * @return void
	 * @throws
	 */
	public void sendRequestInvalid(HttpServletRequest request,HttpServletResponse response) {
		Map<String, Object> result = new HashMap<String, Object>();
		result.put(CODE, ERROR);
		result.put(MSG, "操作无效，请与管理员联系，或反馈该信息");
		HtmlUtil.writerJson(request,response, result);
	}

}
