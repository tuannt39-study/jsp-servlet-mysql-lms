<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

        <!-- BEGIN CORE PLUGINS -->
        <script src="/lms/assets/js/jquery.min.js" type="text/javascript"></script>
        <script src="/lms/assets/js/bootstrap.min.js" type="text/javascript"></script>
        <script src="/lms/assets/js/js.cookie.min.js" type="text/javascript"></script>
        <script src="/lms/assets/js/jquery.slimscroll.min.js" type="text/javascript"></script>
        <script src="/lms/assets/js/jquery.blockui.min.js" type="text/javascript"></script>
        <script src="/lms/assets/js/bootstrap-switch.min.js" type="text/javascript"></script>
        <!-- END CORE PLUGINS -->
        <!-- BEGIN PAGE LEVEL PLUGINS -->
        <script src="/lms/assets/js/moment.min.js" type="text/javascript"></script>
        <script src="/lms/assets/js/daterangepicker.min.js" type="text/javascript"></script>
        <script src="/lms/assets/js/bootstrap-datepicker.min.js" type="text/javascript"></script>
        <script src="/lms/assets/js/bootstrap-timepicker.min.js" type="text/javascript"></script>
        <script src="/lms/assets/js/bootstrap-datetimepicker.min.js" type="text/javascript"></script>
        <script src="/lms/assets/js/clockface.js" type="text/javascript"></script>
        <!-- END PAGE LEVEL PLUGINS -->
        <!-- BEGIN PAGE LEVEL PLUGINS -->
        <script src="/lms/assets/js/datatables.min.js" type="text/javascript"></script>
        <script src="/lms/assets/js/datatables.bootstrap.js" type="text/javascript"></script>
        <!-- END PAGE LEVEL PLUGINS -->
        <!-- BEGIN THEME GLOBAL SCRIPTS -->
        <script src="/lms/assets/js/app.min.js" type="text/javascript"></script>
        <!-- END THEME GLOBAL SCRIPTS -->
        <!-- BEGIN PAGE LEVEL SCRIPTS -->
        <script src="/lms/assets/js/table-datatables-colreorder.min.js" type="text/javascript"></script>
        <!-- END PAGE LEVEL SCRIPTS -->
        <!-- BEGIN THEME LAYOUT SCRIPTS -->
        <script src="/lms/assets/js/layout.min.js" type="text/javascript"></script>
        <script src="/lms/assets/js/demo.min.js" type="text/javascript"></script>
        <script src="/lms/assets/js/quick-sidebar.min.js" type="text/javascript"></script>
        <script src="/lms/assets/js/quick-nav.min.js" type="text/javascript"></script>
        <!-- END THEME LAYOUT SCRIPTS -->
        <script>
            $(document).ready(function()
            {
                $('#clickmewow').click(function()
                {
                    $('#radio1003').attr('checked', 'checked');
                });
            });
            $.fn.datepicker.defaults.format = "yyyy-mm-dd";
			$('.input-daterange input').each(function() {
			    $(this).datepicker("clearDates");
			});
			$('.date input').each(function() {
			    $(this).datepicker("clearDates");
			});
            $('.timepicker-24 input').timepicker({
                showMeridian: false,
            });
        </script>