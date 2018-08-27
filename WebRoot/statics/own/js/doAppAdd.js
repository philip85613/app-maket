$(function(){
	//alert("123");
	function  getPath(){
	     var pathName = document.location.pathname;
	     var index = pathName.substr(1).indexOf("/");
	     var result = pathName.substr(0,index+1);
	     return result;
	}
	//获取平台名字
	var url = getPath()+"/getAppFlatform.json"
	$.getJSON(url,success);
	function success(data){
		$(".form-control-appFlatform").empty();
		var str = "<option value=''>--请选择--</option>";
		for (var i=0;i<data.length;i++) {
			str += "<option value='"+i+"'>"+data[i].app_Flatform+"</option>";
		}
		$(".form-control-appFlatform").append(str);
	}
	
	$("#addappform #softwareName").blur(function(){
		var softwareName = $("#softwareName").val();
		if(softwareName==""){
			swal("软件名称不能为空!");
			return false;
		}
		$.ajax({
			url:getPath()+"/verifySoftwareName.json?softwareName="+softwareName,
			type:"get",
			dataType:"json",
			success:function(data){
				swal(data.msg);
			}
		});
	});
	//图片上传
	$("#test-upload").fileinput({
		uploadUrl: getPath()+'/fileUpload.json',
		language: 'zh',
		maxFileSize:500,//单位为kb，如果为0表示不限制文件大小
		maxFileCount:10, //表示允许同时上传的最大文件个数
    	allowedFileExtensions: ['jpg', 'gif', 'png']
    	//enctype:'multipart/form-data'
    }).on("fileuploaded",function(event, data, previewId, index) {    
    	//console.log(data.response.logoLocPath);
    	$("#logoLocPath").val(data.response.logoLocPath);
    	$("#logoPicPath").val(data.response.logoPicPath);
    });
	//APK上传
	$("#file-upload").fileinput({
		uploadUrl: getPath()+'/apkFileUpload.json',
		language: 'zh',
		maxFileSize:0,//单位为kb，如果为0表示不限制文件大小
		maxFileCount:1, //表示允许同时上传的最大文件个数
    	allowedFileExtensions: ['apk']
    	//enctype:'multipart/form-data'
    }).on("fileuploaded",function(event, data, previewId, index) {    
    	//console.log(data.response.logoLocPath);
    	$("#fileLocPath").val(data.response.fileLocPath);
    	$("#filePath").val(data.response.filePath);
    });
});