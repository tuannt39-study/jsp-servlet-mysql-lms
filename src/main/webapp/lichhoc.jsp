<%@page import="java.util.ArrayList,
				vn.hkd.dao.LichHocDAO,
				vn.hkd.model.LichHoc"
	language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
    <head>
        <title> Lịch Học </title>
        <jsp:include page="/views/head.jsp"></jsp:include>
	</head>
    <!-- END HEAD -->

    <body class="page-header-fixed page-sidebar-closed-hide-logo page-content-white page-md">
    
    <%
		LichHocDAO lichHocDAO = new LichHocDAO();
		ArrayList<LichHoc> listLichHoc = lichHocDAO.getListLichHoc();
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
                                    <span>Lịch Học</span>
                                </li>
                            </ul>
                        </div>
                        <!-- END PAGE BAR -->
                        <!-- BEGIN PAGE TITLE-->
                        <h1 class="page-title"> Lịch Học </h1>
                        <!-- END PAGE TITLE-->
                        <!-- END PAGE HEADER-->
                        
                        <div class="row">
                        	<div class="col-md-12">
                                <!-- BEGIN EXAMPLE TABLE PORTLET-->
                                <div class="portlet light bordered">
                                    <div class="portlet-title">
                                        <div class="caption font-dark">
                                            <i class="icon-settings font-dark"></i>
                                            <span class="caption-subject bold uppercase">Danh Sách Các Lịch Học</span>
                                        </div>
                                        <div class="tools"> </div>
                                    </div>
                                    <div class="portlet-body">
                                        <div class="table-toolbar">
                                            <div class="row">
                                                <div class="col-md-6">
                                                    <div class="btn-group">
                                                        <a href="insert_lichhoc.jsp"> <button id="sample_editable_1_new" class="btn sbold green"> Thêm Lịch Học
                                                            <i class="fa fa-plus"></i>
                                                        </button> </a>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                        <table class="table table-striped table-bordered table-hover" id="sample_1">
                                            <thead>
                                                <tr>
                                                	<th> STT </th>
                                                    <th> Mã Lịch Học </th>
                                                    <th> Thứ </th>
                                                    <th> Giờ bắt đầu </th>
                                                    <th> Giờ kết thúc </th>
                                                    <th> Địa điểm </th>
                                                    <th> Tùy chọn </th>
                                                </tr>
                                            </thead>
                                            <%
					                            int count = 0;
					                            for(LichHoc lichHoc : listLichHoc){
					                                count++;
					                        %>
                                            <tbody>
                                                <tr>
                                                	<td> <%=count%> </td>
                                                    <td> <%=lichHoc.getIdLichHoc()%> </td>
                                                    <td> <%=lichHoc.getThu()%> </td>
                                                    <td> <%=lichHoc.getBdLichHoc()%> </td>
                                                    <td> <%=lichHoc.getKtLichHoc()%> </td>
                                                    <td> <%=lichHoc.getDiaDiemLichHoc()%> </td>
                                                    <td>
                                                    	<a href="update_lichhoc.jsp?xllichhoc=updatelichh&id_lichh=<%=lichHoc.getIdLichHoc()%>"><span class="label label-sm label-warning"> Sửa </span></a>&nbsp;&nbsp;&nbsp;
                                                    	<a href="QLLichHoc?xllichhoc=deletelichh&id_lichh=<%=lichHoc.getIdLichHoc()%>"><span class="label label-sm label-danger"> Xóa </span></a>
                                                    </td>
                                                </tr>
                                            </tbody>
                                            <%
                                            	}
                                            %>
                                        </table>
                                    </div>
                                </div>
                                <!-- END EXAMPLE TABLE PORTLET-->
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