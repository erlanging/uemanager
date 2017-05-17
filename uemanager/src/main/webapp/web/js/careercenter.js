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


function cc_search_stu(){
	var stuname = $("#cc_search_stuname").val();
	var stuzhuanye = $("#cc_search_zhuanye").val();
    $.ajax({
    	url:"http://127.0.0.1:8080/uemanager/cp/getstudents.do",
    	type: "post",
		data:{"stuname":stuname,
			"stuzhuanye":stuzhuanye
		 },
		dataType: "json",
		success:function(result){	
			if(result["code"]=="success"){
				var data= result["data"];
				if(data!="[]"){
					for(var p in data){
						var tr ="<tr class='text-c'>";
						tr+="<td><input type='checkbox'></td>";
						tr+="<td >"+p+"<br></td>";
						tr+="<td>"+data[p].name+"</td>";
						tr+="<td>"+data[p].zhuanye+"</td>";
						tr+="<td>"+data[p].connectphone+"</td>";
						tr+="<td>"+data[p].email+"</td>";
						tr+="<td>"+data[p].qq+"</td>";
						tr+="<td>"+data[p].gender+"</td>";
						tr+="<td>"+data[p].techang+"</td></tr>";
						$("#cc_search_stu_table").append(tr);
					}
				}
			}else{
//				alert(result["msg"]);
			}
			},
		error:function(){
//			alert("保存异常");
		}
	});
}


function cc_search_company(){
	var cpname = $("#cc_search_cpname").val();
    $.ajax({
    	url:"http://127.0.0.1:8080/uemanager/cp/getcompanys.do",
    	type: "post",
		data:{"cpname":cpname
		 },
		dataType: "json",
		success:function(result){	
			if(result["code"]=="success"){
				var data= result["data"];
				if(data!="[]"){
					for(var p in data){
						var tr ="<tr class='text-c'>";
						tr+="<td >"+p+"<br></td>";
						tr+="<td>"+data[p].qyname+"</td>";
						tr+="<td>"+data[p].jiancheng+"</td>";
						tr+="<td>"+data[p].businessno+"</td>";
						tr+="<td>"+data[p].addr+"</td>";
						tr+="<td>"+data[p].legalrepresentative+"</td>";
						tr+="<td>"+data[p].email+"</td>";
						tr+="<td>"+data[p].introduction+"</td></tr>";
						$("#cc_search_company_table").append(tr);
					}
				}
			}else{
//				alert(result["msg"]);
			}
			},
		error:function(){
//			alert("保存异常");
		}
	});
}


function deleteCurrentRow(obj){  
    var tr=obj.parentNode.parentNode;  
    var tbody=tr.parentNode;  
    tbody.removeChild(tr);  
    if(tbody.rows.length==1) {  
        tbody.parentNode.removeChild(tbody);  
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