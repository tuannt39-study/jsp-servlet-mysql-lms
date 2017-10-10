<%@page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
    <head>
        <title> Học Phí </title>
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
                                    <span>Học Phí</span>
                                </li>
                            </ul>
                        </div>
                        <!-- END PAGE BAR -->
                        <!-- BEGIN PAGE TITLE-->
                        <h1 class="page-title">Cập Nhật Học Phí</h1>
                        <!-- END PAGE TITLE-->
                        <!-- END PAGE HEADER-->
                        <div class="row">
                            <div class="col-md-8">
                                <!-- BEGIN VALIDATION STATES-->
                                <div class="portlet light portlet-fit portlet-form bordered">
                                    <div class="portlet-title">
                                        <div class="caption">
                                            <i class=" icon-layers font-green"></i>
                                            <span class="caption-subject font-green sbold uppercase">Cập Nhật Học Phí</span>
                                        </div>
                                    </div>
                                    <div class="portlet-body">
                                        <!-- BEGIN FORM-->
                                        <form action="QLHocPhi" method="post" class="form-horizontal" id="form_sample_1">
                                            <div class="form-body">
                                                <div class="form-group form-md-line-input">
                                                    <label class="col-md-3 control-label" for="form_control_1">HP phải nộp
                                                        <span class="required">*</span>
                                                    </label>
                                                    <div class="col-md-9">
                                                        <input type="text" class="form-control" name="hpPhaiNop"><%=error%>
                                                        <div class="form-control-focus"> </div>
                                                        <span class="help-block">Nhập HP phải nộp</span>
                                                    </div>
                                                </div>
                                                <div class="form-group form-md-line-input">
                                                    <label class="col-md-3 control-label" for="form_control_1">HP nộp 1
                                                        <span class="required">*</span>
                                                    </label>
                                                    <div class="col-md-9">
                                                        <input type="text" class="form-control" name="hpNop1"><%=error%>
                                                        <div class="form-control-focus"> </div>
                                                        <span class="help-block">Nhập HP nộp 1</span>
                                                    </div>
                                                </div>
                                                <div class="form-group form-md-line-input">
                                                    <label class="col-md-3 control-label" for="form_control_1">Ngày nộp 1
                                                        <span class="required">*</span>
                                                    </label>
                                                    <div class="col-md-9">
                                                        <div class="input-group date">
                                                            <input type="text" class="form-control" name="ngayNop1"><%=error%>
                                                            <div class="form-control-focus"> </div>
                                                            <span class="help-block">Nhập ngày nộp 1</span>
                                                        </div>
                                                    </div>
                                                </div>
                                                <div class="form-group form-md-line-input">
                                                    <label class="col-md-3 control-label" for="form_control_1">HP nộp 2
                                                        <span class="required">*</span>
                                                    </label>
                                                    <div class="col-md-9">
                                                        <input type="text" class="form-control" name="hpNop2"><%=error%>
                                                        <div class="form-control-focus"> </div>
                                                        <span class="help-block">Nhập HP nộp 2</span>
                                                    </div>
                                                </div>
                                                <div class="form-group form-md-line-input">
                                                    <label class="col-md-3 control-label" for="form_control_1">Ngày nộp 2
                                                        <span class="required">*</span>
                                                    </label>
                                                    <div class="col-md-9">
                                                        <div class="input-group date">
                                                            <input type="text" class="form-control" name="ngayNop2"><%=error%>
                                                            <div class="form-control-focus"> </div>
                                                            <span class="help-block">Nhập ngày nộp 2</span>
                                                        </div>
                                                    </div>
                                                </div>
                                                <div class="form-group form-md-line-input">
                                                    <label class="col-md-3 control-label" for="form_control_1">HP nộp 3
                                                        <span class="required">*</span>
                                                    </label>
                                                    <div class="col-md-9">
                                                        <input type="text" class="form-control" name="hpNop3"><%=error%>
                                                        <div class="form-control-focus"> </div>
                                                        <span class="help-block">Nhập HP nộp 3</span>
                                                    </div>
                                                </div>
                                                <div class="form-group form-md-line-input">
                                                    <label class="col-md-3 control-label" for="form_control_1">Ngày nộp 3
                                                        <span class="required">*</span>
                                                    </label>
                                                    <div class="col-md-9">
                                                        <div class="input-group date">
                                                            <input type="text" class="form-control" name="ngayNop3"><%=error%>
                                                            <div class="form-control-focus"> </div>
                                                            <span class="help-block">Nhập ngày nộp 3</span>
                                                        </div>
                                                    </div>
                                                </div>
                                                <div class="form-group form-md-line-input">
                                                    <label class="col-md-3 control-label" for="form_control_1">HP nộp 4
                                                        <span class="required">*</span>
                                                    </label>
                                                    <div class="col-md-9">
                                                        <input type="text" class="form-control" name="hpNop4"><%=error%>
                                                        <div class="form-control-focus"> </div>
                                                        <span class="help-block">Nhập HP nộp 4</span>
                                                    </div>
                                                </div>
                                                <div class="form-group form-md-line-input">
                                                    <label class="col-md-3 control-label" for="form_control_1">Ngày nộp 4
                                                        <span class="required">*</span>
                                                    </label>
                                                    <div class="col-md-9">
                                                        <div class="input-group date">
                                                            <input type="text" class="form-control" name="ngayNop4"><%=error%>
                                                            <div class="form-control-focus"> </div>
                                                            <span class="help-block">Nhập ngày nộp 4</span>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="form-actions">
                                                <div class="row">
                                                    <div class="col-md-offset-3 col-md-9">
                                                    	<input type="hidden" name="xlhocphi" value="updatehp">
                                                    	<input type="hidden" name="id_hp" value="<%=request.getParameter("id_hp")%>">
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