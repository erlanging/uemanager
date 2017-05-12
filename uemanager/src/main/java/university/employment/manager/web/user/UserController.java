package university.employment.manager.web.user;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;

import university.employment.manager.entity.SysStuInfo;
import university.employment.manager.entity.SysUserLogin;
import university.employment.manager.service.user.UserService;
import university.employment.manager.tool.Md5;
import university.employment.manager.tool.StringUtil;
import university.employment.manager.tool.constants.Constants;
import university.employment.manager.web.BaseController;

@Controller
@RequestMapping("/user")
public class UserController extends BaseController{
	@Autowired
	private UserService userService;
	private static Logger logger = LoggerFactory.getLogger(UserController.class);
	
	
	@ResponseBody
	@RequestMapping(value = "/login", method = {RequestMethod.POST,RequestMethod.GET })
	public void login(HttpServletRequest request,HttpServletResponse response){
		// 设置编码格式
		try {
			request.setCharacterEncoding("utf-8");
		} catch (UnsupportedEncodingException e) {
			logger.debug("不支持转码");
			return;
		}
		response.setContentType("text/html;charset=utf-8");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		if(StringUtil.isEmpty(username)){
			sendFailureMessage(request, response,"用户名不能为空 ！");
			return;
		}
		
		if(StringUtil.isEmpty(password)){
			sendFailureMessage(request, response,"密码不能为空！");
		}
		
		SysUserLogin userLogin = new SysUserLogin();
		userLogin.setUsername(username);
		userLogin.setPassword(password);
		sendMessage(request, response, userService.userLogin(userLogin));
	}
	
	
	@ResponseBody
	@RequestMapping(value = "/register", method = {RequestMethod.POST,RequestMethod.GET })
	public void register(HttpServletRequest request,HttpServletResponse response){
		// 设置编码格式
		try {
			request.setCharacterEncoding("utf-8");
		} catch (UnsupportedEncodingException e) {
			logger.debug("不支持转码");
			return;
		}
		response.setContentType("text/html;charset=utf-8");
		Map<String,Object> result = new HashMap<String,Object>();
		
		String username = request.getParameter("username");
		String passwd = request.getParameter("password");
		String ensurepwd = request.getParameter("ensurepwd");
		String usertype = request.getParameter("usertype");
		SysUserLogin user = new SysUserLogin();
		if(StringUtil.isEmail(username)){
			result.put(Constants.CODE, Constants.FAIL);
			result.put(Constants.MSG, "用户名不能为空！");
			sendMessage(request, response, result);
			return;
		}
		
		if(StringUtil.isEmpty(passwd)){
			result.put(Constants.CODE, Constants.FAIL);
			result.put(Constants.MSG, "密码不能为空！");
			sendMessage(request, response, result);
			return;
		}
		
		if(StringUtil.isEmpty(ensurepwd)){
			result.put(Constants.CODE, Constants.FAIL);
			result.put(Constants.MSG, "确认密码不能为空！");
			sendMessage(request, response, result);
			return;
		}
		
		if(usertype==null || "".equals(usertype)){
			result.put(Constants.CODE, Constants.FAIL);
			result.put(Constants.MSG, "用户角色不能为空！");
			sendMessage(request, response, result);
			return ;
		}
		passwd = Md5.toMD5(passwd);
		user.setUsername(username);
		user.setPassword(passwd);
		user.setType(Integer.valueOf(usertype));
		user.setCreatetime(System.currentTimeMillis());
		user.setStatus(0);
		result = userService.userRegister(user);
		sendMessage(request, response, result);
	}
	
	
	@ResponseBody
	@RequestMapping(value = "/savebaseinfo", method = {RequestMethod.POST,RequestMethod.GET })
	public void saveBaseInfo(HttpServletRequest request,HttpServletResponse response){
		// 设置编码格式
		try {
			request.setCharacterEncoding("utf-8");
		} catch (UnsupportedEncodingException e) {
			logger.debug("不支持转码");
			return;
		}
		response.setContentType("text/html;charset=utf-8");
		String stuInfojson = request.getParameter("stuInfo");
		SysStuInfo stuInfo = JSON.parseObject(stuInfojson, SysStuInfo.class);
		Map<String, Object> result = userService.userSaveBaseInfo(stuInfo);
		sendMessage(request, response, result);
	}
	
	
	@ResponseBody
	@RequestMapping(value = "/getstualldata", method = {RequestMethod.POST,RequestMethod.GET })
	public void getStuallData(HttpServletRequest request,HttpServletResponse response){
		// 设置编码格式
		try {
			request.setCharacterEncoding("utf-8");
		} catch (UnsupportedEncodingException e) {
			logger.debug("不支持转码");
			return;
		}
		response.setContentType("text/html;charset=utf-8");
		String uid = request.getParameter("uid");
		Map<String, Object> result = userService.getStuallData(Integer.valueOf(uid));
		sendMessage(request, response, result);
	}
}
