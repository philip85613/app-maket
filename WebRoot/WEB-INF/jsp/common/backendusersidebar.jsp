<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<div class="page-sidebar navbar-collapse collapse">
    <!-- BEGIN SIDEBAR MENU -->
    <!-- DOC: Apply "page-sidebar-menu-light" class right after "page-sidebar-menu" to enable light sidebar menu style(without borders) -->
    <!-- DOC: Apply "page-sidebar-menu-hover-submenu" class right after "page-sidebar-menu" to enable hoverable(hover vs accordion) sub menu mode -->
    <!-- DOC: Apply "page-sidebar-menu-closed" class right after "page-sidebar-menu" to collapse("page-sidebar-closed" class must be applied to the body element) the sidebar sub menu mode -->
    <!-- DOC: Set data-auto-scroll="false" to disable the sidebar from auto scrolling/focusing -->
    <!-- DOC: Set data-keep-expand="true" to keep the submenues expanded -->
    <!-- DOC: Set data-auto-speed="200" to adjust the sub menu slide up/down speed -->
    <ul class="page-sidebar-menu" data-keep-expanded="false" data-auto-scroll="true" data-slide-speed="200" ng-class="{'page-sidebar-menu-closed': settings.layout.pageSidebarClosed}">
        <li class="start">
            <a ui-sref="dashboard" href="${pageContext.request.contextPath }/dev/main">
                <i class="icon-home"></i>
                <span class="title">主页</span>
            </a>
        </li>
        <li class="nav-item">
            <a href="javascript:;" class="nav-link nav-toggle">
                <i class="icon-settings"></i>
                <span class="title">APP管理</span>
                <span class="arrow "></span>
            </a>
            <ul class="sub-menu">
                <li>
                    <a ui-sref="uibootstrap" href="${pageContext.request.contextPath }/backendUser/backendUserAppInfo">
                        <i class="icon-puzzle"></i> APP审核</span>
                    </a>
                </li>
                <li>
                    <a ui-sref="fileupload">
                        <i class="icon-paper-clip"></i> 广告推广</span>
                    </a>
                </li>
            </ul>
        </li>
        <li class="nav-item">
            <a href="javascript:;" class="nav-link nav-toggle">
                <i class="icon-wrench"></i>
                <span class="title">用户管理</span>
                <span class="arrow "></span>
            </a>
            <ul class="sub-menu">
                <li>
                    <a ui-sref="formtools" href="">
                        <i class="icon-puzzle"></i> APP维护 </a>
                </li>
            </ul>
        </li>
        <li class="nav-item">
            <a href="javascript:;" class="nav-link nav-toggle">
                <i class="icon-settings"></i>
                <span class="title">基础数据维护</span>
                <span class="arrow "></span>
            </a>
            <ul class="sub-menu">
                <li>
                    <a ui-sref="uibootstrap">
                        <i class="icon-puzzle"></i> UI Bootstrap</span>
                    </a>
                </li>
                <li>
                    <a ui-sref="fileupload">
                        <i class="icon-paper-clip"></i> File Upload</span>
                    </a>
                </li>
                <li>
                    <a ui-sref="uiselect">
                        <i class="icon-check"></i> UI Select</span>
                    </a>
                </li>
            </ul>
        </li>
    </ul>
    <!-- END SIDEBAR MENU -->
</div>