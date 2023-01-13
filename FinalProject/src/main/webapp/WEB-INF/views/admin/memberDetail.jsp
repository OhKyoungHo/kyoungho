<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix='c' uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>CODE O' CLOCK - 관리자페이지</title>

    <!-- Custom fonts for this template-->
    <link href="../admin/vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
    <link
        href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i"
        rel="stylesheet">

    <!-- Custom styles for this template-->
    <link href="../admin/css/sb-admin-2.min.css" rel="stylesheet">
    <style> 
    a:hover {
	text-decoration: none;
}
</style>

</head>

<body id="page-top">

    <!-- Page Wrapper -->
    <div id="wrapper">

        <!-- Sidebar -->
        <ul class="navbar-nav bg-gradient-primary sidebar sidebar-dark accordion" id="accordionSidebar">

            <!-- Sidebar - Brand -->
            <a class="sidebar-brand d-flex align-items-center justify-content-center" href="../admin.do">
                <div class="sidebar-brand-text mx-3">CODE O' CLOCK Admin </div>
            </a>

            <!-- Divider -->
            <hr class="sidebar-divider my-0">

            <!-- Nav Item - Dashboard -->
            <li class="nav-item active">
                <a class="nav-link" href="../main.do">
                    <i class="fas fa-fw fa-tachometer-alt"></i>
                    <span>User Page</span></a>
            </li>

             <!-- Divider -->
             <hr class="sidebar-divider">

             <!-- Heading -->
             <div class="sidebar-heading">
                 Interface
             </div>
            
        
      <!-- Nav Item - Utilities Collapse Menu -->
<li class="nav-item"><a class="nav-link collapsed" href="admin/academyList"
    data-toggle="collapse" data-target="#collapseOne"
    aria-expanded="true" aria-controls="collapseOne"> <i
        class="fas fa-fw fa-cog"></i> <span>학원 관리</span>
</a>
    <div id="collapseOne" class="collapse"
        aria-labelledby="headingUtilities" data-parent="#accordionSidebar">
        <div class="bg-white py-2 collapse-inner rounded">
            <h6 class="collapse-header">Custom Utilities:</h6>
            <a class="collapse-item" href="academyList">학원 목록</a> <a
                class="collapse-item" href="admin/academyRegister">학원 등록</a>
        </div>
    </div></li>
    <li class="nav-item"><a class="nav-link collapsed" href="admin/tutorList"
        data-toggle="collapse" data-target="#collapseTwo"
        aria-expanded="true" aria-controls="collapseTwo"> <i
            class="fas fa-fw fa-cog"></i> <span>강사 관리</span>
    </a>
        <div id="collapseTwo" class="collapse"
            aria-labelledby="headingUtilities" data-parent="#accordionSidebar">
            <div class="bg-white py-2 collapse-inner rounded">
                <h6 class="collapse-header">Custom Utilities:</h6>
                <a class="collapse-item" href="admin/tutorList">강사 목록</a> <a
                    class="collapse-item" href="admin/tutorRegister.do">강사 등록</a>
            </div>
        </div></li>
        <li class="nav-item"><a class="nav-link collapsed" href="admin/lectureList.do"
            data-toggle="collapse" data-target="#collapseThree"
            aria-expanded="true" aria-controls="collapseThree"> <i
                class="fas fa-fw fa-cog"></i> <span>강의 관리</span>
        </a>
            <div id="collapseThree" class="collapse"
                aria-labelledby="headingUtilities" data-parent="#accordionSidebar">
                <div class="bg-white py-2 collapse-inner rounded">
                    <h6 class="collapse-header">Custom Utilities:</h6>
                    <a class="collapse-item" href="admin/lectureList.do">강의 목록</a> <a
                        class="collapse-item" href="admin/lectureRegister.do">강의 등록</a>
                </div>
            </div></li>

            <li class="nav-item"><a class="nav-link" href="admin/member.do">
                <i class="fas fa-fw fa-table"></i> <span>회원관리</span>
        </a></li>    

        <!-- Nav Item - Pages Collapse Menu -->
<li class="nav-item"><a class="nav-link collapsed" href="admin/faq.do"
    data-toggle="collapse" data-target="#collapseFive"
    aria-expanded="true" aria-controls="collapseFive"> <i
        class="fas fa-fw fa-cog"></i> <span>게시판관리</span>
