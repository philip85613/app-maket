<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en" style="height: 100%">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>APP开发者平台</title>
	<link href="http://fonts.googleapis.com/css?family=Open+Sans:400,300,600,700&subset=all" rel="stylesheet" type="text/css" />
    <link href="${pageContext.request.contextPath }/statics/assets/global/plugins/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css" />
    <link href="${pageContext.request.contextPath }/statics/assets/global/plugins/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css" />
    <link href="${pageContext.request.contextPath }/statics/assets/global/plugins/simple-line-icons/simple-line-icons.min.css" rel="stylesheet" type="text/css" />
    <link href="${pageContext.request.contextPath }/statics/assets/global/plugins/bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css" />
    <link href="${pageContext.request.contextPath }/statics/assets/global/plugins/bootstrap-switch/css/bootstrap-switch.min.css" rel="stylesheet" type="text/css" />
    <!-- END GLOBAL MANDATORY STYLES -->
    <!-- BEGIN PAGE LEVEL PLUGINS -->
    <link href="${pageContext.request.contextPath }/statics/assets/global/plugins/select2/css/select2.min.css" rel="stylesheet" type="text/css" />
    <link href="${pageContext.request.contextPath }/statics/assets/global/plugins/select2/css/select2-bootstrap.min.css" rel="stylesheet" type="text/css" />
    <link href="${pageContext.request.contextPath }/statics/assets/global/plugins/bootstrap-datepicker/css/bootstrap-datepicker3.min.css" rel="stylesheet" type="text/css" />
    <link href="${pageContext.request.contextPath }/statics/assets/global/plugins/bootstrap-wysihtml5/bootstrap-wysihtml5.css" rel="stylesheet" type="text/css" />
    <link href="${pageContext.request.contextPath }/statics/assets/global/plugins/bootstrap-markdown/css/bootstrap-markdown.min.css" rel="stylesheet" type="text/css" />
    <!-- END PAGE LEVEL PLUGINS -->
    <!-- BEGIN THEME GLOBAL STYLES -->
    <link href="${pageContext.request.contextPath }/statics/assets/global/css/components.min.css" rel="stylesheet" id="style_components" type="text/css" />
    <link href="${pageContext.request.contextPath }/statics/assets/global/css/plugins.min.css" rel="stylesheet" type="text/css" />
    <!-- END THEME GLOBAL STYLES -->
    <!-- BEGIN THEME LAYOUT STYLES -->
    <link href="${pageContext.request.contextPath }/statics/assets/layouts/layout2/css/layout.min.css" rel="stylesheet" type="text/css" />
    <link href="${pageContext.request.contextPath }/statics/assets/layouts/layout2/css/themes/blue.min.css" rel="stylesheet" type="text/css" id="style_color" />
    <link href="${pageContext.request.contextPath }/statics/assets/layouts/layout2/css/custom.min.css" rel="stylesheet" type="text/css" />
    <!-- END THEME LAYOUT STYLES -->
    <link rel="shortcut icon" href="favicon.ico" />
