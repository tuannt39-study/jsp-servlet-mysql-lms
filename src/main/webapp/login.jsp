<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
    <head>
        <title> Đăng nhập </title>
        <meta charset="utf-8" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta content="width=device-width, initial-scale=1" name="viewport" />
        <meta content="Preview page of Metronic Admin Theme #1 for light page head option" name="description" />
        <meta content="" name="author" />
        <!-- BEGIN GLOBAL MANDATORY STYLES -->
        <link href="http://fonts.googleapis.com/css?family=Open+Sans:400,300,600,700&subset=all" rel="stylesheet" type="text/css" />
        <link href="/lms/assets/css/font-awesome.min.css" rel="stylesheet" type="text/css" />
        <link href="/lms/assets/css/simple-line-icons.min.css" rel="stylesheet" type="text/css" />
        <link href="/lms/assets/css/bootstrap.min.css" rel="stylesheet" type="text/css" />
        <link href="/lms/assets/css/bootstrap-switch.min.css" rel="stylesheet" type="text/css" />
        <!-- END GLOBAL MANDATORY STYLES -->
        <!-- BEGIN PAGE LEVEL PLUGINS -->
        <link href="/lms/assets/css/select2.min.css" rel="stylesheet" type="text/css" />
        <link href="/lms/assets/css/select2-bootstrap.min.css" rel="stylesheet" type="text/css" />
        <!-- END PAGE LEVEL PLUGINS -->
        <!-- BEGIN THEME GLOBAL STYLES -->
        <link href="/lms/assets/css/components-md.min.css" rel="stylesheet" id="style_components" type="text/css" />
        <link href="/lms/assets/css/plugins-md.min.css" rel="stylesheet" type="text/css" />
        <!-- END THEME GLOBAL STYLES -->
        <!-- BEGIN PAGE LEVEL STYLES -->
        <link href="/lms/assets/css/login-4.min.css" rel="stylesheet" type="text/css" />
        <!-- END PAGE LEVEL STYLES -->
        <!-- BEGIN THEME LAYOUT STYLES -->
        <link href="/lms/assets/css/layout.min.css" rel="stylesheet" type="text/css" />
        <link href="/lms/assets/css/darkblue.min.css" rel="stylesheet" type="text/css" id="style_color" />
        <link href="/lms/assets/css/custom.min.css" rel="stylesheet" type="text/css" />
        <!-- END THEME LAYOUT STYLES -->
        <link rel="shortcut icon" href="/lms/assets/favicon.ico" /> 
	</head>
    <!-- END HEAD -->

    <body class=" login">
        <!-- BEGIN LOGO -->
        <div class="logo">
            <a href="index.jsp">
                <img src="/lms/assets/img/logo-big.png" alt="" /> </a>
        </div>
        <!-- END LOGO -->
        <!-- BEGIN LOGIN -->
        <div class="content">
            <!-- BEGIN LOGIN FORM -->
            <form class="login-form" action="QLLogin" method="post">
                <h3 class="form-title">Đăng nhập tài khoản</h3>
                <div class="alert alert-danger display-hide">
                    <button class="close" data-close="alert"></button>
                    <span> Nhập email và mật khẩu bất kỳ. </span>
                </div>
                <div class="form-group">
                    <!--ie8, ie9 does not support html5 placeholder, so we just show field title for that-->
                    <label class="control-label visible-ie8 visible-ie9">Email</label>
                    <div class="input-icon">
                        <i class="fa fa-user"></i>
                        <input class="form-control placeholder-no-fix" type="text" autocomplete="off" placeholder="Email" name="emailTaiKhoan" /> </div>
                </div>
                <div class="form-group">
                    <label class="control-label visible-ie8 visible-ie9">Mật khẩu</label>
                    <div class="input-icon">
                        <i class="fa fa-lock"></i>
                        <input class="form-control placeholder-no-fix" type="password" autocomplete="off" placeholder="Mật khẩu" name="matKhauTaiKhoan" /> </div>
                </div>
                <div class="form-actions">
                    <label class="rememberme mt-checkbox mt-checkbox-outline">
                        <input type="checkbox" name="remember" value="1" /> Nhớ mật khẩu
                        <span></span>
                    </label>
                    <input type="hidden" name="xllogin" value="loginlg">
                    <button type="submit" class="btn green pull-right"> Đăng nhập </button>
                </div>
                <div class="forget-password">
                    <h4>Bạn đã quên mật khẩu?</h4>
                    <p> Đừng lo lắng, kích 
                        <a href="javascript:;" id="forget-password"> vào đây </a> để thiết lập lại mật khẩu của bạn. </p>
                </div>
                <div class="create-account">
                    <p> Không có tài khoản ?&nbsp;
                        <a href="javascript:;" id="register-btn"> Tạo tài khoản </a>
                    </p>
                </div>
            </form>
            <!-- END LOGIN FORM -->
            <!-- BEGIN FORGOT PASSWORD FORM -->
            <form class="forget-form" action="index.jsp" method="post">
                <h3>Quên mật khẩu ?</h3>
                <p> Vui lòng nhập email để thiết lập lại mật khẩu của bạn. </p>
                <div class="form-group">
                    <div class="input-icon">
                        <i class="fa fa-envelope"></i>
                        <input class="form-control placeholder-no-fix" type="text" autocomplete="off" placeholder="Email" name="email" /> </div>
                </div>
                <div class="form-actions">
                    <button type="button" id="back-btn" class="btn red btn-outline">Trở lại </button>
                    <button type="submit" class="btn green pull-right"> Xác nhận </button>
                </div>
            </form>
            <!-- END FORGOT PASSWORD FORM -->
            <!-- BEGIN REGISTRATION FORM -->
            <form class="register-form" action="index.jsp" method="post">
                <h3>Đăng ký</h3>
                <p> Nhập thông tin cá nhân của bạn: </p>
                <div class="form-group">
                    <label class="control-label visible-ie8 visible-ie9">Tên đầy đủ</label>
                    <div class="input-icon">
                        <i class="fa fa-font"></i>
                        <input class="form-control placeholder-no-fix" type="text" placeholder="Tên đầy đủ" name="fullname" /> </div>
                </div>
                <div class="form-group">
                    <!--ie8, ie9 does not support html5 placeholder, so we just show field title for that-->
                    <label class="control-label visible-ie8 visible-ie9">Email</label>
                    <div class="input-icon">
                        <i class="fa fa-envelope"></i>
                        <input class="form-control placeholder-no-fix" type="text" placeholder="Email" name="email" /> </div>
                </div><div class="form-group">
                    <label class="control-label visible-ie8 visible-ie9">Loại tài khoản</label>
                    <select name="country" class="select2 form-control">
                        <option value="Nhân Viên">Nhân Viên</option>
                        <option value="Học Viên">Học Viên</option>
                        <option value="Thực Tập Sinh">Thực Tập Sinh</option>
                        <option value="HV-TTS">HV-TTS</option>
                    </select>
                </div>
                <div class="form-group">
                    <label class="control-label visible-ie8 visible-ie9">Mật khẩu</label>
                    <div class="input-icon">
                        <i class="fa fa-lock"></i>
                        <input class="form-control placeholder-no-fix" type="password" autocomplete="off" id="register_password" placeholder="Mật khẩu" name="password" /> </div>
                </div>
                <div class="form-group">
                    <label class="control-label visible-ie8 visible-ie9">Nhập lại mật khẩu</label>
                    <div class="controls">
                        <div class="input-icon">
                            <i class="fa fa-check"></i>
                            <input class="form-control placeholder-no-fix" type="password" autocomplete="off" placeholder="Nhập lại mật khẩu" name="rpassword" /> </div>
                    </div>
                </div>
                <div class="form-group">
                    <label class="mt-checkbox mt-checkbox-outline">
                        <input type="checkbox" name="tnc" /> Tôi đồng ý với
                        <a href="javascript:;">Điều khoản </a> &
                        <a href="javascript:;">Chính sách dữ liệu </a>
                        <span></span>
                    </label>
                    <div id="register_tnc_error"> </div>
                </div>
                <div class="form-actions">
                    <button id="register-back-btn" type="button" class="btn red btn-outline"> Trở lại </button>
                    <button type="submit" id="register-submit-btn" class="btn green pull-right"> Tạo tài khoản </button>
                </div>
            </form>
            <!-- END REGISTRATION FORM -->
        </div>
        <!-- END LOGIN -->
        <!-- BEGIN COPYRIGHT -->
        <div class="copyright"> 2017 &copy; Hackademics Hà Nội </div>
        <!-- END COPYRIGHT -->
        <!-- BEGIN CORE PLUGINS -->
        <script src="/lms/assets/js/jquery.min.js" type="text/javascript"></script>
        <script src="/lms/assets/js/bootstrap.min.js" type="text/javascript"></script>
        <script src="/lms/assets/js/js.cookie.min.js" type="text/javascript"></script>
        <script src="/lms/assets/js/jquery.slimscroll.min.js" type="text/javascript"></script>
        <script src="/lms/assets/js/jquery.blockui.min.js" type="text/javascript"></script>
        <script src="/lms/assets/js/bootstrap-switch.min.js" type="text/javascript"></script>
        <!-- END CORE PLUGINS -->
        <!-- BEGIN PAGE LEVEL PLUGINS -->
        <script src="/lms/assets/js/jquery.validate.min.js" type="text/javascript"></script>
        <script src="/lms/assets/js/additional-methods.min.js" type="text/javascript"></script>
        <script src="/lms/assets/js/select2.full.min.js" type="text/javascript"></script>
        <script src="/lms/assets/js/jquery.backstretch.min.js" type="text/javascript"></script>
        <!-- END PAGE LEVEL PLUGINS -->
        <!-- BEGIN THEME GLOBAL SCRIPTS -->
        <script src="/lms/assets/js/app.min.js" type="text/javascript"></script>
        <!-- END THEME GLOBAL SCRIPTS -->
        <!-- BEGIN PAGE LEVEL SCRIPTS -->
        <script src="/lms/assets/js/login-4.min.js" type="text/javascript"></script>
        <!-- END PAGE LEVEL SCRIPTS -->
    </body>

</html>