</a>
    <div id="collapseFive" class="collapse" aria-labelledby="headingTwo"
        data-parent="#accordionSidebar">
        <div class="bg-white py-2 collapse-inner rounded">
            <h6 class="collapse-header">홈페이지에 게시된 각종 글 관리</h6>
            <a class="collapse-item" href="admin/faq.do">FAQ 관리</a> <a
                class="collapse-item" href="admin/qna.do">QnA 관리</a> <a
                class="collapse-item" href="admin/notice.do">공지사항 관리</a>
        </div>
    </div></li>    
           
<!-- Nav Item - Charts -->
<li class="nav-item"><a class="nav-link" href="admin/itemCharts.do">
        <i class="fas fa-fw fa-chart-area"></i> <span>결제내역관리</span>
</a></li>

<li class="nav-item"><a class="nav-link" href="admin/calCharts.do">
        <i class="fas fa-fw fa-chart-area"></i> <span>신고관리</span>
</a></li>

<!-- Divider -->
<hr class="sidebar-divider">

<!-- Heading -->
<div class="sidebar-heading">Interface</div>


<!-- Nav Item - Tables -->
<li class="nav-item"><a class="nav-link" href="admin/orderList.do">
        <i class="fas fa-fw fa-table"></i> <span>정산관리</span>
