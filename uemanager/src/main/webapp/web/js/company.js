$(document).ready(function(){
	var uid = getCookie("uid");
	var username = getCookie("username");
	$("#cp_top_name").html(username);
	if(uid==""){
		alert("请登录");
		window.location.href="http://127.0.0.1:8080/uemanager/web/login.html";
		return;
	}
	  $.ajax({
	    	url:"http://127.0.0.1:8080/uemanager/cp/getcpalldata.do",
	    	type: "post",
			data:{"uid":uid
				 },
			dataType: "json",
			success:function(result){	
				if(result["code"]=="success"){
					var cpzhaopin = result["cpzhaopin"];
					var cpInfo = result["cpInfo"];
					
					if(cpzhaopin != "[]"){
						$("#cp_zhaopin_workplace").val(cpzhaopin["workplace"]);
						$("#cp_zhaopin_workexperience").val(cpzhaopin["workexperience"]);
						$("#cp_zhaopin_recruitnum").val(cpzhaopin["recruitnum"]);
						$("#cp_zhaopin_xueli").val(cpzhaopin["xueli"]);
						$("#cp_zhaopin_salary").val(cpzhaopin["salary"]);
						$("#cp_zhaopin_gangweizhize").html(cpzhaopin["gangweizhize"]);
						$("#cp_zhaopin_gangweiyaoqiu").html(cpzhaopin["gangweiyaoqiu"]);
						$("#cp_zhaopin_jinengyaoqiu").html(cpzhaopin["jinengyaoqiu"]);
						$("#cp_zhaopin_save").css("display","none");		
						$(".cp_zhaopin_input").css("readonly","true").attr("disabled","disabled");
					}
					if(cpzhaopin !="[]"){
						$("#cp_info_qyname").val(cpInfo["qyname"]);
						$("#cp_info_jiancheng").val(cpInfo["jiancheng"]);
						$("#cp_info_addr").val(cpInfo["addr"]);
						$("#cp_info_businessno").val(cpInfo["businessno"]);
						$("#cp_info_legalrepresentative").val(cpInfo["legalrepresentative"]);
						$("#cp_info_email").val(cpInfo["email"]);
						$("#cp_info_introduction").val(cpInfo["introduction"]);
						$("#cp_info_product").html(cpInfo["product"]);
						$("#cp_info_lingdaotuandui").html(cpInfo["lingdaotuandui"]);
						$("#cp_info_wenhua").html(cpInfo["wenhua"]);
						$("#cp_info_save").css("display","none");		
						$(".cp_base_info").css("readonly","true").attr("disabled","disabled");
					}
					
				}else{
					alert("请登录");
					window.location.href="http://127.0.0.1:8080/uemanager/web/login.html";
					return;
				}
				},
			error:function(){
//				alert("保存异常");
			}
		});
}); 


function comchangenavi(str){
	if(str=='navi_cominfo'){
		$("#navi_zhaopin").css("border","0px solid #fff");
		$("#navi_rencaimanager").css("border","0px solid #fff");
		$("#navi_search").css("border","0px solid #fff");
		$("#navi_cominfo").css("border","1px solid #cc").css("border-bottom-color","#fff");
		$("#company_info").css('display','block');
		$("#company_zhaopin").css('display','none');
		$("#company_rencai").css('display','none');
		$("#company_rencaimanager").css('display','none');
	}else if(str=='navi_zhaopin'){
		$("#navi_cominfo").css("border","0px solid #fff");
		$("#navi_search").css("border","0px solid #fff");
		$("#navi_rencaimanager").css("border","0px solid #fff");
		$("#navi_zhaopin").css("border","1px solid #ccc").css("border-bottom-color","#fff");
		$("#company_info").css('display','none');
		$("#company_zhaopin").css('display','block');
		$("#company_rencai").css('display','none');
		$("#company_rencaimanager").css('display','none');
	}else if(str == 'navi_search'){
		$("#navi_cominfo").css("border","0px solid #fff");
		$("#navi_zhaopin").css("border","0px solid #fff");
		$("#navi_rencaimanager").css("border","0px solid #fff");
		$("#navi_search").css("border","1px solid #ccc").css("border-bottom-color","#fff");
		$("#company_info").css('display','none');
		$("#company_zhaopin").css('display','none');
		$("#company_rencai").css('display','block');
		$("#company_rencaimanager").css('display','none');
	}else if(str=='navi_rencaimanager'){
		$("#navi_zhaopin").css("border","0px solid #fff");
		$("#navi_cominfo").css("border","0px solid #fff");
		$("#navi_search").css("border","0px solid #fff");
		$("#navi_rencaimanager").css("border","1px solid #ccc").css("border-bottom-color","#fff");
		$("#company_info").css('display','none');
		$("#company_zhaopin").css('display','none');
		$("#company_rencai").css('display','none');
		$("#company_rencaimanager").css('display','block');
	}else{
		$("#navi_zhaopin").css("border","0px solid #fff");
		$("#navi_rencaimanager").css("border","0px solid #fff");
		$("#navi_search").css("border","0px solid #fff");
		$("#navi_info").css("border","1px solid #ccc").css("border-bottom-color","#fff");
		$("#company_info").css('display','block');
		$("#company_zhaopin").css('display','none');
		$("#company_rencai").css('display','none');
		$("#company_rencaimanager").css('display','none');
	}
}



