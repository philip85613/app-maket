$(function(){
	function  getPath(){
	     var pathName = document.location.pathname;
	     var index = pathName.substr(1).indexOf("/");
	     var result = pathName.substr(0,index+1);
	     return result;
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
});