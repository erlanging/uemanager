$(function(){
	$('#switch_qlogin').click(function(){
		$('#switch_login').removeClass("switch_btn_focus").addClass('switch_btn');
		$('#switch_qlogin').removeClass("switch_btn").addClass('switch_btn_focus');
		$('#switch_bottom').animate({left:'0px',width:'70px'});
		$('#qlogin').css('display','none');
		$('#web_qr_login').css('display','block');
		
		});
	$('#switch_login').click(function(){
		
		$('#switch_login').removeClass("switch_btn").addClass('switch_btn_focus');
		$('#switch_qlogin').removeClass("switch_btn_focus").addClass('switch_btn');
		$('#switch_bottom').animate({left:'154px',width:'70px'});
		
		$('#qlogin').css('display','block');
		$('#web_qr_login').css('display','none');
		});
if(getParam("a")=='0')
{
	$('#switch_login').trigger('click');
}
});
	
function logintab(){
	scrollTo(0);
	$('#switch_qlogin').removeClass("switch_btn_focus").addClass('switch_btn');
	$('#switch_login').removeClass("switch_btn").addClass('switch_btn_focus');
	$('#switch_bottom').animate({left:'154px',width:'96px'});
	$('#qlogin').css('display','none');
	$('#web_qr_login').css('display','block');
	
}

