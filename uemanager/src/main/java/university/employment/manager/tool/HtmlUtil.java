package university.employment.manager.tool;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;


import university.employment.manager.tool.JSONUtil;

/**
 * 
 * @ClassName: HtmlUtil 
 * @Description: 接口调用统一返回json工具
 * @author lijiaqi
 * @date 2017年3月7日 上午8:30:58 
 *
 */
public class HtmlUtil {
	private final static Logger log = Logger.getLogger(HtmlUtil.class);

	public static void writerJson(HttpServletRequest request,HttpServletResponse response, String jsonStr) {
		writer(request,response, jsonStr);
	}

	public static void writerJson(HttpServletRequest request,HttpServletResponse response, Object object) {
		response.setContentType("application/json");
		writer(request,response, JSONUtil.toJson(object));
	}

	public static void writerJson(HttpServletRequest request,HttpServletResponse response, Object object, String dateFormat) {
		response.setContentType("application/json");
		writer(request,response, JSONUtil.toJson(object, dateFormat));
	}

	public static void writerHtml(HttpServletRequest request,HttpServletResponse response, String htmlStr) {
		writer(request,response, htmlStr);
	}

	private static void writer(HttpServletRequest request,HttpServletResponse response, String str) {
		try {
			// 设置页面不缓存
			response.setHeader("Pragma", "No-cache");
			response.setHeader("Cache-Control", "no-cache");
			response.setCharacterEncoding("UTF-8");
			String callback = request.getParameter("callback");
			if(null != callback && !"".equals(callback)){
				//str = "<script>" + callback + "(" + str + ")</script>";
				str = "" + callback + "(" + str + ")";
			}
			PrintWriter out = null;
			out = response.getWriter();
			out.print(str);
			out.flush();
			out.close();
			log.info("writer:"+str);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
