$(function(){
	function  getPath(){
	     var pathName = document.location.pathname;
	     var index = pathName.substr(1).indexOf("/");
	     var result = pathName.substr(0,index+1);
	     return result;
	}
	
	var table1 = $('#table').bootstrapTable({
	    url: getPath()+'/data1.json',
	    pagination : true,
	    showColumns: true, 
	    toolbar: '#toolbar',
	    showRefresh: true,
	    search: true,
	    showToggle:true,                  
	    sortable: true,
	    editable : true,
		sortOrder: "desc",
	    columns: [{
	        field: 'softwareName',
	        title: '软件名称',
	        width: 120
	    }, {
	        field: 'aPKName',
	        title: 'APK名称',
	        width: 70
	    }, {
	        field: 'softwareSize',
	        title: '软件大小(单位:M)',
	        width: 100,
	    },{
	        field: 'flatformId',
	        title: '所属平台',
	        width: 80,
	        formatter: function(value,row,index){
	        	if(value===1){
	        		return "手机";
	        	}
	        	if(value===2){
	        		return "平板";
	        	}
	        	if(value===3){
	        		return "通用";
	        	}
	        }
	    },{
	        field: 'statusName',
	        title: '状态'
	        /*formatter: function(value,row,index){
	        	return getStatus(value-1);
	        }*/
	        /*function(value,row,index){
	        	if(value===1){
	        		return "待审核";
	        	}
	        	if(value===2){
	        		return "审核通过";
	        	}
	        	if(value===3){
	        		return "审核未通过";
	        	}
	        	if(value===4){
	        		return "已上架";
	        	}
	        	if(value===5){
	        		return "已下架";
	        	}
	        }*/
	    },{
	        field: 'downloads',
	        title: '下载次数'
	    },{
	        field: 'versionName',
	        title: '最新版本号',
	        sortable: true,
	        width: 80
	    },{
	        field: 'id',
	        title: '操作',
	        width: 40,
	        formatter: operateFormatter
	    }]
	});
	
	function operateFormatter(value, row, index) {
		console.log("value "+value);
        console.log("row "+row);
        console.log("index "+index);
		if (row['statusId'] === 1 || row['statusId'] === 3) {
			return	['<div class="actions"><div class="btn-group" idValue="\'' + value + '\'">',
		             '<a class="btn btn-sm green dropdown-toggle" href="javascript:;" data-toggle="dropdown">点击操作<i class="fa fa-angle-down"></i></a>',
		             '<ul class="dropdown-menu pull-right">',
		             '<li class="appModify"><a href="javascript:;"><i class="fa fa-pencil"></i> 修改 </a></li>',
		             '<li class="appView"><a href="javascript:;"><i class="fa fa-trash-o"></i> 查看 </a></li>',
		             '<li class="appVersionModify"><a href="javascript:;"><i class="fa fa-ban"></i> 修改版本 </a></li>',
		             '<li class="appVersionAdd"><a href="javascript:;"><i class="fa fa-ban"></i> 新增版本 </a></li>',
		             '<li class="appDelete"><a href="javascript:;"><i class="fa fa-ban"></i> 删除 </a></li>',
		             '<li class="divider"> </li>',
		             '</ul></div></div>'
		             ].join('')
	    }
		if (row['statusId'] === 2) {
			return	['<div class="actions"><div class="btn-group" idValue="\'' + value + '\'">',
		             '<a class="btn btn-sm green dropdown-toggle" href="javascript:;" data-toggle="dropdown">点击操作<i class="fa fa-angle-down"></i></a>',
		             '<ul class="dropdown-menu pull-right">',
		             '<li class="appModify"><a href="javascript:;"><i class="fa fa-pencil"></i> 修改 </a></li>',
		             '<li class="appView"><a href="javascript:;"><i class="fa fa-trash-o"></i> 查看 </a></li>',
		             '<li class="appShangJia"><a href="javascript:;"><i class="fa fa-pencil"></i> 上架 </a></li>',
		             '<li class="appVersionModify"><a href="javascript:;"><i class="fa fa-ban"></i> 修改版本 </a></li>',
		             '<li class="appVersionAdd"><a href="javascript:;"><i class="fa fa-ban"></i> 新增版本 </a></li>',
		             '<li class="appDelete"><a href="javascript:;"><i class="fa fa-ban"></i> 删除 </a></li>',
		             '<li class="divider"> </li>',
		             '</ul></div></div>'
		             ].join('')
		}
	    if (row['statusId'] === 4) {
	    	return ['<div class="actions"><div class="btn-group" idValue="\'' + value + '\'">',
             '<a class="btn btn-sm green dropdown-toggle" href="javascript:;" data-toggle="dropdown">点击操作<i class="fa fa-angle-down"></i></a>',
             '<ul class="dropdown-menu pull-right">',
             '<li class="appModify"><a href="javascript:;"><i class="fa fa-pencil"></i> 修改 </a></li>',
             '<li class="appView"><a href="javascript:;"><i class="fa fa-trash-o"></i> 查看 </a></li>',
             '<li class="appXiaJia"><a href="javascript:;"><i class="fa fa-trash-o"></i> 下架 </a></li>',
             '<li class="appVersionModify"><a href="javascript:;"><i class="fa fa-ban"></i> 修改版本 </a></li>',
             '<li class="appVersionAdd"><a href="javascript:;"><i class="fa fa-ban"></i> 新增版本 </a></li>',
             '<li class="appDelete"><a href="javascript:;"><i class="fa fa-ban"></i> 删除 </a></li>',
             '<li class="divider"> </li>',
             '</ul></div></div>'
             ].join('')
	    }
	    if (row['statusId'] === 5) {
	    	return ['<div class="actions"><div class="btn-group" idValue="\'' + value + '\'">',
             '<a class="btn btn-sm green dropdown-toggle" href="javascript:;" data-toggle="dropdown">点击操作<i class="fa fa-angle-down"></i></a>',
             '<ul class="dropdown-menu pull-right">',
             '<li class="appModify"><a href="javascript:;"><i class="fa fa-pencil"></i> 修改 </a></li>',
             '<li class="appView"><a href="javascript:;"><i class="fa fa-trash-o"></i> 查看 </a></li>',
             '<li class="appShangJia"><a href="javascript:;"><i class="fa fa-pencil"></i> 上架 </a></li>',
             '<li class="appVersionModify"><a href="javascript:;"><i class="fa fa-ban"></i> 修改版本 </a></li>',
             '<li class="appVersionAdd"><a href="javascript:;"><i class="fa fa-ban"></i> 新增版本 </a></li>',
             '<li class="appDelete"><a href="javascript:;"><i class="fa fa-ban"></i> 删除 </a></li>',
             '<li class="divider"> </li>',
             '</ul></div></div>'
             ].join('')
	    }
	}
	$(document).on("click","#table li.appDelete",function(){
		var idValue = $(this).parent().parent().attr("idValue");
		idValue = parseInt(idValue.replace(/[^0-9]/ig,""));
		var newUrl = getPath()+'/appDelete.json?id='+idValue;
		$(this).css("background-color","red");
		swal({
			  title: "您确定要删除吗?",
			  text: "您将无法恢复这条数据!",
			  type: "warning",
			  showCancelButton: true,
			  confirmButtonClass: "btn-danger",
			  confirmButtonText: "是的,我要删除!",
			  cancelButtonText: "不删了!",
			  closeOnConfirm: false,
			  closeOnCancel: false
			},
			function(isConfirm) {
			  if (isConfirm) {
				   $.ajax({
						url:newUrl,
						type:"get",
						//data:,
						dataType:"json",
						success:function(data){
							//table1.bootstrapTable("refresh",{"url":getPath()+"/dev/appinfo"});
							table1.bootstrapTable("refresh",{"url":newUrl});
							//$("#table").bootstrapTable('load', data);
							//window.location.href="appinfo";
						}
					});
			    swal("删除成功!", "第二行文字", "success");
			  } else {
			    swal("已取消", "第二行文字", "error");
			  }
		});
	});
	
	$(document).on("click","#table li.appView",function(){
		var idValue = $(this).parent().parent().attr("idValue");
		idValue = parseInt(idValue.replace(/[^0-9]/ig,""));
		//alert(idValue);
		$(this).css("background-color","pink");
		$.ajax({
			url:getPath()+'/appViewAndModify.json?id='+idValue,
			type:"get",
			//data:,
			dataType:"json",
			success:function(data){
				console.log(data);
				$(".col-md-12").hide();
				$(".col-lg-4").hide();
				$(".form-actions #save").hide();
				$("#softwareName").val(data.softwareName);
				$("#flatformId").val(data.flatformId);
				$("#APKName").val(data.aPKName);
				$("#supportROM").val(data.supportROM);
				$("#interfaceLanguage").val(data.interfaceLanguage);
				$("#downloads").val(data.downloads);
				$("#statusId").val(data.statusId);
				$("#appInfo").val(data.appInfo);
				$("#softwareSize").val(data.softwareSize);
				$("#appInfoDetail").show();
				console.log("data.softwareName");
				console.log(data.softwareName);
			}
		});
	});
	
	$(document).on("click","#table li.appModify",function(){
		var idValue = $(this).parent().parent().attr("idValue");
		idValue = parseInt(idValue.replace(/[^0-9]/ig,""));
		$(this).css("background-color","green");
		$.ajax({
			url:getPath()+'/appViewAndModify.json?id='+idValue,
			type:"get",
			//data:,
			dataType:"json",
			success:function(data){
				//alert("即将跳转查看页面!");
				$(".col-md-12").hide();
				$(".col-lg-4").hide();
				$("#appId").val(data.id);
				$("#softwareName").val(data.softwareName);
				$("#APKName").val(data.aPKName);
				$("#flatformId").val(data.flatformId);
				$("#supportROM").val(data.supportROM);
				$("#interfaceLanguage").val(data.interfaceLanguage);
				$("#downloads").val(data.downloads);
				$("#statusId").val(data.statusId);
				$("#appInfo").val(data.appInfo);
				$("#softwareSize").val(data.softwareSize);
				$("#appInfoDetail").show();
				console.log("data.softwareName");
				console.log(data.softwareName);
			}
		});
	});
	
	$("#searchButton").click(function(){
		var data = $("#searchForm").find(":input").val();
		var newUrl = getPath() + "/queryAppInfo.json?softwareName=" + data;
		//alert("url "+newUrl);
		table1.bootstrapTable("refresh",{"url":newUrl});
	});
	
	$("#save").click(function(){
		var data = $("#modifyForm").serialize();
		console.log(data);
		var newUrl = getPath() + "/doAppModify.json?" + data;
		//alert("url "+newUrl);
		$(".col-md-12").show();
		$("#appInfoDetail").hide();
		table1.bootstrapTable("refresh",{"url":newUrl});
		//window.location.href="appinfo";
	});
	
	$(document).on("click","#table li.appShangJia",function(){
		//swal("请点击确定完成审核!"); 
		var idValue = $(this).parent().parent().attr("idValue");
		idValue = parseInt(idValue.replace(/[^0-9]/ig,""));
		var newUrl = getPath()+'/appShangJia.json?id='+idValue;
		//alert("idValue"+idValue);
		$(this).css("background-color","green");
		$.ajax({
			url:newUrl,
			type:"get",
			//data:,
			dataType:"json",
			success:function(data){
				swal("APP上架成功!");
				table1.bootstrapTable("refresh",{"url":newUrl});
			}
		});
	});
	
	$(document).on("click","#table li.appXiaJia",function(){
		//swal("请点击确定完成审核!"); 
		var idValue = $(this).parent().parent().attr("idValue");
		idValue = parseInt(idValue.replace(/[^0-9]/ig,""));
		var newUrl = getPath()+'/appXiaJia.json?id='+idValue;
		//alert("idValue"+idValue);
		$(this).css("background-color","green");
		$.ajax({
			url:newUrl,
			type:"get",
			//data:,
			dataType:"json",
			success:function(data){
				swal("APP下架成功!");
				table1.bootstrapTable("refresh",{"url":newUrl});
			}
		});
	});
	
	
	function getStatus(i){
		var status = ["待审核","审核通过","审核未通过","已上架","已下架"];
		return status[i];
	}
});
