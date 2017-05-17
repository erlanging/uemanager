package university.employment.manager.web.company;

import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
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

import university.employment.manager.dao.SysQiyeInfoMapper;
import university.employment.manager.entity.SysQiyeInfo;
import university.employment.manager.entity.SysQiyeInfoExample;
import university.employment.manager.entity.SysQiyeZhaopin;
import university.employment.manager.service.company.CompanyService;
import university.employment.manager.tool.StringUtil;
import university.employment.manager.tool.constants.Constants;
import university.employment.manager.web.BaseController;
import university.employment.manager.web.user.UserController;
@Controller
@RequestMapping("/cp")
public class CompanyController extends BaseController{
	private static Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	private CompanyService companyService;
	@Autowired
	private SysQiyeInfoMapper cpInfoMapper;
	@ResponseBody
	@RequestMapping(value = "/getcpalldata", method = {RequestMethod.POST,RequestMethod.GET })
	public void getCpallData(HttpServletRequest request,HttpServletResponse response){
		// 设置编码格式
		try {
			request.setCharacterEncoding("utf-8");
		} catch (UnsupportedEncodingException e) {
			logger.debug("不支持转码");
			return;
		}
		response.setContentType("text/html;charset=utf-8");
		String uid = request.getParameter("uid");
		Map<String, Object> result = companyService.getCpallData(Integer.valueOf(uid));
		sendMessage(request, response, result);
	}
	
	
	@ResponseBody
	@RequestMapping(value = "/savecpinfo", method = {RequestMethod.POST,RequestMethod.GET })
	public void saveCpinfo(HttpServletRequest request,HttpServletResponse response){
		// 设置编码格式
		try {
			request.setCharacterEncoding("utf-8");
		} catch (UnsupportedEncodingException e) {
			logger.debug("不支持转码");
			return;
		}
		response.setContentType("text/html;charset=utf-8");
		String cpinfoStr = request.getParameter("cpinfo");
		SysQiyeInfo cpinfo = JSON.parseObject(cpinfoStr,SysQiyeInfo.class);
		Map<String, Object> result = companyService.saveCpinfo(cpinfo);
		sendMessage(request, response, result);
	}
	
	
	@ResponseBody
	@RequestMapping(value = "/savecpzhaopin", method = {RequestMethod.POST,RequestMethod.GET })
	public void saveCpZhaopin(HttpServletRequest request,HttpServletResponse response){
		// 设置编码格式
		try {
			request.setCharacterEncoding("utf-8");
		} catch (UnsupportedEncodingException e) {
			logger.debug("不支持转码");
			return;
		}
		response.setContentType("text/html;charset=utf-8");
		String cpzhaopinStr  = request.getParameter("cpzhaopin");
		String uid = request.getParameter("uid");
		Map<String, Object> result = new HashMap<>();
		SysQiyeInfoExample cpinfoexa = new SysQiyeInfoExample();
		cpinfoexa.createCriteria().andUidEqualTo(Integer.valueOf(uid));
		List<SysQiyeInfo> cpinfolist  = cpInfoMapper.selectByExample(cpinfoexa );
		SysQiyeZhaopin cpzhaopin = JSON.parseObject(cpzhaopinStr, SysQiyeZhaopin.class);
		cpzhaopin.setPublishtime(new Date(System.currentTimeMillis()));
		if(cpinfolist!=null){
			cpzhaopin.setQyid(cpinfolist.get(0).getQyid());
		}else{
			result.put(Constants.CODE, Constants.FAIL);
			result.put(Constants.MSG, "请登录");
			sendMessage(request, response, result);
			return;
		}
		
		result = companyService.saveCpZhaopin(cpzhaopin);
		sendMessage(request, response, result);
	}
	
	@ResponseBody
	@RequestMapping(value = "/getstudents", method = {RequestMethod.POST,RequestMethod.GET })
	public void getStudents(HttpServletRequest request,HttpServletResponse response){
		// 设置编码格式
		try {
			request.setCharacterEncoding("utf-8");
		} catch (UnsupportedEncodingException e) {
			logger.debug("不支持转码");
			return;
		}
		response.setContentType("text/html;charset=utf-8");
		String stuname  = request.getParameter("stuname");
		String stuzhuanye = request.getParameter("stuzhuanye");
		if(StringUtil.isEmpty(stuzhuanye)){
			stuzhuanye ="%%";
		}else{
			stuzhuanye ="%"+stuzhuanye+"%";
		}
		
		if(StringUtil.isEmpty(stuname)){
			stuname ="%%";
		}else{
			stuname="%"+stuname+"%";
		}
		Map<String, Object> result = new HashMap<>();
		
		result = companyService.searchstus(stuname,stuzhuanye);
		sendMessage(request, response, result);
	}
	
	@ResponseBody
	@RequestMapping(value = "/getcompanys", method = {RequestMethod.POST,RequestMethod.GET })
	public void getcompanys(HttpServletRequest request,HttpServletResponse response){
		// 设置编码格式
		try {
			request.setCharacterEncoding("utf-8");
		} catch (UnsupportedEncodingException e) {
			logger.debug("不支持转码");
			return;
		}
		response.setContentType("text/html;charset=utf-8");
		String cpname  = request.getParameter("cpname");
		
		if(StringUtil.isEmpty(cpname)){
			cpname ="%%";
		}else{
			cpname="%"+cpname+"%";
		}
		Map<String, Object> result = new HashMap<>();
		
		result = companyService.searchcompany(cpname);
		sendMessage(request, response, result);
	}
}