</head>
<body>
    <!-- BEGIN VALIDATION STATES-->
    <div class="portlet light portlet-fit portlet-form " style="height: 468px">
        <div class="portlet-title" style="margin-left: 600px">
            <div class="caption">
                <span class="caption-subject font-green bold uppercase">APP开发者平台</span>
            </div>
        </div>
        <div class="portlet-body">
            <!-- BEGIN FORM-->
            <form action="${pageContext.request.contextPath }/doLogin" id="form_sample_2" class="form-horizontal" method="post">
                <div class="form-body" style="margin-left: 200px">
                    <div class="form-group  margin-top-20">
                        <label class="control-label col-md-3">用户名:
                            <span class="required"> * </span>
                        </label>
                        <div class="col-md-4">
                            <div class="input-icon right">
                                <i class="fa"></i>
                                <input id="devCode" type="text" class="form-control" name="devCode" placeholder="请输入用户名"/>
                                <span style="color:red"></span>
                            </div>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="control-label col-md-3">密码:
                            <span class="required"> * </span>
                        </label>
                        <div class="col-md-4">
                            <div class="input-icon right">
                                <i class="fa"></i>
                                <input id="devPassword" type="password" class="form-control" name="devPassword" placeholder="请输入密码"/> 
                            	<span style="color:red"></span>
                            </div>
                        </div>
                    </div>
                </div>
                <div style="text-align:center">
        	<span style="font-size: 18px;color: red">${error }</span>
       </div>
                <div class="form-actions" style="margin-left: 350px">
                    <div class="row">
                        <div class="col-md-offset-3 col-md-9">
                            <button type="submit" class="btn green">登录</button>
                            <button type="reset" class="btn default">重填</button>
                        </div>
                    </div>
                </div>
            </form>
            <!-- END FORM-->
        </div>
    </div>
    <!-- END VALIDATION STATES-->
     <script src="${pageContext.request.contextPath }/statics/assets/global/plugins/jquery.min.js" type="text/javascript"></script>
     <script src="${pageContext.request.contextPath }/statics/assets/global/plugins/bootstrap/js/bootstrap.min.js" type="text/javascript"></script>
     <script src="${pageContext.request.contextPath }/statics/assets/global/plugins/js.cookie.min.js" type="text/javascript"></script>
     <script src="${pageContext.request.contextPath }/statics/assets/global/plugins/jquery-slimscroll/jquery.slimscroll.min.js" type="text/javascript"></script>
     <script src="${pageContext.request.contextPath }/statics/assets/global/plugins/jquery.blockui.min.js" type="text/javascript"></script>
     <script src="${pageContext.request.contextPath }/statics/assets/global/plugins/bootstrap-switch/js/bootstrap-switch.min.js" type="text/javascript"></script>
     <!-- END CORE PLUGINS -->
     <!-- BEGIN PAGE LEVEL PLUGINS -->
     <script src="${pageContext.request.contextPath }/statics/assets/global/plugins/select2/js/select2.full.min.js" type="text/javascript"></script>
     <script src="${pageContext.request.contextPath }/statics/assets/global/plugins/jquery-validation/js/jquery.validate.min.js" type="text/javascript"></script>
     <script src="${pageContext.request.contextPath }/statics/assets/global/plugins/jquery-validation/js/additional-methods.min.js" type="text/javascript"></script>
     <script src="${pageContext.request.contextPath }/statics/assets/global/plugins/bootstrap-datepicker/js/bootstrap-datepicker.min.js" type="text/javascript"></script>
     <script src="${pageContext.request.contextPath }/statics/assets/global/plugins/bootstrap-wysihtml5/wysihtml5-0.3.0.js" type="text/javascript"></script>
     <script src="${pageContext.request.contextPath }/statics/assets/global/plugins/bootstrap-wysihtml5/bootstrap-wysihtml5.js" type="text/javascript"></script>
     <script src="${pageContext.request.contextPath }/statics/assets/global/plugins/ckeditor/ckeditor.js" type="text/javascript"></script>
     <script src="${pageContext.request.contextPath }/statics/assets/global/plugins/bootstrap-markdown/lib/markdown.js" type="text/javascript"></script>
     <script src="${pageContext.request.contextPath }/statics/assets/global/plugins/bootstrap-markdown/js/bootstrap-markdown.js" type="text/javascript"></script>
     <!-- END PAGE LEVEL PLUGINS -->
     <!-- BEGIN THEME GLOBAL SCRIPTS -->
     <script src="${pageContext.request.contextPath }/statics/assets/global/scripts/app.min.js" type="text/javascript"></script>
     <!-- END THEME GLOBAL SCRIPTS -->
     <!-- BEGIN PAGE LEVEL SCRIPTS -->
     <script src="${pageContext.request.contextPath }/statics/assets/pages/scripts/form-validation.min.js" type="text/javascript"></script>
     <!-- END PAGE LEVEL SCRIPTS -->
     <!-- BEGIN THEME LAYOUT SCRIPTS -->
     <script src="${pageContext.request.contextPath }/statics/assets/layouts/layout2/scripts/layout.min.js" type="text/javascript"></script>
     <script src="${pageContext.request.contextPath }/statics/assets/layouts/layout2/scripts/demo.min.js" type="text/javascript"></script>
     <script src="${pageContext.request.contextPath }/statics/assets/layouts/global/scripts/quick-sidebar.min.js" type="text/javascript"></script>
     <script src="${pageContext.request.contextPath }/statics/assets/layouts/global/scripts/quick-nav.min.js" type="text/javascript"></script>
     <script src="${pageContext.request.contextPath }/statics/own/js/dologin.js" type="text/javascript"></script>
     <!-- END THEME LAYOUT SCRIPTS -->
     <script>
         $(document).ready(function()
         {
             $('#clickmewow').click(function()
             {
                 $('#radio1003').attr('checked', 'checked');
             });
         })
     </script>
</body>
</html>