</a></li>
                
                
                <!-- Divider -->
                <hr class="sidebar-divider d-none d-md-block">
                
            <!-- Sidebar Toggler (Sidebar) -->
            <div class="text-center d-none d-md-inline">
                <button class="rounded-circle border-0" id="sidebarToggle"></button>
            </div>


        </ul>
        <!-- End of Sidebar -->

        <!-- Content Wrapper -->
        <div id="content-wrapper" class="d-flex flex-column">

            <!-- Main Content -->
            <div id="content">

                <!-- Topbar -->
                <nav class="navbar navbar-expand navbar-light bg-white topbar mb-4 static-top shadow">

                    <!-- Sidebar Toggle (Topbar) -->
                    <button id="sidebarToggleTop" class="btn btn-link d-md-none rounded-circle mr-3">
                        <i class="fa fa-bars"></i>
                    </button>

                    <!-- Topbar Navbar -->
                    <ul class="navbar-nav ml-auto">

                        <!-- Nav Item -->
						<li>
							<a class="dropdown-item" href="#" data-toggle="modal" data-target="#logoutModal">
                                    <i class="fas fa-sign-out-alt fa-sm fa-fw mr-2 text-gray-400"></i>
                                </a>
						</li>
                        
                    </ul>

                </nav>
                <!-- End of Topbar -->

                <!-- Begin Page Content -->
                <div class="container-fluid">
                    <div id="memberInfo1" class="card shadow mb-4">
                        <div class="card-header py-3">
                            <h6 class="m-0 font-weight-bold text-primary">회원정보 상세보기</h6>
                        </div>
                        <div class="card-body">
                            <div class="table-responsive">
                                <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
                                    
                                    <tbody id="memberDetailTbl">
                                        <tr>
                                            <th scope="row">회원명</th>
                                            <td class="mValue">값을넣어라</td>
                                        </tr>
                                        <tr>
                                            <th scope="row">ID</th>
                                            <td class="mValue">값을넣어라</td>
                                        </tr>
                                        <tr>
                                            <th scope="row">가입 날짜</th>
                                            <td class="mValue">값을넣어라</td>
                                        </tr>
                                        <tr>
                                            <th scope="row">전화번호</th>
                                            <td class="mValue">값을넣어라</td>
                                        </tr>
                                        <tr>
                                            <th scope="row">이메일</th>
                                            <td class="mValue">값을넣어라</td>
                                        </tr>
                                        <tr>
                                            <th scope="row">주소</th>
                                            <td class="mValue">값을넣어라</td>
                                        </tr>

                                    </tbody>
                                </table>
                            </div>
                        </div>
                    </div>
                    <div id="memberInfo2" class="card shadow mb-4">
                        <div class="card-header py-3">
                            <h6 class="m-0 font-weight-bold text-primary">강의구매내역</h6>
                        </div>
                            <div class="card-body">
                                <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
                                    <thead>
                                    <tr>
                                        <td>사진</td>
                                    	<td>강의 상세 번호</td>
                                    	<td>강의 이름</td>
                                        <td>구매 일자</td>
                                        <td>비고</td>
                                    </tr>
                                    </thead>
                                    <tbody>
                                        <c:forEach items='${oList }' var='list1'>
                                        	<tr>
                                        		<td>${list1.order_detail_number }</td>
                                        		<td>${list1.product_name }</td>
                                        		<td>${list1.order_detail_status }</td>
                                        		<td>${list1.order_date }</td>
                                        	</tr>
                                        </c:forEach>
                                    </tbody>
                                </table>
                            </div>
                        <div class="card-header py-3">
                            <h6 class="m-0 font-weight-bold text-primary">강의리뷰내역</h6>
                        </div>
                            <div class="card-body">
                                <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
                                    <thead>
                                    <tr>
                                    	<td>강의 이름</td>
                                    	<td>리뷰 내용</td>
                                    	<td>작성 일자</td>
                                    </tr>
                                    </thead>
                                    <tbody>
                                        <c:forEach items='${rList}' var='list2'>
                                       		 <tr>
                                        		<td>${list2.product_name}</td>
                                        		<td>${list2.review_content}</td>
                                        		<td>${list2.review_date}</td>
                                        	</tr>
                                        </c:forEach>
                                    </tbody>
                                </table>
                            </div>
                            <div class="card-header py-3">
                                <h6 class="m-0 font-weight-bold text-primary">교육과정리뷰내역</h6>
                            </div>
                                <div class="card-body">
                                    <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
                                        <thead>
                                        <tr>
                                            <td>교육과정 이름</td>
                                            <td>리뷰 내용</td>
                                            <td>작성 일자</td>
                                        </tr>
                                        </thead>
                                        <tbody>
                                            <c:forEach items='${rList}' var='list2'>
                                                    <tr>
                                                    <td>${list2.product_name}</td>
                                                    <td>${list2.review_content}</td>
                                                    <td>${list2.review_date}</td>
                                                </tr>
                                            </c:forEach>
                                        </tbody>
                                    </table>
                                </div>
                    </div>

                </div>


                <!-- /.container-fluid -->

            </div>
            <!-- End of Main Content -->

            <!-- Footer -->
            <footer class="sticky-footer bg-white">
                <div class="container my-auto">
                    <div class="copyright text-center my-auto">
                        <span>Copyright &copy; PetDo 2021</span>
                    </div>
                </div>
            </footer>
            <!-- End of Footer -->

        </div>
        <!-- End of Content Wrapper -->

    </div>
    <!-- End of Page Wrapper -->

    <!-- Scroll to Top Button-->
    <a class="scroll-to-top rounded" href="#page-top">
        <i class="fas fa-angle-up"></i>
    </a>

    <!-- Logout Modal-->
    <div class="modal fade" id="logoutModal" tabindex="-1" role="dialog"
		aria-labelledby="exampleModalLabel" aria-hidden="true">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<h5 class="modal-title" id="exampleModalLabel">로그아웃</h5>
					<button class="close" type="button" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">×</span>
					</button>
				</div>
				<div class="modal-body" >로그아웃 하시겠습니까?</div>
				<div class="modal-footer" style="height:75px;">
					<button class="btn btn-secondary" type="button" style="border-radius: 10px;"
						data-dismiss="modal">취소</button>
					<a class="btn btn-primary" href="../logOut.do" style="border-radius: 10px;">로그아웃</a>
				</div>
			</div>
		</div>
	</div>

    <!-- Bootstrap core JavaScript-->
    <script src="../admin/vendor/jquery/jquery.min.js"></script>
    <script src="../admin/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

    <!-- Core plugin JavaScript-->
    <script src="../admin/vendor/jquery-easing/jquery.easing.min.js"></script>

    <!-- Custom scripts for all pages-->
    <script src="../admin/js/sb-admin-2.min.js"></script>

    <!-- Page level plugins -->
    <script src="../admin/vendor/chart.js/Chart.min.js"></script>

    <!-- Page level custom scripts -->
    <script src="../admin/js/demo/chart-area-demo.js"></script>
    <script src="../admin/js/demo/chart-pie-demo.js"></script>

</body>

</html>