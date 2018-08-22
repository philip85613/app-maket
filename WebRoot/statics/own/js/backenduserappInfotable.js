$(function(){
	function  getPath(){
	     var pathName = document.location.pathname;
	     var index = pathName.substr(1).indexOf("/");
	     var result = pathName.substr(0,index+1);
	     return result;
	}
	
	var table1 = $('#table').bootstrapTable({
	    url: getPath()+'/data2.json',
	    pagination : true,
	    //toolbar: '#toolbar',
	    showColumns: true, 
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
	        field: 'statusId',
	        title: '状态',
	        formatter: function(value,row,index){
	        	return getStatus(value-1);
	        }
	    },{
	        field: 'downloads',
	        title: '下载次数'
	    },{
	        field: 'versionId',
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
		return	['<div class="actions" idValue="\'' + value + '\'">',
		      	 '<a id="formore" class="btn btn-outline dark" data-toggle="modal" href="#responsive"> View Demo </a>',
	             '<button type="button" class="btn btn-circle red-sunglo" id="verify">审核</button></div>'
	             ].join('')
	}
	
	/*$("#formore").click(function(){
		swal("请点击确定完成审核!"); 
	});*/
	
	$(document).on("click","#table .actions #verify",function(){
		//swal("请点击确定完成审核!"); 
		var idValue = $(this).parent().attr("idValue");
		idValue = parseInt(idValue.replace(/[^0-9]/ig,""));
		var newUrl = getPath()+'/appVerify.json?id='+idValue;
		//alert("idValue"+idValue);
		$(this).css("background-color","green");
		$.ajax({
			url:newUrl,
			type:"get",
			//data:,
			dataType:"json",
			success:function(data){
				swal("审核成功!");
				table1.bootstrapTable("refresh",{"url":newUrl});
			}
		});
	});
	
	function getStatus(i){
		var status = ["待审核","审核通过","审核未通过","已上架","已下架"];
		return status[i];
	}
});