/**保存企业信息 */
function savecpinfo(){
	var qyname=$("#cp_info_qyname").val();
	if(qyname == "undefine" ||qyname == ""){
		alert("公司全称不能为空！");
		return;
	}
	var jiancheng=$("#cp_info_jiancheng").val();
	if(jiancheng == "undefine" ||jiancheng == ""){
		alert("公司简称不能为空！");
		return;
	}
	
	var addr=$("#cp_info_addr").val();
	if(addr == "undefine" ||addr == ""){
		alert("公司地址不能为空！");
		return;
	}
	var businessno=$("#cp_info_businessno").val();
	if(businessno == "undefine" ||businessno == ""){
		alert("工商注册码不能为空！");
		return;
	}
	var legalrepresentative=$("#cp_info_legalrepresentative").val();
	if(legalrepresentative == "undefine" ||legalrepresentative == ""){
		alert("法人代表不能为空！");
		return;
	}
	var email=$("#cp_info_email").val();
	if(email == "undefine" ||email == ""){
		alert("公司邮箱不能为空！");
		return;
	}
	var introduction=$("#cp_info_introduction").val();
	if(introduction == "undefine" ||introduction == ""){
		alert("公司主页不能为空！");
		return;
	}
	var product=$("#cp_info_product").val();//证件类型
	if(product == "undefine" ||product == ""){
		alert("公司业务不能为空！");
		return;
	}
	var lingdaotuandui=$("#cp_info_lingdaotuandui").val();
	if(lingdaotuandui == "undefine" ||lingdaotuandui == ""){
		alert("领导团队不能为空！");
		return;
	}
	var wenhua=$("#cp_info_wenhua").val();//政治面貌
	if(wenhua == "undefine" ||wenhua == ""){
		alert("企业文化不能为空！");
		return;
	}

	var cpinfo=new Object(); 
	if(getCookie("uid")==null){
		alert("请登录");
		window.location.href="http://127.0.0.1:8080/uemanager/web/login.html";
		return;
	}
	cpinfo.uid=getCookie("uid");
	cpinfo.qyname=$("#cp_info_qyname").val();
	cpinfo.jiancheng=$("#cp_info_jiancheng").val();
	cpinfo.addr=$("#cp_info_addr").val();
	cpinfo.businessno=$("#cp_info_businessno").val();
	cpinfo.legalrepresentative=$("#cp_info_legalrepresentative").val();
	cpinfo.email=$("#cp_info_email").val();
	cpinfo.introduction=$("#cp_info_introduction").val();
	cpinfo.product=$("#cp_info_product").val();
	cpinfo.lingdaotuandui=$("#cp_info_lingdaotuandui").val();
	cpinfo.wenhua=$("#cp_info_wenhua").val();
	var cpinfoJson = JSON.stringify(cpinfo);
    $.ajax({
    	url:"http://127.0.0.1:8080/uemanager/cp/savecpinfo.do",
    	type: "post",
		data:{"cpinfo":cpinfoJson
		 },
		dataType: "json",
		success:function(result){	
			if(result["code"]=="success"){
				var data= result["data"];
				$("#cp_info_save").css("display","none");		
				$(".cp_base_info").css("readonly","true").attr("disabled","disabled");
				
				alert(result["msg"]);
			}else{
				alert(result["msg"]);
			}
			},
		error:function(){
//			alert("保存异常");
		}
	});
}


