$(document).ready(function(){
	var uid = getCookie("uid");
	if(uid==""){
		alert("请登录");
		window.location.href="http://127.0.0.1:8080/uemanager/web/login.html";
		return;
	}
	var name = getCookie("username");
	if(name!=null && name !=""){
		$("#cc_top_name").html(name);		
	}

}); 

function ccchangenavi(str){
	if(str=='navi_student_manager'){
		$("#navi_company_manager").css("border","0px solid #fff");
		$("#navi_notifications").css("border","0px solid #fff");
		$("#navi_tongji").css("border","0px solid #fff");
		$("#navi_student_manager").css("border","1px solid #cc").css("border-bottom-color","#fff");
		$("#cc_student_manager").css('display','block');
		$("#cc_company_manager").css('display','none');
		$("#cc_tongji").css('display','none');
		$("#cc_notification").css('display','none');
	}else if(str=='navi_company_manager'){
		$("#navi_student_manager").css("border","0px solid #fff");
		$("#navi_tongji").css("border","0px solid #fff");
		$("#navi_notifications").css("border","0px solid #fff");
		$("#navi_company_manager").css("border","1px solid #ccc").css("border-bottom-color","#fff");
		$("#cc_student_manager").css('display','none');
		$("#cc_company_manager").css('display','block');
		$("#cc_tongji").css('display','none');
		$("#cc_notification").css('display','none');
	}else if(str == 'navi_tongji'){
		$("#navi_student_manager").css("border","0px solid #fff");
		$("#navi_company_manager").css("border","0px solid #fff");
		$("#navi_notifications").css("border","0px solid #fff");
		$("#navi_tongji").css("border","1px solid #ccc").css("border-bottom-color","#fff");
		$("#cc_student_manager").css('display','none');
		$("#cc_company_manager").css('display','none');
		$("#cc_tongji").css('display','block');
		$("#cc_notification").css('display','none');
	}else if(str=='navi_notifications'){
		$("#navi_company_manager").css("border","0px solid #fff");
		$("#navi_student_manager").css("border","0px solid #fff");
		$("#navi_tongji").css("border","0px solid #fff");
		$("#navi_notifications").css("border","1px solid #ccc").css("border-bottom-color","#fff");
		$("#cc_student_manager").css('display','none');
		$("#cc_company_manager").css('display','none');
		$("#cc_tongji").css('display','none');
		$("#cc_notification").css('display','block');
	}else{
		$("#navi_company_manager").css("border","0px solid #fff");
		$("#navi_notifications").css("border","0px solid #fff");
		$("#navi_tongji").css("border","0px solid #fff");
		$("#navi_student_manager").css("border","1px solid #ccc").css("border-bottom-color","#fff");
		$("#cc_student_manager").css('display','block');
		$("#cc_company_manager").css('display','none');
		$("#cc_tongji").css('display','none');
		$("#cc_notification").css('display','none');
	}
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