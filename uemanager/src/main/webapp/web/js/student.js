$(document).ready(function(){
	var uid = getCookie("uid");
	if(uid==""){
		alert("请登录");
		window.location.href="http://127.0.0.1:8080/uemanager/web/login.html";
		return;
	}
	var name = getCookie("username");
	if(name!=null && name !=""){
		$("#top_name").html(name);		
	}
	
	 $.ajax({
	    	url:"http://127.0.0.1:8080/uemanager/stu/getstualldata.do",
	    	type: "post",
			data:{"uid":uid
				 },
			dataType: "json",
			success:function(result){	
				if(result["code"]=="success"){
					var stuInfo = result["stuInfo"];
					var chengjilist = result["chengjilist"]; 
					var dangan = result["stuDangan"];
					var jianli =result["stuJianli"];
					
					
					setCookie("stuid",stuInfo["stuid"]);
					if(dangan != "[]"){
						$("#stu_da_name").val(dangan["name"]);
						
						$("#stu_da_gender").val(dangan["gender"]);
						$("#stu_da_studentid").val(dangan["studentid"]);
						$("#stu_da_xingzhengbanji").val(dangan["xingzhengbanji"]);
						$("#stu_da_birthday").val(dangan["birthday"]);
						$("#stu_da_nation").val(dangan["nation"]);
						$("#stu_da_rutuandate").val(dangan["rutuandate"]);//证件类型
						$("#stu_da_identityid").val(dangan["identityid"]);
						$("#stu_da_zhengzhimianmao").val(dangan["zhengzhimianmao"]);//政治面貌
						$("#stu_da_jiguan").val(dangan["jiguan"]);
						$("#stu_da_phone").val(dangan["phone"]);
						$("#stu_da_mail").val(dangan["mail"]);
						$("#stu_da_homeaddr").html(dangan["homeaddr"]);
						$("#stu_da_zipcode").val(dangan["zipcode"]);
						$("#stu_da_contactphone").val(dangan["contactphone"]);
						$("#stu_da_awards").html(dangan["awards"]);
						$("#stu_dangan_beizhu").html(dangan["beizhu"]);
						$("#stu_da_jianli").html(dangan["xuexijingli"]);
						$("#stu_da_guanxi").html(dangan["guanxi"]);
						$("#stu_dangan_save").css("display","none");		
						$(".stu_dangan_input").css("readonly","true").attr("disabled","disabled");
					}
					
					if(jianli != "[]"){
						$("#stu_jl_realname").val(jianli["realname"]);
						$("#stu_jl_yingwenname").val(jianli["yingwenname"]);
						$("#stu_jl_birthday").val(jianli["birthday"]);
						$("#stu_jl_mibilephone").val(jianli["mibilephone"]);
						$("#stu_jl_mail").val(jianli["mail"]);
						$("#stu_jl_homepage").val(jianli["homepage"]);
						$("#stu_jl_qq").val(jianli["qq"]);//证件类型
						$("#stu_jl_qiuzhiyixiang").html(jianli["qiuzhiyixiang"]);
						$("#stu_jl_jineng").html(jianli["jineng"]);//政治面貌
						$("#stu_jl_workexperience").html(jianli["workexperience"]);
						$("#stu_jl_awards").html(jianli["awards"]);
						$("#stu_jianli_save").css("display","none");		
						$(".stu_jianli_input").css("readonly","true").attr("disabled","disabled");
					}
					
					if(stuInfo !="[]"){
						$("#top_name").html(stuInfo["name"]);
						$("#basic_name_input").val(stuInfo["name"]);
						$("#basic_gender_input").val(stuInfo["gender"]);
						$("#basic_birthdate_input").val(stuInfo["birthdate"]);
						$("#basic_birthplace_input").val(stuInfo["birthplace"]);
						$("#basic_nativeplace_input").val(stuInfo["nativeplace"]);
						$("#basic_nation_input").val(stuInfo["nation"]);
						$("#basic_identityCardType_input").val(stuInfo["identitycardtype"]);//证件类型
						$("#basic_identityId_input").val(stuInfo["identityid"]);
						$("#basic_politicsStatus_input").val(stuInfo["politicsstatus"]);//政治面貌
						$("#basic_healthcondition_input").val(stuInfo["healthcondition"]);
						$("#basic_hukouxingzhi_input").val(stuInfo["hukouxingzhi"]);
						$("#basic_huhousuozaidi_input").val(stuInfo["hukousuozaidi"]);
						$("#basic_addr_input").val(stuInfo["addr"]);
						$("#basic_zipcode_input").val(stuInfo["zipcode"]);
						$("#basic_email_input").val(stuInfo["email"]);
						$("#basic_qq_input").val(stuInfo["qq"]);
						$("#basic_connectphone_input").val(stuInfo["connectphone"]);
						$("#basic_studyid_input").val(stuInfo["studyid"]);
						$("#basic_zhuanye_input").val(stuInfo["zhuanye"]);
						$("#basic_techang_input").val(stuInfo["techang"]);
						$("#basic_suozaibanji_input").val(stuInfo["suozaibanji"]);
						$("#basic_susheId_input").val(stuInfo["susheid"]);
						$("#basic_zhiwu_input").val(stuInfo["zhiwu"]);
						$("#basic_dushengzinv_input").val(stuInfo["dushengzinv"]);
						$("#basic_lianxirenname_input").val(stuInfo["lianxirenname"]);
						$("#basic_lianxirenphone_input").val(stuInfo["lianxirenphone"]);
						$("#basic_lianxirendanwei_input").val(stuInfo["lianxirendanwei"]);
						$("#basic_lianxirenage_input").val(stuInfo["lianxirenage"]);
						$("#save_stu_base_info").css("display","none");		
						$(".stu_input").css("readonly","true").attr("disabled","disabled");
					}else{
						$("#top_name").html(name);
					}
					
					if(chengjilist != "[]"){
						for(var p in chengjilist){
							var tr = "<tr>";
							tr+="<td class='tg-q1kk'>"+p+"<br></td>";
							tr+="<td class='tg-3we0'>"+chengjilist[p].studentid+"</td>";
							tr+="<td class='tg-3we0'>"+chengjilist[p].coursename+"</td>";
							tr+="<td class='tg-3we0'>"+chengjilist[p].type+"</td>";
							tr+="<td class='tg-3we0'>"+chengjilist[p].credit+"</td>";
							tr+="<td class='tg-3we0'>"+chengjilist[p].point+"</td>";
							tr+="<td class='tg-3we0'>"+chengjilist[p].term+"</td>";
							tr+="<td class='tg-3we0'>"+chengjilist[p].examtime+"</td>";
							tr+="</tr>";
							$("#stu_chengji_table").append(tr);
						}
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
function changenavi(str){
	if(str=='navi_info'){
		$("#navi_chengji").css("border","0px solid #fff");
		$("#navi_jianli").css("border","0px solid #fff");
		$("#navi_dangan").css("border","0px solid #fff");
		$("#navi_qiuzhi").css("border","0px solid #fff");
		$("#navi_info").css("border","1px solid #cc").css("border-bottom-color","#fff");
		$("#student_base_info").css('display','block');
		$("#student_chengji").css('display','none');
		$("#student_dangan").css('display','none');
		$("#student_qiuzhi").css('display','none');
		$("#student_jianli").css('display','none');
	}else if(str=='navi_chengji'){
		$("#navi_info").css("border","0px solid #fff");
		$("#navi_dangan").css("border","0px solid #fff");
		$("#navi_jianli").css("border","0px solid #fff");
		$("#navi_qiuzhi").css("border","0px solid #fff");
		$("#navi_chengji").css("border","1px solid #ccc").css("border-bottom-color","#fff");
		$("#student_base_info").css('display','none');
		$("#student_chengji").css('display','block');
		$("#student_dangan").css('display','none');
		$("#student_qiuzhi").css('display','none');
		$("#student_jianli").css('display','none');
	}else if(str == 'navi_dangan'){
		$("#navi_info").css("border","0px solid #fff");
		$("#navi_chengji").css("border","0px solid #fff");
		$("#navi_jianli").css("border","0px solid #fff");
		$("#navi_qiuzhi").css("border","0px solid #fff");
		$("#navi_dangan").css("border","1px solid #ccc").css("border-bottom-color","#fff");
		$("#student_base_info").css('display','none');
		$("#student_chengji").css('display','none');
		$("#student_dangan").css('display','block');
		$("#student_qiuzhi").css('display','none');
		$("#student_jianli").css('display','none');
	}else if(str=='navi_jianli'){
		$("#navi_chengji").css("border","0px solid #fff");
		$("#navi_info").css("border","0px solid #fff");
		$("#navi_dangan").css("border","0px solid #fff");
		$("#navi_qiuzhi").css("border","0px solid #fff");
		$("#navi_jianli").css("border","1px solid #ccc").css("border-bottom-color","#fff");
		$("#student_base_info").css('display','none');
		$("#student_chengji").css('display','none');
		$("#student_dangan").css('display','none');
		$("#student_qiuzhi").css('display','none');
		$("#student_jianli").css('display','block');
	}else if(str=='navi_qiuzhi'){
		$("#navi_chengji").css("border","0px solid #fff");
		$("#navi_info").css("border","0px solid #fff");
		$("#navi_dangan").css("border","0px solid #fff");
		$("#navi_jianli").css("border","0px solid #fff");
		$("#navi_qiuzhi").css("border","1px solid #ccc").css("border-bottom-color","#fff");
		$("#student_base_info").css('display','none');
		$("#student_chengji").css('display','none');
		$("#student_dangan").css('display','none');
		$("#student_qiuzhi").css('display','block');
		$("#student_jianli").css('display','none');
	}else{
		$("#navi_chengji").css("border","0px solid #fff");
		$("#navi_jianli").css("border","0px solid #fff");
		$("#navi_dangan").css("border","0px solid #fff");
		$("#navi_qiuzhi").css("border","0px solid #fff");
		$("#navi_info").css("border","1px solid #ccc").css("border-bottom-color","#fff");
		$("#student_base_info").css('display','block');
		$("#student_chengji").css('display','none');
		$("#student_dangan").css('display','none');
		$("#student_qiuzhi").css('display','none');
		$("#student_jianli").css('display','none');
	}
}

function savestudangan(){
	var name=$("#stu_da_name").val();
	if(name == "undefine" ||name == ""){
		alert("姓名不能为空！");
		return;
	}
	var gender=$("#stu_da_gender").val();
	if(gender == "undefine" ||gender == ""){
		alert("性别不能为空！");
		return;
	}
	var studentid=$("#stu_da_studentid").val();
	if(studentid == "undefine" ||studentid == ""){
		alert("学号不能为空！");
		return;
	}
	var xingzhengbanji=$("#stu_da_xingzhengbanji").val();
	if(xingzhengbanji == "undefine" ||xingzhengbanji == ""){
		alert("行政班级不能为空！");
		return;
	}
	var birthday=$("#stu_da_birthday").val();
	if(birthday == "undefine" ||birthday == ""){
		alert("生日不能为空！");
		return;
	}
	var nation=$("#stu_da_nation").val();
	if(nation == "undefine" ||nation == ""){
		alert("民族不能为空！");
		return;
	}
	var rutuandate=$("#stu_da_rutuandate").val();//证件类型
	if(rutuandate == "undefine" ||rutuandate == ""){
		alert("入团时间不能为空！");
		return;
	}
	var identityid=$("#stu_da_identityid").val();
	if(identityid == "undefine" ||identityid == ""){
		alert("身份证号不能为空！");
		return;
	}
	var zhengzhimianmao=$("#stu_da_zhengzhimianmao").val();//政治面貌
	if(zhengzhimianmao == "undefine" ||zhengzhimianmao == ""){
		alert("政治面貌不能为空！");
		return;
	}
	var jiguan=$("#stu_da_jiguan").val();
	if(jiguan == "undefine" ||jiguan == ""){
		alert("籍贯不能为空！");
		return;
	}
	var phone=$("#stu_da_phone").val();
	if(phone == "undefine" ||phone == ""){
		alert("手机不能为空！");
		return;
	}
	var mail=$("#stu_da_mail").val();
	if(mail == "undefine" ||mail == ""){
		alert("电子邮箱不能为空！");
		return;
	}
	var homeaddr=$("#stu_da_homeaddr").val();
	if(homeaddr == "undefine" ||homeaddr == ""){
		alert("家庭住址不能为空！");
		return;
	}
	var zipcode=$("#stu_da_zipcode").val();
	if(zipcode == "undefine" ||zipcode == ""){
		alert("邮编不能为空！");
		return;
	}
	var contactphone=$("#stu_da_contactphone").val();
	if(contactphone == "undefine" ||contactphone == ""){
		alert("联系电话不能为空！");
		return;
	}
	
	
	var awards=$("#stu_da_awards").val();
	
	var beizhu=$("#stu_dangan_beizhu").val();
	if(beizhu == "undefine" ||beizhu == ""){
		alert("备注不能为空！");
		return;
	}
	var xuexijingli=$("#stu_da_jianli").val();
	if(xuexijingli == "undefine" ||xuexijingli == ""){
		alert("简历不能为空！");
		return;
	}
	var guanxi=$("#stu_da_guanxi").val();
	if(guanxi == "undefine" ||guanxi == ""){
		alert("家庭关系不能为空！");
		return;
	}
	var stuDangan=new Object(); 
	if(getCookie("uid")==null){
		alert("请登录");
		window.location.href="http://127.0.0.1:8080/uemanager/web/login.html";
		return;
	}
	
	
	stuDangan.stuid=getCookie("stuid");
	stuDangan.name=$("#stu_da_name").val();
	stuDangan.gender=$("#stu_da_gender").val();
	stuDangan.studentid=$("#stu_da_studentid").val();
	stuDangan.xingzhengbanji=$("#stu_da_xingzhengbanji").val();
	stuDangan.birthday=$("#stu_da_birthday").val();
	stuDangan.nation=$("#stu_da_nation").val();
	stuDangan.rutuandate=$("#stu_da_rutuandate").val();//证件类型
	stuDangan.identityid=$("#stu_da_identityid").val();
	stuDangan.zhengzhimianmao=$("#stu_da_zhengzhimianmao").val();//政治面貌
	stuDangan.jiguan=$("#stu_da_jiguan").val();
	stuDangan.phone=$("#stu_da_phone").val();
	stuDangan.mail=$("#stu_da_mail").val();
	stuDangan.homeaddr=$("#stu_da_homeaddr").val();
	stuDangan.zipcode=$("#stu_da_zipcode").val();
	stuDangan.contactphone=$("#stu_da_contactphone").val();
	stuDangan.awards=$("#stu_da_awards").val();
	stuDangan.beizhu=$("#stu_dangan_beizhu").val();
	stuDangan.xuexijingli=$("#stu_da_jianli").val();
	stuDangan.guanxi=$("#stu_da_guanxi").val();
	
	var stuDanganJson = JSON.stringify(stuDangan);
    $.ajax({
    	url:"http://127.0.0.1:8080/uemanager/stu/savestudangan.do",
    	type: "post",
		data:{"stuDangan":stuDanganJson
		 },
		dataType: "json",
		success:function(result){	
			if(result["code"]=="success"){
				var data= result["data"];
				$("#stu_dangan_save").css("display","none");		
				$(".stu_dangan_input").css("readonly","true").attr("disabled","disabled");
				
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

function savestujianli(){
	var realname=$("#stu_jl_realname").val();
	if(realname == "undefine" ||realname == ""){
		alert("真实姓名不能为空！");
		return;
	}
	var yingwenname=$("#stu_jl_yingwenname").val();
	if(yingwenname == "undefine" ||yingwenname == ""){
		alert("英文名不能为空！");
		return;
	}
	var birthday=$("#stu_jl_birthday").val();
	if(birthday == "undefine" ||birthday == ""){
		alert("出生年月不能为空！");
		return;
	}
	var mibilephone=$("#stu_jl_mibilephone").val();
	if(mibilephone == "undefine" ||mibilephone == ""){
		alert("移动电话不能为空！");
		return;
	}
	var mail=$("#stu_jl_mail").val();
	if(mail == "undefine" ||mail == ""){
		alert("邮箱不能为空！");
		return;
	}
	var homepage=$("#stu_jl_homepage").val();
	
	var qq=$("#stu_jl_qq").val();//证件类型
	if(qq == "undefine" ||qq == ""){
		alert("qq不能为空！");
		return;
	}
	var qiuzhiyixiang=$("#stu_jl_qiuzhiyixiang").val();
	if(qiuzhiyixiang == "undefine" ||qiuzhiyixiang == ""){
		alert("求职意向不能为空！");
		return;
	}
	var jineng=$("#stu_jl_jineng").val();//政治面貌
	if(jineng == "undefine" ||jineng == ""){
		alert("技能不能为空！");
		return;
	}
	var workexperience=$("#stu_jl_workexperience").val();
	if(workexperience == "undefine" ||workexperience == ""){
		alert("工作经验不能为空！");
		return;
	}
	var awards=$("#stu_jl_awards").val();
	if(awards == "undefine" ||awards == ""){
		alert("所获奖项不能为空！");
		return;
	}
	
	
	var stuJianli=new Object(); 
	if(getCookie("uid")==null){
		alert("请登录");
		window.location.href="http://127.0.0.1:8080/uemanager/web/login.html";
		return;
	}
	
	stuJianli.stuid=getCookie("stuid");
	stuJianli.realname=$("#stu_jl_realname").val();
	
	stuJianli.yingwenname=$("#stu_jl_yingwenname").val();
	
	stuJianli.birthday=$("#stu_jl_birthday").val();
	
	stuJianli.mibilephone=$("#stu_jl_mibilephone").val();
	
	stuJianli.mail=$("#stu_jl_mail").val();
	
	stuJianli.homepage=$("#stu_jl_homepage").val();
	
	stuJianli.qq=$("#stu_jl_qq").val();//证件类型
	
	stuJianli.qiuzhiyixiang=$("#stu_jl_qiuzhiyixiang").val();
	
	stuJianli.jineng=$("#stu_jl_jineng").val();//政治面貌
	
	stuJianli.workexperience=$("#stu_jl_workexperience").val();
	
	stuJianli.awards=$("#stu_jl_awards").val();
	
	var stuJianliJson = JSON.stringify(stuJianli);
    $.ajax({
    	url:"http://127.0.0.1:8080/uemanager/stu/savestujianli.do",
    	type: "post",
		data:{"stuJianli":stuJianliJson
		 },
		dataType: "json",
		success:function(result){	
			if(result["code"]=="success"){
				var data= result["data"];
				$("#stu_jianli_save").css("display","none");		
				$(".stu_jianli_input").css("readonly","true").attr("disabled","disabled");
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



function saveStubaseInfo(){
	var name=$("#basic_name_input").val();
	if(name == "undefine" ||name == ""){
		alert("姓名不能为空！");
		return;
	}
	var gender=$("#basic_gender_input").val();
	if(gender == "undefine" ||gender == ""){
		alert("性别不能为空！");
		return;
	}
	var birthdate=$("#basic_birthdate_input").val();
	if(birthdate == "undefine" ||birthdate == ""){
		alert("出生日期不能为空！");
		return;
	}
	var birthplace=$("#basic_birthplace_input").val();
	if(birthplace == "undefine" ||birthplace == ""){
		alert("出生地不能为空！");
		return;
	}
	var nativeplace=$("#basic_nativeplace_input").val();
	if(nativeplace == "undefine" ||nativeplace == ""){
		alert("籍贯不能为空！");
		return;
	}
	var nation=$("#basic_nation_input").val();
	if(nation == "undefine" ||nation == ""){
		alert("民族不能为空！");
		return;
	}
	var identityCardType=$("#basic_identityCardType_input").val();//证件类型
	if(identityCardType == "undefine" ||identityCardType == ""){
		alert("证件类型不能为空！");
		return;
	}
	var identityId=$("#basic_identityId_input").val();
	if(identityId == "undefine" ||identityId == ""){
		alert("身份证号能为空！");
		return;
	}
	var politicsStatus=$("#basic_politicsStatus_input").val();//政治面貌
	if(politicsStatus == "undefine" ||politicsStatus == ""){
		alert("政治面貌不能为空！");
		return;
	}
	var healthcondition=$("#basic_healthcondition_input").val();
	if(healthcondition == "undefine" ||healthcondition == ""){
		alert("健康状况不能为空！");
		return;
	}
	var hukouxingzhi=$("#basic_hukouxingzhi_input").val();
	if(hukouxingzhi == "undefine" ||hukouxingzhi == ""){
		alert("户口性质不能为空！");
		return;
	}
	var hukousuozaidi=$("#basic_hukousuozaidi").val();
	if(hukousuozaidi == "undefine" ||hukousuozaidi == ""){
		alert("户口所在地不能为空！");
		return;
	}
	var addr=$("#basic_addr_input").val();
	if(addr == "undefine" ||addr == ""){
		alert("家庭住址不能为空！");
		return;
	}
	var zipcode=$("#basic_zipcode_input").val();
	if(zipcode == "undefine" ||zipcode == ""){
		alert("邮编不能为空！");
		return;
	}
	var email=$("#basic_email_input").val();
	if(email == "undefine" ||email == ""){
		alert("邮箱不能为空！");
		return;
	}
	var qq=$("#basic_qq_input").val();
	if(qq == "undefine" ||qq == ""){
		alert("qq不能为空！");
		return;
	}
	var connectphone=$("#basic_connectphone_input").val();
	if(connectphone == "undefine" ||connectphone == ""){
		alert("联系电话不能为空！");
		return;
	}
	var studyid=$("#basic_studyid_input").val();
	if(studyid == "undefine" ||studyid == ""){
		alert("学号不能为空！");
		return;
	}
	var zhuanye=$("#basic_zhuanye_input").val();
	if(zhuanye == "undefine" ||zhuanye == ""){
		alert("专业不能为空！");
		return;
	}
	var techang=$("#basic_techang_input").val();
	if(techang == "undefine" ||techang == ""){
		alert("特长不能为空！");
		return;
	}
	var suozaibanji=$("#basic_suozaibanji_input").val();
	if(suozaibanji == "undefine" ||suozaibanji == ""){
		alert("所在班级不能为空！");
		return;
	}
	var susheId=$("#basic_susheId_input").val();
	if(susheId == "undefine" ||susheId == ""){
		alert("宿舍号不能为空！");
		return;
	}
	var zhiwu=$("#basic_zhiwu_input").val();
	if(zhiwu == "undefine" ||zhiwu == ""){
		alert("职务不能为空！");
		return;
	}
	var dushengzinv=$("#basic_dushengzinv_input").val();
	if(dushengzinv == "undefine" ||dushengzinv == ""){
		alert("独生子女不能为空！");
		return;
	}
	var lianxirenname=$("#basic_lianxirenname_input").val();
	if(lianxirenname == "undefine" ||lianxirenname == ""){
		alert("家长姓名不能为空！");
		return;
	}
	var lianxirenphone=$("#basic_lianxirenphone_input").val();
	if(lianxirenphone == "undefine" ||lianxirenphone == ""){
		alert("家长手机不能为空！");
		return;
	}
	var lianxirendanwei=$("#basic_lianxirendanwei_input").val();
	if(lianxirendanwei == "undefine" ||lianxirendanwei == ""){
		alert("家长单位不能为空！");
		return;
	}
	var lianxirenage=$("#basic_lianxirenage_input").val();
	if(lianxirenage == "undefine" ||lianxirenage == ""){
		alert("家长年龄不能为空！");
		return;
	}
	var stuInfo=new Object(); 
	if(getCookie("uid")==null){
		alert("请登录");
		window.location.href="http://127.0.0.1:8080/uemanager/web/login.html";
		return;
	}
	stuInfo.uid = getCookie("uid");
	stuInfo.name=$("#basic_name_input").val();
	stuInfo.gender=$("#basic_gender_input").val();
	stuInfo.birthdate=$("#basic_birthdate_input").val();
	stuInfo.birthplace=$("#basic_birthplace_input").val();
	stuInfo.nativeplace=$("#basic_nativeplace_input").val();
	stuInfo.nation=$("#basic_nation_input").val();
	stuInfo.identityCardType=$("#basic_identityCardType_input").val();//证件类型
	stuInfo.identityId=$("#basic_identityId_input").val();
	stuInfo.politicsStatus=$("#basic_politicsStatus_input").val();//政治面貌
	stuInfo.healthcondition=$("#basic_healthcondition_input").val();
	stuInfo.hukouxingzhi=$("#basic_hukouxingzhi_input").val();
	stuInfo.hukousuozaidi=$("#basic_hukousuozaidi").val();
	stuInfo.addr=$("#basic_addr_input").val();
	stuInfo.zipcode=$("#basic_zipcode_input").val();
	stuInfo.email=$("#basic_email_input").val();
	stuInfo.qq=$("#basic_qq_input").val();
	stuInfo.connectphone=$("#basic_connectphone_input").val();
	stuInfo.studyid=$("#basic_studyid_input").val();
	stuInfo.zhuanye=$("#basic_zhuanye_input").val();
	stuInfo.techang=$("#basic_techang_input").val();
	stuInfo.suozaibanji=$("#basic_suozaibanji_input").val();
	stuInfo.susheId=$("#basic_susheId_input").val();
	stuInfo.zhiwu=$("#basic_zhiwu_input").val();
	stuInfo.dushengzinv=$("#basic_dushengzinv_input").val();
	stuInfo.lianxirenname=$("#basic_lianxirenname_input").val();
	stuInfo.lianxirenphone=$("#basic_lianxirenphone_input").val();
	stuInfo.lianxirendanwei=$("#basic_lianxirendanwei_input").val();
	stuInfo.lianxirenage=$("#basic_lianxirenage_input").val();
	var stuInfoJson = JSON.stringify(stuInfo);
    $.ajax({
    	url:"http://127.0.0.1:8080/uemanager/stu/savebaseinfo.do",
    	type: "post",
		data:{"stuInfo":stuInfoJson
			 },
		dataType: "json",
		success:function(result){	
			if(result["code"]=="success"){
				var data= result["data"];
				$("#save_stu_base_info").css("display","none");		
				$(".stu_input").css("readonly","true").attr("disabled","disabled");
				
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