function savecpzhaopin(){
	var workplace=$("#cp_zhaopin_workplace").val();
	if(workplace == "undefine" ||workplace == ""){
		alert("工作地点不能为空！");
		return;
	}
	var workexperience=$("#cp_zhaopin_workexperience").val();
	if(workexperience == "undefine" ||workexperience == ""){
		alert("工作经验不能为空！");
		return;
	}
	
	var recruitnum=$("#cp_zhaopin_recruitnum").val();
	if(recruitnum == "undefine" ||recruitnum == ""){
		alert("招聘人数不能为空！");
		return;
	}
	var xueli=$("#cp_zhaopin_xueli").val();
	if(xueli == "undefine" ||xueli == ""){
		alert("学历不能为空！");
		return;
	}
	var salary=$("#cp_zhaopin_salary").val();
	if(salary == "undefine" ||salary == ""){
		alert("职位月薪不能为空！");
		return;
	}
	var gangweizhize=$("#cp_zhaopin_gangweizhize").val();
	if(gangweizhize == "undefine" ||gangweizhize == ""){
		alert("岗位职责不能为空！");
		return;
	}
	var gangweiyaoqiu=$("#cp_zhaopin_gangweiyaoqiu").val();
	if(gangweiyaoqiu == "undefine" ||gangweiyaoqiu == ""){
		alert("岗位要求不能为空！");
		return;
	}
	var jinengyaoqiu=$("#cp_zhaopin_jinengyaoqiu").val();
	if(jinengyaoqiu == "undefine" ||jinengyaoqiu == ""){
		alert("技能要求不能为空！");
		return;
	}
	
	var cpzhaopin=new Object(); 
	
	cpzhaopin.workplace=$("#cp_zhaopin_workplace").val();
	
	cpzhaopin.workexperience=$("#cp_zhaopin_workexperience").val();
	
	cpzhaopin.recruitnum=$("#cp_zhaopin_recruitnum").val();
	
	cpzhaopin.xueli=$("#cp_zhaopin_xueli").val();
	
	cpzhaopin.salary=$("#cp_zhaopin_salary").val();
	
	cpzhaopin.gangweizhize=$("#cp_zhaopin_gangweizhize").val();
	
	cpzhaopin.gangweiyaoqiu=$("#cp_zhaopin_gangweiyaoqiu").val();
	
	cpzhaopin.jinengyaoqiu=$("#cp_zhaopin_jinengyaoqiu").val();
	var cpzhaopinJson = JSON.stringify(cpzhaopin);
	var uid = getCookie("uid");
	if(uid == null |uid ==""){
		alert("请登录！");
		window.location.href="http://127.0.0.1:8080/uemanager/web/login.html";
		return;
	}
    $.ajax({
    	url:"http://127.0.0.1:8080/uemanager/cp/savecpzhaopin.do",
    	type: "post",
		data:{"cpzhaopin":cpzhaopinJson,
			"uid":uid
		 },
		dataType: "json",
		success:function(result){	
			if(result["code"]=="success"){
				var data= result["data"];
				$("#cp_zhaopin_save").css("display","none");		
				$(".cp_zhaopin_input").css("readonly","true").attr("disabled","disabled");
				
				alert(result["msg"]);
			}else{
				alert(result["msg"]);
				
			}
			},
		error:function(){
//			alert("保存异常");
		}
	});

}
function setCookie(cname, cvalue, exdays) {
	var d = new Date();
	d.setTime(d.getTime() + (exdays * 24 * 60 * 60 * 1000));
	var expires = "expires=" + d.toGMTString();
	document.cookie = cname + "=" + cvalue + "; " + expires;
}
/**
 * @description 获取指定cookie
 * @param {String} cname key
 */
function getCookie(cname) {
	var name = cname + "=";
	var ca = document.cookie.split(';');
	for(var i = 0; i < ca.length; i++) {
		var c = ca[i].trim();
		if(c.indexOf(name) == 0) return c.substring(name.length, c.length);
	}
	return "";
}