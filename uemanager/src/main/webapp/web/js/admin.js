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


function admin_search_company(){
	var cpname = $("#admin_search_cpname").val();
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
						$("#admin_search_company_table").append(tr);
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

function admin_search_stu(){
	var stuname = $("#admin_search_stuname").val();
	var stuzhuanye = $("#admin_search_zhuanye").val();
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
						$("#admin_search_stu_table").append(tr);
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

function admin_search_zhaopin(){
	var job = $("#admin_serach_job").val();
    $.ajax({
    	url:"http://127.0.0.1:8080/uemanager/stu/searchjob.do",
    	type: "post",
		data:{"job":job
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
						tr+="<td>"+data[p].xueli+"</td>";
						tr+="<td>"+data[p].workplace+"</td>";
						tr+="<td>"+data[p].publishtime+"</td>";
						tr+="<td>"+data[p].gangweizhize+"</td>";
						tr+="<td>"+data[p].gangweiyaoqiu+"</td>";
						tr+="<td>"+data[p].jinengyaoqiu+"</td></tr>";
						$("#admin_search_job_table").append(tr);
					}
				}
			}else{
				alert("系统繁忙，稍后重试");
			}
			},
		error:function(){
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