//用户登录
function login(){
	var name = $("#login_name").val().trim();
	var pwd = $("#pwd").val().trim();
	
	if(!validateSafeCode()){
		alert("验证码错误");
		return;
	}
	//检查该id对应的记录是否存在
	//进行发送请求进行删除数据
	$.ajax({
		url: "http://127.0.0.1:8080/uemanager/user/login.do",
		type: "post",
		data:{"password":pwd,
				"username":name
			 },
		dataType: "json",
		success:function(result){	
			if(result["code"]=="success"){
				var data= result["data"];
				setCookie("uid",data["uid"],0.1);
//				var stuInfo = result["stuInfo"];
//				var chengjilist = result["chengjilist"]; 
//				setCookie("name",stuInfo["name"],0.1);
//				setCookie("stuid",stuInfo["stuid"],0.1);
//				setCookie("uid",stuInfo["uid"],0.1);
//				setCookie("gender",stuInfo["gender"],0.1);
//				setCookie("birthdate",stuInfo["birthdate"],0.1);
//				setCookie("birthplace",stuInfo["birthplace"],0.1);
//				setCookie("nativeplace",stuInfo["nativeplace"],0.1);
//				setCookie("nation",stuInfo["nation"],0.1);
//				setCookie("studyid",stuInfo["studyid"],0.1);
//				setCookie("identityid",stuInfo["identityid"],0.1);
//				setCookie("identitycardtype",stuInfo["identitycardtype"],0.1);
//				setCookie("politicsstatus",stuInfo["politicsstatus"],0.1);
//				setCookie("healthcondition",stuInfo["healthcondition"],0.1);
//				setCookie("hukouxingzhi",stuInfo["hukouxingzhi"],0.1);
//				setCookie("techang",stuInfo["techang"],0.1);
//				setCookie("addr",stuInfo["addr"],0.1);
//				setCookie("email",stuInfo["email"],0.1);
//				setCookie("zipcode",stuInfo["zipcode"],0.1);
//				setCookie("suozaibanji",stuInfo["suozaibanji"],0.1);
//				setCookie("zhuanye",stuInfo["zhuanye"],0.1);
//				setCookie("susheid",stuInfo["susheid"],0.1);
//				setCookie("zhiwu",stuInfo["zhiwu"],0.1);
//				setCookie("dushengzinv",stuInfo["dushengzinv"],0.1);
//				setCookie("lianxirenname",stuInfo["lianxirenname"],0.1);
//				setCookie("lianxirenage",stuInfo["lianxirenage"],0.1);
//				setCookie("lianxirenphone",stuInfo["lianxirenphone"],0.1);
//				setCookie("qq",stuInfo["qq"],0.1);
//				setCookie("connectphone",stuInfo["connectphone"],0.1);
//				setCookie("lianxirendanwei",stuInfo["lianxirendanwei"],0.1);
//				
//				
//				for(var p in chengjilist){//遍历json数组时，这么写p为索引，0,1
//					alert(chengjilist[p].chjid);
//				}
//				setCookie("chengjilist",chengjilist,0.1);
				if(data["type"]==0){
					window.location.href="http://127.0.0.1:8080/uemanager/web/student.html";
				}else if(data["type"]==1){
					window.location.href="http://127.0.0.1:8080/uemanager/web/company.html";
				}else if(data["type"]==2){
					window.location.href="http://127.0.0.1:8080/uemanager/web/careercenter.html";
				}else if(data["type"]==3){
					window.location.href="http://127.0.0.1:8080/uemanager/web/admin.html";
				}
			}else{
				alert(result["msg"]);
				window.location.href="http://127.0.0.1:8080/uemanager/web/login.html";
			}
			},
		error:function(){
			alert("查询异常");
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

//根据参数名获得该参数 pname等于想要的参数名 
function getParam(pname) { 
    var params = location.search.substr(1); // 获取参数 平且去掉？ 
    var ArrParam = params.split('&'); 
    if (ArrParam.length == 1) { 
        //只有一个参数的情况 
        return params.split('=')[1]; 
    } 
    else { 
         //多个参数参数的情况 
        for (var i = 0; i < ArrParam.length; i++) { 
            if (ArrParam[i].split('=')[0] == pname) { 
                return ArrParam[i].split('=')[1]; 
            } 
        } 
    } 
}  

/***验证码相关***/
function showCheck(a){
	var c = document.getElementById("myCanvas");
    var ctx = c.getContext("2d");
	ctx.clearRect(0,0,1000,1000);
	ctx.font = "80px 'Microsoft Yahei'";
	ctx.fillText(a,0,100);
	ctx.fillStyle = "white";
}
var code;    
function createCode(){       
    code = "";      
    var codeLength = 4;
    var selectChar = new Array(1,2,3,4,5,6,7,8,9,'a','b','c','d','e','f','g','h','j','k','l','m','n','p','q','r','s','t','u','v','w','x','y','z','A','B','C','D','E','F','G','H','J','K','L','M','N','P','Q','R','S','T','U','V','W','X','Y','Z');      
    for(var i=0;i<codeLength;i++) {
       var charIndex = Math.floor(Math.random()*60);      
      code +=selectChar[charIndex];
    }      
    if(code.length != codeLength){      
      createCode();      
    }
    showCheck(code);
}

//验证图形验证码
function validateSafeCode() {
    var inputCode = document.getElementById("J_codetext").value.toUpperCase();
    var codeToUp=code.toUpperCase();
    if(inputCode.length <=0) {
      document.getElementById("J_codetext").setAttribute("placeholder","输入验证码");
      createCode();
      return false;
    }
    else if(inputCode != codeToUp ){
      document.getElementById("J_codetext").value="";
      document.getElementById("J_codetext").setAttribute("placeholder","验证码错误");
      createCode();
      return false;
    }
    else {
//      window.open(document.getElementById("J_down").getAttribute("data-link"));
//      document.getElementById("J_codetext").value="";
//      createCode();
      return true;
    }

}



var reMethod = "GET",
	pwdmin = 6;

$(document).ready(function() {


	$('#reg').click(function() {

		if ($('#user').val() == "") {
			$('#user').focus().css({
				border: "1px solid red",
				boxShadow: "0 0 2px red"
			});
			$('#userCue').html("<font color='red'><b>×用户名不能为空</b></font>");
			return false;
		}



		if ($('#user').val().length < 4 || $('#user').val().length > 16) {

			$('#user').focus().css({
				border: "1px solid red",
				boxShadow: "0 0 2px red"
			});
			$('#userCue').html("<font color='red'><b>×用户名位4-16字符</b></font>");
			return false;

		}
		$.ajax({
			type: reMethod,
			url: "/member/ajaxyz.php",
			data: "uid=" + $("#user").val() + '&temp=' + new Date(),
			dataType: 'html',
			success: function(result) {

				if (result.length > 2) {
					$('#user').focus().css({
						border: "1px solid red",
						boxShadow: "0 0 2px red"
					});$("#userCue").html(result);
					return false;
				} else {
					$('#user').css({
						border: "1px solid #D7D7D7",
						boxShadow: "none"
					});
				}

			}
		});


		if ($('#passwd').val().length < pwdmin) {
			$('#passwd').focus();
			$('#userCue').html("<font color='red'><b>×密码不能小于" + pwdmin + "位</b></font>");
			return false;
		}
		if ($('#passwd2').val() != $('#passwd').val()) {
			$('#passwd2').focus();
			$('#userCue').html("<font color='red'><b>×两次密码不一致！</b></font>");
			return false;
		}

		var sqq = /^[1-9]{1}[0-9]{4,9}$/;
		if (!sqq.test($('#qq').val()) || $('#qq').val().length < 5 || $('#qq').val().length > 12) {
			$('#qq').focus().css({
				border: "1px solid red",
				boxShadow: "0 0 2px red"
			});
			$('#userCue').html("<font color='red'><b>×QQ号码格式不正确</b></font>");return false;
		} else {
			$('#qq').css({
				border: "1px solid #D7D7D7",
				boxShadow: "none"
			});
			
		}

		$('#regUser').submit();
	});
	

});