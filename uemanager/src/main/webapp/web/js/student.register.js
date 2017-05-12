/**用户注册**/
function register_user(){
	var username = $("#register_name").val().trim();
	var password = $("#password").val().trim();
	var repeatpwd = $("#repeat_password").val().trim();
	
	var usertype = $("#user_type").find("option:selected").val().trim();
	
	if(password!=repeatpwd){
		alert("两次密码不相同！");
		return;
	}
	//检查该id对应的记录是否存在
	//进行发送请求进行删除数据
	$.ajax({
		url: "http://127.0.0.1:8080/uemanager/user/register.do",
		type: "post",
		data:{
			"username":username,
			"password":password,
			"usertype":usertype,
			"ensurepwd":repeatpwd
		},
		dataType: "json",
		success:function(result){	
			//判断用户类型，跳转至不同的页面
			if(result["code"]=="success"){
				alert("注册成功！");
				window.location.href="http://127.0.0.1:8080/uemanager/web/login.html";
			}else{
				alert(result["msg"]);
			}
		},
		error:function(){
			alert("查询异常");
		}
	});
}


