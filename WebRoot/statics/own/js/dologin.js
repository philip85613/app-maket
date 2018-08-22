$(function(){
	$("#devCode").blur(function(){
		if($(this).val()==null || $(this).val()==""){
			$(this).next().text("请输入用户名!");
		}
	});
	
	$("#devPassword").blur(function(){
		if($(this).val()==null || $(this).val()==""){
			$(this).next().text("请输入密码!");
		}
	});
});