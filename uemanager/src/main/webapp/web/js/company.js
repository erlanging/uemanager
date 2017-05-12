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