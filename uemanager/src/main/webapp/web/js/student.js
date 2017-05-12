$(document).ready(function(){
	var uid = getCookie("uid");
	  $.ajax({
	    	url:"http://127.0.0.1:8080/uemanager/user/getstualldata.do",
	    	type: "post",
			data:{"uid":uid
				 },
			dataType: "json",
			success:function(result){	
				if(result["code"]=="success"){
					var stuInfo = result["stuInfo"];
					var chengjilist = result["chengjilist"]; 
					
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
				alert("保存异常");
			}
		});
	
	
}); 

student_qiuzhi
navi_qiuzhi
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


function saveStubaseInfo1(){
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
    	url:"http://127.0.0.1:8080/uemanager/user/savebaseinfo.do",
    	type: "post",
		data:{"stuInfo":stuInfoJson
				/* "name":name,
				"gender":gender,
				"birthdate":birthdate,
				"birthplace":birthplace,
				"nativeplace":nativeplace,
				"nation":nation,
				"identityCardType":identityCardType,
				"identityId":identityId,
				"politicsStatus":politicsStatus,
				"healthcondition":healthcondition,
				"hukouxingzhi":hukouxingzhi,
				"hukousuozaidi":hukousuozaidi,
				"addr":addr,
				"zipcode":zipcode,
				"email":email,
				"qq":qq,
				"connectphone":connectphone,
				"studyid":studyid,
				"zhuanye":zhuanye,
				"techang":techang,
				"suozaibanji":suozaibanji,
				"susheId":susheId,
				"zhiwu":zhiwu,
				"dushengzinv":dushengzinv,
				"lianxirenname":lianxirenname,
				"lianxirenphone":lianxirenphone,
				"lianxirendanwei":lianxirendanwei,
				"lianxirenage":lianxirenage */
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
			alert("保存异常");
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
