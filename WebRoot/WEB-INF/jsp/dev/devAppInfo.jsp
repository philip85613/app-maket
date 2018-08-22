<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html lang="en">
    <head>
        <meta charset="utf-8" />
        <title>APP开发者平台</title>
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta content="width=device-width, initial-scale=1" name="viewport" />
        <meta content="Preview page of Metronic Admin RTL Theme #1 for statistics, charts, recent events and reports" name="description" />
        <meta content="" name="author" />
        <!-- BEGIN GLOBAL MANDATORY STYLES -->
        <link href="http://fonts.googleapis.com/css?family=Open+Sans:400,300,600,700&subset=all" rel="stylesheet" type="text/css" />
        <link href="${pageContext.request.contextPath }/statics/assets/bootstrap-fileinput/css/fileinput.css" media="all" rel="stylesheet" type="text/css"/>
        <link href="${pageContext.request.contextPath }/statics/assets/bootstrap-fileinput/css/fileinput.min.css" media="all" rel="stylesheet" type="text/css"/>
		<link href="${pageContext.request.contextPath }/statics/assets/bootstrap-fileinput/themes/explorer/theme.css" media="all" rel="stylesheet" type="text/css"/>
        <link href="${pageContext.request.contextPath }/statics/assets/global/plugins/bootstrap-sweetalert/sweetalert.css" rel="stylesheet" type="text/css" />
        <link href="${pageContext.request.contextPath }/statics/assets/global/plugins/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css" />
        <link href="${pageContext.request.contextPath }/statics/assets/global/plugins/simple-line-icons/simple-line-icons.min.css" rel="stylesheet" type="text/css" />
        <link href="${pageContext.request.contextPath }/statics/assets/global/plugins/bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css" />
        <link href="${pageContext.request.contextPath }/statics/assets/global/plugins/bootstrap-switch/css/bootstrap-switch.min.css" rel="stylesheet" type="text/css" />
        <!-- END GLOBAL MANDATORY STYLES -->
        <!-- BEGIN PAGE LEVEL PLUGINS -->
        <link href="${pageContext.request.contextPath }/statics/assets/global/plugins/bootstrap-daterangepicker/daterangepicker.min.css" rel="stylesheet" type="text/css" />
        <link href="${pageContext.request.contextPath }/statics/assets/global/plugins/morris/morris.css" rel="stylesheet" type="text/css" />
        <link href="${pageContext.request.contextPath }/statics/assets/global/plugins/fullcalendar/fullcalendar.min.css" rel="stylesheet" type="text/css" />
        <link href="${pageContext.request.contextPath }/statics/assets/global/plugins/jqvmap/jqvmap/jqvmap.css" rel="stylesheet" type="text/css" />
        <!-- END PAGE LEVEL PLUGINS -->
        <!-- BEGIN THEME GLOBAL STYLES -->
        <link href="${pageContext.request.contextPath }/statics/assets/global/css/components.min.css" rel="stylesheet" id="style_components" type="text/css" />
        <link href="${pageContext.request.contextPath }/statics/assets/global/css/plugins.min.css" rel="stylesheet" type="text/css" />
        <!-- END THEME GLOBAL STYLES -->
        <!-- BEGIN THEME LAYOUT STYLES -->
        <link href="${pageContext.request.contextPath }/statics/assets/layouts/layout2/css/layout.min.css" rel="stylesheet" type="text/css" />
        <link href="${pageContext.request.contextPath }/statics/assets/layouts/layout2/css/themes/blue.min.css" rel="stylesheet" type="text/css" id="style_color" />
        <link href="${pageContext.request.contextPath }/statics/assets/layouts/layout2/css/custom.min.css" rel="stylesheet" type="text/css" />
		<link rel="stylesheet" href="${pageContext.request.contextPath }/statics/assets/bootstrap-table/bootstrap-table.css">
		<link href="${pageContext.request.contextPath }/statics/own/owncss.css" rel="stylesheet" type="text/css" />
        <!-- END THEME LAYOUT STYLES -->
        <link rel="shortcut icon" href="favicon.ico" /> </head>
    <!-- END HEAD -->
	
    <body class="page-header-fixed page-sidebar-closed-hide-logo page-content-white">
    	<!-- <div class="modal fade draggable-modal" id="draggable" tabindex="-1" role="basic" aria-hidden="true"> -->
    	<div class="modal fade bs-modal-lg" id="large" tabindex="-1" role="dialog" aria-hidden="true">
		    <div class="modal-dialog">
			    <div class="modal-content">
			        <div class="modal-header">
			            <button type="button" class="close" data-dismiss="modal" aria-hidden="true"></button>
			            <h4 class="modal-title">新增APP</h4>
			        </div>
			        <div class="portlet-body">
                       <!-- BEGIN FORM-->
                       <form action="${pageContext.request.contextPath }/doAppAdd" enctype="multipart/form-data" id="addappform" class="form-horizontal" method="post">
                           <div class="form-body">
                               <div class="form-group">
                                   <label class="control-label col-md-3">软件名称
                                       <span class="required"> * </span>
                                   </label>
                                   <div class="col-md-4">
                                       <input type="text" name="softwareName" data-required="1" class="form-control" id="softwareName" required="required"/></div>
                               </div>
                               <div class="form-group">
                                   <label class="control-label col-md-3">APK名称
                                       <span class="required"> * </span>
                                   </label>
                                   <div class="col-md-4">
                                       <input type="text" name="APKName" data-required="1" class="form-control" id="APKName" required="required"/></div>
                               </div>
                               <div class="form-group">
                                   <label class="control-label col-md-3">支持ROM
                                       <span class="required"> * </span>
                                   </label>
                                   <div class="col-md-4">
                                       <input name="supportROM" type="text" class="form-control" id="supportROM" required="required"/></div>
                               </div>
                               <div class="form-group">
                                   <label class="control-label col-md-3">界面语言
                                       <span class="required"> * </span>
                                   </label>
                                   <div class="col-md-4">
                                       <input name="interfaceLanguage" type="text" class="form-control" id="interfaceLanguage" required="required"/>
                                   </div>
                               </div>
                               <div class="form-group">
                                   <label class="control-label col-md-3">软件大小
                                       <span class="required"> * </span>
                                   </label>
                                   <div class="col-md-4">
                                       <input name="softwareSize" type="text" class="form-control" id="softwareSize" required="required"/></div>
                               </div>
                               <div class="form-group">
                                   <label class="control-label col-md-3">下载次数
                                       <span class="required"> * </span>
                                   </label>
                                   <div class="col-md-4">
                                       <input name="downloads" type="text" class="form-control" id="downloads" required="required"/></div>
                               </div>
                               <!-- <div class="form-group">
                                   <label class="control-label col-md-3">所属平台
                                       <span class="required"> * </span>
                                   </label>
                                   <div class="col-md-4">
                                       <select class="form-control" name="select">
                                           <option value="">--请选择--</option>
                                           <option value="Category 1">Category 1</option>
                                           <option value="Category 2">Category 2</option>
                                           <option value="Category 3">Category 5</option>
                                           <option value="Category 4">Category 4</option>
                                       </select>
                                   </div>
                               </div>
                               <div class="form-group">
                                   <label class="control-label col-md-3">一级分类
                                       <span class="required"> * </span>
                                   </label>
                                   <div class="col-md-4">
                                       <select class="form-control" name="select">
                                           <option value="">--请选择--</option>
                                           <option value="Category 1">Category 1</option>
                                           <option value="Category 2">Category 2</option>
                                           <option value="Category 3">Category 5</option>
                                           <option value="Category 4">Category 4</option>
                                       </select>
                                   </div>
                               </div>
                               <div class="form-group">
                                   <label class="control-label col-md-3">二级分类
                                       <span class="required"> * </span>
                                   </label>
                                   <div class="col-md-4">
                                       <select class="form-control" name="select">
                                           <option value="">--请选择--</option>
                                           <option value="Category 1">Category 1</option>
                                           <option value="Category 2">Category 2</option>
                                           <option value="Category 3">Category 5</option>
                                           <option value="Category 4">Category 4</option>
                                       </select>
                                   </div>
                               </div>
                               <div class="form-group">
                                   <label class="control-label col-md-3">三级分类
                                       <span class="required"> * </span>
                                   </label>
                                   <div class="col-md-4">
                                       <select class="form-control" name="select">
                                           <option value="">--请选择--</option>
                                           <option value="Category 1">Category 1</option>
                                           <option value="Category 2">Category 2</option>
                                           <option value="Category 3">Category 5</option>
                                           <option value="Category 4">Category 4</option>
                                       </select>
                                   </div>
                               </div> -->
                               <div class="form-group">
                                   <label class="control-label col-md-3">APP状态
                                       <span class="required"> * </span>
                                   </label>
                                   <div class="col-md-4">
                                       	待审核 
                                   </div>
                               </div>
                               <div class="form-group">
                                   <label class="control-label col-md-3">应用简介
                                       <span class="required"> * </span>
                                   </label>
                                   <div class="col-md-4">
                                       <input type="text" name="appInfo" data-required="1" class="form-control" id="appInfo" required="required"/></div>
                               </div>
                               <div class="form-group">
                               	<label class="control-label col-md-3">LOGO图片
                                       <span class="required"> * </span>
                                   </label>
                                   <div class="col-md-4">
                                       <input type="hidden" id="logoLocPath" name="logoLocPath" value="">
                                       <input type="hidden" id="logoPicPath" name="logoPicPath" value="">
                                       <input type="file" id="test-upload" name="myAppPic" multiple class="file-loading" ref=""/> 
                                   </div>
                               </div>
                           </div>
                           <div class="form-actions">
                               <div class="row">
                                   <div class="col-md-offset-3 col-md-9">
                                       <button type="submit" class="btn green" id="addsave">保存</button>
                                       <a type="button" href="${pageContext.request.contextPath }/dev/appinfo"
                                       	class="btn grey-salsa btn-outline">返回</a>
                                   </div>
                               </div>
                           </div>
                       </form>
                       <!-- END FORM-->
                   </div>
			    </div>
			    <!-- /.modal-content -->
			</div>
			<!-- /.modal-dialog -->
		</div>
    	<%@include file="../common/header.jsp" %>
        <div class="page-wrapper">
            <!-- BEGIN HEADER & CONTENT DIVIDER -->
            <div class="clearfix"> </div>
            <!-- END HEADER & CONTENT DIVIDER -->
            <!-- BEGIN CONTAINER -->
            <div class="page-container" style="margin-top: 0px;">
            <%@include file="../common/sidebar.jsp" %>
                <!-- BEGIN CONTENT -->
                <div class="page-content-wrapper">
                    <!-- BEGIN CONTENT BODY -->
                    <div class="page-content">
                        <!-- BEGIN PAGE TITLE-->
                        <h1 class="page-title"> APP信息管理维护
                            <small>${devUserSession.devName }-您可以通过搜索或者其他的筛选选项对APP的信息进行修改.删除等管理操作^_^</small>
                        </h1>
                       <div class="row">
                        <div class="col-lg-4">
                        <form action="" method="get" id="searchForm">
                            <div class="search-filter " style="width:880px;">
                            <ul>
                            	<li>
                            		<div class="search-label uppercase">软件名称</div>
                                	<div class="input-icon right">
                                    <i class="icon-magnifier"></i>
                                    <input type="text" class="form-control" placeholder="请输入软件名称"> </div>
                            	</li>
                            	<!-- <li>
                            		<div class="search-label uppercase">APP状态</div>
	                                <select class="form-control">
	                                	<option value="">--请选择--</option>
	                                    <option>Option 1</option>
	                                    <option>Option 2</option>
	                                    <option>Option 3</option>
	                                    <option>Option 4</option>
	                                    <option>Option 5</option>
	                                </select>
                            	</li>
                            	<li>
                            		<div class="search-label uppercase">所属平台</div>
	                                <select class="form-control">
	                                	<option value="">--请选择--</option>
	                                    <option>Option 1</option>
	                                    <option>Option 2</option>
	                                    <option>Option 3</option>
	                                    <option>Option 4</option>
	                                    <option>Option 5</option>
	                                </select>
                            	</li>
                            	<li>
                            		<div class="search-label uppercase">一级分类</div>
		                                <select class="form-control">
		                                	<option value="">--请选择--</option>
		                                    <option>Option 1</option>
		                                    <option>Option 2</option>
		                                    <option>Option 3</option>
		                                    <option>Option 4</option>
		                                    <option>Option 5</option>
	                                	</select>
                            	</li>
                            	<li>
                            		<div class="search-label uppercase">二级分类</div>
	                                	<select class="form-control">
	                                		<option value="">--请选择--</option>
		                                    <option>Option 1</option>
		                                    <option>Option 2</option>
		                                    <option>Option 3</option>
		                                    <option>Option 4</option>
		                                    <option>Option 5</option>
	                               		</select>
                            	</li>
                            	<li>
                            		<div class="search-label uppercase">三级分类</div>
	                                <select class="form-control">
	                                	<option value="">--请选择--</option>
	                                    <option>Option 1</option>
	                                    <option>Option 2</option>
	                                    <option>Option 3</option>
	                                    <option>Option 4</option>
	                                    <option>Option 5</option>
	                                </select>
                            	</li> -->
                            	<li>
									<button type="button" id="searchButton" class="btn green bold uppercase btn-block" style="width:50px;">查询</button>                            	
                            	</li>
                            </ul>
                                <div class="search-filter-divider bg-grey-steel"></div>
                            </div>
                            </form>
                          </div>
                        <div class="col-md-12">
                            <!-- BEGIN EXAMPLE TABLE PORTLET-->
                            <div class="portlet light">
                                <div class="portlet-body">
                                    <div class="table-toolbar">
                                        <div class="row">
                                            <div class="col-md-6">
                                                <div class="btn-group">
                                                    <a href="${pageContext.request.contextPath }/dev/toappinfoadd" id="sample_editable_1_new" class="btn sbold green"> 新增APP基础信息
                                                        <i class="fa fa-plus"></i>
                                                    </a>
                                                </div>
                                                <div id="toolbar" class="btn-group btn-group-solid">
													<!-- <button type="button" class="btn red" id="add"> -->
														<!-- <i class="fa fa-user-plus"></i>  -->
														<a class="btn purple btn-outline sbold" data-toggle="modal" href="#large"> 新增 </a>
													<!-- </button> -->
													<button type="button" class="btn green" id="modify">
														<i class="fa fa-user"></i> 修改
													</button>
													<button type="button" class="btn purple" id="remove">
														<i class="fa fa-user-times"></i> 删除
													</button>
													<button type="button" class="btn yellow" id="refresh">
														<i class="fa fa-refresh"></i> 刷新
													</button>
												</div>
                                            </div>
                                        </div>
                                    </div>
                                    <table class="table table-striped table-bordered table-hover table-checkable order-column" id="table">
                                    </table>
                                </div>
                            </div>
                            <!-- END VALIDATION STATES-->
                        </div>
                        <div class="col-md-12 "  id="appInfoDetail" style="display: none">
                            <!-- BEGIN VALIDATION STATES-->
                            <div class="portlet light portlet-fit portlet-form ">
                                <div class="portlet-title">
                                    <div class="caption">
                                        <i class="icon-settings font-red"></i>
                                        <span class="caption-subject font-red sbold uppercase">APP详细信息 | ${devUserSession.devName }</span>
                                    </div>
                                </div>
                                <div class="portlet-body">
                                    <!-- BEGIN FORM-->
                                    <form action="" id="modifyForm" class="form-horizontal" method="post">
                                        <div class="form-body">
                                        	<input type="hidden" name="id" data-required="1" class="form-control" id="appId"/>
                                            <div class="form-group">
                                                <label class="control-label col-md-3">软件名称
                                                    <span class="required"> * </span>
                                                </label>
                                                <div class="col-md-4">
                                                    <input type="text" name="softwareName" data-required="1" class="form-control" id="softwareName" value=""/> </div>
                                            </div>
                                            <div class="form-group">
                                                <label class="control-label col-md-3">APK名称
                                                    <span class="required"> * </span>
                                                </label>
                                                <div class="col-md-4">
                                                    <input type="text" name="APKName" data-required="1" class="form-control" id="APKName" value=""/> </div>
                                            </div>
                                            <div class="form-group">
                                                <label class="control-label col-md-3">支持ROM
                                                    <span class="required"> * </span>
                                                </label>
                                                <div class="col-md-4">
                                                    <input name="supportROM" type="text" class="form-control" id="supportROM" value=""/> </div>
                                            </div>
                                            <div class="form-group">
                                                <label class="control-label col-md-3">界面语言
                                                    <span class="required"> * </span>
                                                </label>
                                                <div class="col-md-4">
                                                    <input name="interfaceLanguage" type="text" class="form-control" id="interfaceLanguage" value=""/>
                                                </div>
                                            </div>
                                            <div class="form-group">
                                                <label class="control-label col-md-3">软件大小(单位M)
                                                    <span class="required"> * </span>
                                                </label>
                                                <div class="col-md-4">
                                                    <input name="softwareSize" type="text" class="form-control" id="softwareSize" value=""/></div>
                                            </div>
                                            <div class="form-group">
                                                <label class="control-label col-md-3">下载次数
                                                    <span class="required"> * </span>
                                                </label>
                                                <div class="col-md-4">
                                                    <input name="downloads" type="text" class="form-control" id="downloads" value=""/></div>
                                            </div>
                                            <div class="form-group">
                                                <label class="control-label col-md-3">APP状态
                                                    <span class="required"> * </span>
                                                </label>
                                                <div class="col-md-4">
                                                    	<input name="statusId" type="text" class="form-control" id="statusId" value=""/> </div>
                                                </div>
                                            </div>
                                            <div class="form-group">
                                                <label class="control-label col-md-3">所属平台
                                                    <span class="required"> * </span>
                                                </label>
                                                <div class="col-md-4">
                                                    	<input name="flatformId" type="text" class="form-control" id="flatformId" value=""/> </div>
                                                </div>
                                            </div>
                                            <div class="form-group">
                                                <label class="control-label col-md-3">应用简介
                                                    <span class="required"> * </span>
                                                </label>
                                                <div class="col-md-4">
                                                    <!-- <input type="textarea" name="appInfo" data-required="1" class="form-control" id="softwareName" value="" readonly="readonly"/> -->
                                                    <textarea name="appInfo"  style="width:340px;height:80px;" id="appInfo" value=""></textarea>
                                                 </div>
                                            </div>
                                        </div>
                                        <div class="form-actions">
                                            <div class="row">
                                                <div class="col-md-offset-3 col-md-9">
                                                	<button type="button" class="btn green" id="save">保存</button>
                                                    <a type="button" href="${pageContext.request.contextPath }/dev/appinfo"
                                                    	class="btn grey-salsa btn-outline">返回</a>
                                                </div>
                                            </div>
                                        </div>
                                      </form>
                                    <!-- END FORM-->
                                </div>
                            </div>
                            <!-- END EXAMPLE TABLE PORTLET-->
                        </div>
                    </div>
                    </div>
                    <!-- END CONTENT BODY -->
                </div>
                <!-- END CONTENT -->
                <!-- BEGIN QUICK SIDEBAR -->
                <a href="javascript:;" class="page-quick-sidebar-toggler">
                    <i class="icon-login"></i>
                </a>
                <!-- END QUICK SIDEBAR -->
            </div>
            <!-- END CONTAINER -->
            <!-- BEGIN FOOTER -->
            <div class="page-footer">
                <div class="page-footer-inner" style="text-align:center"> 2018 &copy; All Rights Reserved</div>
                <div class="scroll-to-top">
                    <i class="icon-arrow-up"></i>
                </div>
            </div>
            <!-- END FOOTER -->
        </div>
        <!--[if lt IE 9]>
