package university.employment.manager.web.student;

import java.io.UnsupportedEncodingException;
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

import university.employment.manager.entity.SysStuDangan;
import university.employment.manager.entity.SysStuInfo;
import university.employment.manager.entity.SysStuJianli;
import university.employment.manager.service.student.StudentService;
import university.employment.manager.tool.StringUtil;
import university.employment.manager.web.BaseController;
import university.employment.manager.web.user.UserController;
@Controller
@RequestMapping("/stu")
public class StudentController extends BaseController{
	@Autowired
	private StudentService studentService;
	
	private static Logger logger = LoggerFactory.getLogger(UserController.class);
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
		Map<String, Object> result = studentService.getStuallData(Integer.valueOf(uid));
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
		String stuInfoStr = request.getParameter("stuInfo");
		SysStuInfo stuInfo = JSON.parseObject(stuInfoStr, SysStuInfo.class);
		Map<String, Object> result = studentService.userSaveBaseInfo(stuInfo);
		sendMessage(request, response, result);
	}
	
	@ResponseBody
	@RequestMapping(value = "/savestudangan", method = {RequestMethod.POST,RequestMethod.GET })
	public void saveStuDangan(HttpServletRequest request,HttpServletResponse response){
		// 设置编码格式
		try {
			request.setCharacterEncoding("utf-8");
		} catch (UnsupportedEncodingException e) {
			logger.debug("不支持转码");
			return;
		}
		response.setContentType("text/html;charset=utf-8");
		String stuDanganStr = request.getParameter("stuDangan");
		SysStuDangan stuDangan = JSON.parseObject(stuDanganStr, SysStuDangan.class);
		Map<String, Object> result = studentService.saveStuDangan(stuDangan);
		sendMessage(request, response, result);
	}
	
	@ResponseBody
	@RequestMapping(value = "/savestujianli", method = {RequestMethod.POST,RequestMethod.GET })
	public void saveStuJianli(HttpServletRequest request,HttpServletResponse response){
		// 设置编码格式
		try {
			request.setCharacterEncoding("utf-8");
		} catch (UnsupportedEncodingException e) {
			logger.debug("不支持转码");
			return;
		}
		response.setContentType("text/html;charset=utf-8");
		String stuJianliStr = request.getParameter("stuJianli");
		SysStuJianli stuJianli= JSON.parseObject(stuJianliStr, SysStuJianli.class);
		Map<String, Object> result = studentService.saveStuJianli(stuJianli);
		sendMessage(request, response, result);
	}
	
	@ResponseBody
	@RequestMapping(value = "/searchjob", method = {RequestMethod.POST,RequestMethod.GET })
	public void searchJob(HttpServletRequest request,HttpServletResponse response){
		// 设置编码格式
		try {
			request.setCharacterEncoding("utf-8");
		} catch (UnsupportedEncodingException e) {
			logger.debug("不支持转码");
			return;
		}
		response.setContentType("text/html;charset=utf-8");
		String job = request.getParameter("job");
		if(StringUtil.isEmpty(job)){
			job = "%%";
		}else{
			job = "%"+job+"%";
		}
		Map<String, Object> result = studentService.searchJob(job);
		sendMessage(request, response, result);
	}
}
