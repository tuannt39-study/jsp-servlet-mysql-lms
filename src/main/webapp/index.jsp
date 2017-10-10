<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
    <head>
        <title> Trang chủ </title>
        <jsp:include page="/views/head.jsp"></jsp:include>
	</head>
    <!-- END HEAD -->

    <body class="page-header-fixed page-sidebar-closed-hide-logo page-content-white page-md">
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
                                    <span>Trang chủ</span>
                                </li>
                            </ul>
                        </div>
                        <!-- END PAGE BAR -->
                        <!-- BEGIN PAGE TITLE-->
                        <h1 class="page-title"> Trang chủ </h1>
                        <!-- END PAGE TITLE-->
                        <!-- END PAGE HEADER-->
                        <p>
                        	- Đối tác - OK<br />
                        	- Dự án - OK<br />
                        	- Học phí - OK<br />
                        	- Lịch học - OK<br />
                        	- Lớp học - OK <br />
                        	- Ngôn ngữ - OK <br />
                        	- Tài khoản - OK <br />
                        	- Tuyển dụng - OK <br />
                        	- Cá nhân <br />
                        	- Dự án - Thực tập sinh <br />
                        	- Đối tác - Tuyển dụng <br />
                        	- Giảng dạy <br />
                        	- Học viên <br />
                        	- Học Viên - Thực tập sinh <br />
                        	- Lớp học - lịch học <br />
                        	- Lớp học - Giảng dạy <br />
                        	- Thực tập sinh
                        </p>
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