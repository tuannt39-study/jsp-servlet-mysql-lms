<%@page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
    <head>
        <title> Tài Khoản </title>
        <jsp:include page="/views/head.jsp"></jsp:include>
	</head>
    <!-- END HEAD -->

    <body class="page-header-fixed page-sidebar-closed-hide-logo page-content-white page-md">
    	<%
            String error = "";
            if(request.getParameter("error")!=null){
                error = (String) request.getParameter("error");
            }
        %>
        <div class="page-wrapper">
			<jsp:include page="/views/header.jsp"></jsp:include>
            <!-- BEGIN CONTAINER -->
            <div class="page-container">
            	<jsp:include page="/views/sidebar.jsp"></jsp:include>
                <!-- BEGIN CONTENT -->
                <div class="page-content-wrapper">
                    <!-- BEGIN CONTENT BODY -->
                    <div class="page-content">
                        <!-- BEGIN PAGE HEADER-->
                        <!-- BEGIN PAGE BAR -->
                        <div class="page-bar">
                            <ul class="page-breadcrumb">
                                <li>
                                    <a href="index.jsp">Trang chủ</a>
                                    <i class="fa fa-circle"></i>
                                </li>
                                <li>
                                    <span>Tài Khoản</span>
                                </li>
                            </ul>
                        </div>
                        <!-- END PAGE BAR -->
                        <!-- BEGIN PAGE TITLE-->
                        <h1 class="page-title">Thêm Tài Khoản</h1>
                        <!-- END PAGE TITLE-->
                        <!-- END PAGE HEADER-->
                        <div class="row">
                            <div class="col-md-8">
                                <!-- BEGIN VALIDATION STATES-->
                                <div class="portlet light portlet-fit portlet-form bordered">
                                    <div class="portlet-title">
                                        <div class="caption">
                                            <i class=" icon-layers font-green"></i>
                                            <span class="caption-subject font-green sbold uppercase">Thêm Tài Khoản</span>
                                        </div>
                                    </div>
                                    <div class="portlet-body">
                                        <!-- BEGIN FORM-->
                                        <form action="QLTaiKhoan" method="post" class="form-horizontal" id="form_sample_1">
                                            <div class="form-body">
                                                <div class="form-group form-md-line-input">
                                                    <label class="col-md-3 control-label" for="form_control_1">Email tài khoản
                                                        <span class="required">*</span>
                                                    </label>
                                                    <div class="col-md-9">
	                                                    <div class="input-group">
	                                                        <span class="input-group-addon">
	                                                            <i class="fa fa-envelope"></i>
	                                                        </span>
	                                                        <input type="text" class="form-control" name="emailTaiKhoan"><%=error%>
	                                                        <div class="form-control-focus"> </div>
	                                                        <span class="help-block">Nhập email tài khoản</span>
	                                                    </div>
                                                    </div>
                                                </div>
                                                <div class="form-group form-md-line-input">
                                                    <label class="col-md-3 control-label" for="form_control_1">Loại tài khoản
                                                        <span class="required">*</span>
                                                    </label>
                                                    <div class="col-md-9">
                                                        <select class="form-control" name="loaiTaiKhoan">
                                                            <option value="Nhân Viên">Nhân Viên</option>
                                                            <option value="Học Viên">Học Viên</option>
                                                            <option value="Thực Tập Sinh">Thực Tập Sinh</option>
                                                            <option value="HV-TTS">HV-TTS</option>
                                                        </select>
                                                        <div class="form-control-focus"> </div>
                                                    </div>
                                                </div>
                                                <div class="form-group form-md-line-input">
                                                    <label class="col-md-3 control-label" for="form_control_1">Tên đầy đủ
                                                        <span class="required">*</span>
                                                    </label>
                                                    <div class="col-md-9">
                                                        <input type="text" class="form-control" name="tenDayDu"><%=error%>
                                                        <div class="form-control-focus"> </div>
                                                        <span class="help-block">Nhập tên đầy đủ</span>
                                                    </div>
                                                </div>
                                                <div class="form-group form-md-line-input">
                                                    <label class="col-md-3 control-label" for="form_control_1">Mật khẩu tài khoản
                                                        <span class="required">*</span>
                                                    </label>
                                                    <div class="col-md-9">
                                                        <input type="password" class="form-control" name="matKhauTaiKhoan"><%=error%>
                                                        <div class="form-control-focus"> </div>
                                                        <span class="help-block">Nhập mật khẩu tài khoản</span>
                                                    </div>
                                                </div>
                                                <div class="form-group form-md-line-input">
                                                    <label class="col-md-3 control-label" for="form_control_1">Ngày mở tài khoản
                                                        <span class="required">*</span>
                                                    </label>
                                                    <div class="col-md-4">
                                                        <div class="input-group input-large date-picker input-daterange">
                                                            <input type="text" class="form-control" name="moTaiKhoan"><%=error%>
                                                            <span class="help-block">Nhập ngày</span>
                                                            <span class="input-group-addon"> tới </span>
                                                            <input type="text" class="form-control" name="khoaTaiKhoan"><%=error%>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="form-actions">
                                                <div class="row">
                                                    <div class="col-md-offset-3 col-md-9">
                                                    	<input type="hidden" name="xltaikhoan" value="inserttk">
                                                    	<button type="submit" class="btn green">Xác nhận</button>
                                                    </div>
                                                </div>
                                            </div>
                                        </form>
                                        <!-- END FORM-->
                                    </div>
                                </div>
                                <!-- END VALIDATION STATES-->
                            </div>
                         </div>
                    </div>
                    <!-- END CONTENT BODY -->
                </div>
                <!-- END CONTENT -->
            </div>
            <!-- END CONTAINER -->
			<jsp:include page="/views/footer.jsp"></jsp:include>
        </div>
		<jsp:include page="/views/layout.jsp"></jsp:include>
    </body>

</html>