<script src="${pageContext.request.contextPath }/statics/assets/global/plugins/respond.min.js"></script>
<script src="${pageContext.request.contextPath }/statics/assets/global/plugins/excanvas.min.js"></script> 
<script src="${pageContext.request.contextPath }/statics/assets/global/plugins/ie8.fix.min.js"></script> 
<![endif]-->
        <!-- BEGIN CORE PLUGINS -->
        <script src="${pageContext.request.contextPath }/statics/assets/global/plugins/jquery.min.js" type="text/javascript"></script>
        <script src="${pageContext.request.contextPath }/statics/assets/bootstrap-fileinput/js/plugins/sortable.js" type="text/javascript"></script>
		<script src="${pageContext.request.contextPath }/statics/assets/bootstrap-fileinput/js/fileinput.js" type="text/javascript"></script>
		<script src="${pageContext.request.contextPath }/statics/assets/bootstrap-fileinput/js/locales/zh.js" type="text/javascript"></script>
		<script src="${pageContext.request.contextPath }/statics/assets/bootstrap-fileinput/js/locales/fr.js" type="text/javascript"></script>
		<script src="${pageContext.request.contextPath }/statics/assets/bootstrap-fileinput/js/locales/es.js" type="text/javascript"></script>
		<script src="${pageContext.request.contextPath }/statics/assets/bootstrap-fileinput/themes/explorer/theme.js" type="text/javascript"></script>
        <script src="${pageContext.request.contextPath }/statics/assets/global/plugins/bootstrap/js/bootstrap.min.js" type="text/javascript"></script>
        <script src="${pageContext.request.contextPath }/statics/assets/global/plugins/js.cookie.min.js" type="text/javascript"></script>
        <script src="${pageContext.request.contextPath }/statics/assets/global/plugins/jquery-slimscroll/jquery.slimscroll.min.js" type="text/javascript"></script>
        <script src="${pageContext.request.contextPath }/statics/assets/global/plugins/jquery.blockui.min.js" type="text/javascript"></script>
        <script src="${pageContext.request.contextPath }/statics/assets/global/plugins/bootstrap-switch/js/bootstrap-switch.min.js" type="text/javascript"></script>
        <!-- END CORE PLUGINS -->
        <!-- BEGIN PAGE LEVEL PLUGINS -->
        <script src="${pageContext.request.contextPath }/statics/assets/global/plugins/moment.min.js" type="text/javascript"></script>
        <script src="${pageContext.request.contextPath }/statics/assets/global/plugins/bootstrap-daterangepicker/daterangepicker.min.js" type="text/javascript"></script>
        <script src="${pageContext.request.contextPath }/statics/assets/global/plugins/morris/morris.min.js" type="text/javascript"></script>
        <script src="${pageContext.request.contextPath }/statics/assets/global/plugins/morris/raphael-min.js" type="text/javascript"></script>
        <script src="${pageContext.request.contextPath }/statics/assets/global/plugins/counterup/jquery.waypoints.min.js" type="text/javascript"></script>
        <script src="${pageContext.request.contextPath }/statics/assets/global/plugins/counterup/jquery.counterup.min.js" type="text/javascript"></script>
        <script src="${pageContext.request.contextPath }/statics/assets/global/plugins/amcharts/amcharts/amcharts.js" type="text/javascript"></script>
        <script src="${pageContext.request.contextPath }/statics/assets/global/plugins/amcharts/amcharts/serial.js" type="text/javascript"></script>
        <script src="${pageContext.request.contextPath }/statics/assets/global/plugins/amcharts/amcharts/pie.js" type="text/javascript"></script>
        <script src="${pageContext.request.contextPath }/statics/assets/global/plugins/amcharts/amcharts/radar.js" type="text/javascript"></script>
        <script src="${pageContext.request.contextPath }/statics/assets/global/plugins/amcharts/amcharts/themes/light.js" type="text/javascript"></script>
        <script src="${pageContext.request.contextPath }/statics/assets/global/plugins/amcharts/amcharts/themes/patterns.js" type="text/javascript"></script>
        <script src="${pageContext.request.contextPath }/statics/assets/global/plugins/amcharts/amcharts/themes/chalk.js" type="text/javascript"></script>
        <script src="${pageContext.request.contextPath }/statics/assets/global/plugins/amcharts/ammap/ammap.js" type="text/javascript"></script>
        <script src="${pageContext.request.contextPath }/statics/assets/global/plugins/amcharts/ammap/maps/js/worldLow.js" type="text/javascript"></script>
        <script src="${pageContext.request.contextPath }/statics/assets/global/plugins/amcharts/amstockcharts/amstock.js" type="text/javascript"></script>
        <script src="${pageContext.request.contextPath }/statics/assets/global/plugins/fullcalendar/fullcalendar.min.js" type="text/javascript"></script>
        <script src="${pageContext.request.contextPath }/statics/assets/global/plugins/horizontal-timeline/horizontal-timeline.js" type="text/javascript"></script>
        <script src="${pageContext.request.contextPath }/statics/assets/global/plugins/flot/jquery.flot.min.js" type="text/javascript"></script>
        <script src="${pageContext.request.contextPath }/statics/assets/global/plugins/flot/jquery.flot.resize.min.js" type="text/javascript"></script>
        <script src="${pageContext.request.contextPath }/statics/assets/global/plugins/flot/jquery.flot.categories.min.js" type="text/javascript"></script>
        <script src="${pageContext.request.contextPath }/statics/assets/global/plugins/jquery-easypiechart/jquery.easypiechart.min.js" type="text/javascript"></script>
        <script src="${pageContext.request.contextPath }/statics/assets/global/plugins/jquery.sparkline.min.js" type="text/javascript"></script>
        <script src="${pageContext.request.contextPath }/statics/assets/global/plugins/jqvmap/jqvmap/jquery.vmap.js" type="text/javascript"></script>
        <script src="${pageContext.request.contextPath }/statics/assets/global/plugins/jqvmap/jqvmap/maps/jquery.vmap.russia.js" type="text/javascript"></script>
        <script src="${pageContext.request.contextPath }/statics/assets/global/plugins/jqvmap/jqvmap/maps/jquery.vmap.world.js" type="text/javascript"></script>
        <script src="${pageContext.request.contextPath }/statics/assets/global/plugins/jqvmap/jqvmap/maps/jquery.vmap.europe.js" type="text/javascript"></script>
        <script src="${pageContext.request.contextPath }/statics/assets/global/plugins/jqvmap/jqvmap/maps/jquery.vmap.germany.js" type="text/javascript"></script>
        <script src="${pageContext.request.contextPath }/statics/assets/global/plugins/jqvmap/jqvmap/maps/jquery.vmap.usa.js" type="text/javascript"></script>
        <script src="${pageContext.request.contextPath }/statics/assets/global/plugins/jqvmap/jqvmap/data/jquery.vmap.sampledata.js" type="text/javascript"></script>
        <!-- END PAGE LEVEL PLUGINS -->
        <!-- BEGIN THEME GLOBAL SCRIPTS -->
        <script src="${pageContext.request.contextPath }/statics/assets/global/scripts/app.min.js" type="text/javascript"></script>
        <!-- END THEME GLOBAL SCRIPTS -->
        <!-- BEGIN PAGE LEVEL SCRIPTS -->
        <script src="${pageContext.request.contextPath }/statics/assets/pages/scripts/dashboard.min.js" type="text/javascript"></script>
        <!-- END PAGE LEVEL SCRIPTS -->
        <!-- BEGIN THEME LAYOUT SCRIPTS -->
        <script src="${pageContext.request.contextPath }/statics/assets/layouts/layout2/scripts/layout.min.js" type="text/javascript"></script>
        <script src="${pageContext.request.contextPath }/statics/assets/layouts/layout2/scripts/demo.min.js" type="text/javascript"></script>
        <script src="${pageContext.request.contextPath }/statics/assets/layouts/global/scripts/quick-sidebar.min.js" type="text/javascript"></script>
        <script src="${pageContext.request.contextPath }/statics/assets/layouts/global/scripts/quick-nav.min.js" type="text/javascript"></script>
		<script src="${pageContext.request.contextPath }/statics/assets/bootstrap-table/bootstrap-table.js"></script>
		<script src="${pageContext.request.contextPath }/statics/assets/bootstrap-table/locale/bootstrap-table-zh-CN.js"></script>
		<script src="${pageContext.request.contextPath }/statics/assets/global/plugins/bootstrap-sweetalert/sweetalert.js" type="text/javascript"></script>
		<script src="${pageContext.request.contextPath }/statics/assets/global/plugins/bootstrap-sweetalert/sweetalert.min.js" type="text/javascript"></script>
		<script src="${pageContext.request.contextPath }/statics/assets/pages/scripts/ui-sweetalert.min.js" type="text/javascript"></script>
		<script src="${pageContext.request.contextPath }/statics/own/js/appInfotable.js"></script>
		<script src="${pageContext.request.contextPath }/statics/own/js/doAppAdd.js"></script>
        <!-- END THEME LAYOUT SCRIPTS -->
        <script>
            $(document).ready(function(){
                $('#clickmewow').click(function(){
                    $('#radio1003').attr('checked', 'checked');
                });
            });
        </script>
    </body>
</html>