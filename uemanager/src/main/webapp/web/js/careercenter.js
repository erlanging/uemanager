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