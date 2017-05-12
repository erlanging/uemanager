admin_navi_student
admin_navi_company
admin_navi_cc
admin_navi_jlzp

admin_student_manager
admin_company_manager
admin_cc_manager
admin_zhaopin_jianli_manager
function adminchangenavi(str){
	if(str=='admin_navi_student'){
		$("#admin_navi_company").css("border","0px solid #fff");
		$("#admin_navi_jlzp").css("border","0px solid #fff");
		$("#admin_navi_cc").css("border","0px solid #fff");
		$("#admin_navi_student").css("border","1px solid #cc").css("border-bottom-color","#fff");
		$("#admin_student_manager").css('display','block');
		$("#admin_company_manager").css('display','none');
		$("#admin_cc_manager").css('display','none');
		$("#admin_zhaopin_jianli_manager").css('display','none');
	}else if(str=='admin_navi_company'){
		$("#admin_navi_student").css("border","0px solid #fff");
		$("#admin_navi_cc").css("border","0px solid #fff");
		$("#admin_navi_jlzp").css("border","0px solid #fff");
		$("#admin_navi_company").css("border","1px solid #ccc").css("border-bottom-color","#fff");
		$("#admin_student_manager").css('display','none');
		$("#admin_company_manager").css('display','block');
		$("#admin_cc_manager").css('display','none');
		$("#admin_zhaopin_jianli_manager").css('display','none');
	}else if(str == 'admin_navi_cc'){
		$("#admin_navi_student").css("border","0px solid #fff");
		$("#admin_navi_company").css("border","0px solid #fff");
		$("#admin_navi_jlzp").css("border","0px solid #fff");
		$("#admin_navi_cc").css("border","1px solid #ccc").css("border-bottom-color","#fff");
		$("#admin_student_manager").css('display','none');
		$("#admin_company_manager").css('display','none');
		$("#admin_cc_manager").css('display','block');
		$("#admin_zhaopin_jianli_manager").css('display','none');
	}else if(str=='admin_navi_jlzp'){
		$("#admin_navi_company").css("border","0px solid #fff");
		$("#admin_navi_student").css("border","0px solid #fff");
		$("#admin_navi_cc").css("border","0px solid #fff");
		$("#admin_navi_jlzp").css("border","1px solid #ccc").css("border-bottom-color","#fff");
		$("#admin_student_manager").css('display','none');
		$("#admin_company_manager").css('display','none');
		$("#admin_cc_manager").css('display','none');
		$("#admin_zhaopin_jianli_manager").css('display','block');
	}else{
		$("#admin_navi_company").css("border","0px solid #fff");
		$("#admin_navi_jlzp").css("border","0px solid #fff");
		$("#admin_navi_cc").css("border","0px solid #fff");
		$("#admin_navi_student").css("border","1px solid #ccc").css("border-bottom-color","#fff");
		$("#admin_student_manager").css('display','block');
		$("#admin_company_manager").css('display','none');
		$("#admin_cc_manager").css('display','none');
		$("#admin_zhaopin_jianli_manager").css('display','none');
	}
}