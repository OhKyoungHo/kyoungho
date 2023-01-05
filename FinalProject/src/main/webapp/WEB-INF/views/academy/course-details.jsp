<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!doctype html>
<html class="no-js" lang="zxx">
   <head>
      <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
      <meta charset="utf-8">
      <meta http-equiv="x-ua-compatible" content="ie=edge">
      <title>Educal – Online Learning and Education HTML5 Template </title>
      <meta name="description" content="">
      <meta name="viewport" content="width=device-width, initial-scale=1">
      <!-- Place favicon.ico in the root directory -->
      <link rel="shortcut icon" type="image/x-icon" href="../assets/img/favicon.png">
      <!-- CSS here -->
      <link rel="stylesheet" href="../assets/css/preloader.css">
      <link rel="stylesheet" href="../assets/css/bootstrap.min.css">
      <link rel="stylesheet" href="../assets/css/meanmenu.css">
      <link rel="stylesheet" href="../assets/css/animate.min.css">
      <link rel="stylesheet" href="../assets/css/owl.carousel.min.css">
      <link rel="stylesheet" href="../assets/css/swiper-bundle.css">
      <link rel="stylesheet" href="../assets/css/backToTop.css">
      <link rel="stylesheet" href="../assets/css/jquery.fancybox.min.css">
      <link rel="stylesheet" href="../assets/css/fontAwesome5Pro.css">
      <link rel="stylesheet" href="../assets/css/elegantFont.css">
      <link rel="stylesheet" href="../assets/css/default.css">
      <link rel="stylesheet" href="../assets/css/style.css">
   </head>
   <body>
      <!--[if lte IE 9]>
      <p class="browserupgrade">You are using an <strong>outdated</strong> browser. Please <a href="https://browsehappy.com/">upgrade your browser</a> to improve your experience and security.</p>
      <![endif]-->
      
      <!-- Add your site or application content here -->  

      <!-- pre loader area start -->
      <div id="loading">
         <div id="loading-center">
            <div id="loading-center-absolute">
               <div class="loading-content">
                  <img class="loading-logo-text" src="../assets/img/logo/logo-text-2.png" alt="">
                  <div class="loading-stroke">
                     <img class="loading-logo-icon" src="../assets/img/logo/logo-icon.png" alt="">
                  </div>
               </div>
            </div>
         </div>  
      </div>
      <!-- pre loader area end -->

      <!-- back to top start -->
      <div class="progress-wrap">
         <svg class="progress-circle svg-content" width="100%" height="100%" viewBox="-1 -1 102 102">
            <path d="M50,1 a49,49 0 0,1 0,98 a49,49 0 0,1 0,-98" />
         </svg>
      </div>
      <!-- back to top end -->

      <!-- header area start -->
      <header>
         <div id="header-sticky" class="header__area header__padding-2 header__shadow">
            <div class="container">
               <div class="row align-items-center">
                  <div class="col-xxl-3 col-xl-3 col-lg-4 col-md-2 col-sm-4 col-6">
                     <div class="header__left d-flex">
                        <div class="logo">
                           <a href="index">
                              <img src="../assets/img/logo/logo.png" alt="logo">
                           </a>
                        </div>
                        <div class="header__category d-none d-lg-block">
                           <nav>
                              <ul>
                                 <li>
                                    <a href="course-grid" class="cat-menu d-flex align-items-center">
                                       <div class="cat-dot-icon d-inline-block">
                                          <svg viewBox="0 0 276.2 276.2">
                                             <g>
                                                <g>
                                                   <path class="cat-dot" d="M33.1,2.5C15.3,2.5,0.9,17,0.9,34.8s14.5,32.3,32.3,32.3s32.3-14.5,32.3-32.3S51,2.5,33.1,2.5z"/>
                                                   <path class="cat-dot" d="M137.7,2.5c-17.8,0-32.3,14.5-32.3,32.3s14.5,32.3,32.3,32.3c17.8,0,32.3-14.5,32.3-32.3S155.5,2.5,137.7,2.5    z"/>
                                                   <path class="cat-dot" d="M243.9,67.1c17.8,0,32.3-14.5,32.3-32.3S261.7,2.5,243.9,2.5S211.6,17,211.6,34.8S226.1,67.1,243.9,67.1z"/>
                                                   <path class="cat-dot" d="M32.3,170.5c17.8,0,32.3-14.5,32.3-32.3c0-17.8-14.5-32.3-32.3-32.3S0,120.4,0,138.2S14.5,170.5,32.3,170.5z"/>
                                                   <path class="cat-dot" d="M136.8,170.5c17.8,0,32.3-14.5,32.3-32.3c0-17.8-14.5-32.3-32.3-32.3c-17.8,0-32.3,14.5-32.3,32.3    C104.5,156.1,119,170.5,136.8,170.5z"/>
                                                   <path class="cat-dot" d="M243,170.5c17.8,0,32.3-14.5,32.3-32.3c0-17.8-14.5-32.3-32.3-32.3s-32.3,14.5-32.3,32.3    C210.7,156.1,225.2,170.5,243,170.5z"/>
                                                   <path class="cat-dot" d="M33,209.1c-17.8,0-32.3,14.5-32.3,32.3c0,17.8,14.5,32.3,32.3,32.3s32.3-14.5,32.3-32.3S50.8,209.1,33,209.1z    "/>
                                                   <path class="cat-dot" d="M137.6,209.1c-17.8,0-32.3,14.5-32.3,32.3c0,17.8,14.5,32.3,32.3,32.3c17.8,0,32.3-14.5,32.3-32.3    S155.4,209.1,137.6,209.1z"/>
                                                   <path class="cat-dot" d="M243.8,209.1c-17.8,0-32.3,14.5-32.3,32.3c0,17.8,14.5,32.3,32.3,32.3c17.8,0,32.3-14.5,32.3-32.3    S261.6,209.1,243.8,209.1z"/>
                                                </g>
                                             </g>
                                          </svg>
                                       </div>
                                       <span>Category</span>
                                    </a>
                                    <ul class="cat-submenu">
                                       <li><a href="course-details">English Learning</a></li>
                                       <li><a href="course-details">Web Development</a></li>
                                       <li><a href="course-details">Logo Design</a></li>
                                       <li><a href="course-details">Motion Graphics</a></li>
                                       <li><a href="course-details">Video Edition</a></li>
                                    </ul>
                                 </li>
                              </ul>
                           </nav>
                        </div>
                     </div>
                  </div>
                  <div class="col-xxl-9 col-xl-9 col-lg-8 col-md-10 col-sm-8 col-6">
                     <div class="header__right d-flex justify-content-end align-items-center">
                        <div class="main-menu main-menu-2">
                           <nav id="mobile-menu">
                              <ul>
                                 <li class="has-dropdown">
                                    <a href="index">Home</a>
                                    <ul class="submenu">
                                       <li><a href="index">Home Style 1</a></li>
                                       <li><a href="index-2">Home Style 2</a></li>
                                       <li><a href="index-3">Home Style 3</a></li>
                                    </ul>
                                 </li>
                                 <li class="has-dropdown">
                                    <a href="course-grid">Courses</a>
                                    <ul class="submenu">
                                       <li><a href="course-grid">Courses</a></li>
                                       <li><a href="course-list">Course List</a></li>
                                       <li><a href="course-sidebar">Course sidebar</a></li>
                                       <li><a href="course-details">Course Details</a></li>
                                    </ul>
                                 </li>
                                 <li class="has-dropdown">
                                    <a href="blog">Blog</a>
                                    <ul class="submenu">
                                       <li><a href="blog">Blog</a></li>
                                       <li><a href="blog-details">Blog Details</a></li>
                                    </ul>
                                 </li>
                                 <li class="has-dropdown">
                                    <a href="course-grid">Pages</a>
                                    <ul class="submenu">
                                       <li><a href="about">About</a></li>
                                       <li><a href="instructor">Instructor</a></li>
                                       <li><a href="instructor-details">Instructor Details</a></li>
                                       <li><a href="event-details">Event Details</a></li>
                                       <li><a href="cart">My Cart</a></li>
                                       <li><a href="wishlist">My Wishlist</a></li>
                                       <li><a href="checkout">checkout</a></li>
                                       <li><a href="sign-in">Sign In</a></li>
                                       <li><a href="sign-up">Sign Up</a></li>
                                       <li><a href="error">Error</a></li>
                                    </ul>
                                 </li>
                                 <li><a href="contact">Contact</a></li>
                              </ul>
                           </nav>
                        </div>
                        <div class="header__btn header__btn-2 ml-50 d-none d-sm-block">
                           <a href="sign-up" class="e-btn">Sign up</a>
                        </div>
                        <div class="sidebar__menu d-xl-none">
                           <div class="sidebar-toggle-btn ml-30" id="sidebar-toggle">
                               <span class="line"></span>
                               <span class="line"></span>
                               <span class="line"></span>
                           </div>
                       </div>
                     </div>
                  </div>
               </div>
            </div>
         </div>
      </header>
      <!-- header area end -->

      <!-- cart mini area start -->
      <div class="cartmini__area">
         <div class="cartmini__wrapper">
            <div class="cartmini__title">
               <h4>Shopping cart</h4>
            </div>
            <div class="cartmini__close">
               <button type="button" class="cartmini__close-btn"><i class="fal fa-times"></i></button>
            </div>
            <div class="cartmini__widget">
               <div class="cartmini__inner">
                  <ul>
                     <li>
                        <div class="cartmini__thumb">
                           <a href="#">
                              <img src="../assets/img/course/sm/cart-1.jpg" alt="">
                           </a>
                        </div>
                        <div class="cartmini__content">
                           <h5><a href="#">Strategy law and organization Foundation </a></h5>
                           <div class="product-quantity mt-10 mb-10">
                              <span class="cart-minus">-</span>
                              <input class="cart-input" type="text" value="1"/>
                              <span class="cart-plus">+</span>
                           </div>
                           <div class="product__sm-price-wrapper">
                              <span class="product__sm-price">$46.00</span>
                           </div>
                        </div>
                        <a href="#" class="cartmini__del"><i class="fal fa-times"></i></a>
                     </li>
                     <li>
                        <div class="cartmini__thumb">
                           <a href="#">
                              <img src="../assets/img/course/sm/cart-2.jpg" alt="">
                           </a>
                        </div>
                        <div class="cartmini__content">
                           <h5><a href="#">Fundamentals of music theory Learn new</a></h5>
                           <div class="product-quantity mt-10 mb-10">
                              <span class="cart-minus">-</span>
                              <input class="cart-input" type="text" value="1"/>
                              <span class="cart-plus">+</span>
                           </div>
                           <div class="product__sm-price-wrapper">
                              <span class="product__sm-price">$32.00</span>
                           </div>
                        </div>
                        <a href="#" class="cartmini__del"><i class="fal fa-times"></i></a>
                     </li>
                     <li>
                        <div class="cartmini__thumb">
                           <a href="#">
                              <img src="../assets/img/course/sm/cart-3.jpg" alt="">
                           </a>
                        </div>
                        <div class="cartmini__content">
                           <h5><a href="#">Strategy law and organization Foundation </a></h5>
                           <div class="product-quantity mt-10 mb-10">
                              <span class="cart-minus">-</span>
                              <input class="cart-input" type="text" value="1"/>
                              <span class="cart-plus">+</span>
                           </div>
                           <div class="product__sm-price-wrapper">
                              <span class="product__sm-price">$62.00</span>
                           </div>
                        </div>
                        <a href="#" class="cartmini__del"><i class="fal fa-times"></i></a>
                     </li>
                  </ul>
               </div>
               <div class="cartmini__checkout">
                  <div class="cartmini__checkout-title mb-30">
                     <h4>Subtotal:</h4>
                     <span>$113.00</span>
                  </div>
                  <div class="cartmini__checkout-btn">
                     <a href="cart" class="e-btn e-btn-border mb-10 w-100"> <span></span> view cart</a>
                     <a href="checkout" class="e-btn w-100"> <span></span> checkout</a>
                  </div>
               </div>
            </div>
         </div>
      </div>
      <div class="body-overlay"></div>
      <!-- cart mini area end -->


      <!-- sidebar area start -->
      <div class="sidebar__area">
         <div class="sidebar__wrapper">
            <div class="sidebar__close">
               <button class="sidebar__close-btn" id="sidebar__close-btn">
               <span><i class="fal fa-times"></i></span>
               <span>close</span>
               </button>
            </div>
            <div class="sidebar__content">
               <div class="logo mb-40">
                  <a href="index">
                  <img src="../assets/img/logo/logo.png" alt="logo">
                  </a>
               </div>
               <div class="mobile-menu fix"></div>

               <div class="sidebar__search p-relative mt-40 ">
                  <form action="#">
                     <input type="text" placeholder="Search...">
                     <button type="submit"><i class="fad fa-search"></i></button>
                  </form>
               </div>
               <div class="sidebar__cart mt-30">
                  <a href="#">
                     <div class="header__cart-icon">
                        <svg viewBox="0 0 24 24">
                           <circle class="st0" cx="9" cy="21" r="1"/>
                           <circle class="st0" cx="20" cy="21" r="1"/>
                           <path class="st0" d="M1,1h4l2.7,13.4c0.2,1,1,1.6,2,1.6h9.7c1,0,1.8-0.7,2-1.6L23,6H6"/>
                        </svg>
                     </div>
                     <span class="cart-item">2</span>
                  </a>
               </div>
            </div>
         </div>
      </div>
      <!-- sidebar area end -->      
      <div class="body-overlay"></div>
      <!-- sidebar area end -->

      <main>

         <!-- page title area start -->
         <section class="page__title-area pt-120 pb-90">
            <div class="page__title-shape">
               <img class="page-title-shape-5 d-none d-sm-block" src="../assets/img/page-title/page-title-shape-1.png" alt="">
               <img class="page-title-shape-6" src="../assets/img/page-title/page-title-shape-6.png" alt="">
               <img class="page-title-shape-7" src="../assets/img/page-title/page-title-shape-4.png" alt="">
            </div>
            <div class="container">
               <div class="row">
                  <div class="col-xxl-8 col-xl-8 col-lg-8">
                     <div class="course__wrapper">
                        <div class="page__title-content mb-25">
                           <div class="page__title-breadcrumb">                            
                               <nav aria-label="breadcrumb">
                                 <ol class="breadcrumb">
                                   <li class="breadcrumb-item"><a href="index">Home</a></li>
                                   <li class="breadcrumb-item"><a href="course-grid">Courses</a></li>
                                   <li class="breadcrumb-item active" aria-current="page">${education.edTitle}</li>
                                 </ol>
                               </nav>
                           </div>
                             <!-- 국비인지 부트인지-->
                           <span class="page__title-pre">Development</span>
                             <!-- 교육과정 이름-->
                           <h5 class="page__title-3">${education.edTitle}</h5>
                        </div>
                        <div class="course__meta-2 d-sm-flex">
                           <div class="course__teacher-3 d-flex align-items-center mr-70 mb-20">
                              <div class="course__teacher-thumb-3 mr-15">
                                   <!--학원 상세페이지로 이동 -->
                                 <img src="../assets/img/course/teacher/teacher-1.jpg" alt="">
                              </div>
                              <div class="course__teacher-info-3">
                                 <h5>학원이름</h5>
                                   <!--누르면 학원 상세페이지로 이동 -->
                                 <p><a href="#">${education.edName}</a></p>
                              </div>
                           </div>
                           <div class="course__update mr-80 mb-20">
                              <h5>교육과정 기간</h5>
                                <!--날짜의 값이 들어가도록 세팅 -->
                              <p><fmt:formatDate value="${education.ed_start_date}" pattern="yyyy.MM.dd" /> ~ <fmt:formatDate value="${education.ed_end_date}" pattern="yyyy.MM.dd" /> </p>
                           </div>


                               <!--0105 찬주 별점1  평균 부분 나오는 작은부분-->
                           <div class="course__rating-2 mb-20">
                              <h5>별점:</h5>
                              <div class="course__rating-inner d-flex align-items-center">
                                 <c:if test="${avg == 1}">
                                    <img src="../assets/img/star/1s.png">
                              </c:if>
                              <c:if test="${avg == 2}">
                                    <img src="../assets/img/star/2s.png">
                              </c:if>
                              <c:if test="${avg == 3}">
                                    <img src="../assets/img/star/3s.png">
                              </c:if>
                              <c:if test="${avg == 4}">
                                    <img src="../assets/img/star/4s.png">
                              </c:if>
                              <c:if test="${avg == 5}">
                                    <img src="../assets/img/star/5s.png">
                              </c:if>
                                 <p>${avg}</p>
                              </div>
                           </div>
                        </div>


                        
                        <div class="course__tag-2 mb-15">
                           <!--여기에 해당하는 키워드(값들 꺼내서)들 넣기-->
                          <i class="fal fa-tag"></i>
                          <a>  ${education.ed_keyword}</a>
                       </div>
                        <!--해당 교육과정 이미지-->
                        <div class="course__img w-img mb-30">
                           <img src="../assets/img/course/${education.ed_pic}" alt="" width='770' height='450'>
                        </div>
                         <!--교육과정 관련 tab부분 -->
                        <div class="course__tab-2 mb-45">
                           <ul class="nav nav-tabs" id="courseTab" role="tablist">
                              <li class="nav-item" role="presentation">
                                <button class="nav-link active" id="description-tab" data-bs-toggle="tab" data-bs-target="#description" type="button" role="tab" aria-controls="description" aria-selected="true"> <i class="icon_ribbon_alt"></i> <span>상세설명</span> </button>
                              </li>
                              <li class="nav-item" role="presentation">
                                <button class="nav-link " id="curriculum-tab" data-bs-toggle="tab" data-bs-target="#curriculum" type="button" role="tab" aria-controls="curriculum" aria-selected="false"> <i class="icon_book_alt"></i> <span>교육과정</span> </button>
                              </li>
                              <li class="nav-item" role="presentation">
                                <button class="nav-link" id="review-tab" data-bs-toggle="tab" data-bs-target="#review" type="button" role="tab" aria-controls="review" aria-selected="false"> <i class="icon_star_alt"></i> <span>후기</span> </button>
                              </li>
                              <li class="nav-item" role="presentation">
                                <button class="nav-link" id="member-tab" data-bs-toggle="tab" data-bs-target="#member" type="button" role="tab" aria-controls="member" aria-selected="false"> <i class="fal fa-user"></i> <span>담당강사님들</span> </button>
                              </li>
                            </ul>
                        </div>
                        <div class="course__tab-content mb-95">
                           <div class="tab-content" id="courseTabContent">
                              <div class="tab-pane fade show active" id="description" role="tabpanel" aria-labelledby="description-tab">
                                 <div class="course__description">
                                    <h3>${education.edTitle}</h3>
                                     <!--상세내용(크롤링해서 넣기)-->
                                    <p>${education.ed_intro}</p>

                                    
                                    <div class="course__description-list mb-45">
                                       <h4>What is the Target Audience?</h4>
                                       <ul>
                                          <li> <i class="icon_check"></i> Business's managers, leaders</li>
                                          <li> <i class="icon_check"></i> Downloadable lectures, code and design ../assets for all projects</li>
                                          <li> <i class="icon_check"></i> Anyone who is finding a chance to get the promotion</li>
                                       </ul>
                                    </div>
                                    <div class="course__instructor mb-45">
                                       <h3>Other Instructors</h3>
                                       <div class="course__instructor-wrapper d-md-flex align-items-center">
                                          <div class="course__instructor-item d-flex align-items-center mr-70">
                                             <div class="course__instructor-thumb mr-20">
                                                <img src="../assets/img/course/teacher/teacher-3.jpg" alt="">
                                             </div>
                                             <div class="course__instructor-content">
                                                <h3>Eleanor Fant</h3>
                                                <p>Instructor</p>
                                             </div>
                                          </div>
                                          <div class="course__instructor-item d-flex align-items-center mr-70">
                                             <div class="course__instructor-thumb mr-20">
                                                <img src="../assets/img/course/teacher/teacher-2.jpg" alt="">
                                             </div>
                                             <div class="course__instructor-content">
                                                <h3>Lauren Stamps</h3>
                                                <p>Teacher</p>
                                             </div>
                                          </div>
                                          <div class="course__instructor-item d-flex align-items-center mr-70">
                                             <div class="course__instructor-thumb mr-20">
                                                <img src="../assets/img/course/teacher/teacher-1.jpg" alt="">
                                             </div>
                                             <div class="course__instructor-content">
                                                <h3>Jonquil Von</h3>
                                                <p>Associate</p>
                                             </div>
                                          </div>
                                       </div>
                                    </div>
                                 </div>
                              </div>

                              <!--커리큘럼-->
                              <div class="tab-pane fade" id="curriculum" role="tabpanel" aria-labelledby="curriculum-tab">
                                 <div class="course__curriculum">
                                    <c:forEach items="${title}" var="i" step="3" varStatus="status" >
                                    <div class="accordion" id="course__accordion">
                                          <div class="accordion-item mb-20">
                                             <button class="accordion-button" type="button" data-bs-toggle="collapse"
                                                data-bs-target="#${title[status.index-3]}-content" aria-expanded="true"
                                                aria-controls="${title[status.index-3]}-content">
                                                ${i}
                                             </button>
                                             </h2>
                                             <div id="${title[status.index-3]}-content" class="accordion-collapse collapse show"
                                                aria-labelledby="${title[status.index-3]}" data-bs-parent="#course__accordion">
                                                <div class="accordion-body">
                                                   <div
                                                      class="course__curriculum-content d-sm-flex justify-content-between align-items-center">
                                                      <div class="course__curriculum-info">

                                                         <svg class="document" viewBox="0 0 24 24">

                                                            <path class="st0"
                                                               d="M14,2H6C4.9,2,4,2.9,4,4v16c0,1.1,0.9,2,2,2h12c1.1,0,2-0.9,2-2V8L14,2z" />
                                                            <polyline class="st0" points="14,2 14,8 20,8 " />
                                                            <line class="st0" x1="16" y1="13" x2="8" y2="13" />
                                                            <line class="st0" x1="16" y1="17" x2="8" y2="17" />
                                                            <polyline class="st0" points="10,9 9,9 8,9 " />
                                                         </svg>
                                                         <h3><span> ${title[status.index+1]}: </span>
                                                            ${title[status.index+2]}</h3>
                                                      </div>
                                                   </div>
                                                </div>
                                             </div>
                                          </div>
                                       </c:forEach>
                                 </div>
                              </div>

                              <!----------------------------------------------------------------------------------------------------------------->
                              <!--0105 찬주 별점2  평균 부분 나오는 큰부분 -->
                              <div class="tab-pane fade" id="review" role="tabpanel" aria-labelledby="review-tab">
                                 <div class="course__review">
                                    
                                    <h3>평균 별점</h3>
                                    <p>평균 별점으로 확실히 확인하세요!</p>

                                    <div class="course__review-rating mb-50">
                                       <div class="row g-0">
                                          <div class="col-xxl-4 col-xl-4 col-lg-4 col-md-4 col-sm-4">
                                             <div class="course__review-rating-info grey-bg text-center">
                                                <h5>${avg}</h5>
                                                <c:if test="${avg == 1}">
                                                      <img src="../assets/img/star/1s.png">
                                                </c:if>
                                                <c:if test="${avg == 2}">
                                                      <img src="../assets/img/star/2s.png">
                                                </c:if>
                                                <c:if test="${avg == 3}">
                                                      <img src="../assets/img/star/3s.png">
                                                </c:if>
                                                <c:if test="${avg == 4}">
                                                      <img src="../assets/img/star/4s.png">
                                                </c:if>
                                                <c:if test="${avg == 5}">
                                                      <img src="../assets/img/star/5s.png">
                                                </c:if>
                                                <p>${avg} Ratings</p>
                                             </div>
                                          </div>
                                         
                                          <!-- 별점 큰부분 옆 이미지 대체-->
                                          <div class="col-xxl-8 col-xl-8 col-lg-8 col-md-8 col-sm-8">
                                                <img src="../assets/img/star/re.png "  height="255" width="515">
                                          </div>
                                       </div>
                                    </div>
                                  
                                   
                            

                                 <!-- 0105 찬주 등록된 리뷰확인 -->
                                    <div class="course__comment mb-75">
                                       <h3>리뷰확인</h3>
                                    <!--반복문으로 출력--> 
                                    <c:forEach var="reviewList" items="${reviewList}">  
                                       <ul>
                                          <li>
                                             <div class="course__comment-box ">
                                                <div class="course__comment-thumb float-start">
                                                   
                                                </div>
                                                <div class="course__comment-content">
                                                   <div class="course__comment-wrapper ml-70 fix">
                                                      <div class="course__comment-info float-start">
                                                         <h4>${reviewList.MId}</h4>
                                                         <span>${reviewList.reDate}</span>
                                                      </div>
                                                      <div class="course__comment-rating float-start float-sm-end">
                                                         <tr>
                                                            <td>${reviewList.star}
                                                               <c:if test="${reviewList.star ==1}">
                                                                  <img src="../assets/img/star/1s.png">
                                                               </c:if>
                                                               <c:if test="${reviewList.star ==2}">
                                                                  <img src="../assets/img/star/2s.png">
                                                               </c:if>
                                                               <c:if test="${reviewList.star ==3}">
                                                                  <img src="../assets/img/star/3s.png">
                                                               </c:if>
                                                               <c:if test="${reviewList.star ==4}">
                                                                  <img src="../assets/img/star/4s.png">
                                                               </c:if>
                                                               <c:if test="${reviewList.star ==5}">
                                                                  <img src="../assets/img/star/5s.png">
                                                               </c:if>

                                                            </td>
                                                         </tr>
                                                      </div>
                                                   </div>
                                                   <div class="course__comment-text ml-70">
                                                      <p>${reviewList.reContent}</p>
                                                </div>
                                             </div>
                                          </li>
                                       </ul>
                                    </c:forEach>
                                    </div>





                                    <!-- 0104 찬주 리뷰등록 -->
                                    <div class="course__form">
                                       <h3>리뷰작성</h3>
                                       <div class="course__form-inner">

                                          <!--form의 시작-->
                                          <form action="insertRV" method="get" name ="cmtfrm">

                                             <div class="row">
                                                <div class="col-xxl-6">
                                                   <div class="course__form-input">
                                                      <!--아이디값 저장 지금은 그냥 임의의 값 넣어줌-->
                                                      <!--참고로 re_id 는 시퀀스라 자동이고 날짜도 자동으로 들어가게 해놓음-->
                                                      <input type="text" name="MId" value='ckswn' readonly> <!-- "${sessionScope.MId}"-->
                                                    
                                                      
                                                   </div>
                                                </div>
                                                
                              
                                                <!--별점 체크 부분-->
                                                <div class="col-xxl-12">
                                                   <div class="course__form-input">
                                                      <div class="course__form-rating">
                                                         <span>별점 </span>
                                                         <img id =image1 onmouseover=show(1) onclick=mark(1) onmouseout=noshow(1) src="../assets/img/star/0star.png">
                                                         <img id =image2 onmouseover=show(2) onclick=mark(2) onmouseout=noshow(2) src="../assets/img/star/0star.png">
                                                         <img id =image3 onmouseover=show(3) onclick=mark(3) onmouseout=noshow(3) src="../assets/img/star/0star.png">
                                                         <img id =image4 onmouseover=show(4) onclick=mark(4) onmouseout=noshow(4) src="../assets/img/star/0star.png">
                                                         <img id =image5 onmouseover=show(5) onclick=mark(5) onmouseout=noshow(5) src="../assets/img/star/0star.png">
                                                         <span id=startext></span>
                                                         <input type="hidden" name="star" > <!--히든넘기기-->
                                                         <input type="hidden" name="edId" value="333"> <!--히든넘기기--> <!--임의의값임 수정해야함-->
                                                      </div>

                                                     <!--작성글 들어가는 부분!-->
                                                      <textarea placeholder="리뷰를작성" name="reContent" ></textarea>
                                                   </div>
                                                </div>
                                            

                                             </div>
                                             <div class="row">
                                                <div class="col-xxl-12">
                                                   <div class="course__form-btn mt-10 mb-55">
                                                      <button type="submit" class="e-btn">글 등록</button>
                                                   </div>
                                                </div>
                                             </div>
                                         
                                          </form>
                                       </div>
                                    </div>
                                    <!--0105 리뷰부분 종료 여기까지-->











                                    




                              <div class="tab-pane fade" id="member" role="tabpanel" aria-labelledby="member-tab">
                                 <div class="course__member mb-45">
                                    <div class="course__member-item">
                                       <div class="row align-items-center">
                                          <div class="col-xxl-5 col-xl-5 col-lg-5 col-md-5 col-sm-6">
                                             <div class="course__member-thumb d-flex align-items-center">
                                                <img src="../assets/img/course/instructor/course-instructor-1.jpg" alt="">
                                                <div class="course__member-name ml-20">
                                                   <h5>Shahnewaz Sakil</h5>
                                                   <span>Engineer</span>
                                                </div>
                                             </div>
                                          </div>
                                          <div class="col-xxl-2 col-xl-2 col-lg-2 col-md-2 col-sm-2 col-4">
                                             <div class="course__member-info pl-45">
                                                <h5>07</h5>
                                                <span>Courses</span>
                                             </div>
                                          </div>
                                          <div class="col-xxl-2 col-xl-2 col-lg-2 col-md-2 col-sm-2 col-4">
                                             <div class="course__member-info pl-70">
                                                <h5>05</h5>
                                                <span>Reviw</span>
                                             </div>
                                          </div>
                                          <div class="col-xxl-2 col-xl-2 col-lg-2 col-md-2 col-sm-2 col-4">
                                             <div class="course__member-info pl-85">
                                                <h5>3.00</h5>
                                                <span>Rating</span>
                                             </div>
                                          </div>
                                       </div>
                                    </div>
                                 </div>
                              </div>
                              <div class="course__share">
                                 <h3>Share :</h3>
                                 <ul>
                                    <li><a href="#" class="fb" ><i class="social_facebook"></i></a></li>
                                    <li><a href="#" class="tw" ><i class="social_twitter"></i></a></li>
                                    <li><a href="#" class="pin" ><i class="social_pinterest"></i></a></li>
                                 </ul>
                              </div>
                            </div>
                        </div>
                        <div class="course__related">
                           <div class="row">
                              <div class="col-xxl-12">
                                 <div class="section__title-wrapper mb-40">
                                    <h2 class="section__title">Related <span class="yellow-bg yellow-bg-big">Course<img src="../assets/img/shape/yellow-bg.png" alt=""></span></h2>
                                    <p>You don't have to struggle alone, you've got our assistance and help.</p>
                                 </div>
                              </div>
                           </div>
                           <div class="row">
                              <div class="col-xxl-12">
                                 <div class="course__slider swiper-container pb-60">
                                    <div class="swiper-wrapper">
                                       <div class="course__item course__item-3 swiper-slide white-bg mb-30 fix">
                                          <div class="course__thumb w-img p-relative fix">
                                             <a href="course-details">
                                                <img src="../assets/img/course/course-1.jpg" alt="">
                                             </a>
                                             <div class="course__tag">
                                                <a href="#">Art & Design</a>
                                             </div>
                                          </div>
                                          <div class="course__content">
                                             <div class="course__meta d-flex align-items-center justify-content-between">
                                                <div class="course__lesson">
                                                   <span><i class="far fa-book-alt"></i>43 Lesson</span>
                                                </div>
                                                <div class="course__rating">
                                                   <span><i class="icon_star"></i>4.5 (44)</span>
                                                </div>
                                             </div>
                                             <h3 class="course__title"><a href="course-details">Become a product Manager learn the skills & job.</a></h3>
                                             <div class="course__teacher d-flex align-items-center">
                                                <div class="course__teacher-thumb mr-15">
                                                   <img src="../assets/img/course/teacher/teacher-1.jpg" alt="">
                                                </div>
                                                <h6><a href="instructor-details">Jim Séchen</a></h6>
                                             </div>
                                          </div>
                                          <div class="course__more d-flex justify-content-between align-items-center">
                                             <div class="course__status">
                                                <span>Free</span>
                                             </div>
                                             <div class="course__btn">
                                                <a href="course-details" class="link-btn">
                                                   Know Details
                                                   <i class="far fa-arrow-right"></i>
                                                   <i class="far fa-arrow-right"></i>
                                                </a>
                                             </div>
                                          </div>
                                       </div>
                                       <div class="course__item course__item-3 swiper-slide white-bg mb-30 fix">
                                          <div class="course__thumb w-img p-relative fix">
                                             <a href="course-details">
                                                <img src="../assets/img/course/course-2.jpg" alt="">
                                             </a>
                                             <div class="course__tag">
                                                <a href="#" class="sky-blue">Mechanical</a>
                                             </div>
                                          </div>
                                          <div class="course__content">
                                             <div class="course__meta d-flex align-items-center justify-content-between">
                                                <div class="course__lesson">
                                                   <span><i class="far fa-book-alt"></i>72 Lesson</span>
                                                </div>
                                                <div class="course__rating">
                                                   <span><i class="icon_star"></i>4.5 (44)</span>
                                                </div>
                                             </div>
                                             <h3 class="course__title"><a href="course-details">Fundamentals of music theory Learn new</a></h3>
                                             <div class="course__teacher d-flex align-items-center">
                                                <div class="course__teacher-thumb mr-15">
                                                   <img src="../assets/img/course/teacher/teacher-2.jpg" alt="">
                                                </div>
                                                <h6><a href="instructor-details">Barry Tone</a></h6>
                                             </div>
                                          </div>
                                          <div class="course__more d-flex justify-content-between align-items-center">
                                             <div class="course__status d-flex align-items-center">
                                                <span class="sky-blue">$32.00</span>
                                                <span class="old-price">$68.00</span>
                                             </div>
                                             <div class="course__btn">
                                                <a href="course-details" class="link-btn">
                                                   Know Details
                                                   <i class="far fa-arrow-right"></i>
                                                   <i class="far fa-arrow-right"></i>
                                                </a>
                                             </div>
                                          </div>
                                       </div>
                                       <div class="course__item course__item-3 swiper-slide white-bg mb-30 fix">
                                          <div class="course__thumb w-img p-relative fix">
                                             <a href="course-details">
                                                <img src="../assets/img/course/course-3.jpg" alt="">
                                             </a>
                                             <div class="course__tag">
                                                <a href="#" class="green">Development</a>
                                             </div>
                                          </div>
                                          <div class="course__content">
                                             <div class="course__meta d-flex align-items-center justify-content-between">
                                                <div class="course__lesson">
                                                   <span><i class="far fa-book-alt"></i>14 Lesson</span>
                                                </div>
                                                <div class="course__rating">
                                                   <span><i class="icon_star"></i>3.5 (55)</span>
                                                </div>
                                             </div>
                                             <h3 class="course__title"><a href="course-details">Strategy law and organization Foundation</a></h3>
                                             <div class="course__teacher d-flex align-items-center">
                                                <div class="course__teacher-thumb mr-15">
                                                   <img src="../assets/img/course/teacher/teacher-3.jpg" alt="">
                                                </div>
                                                <h6><a href="instructor-details">Elon Gated</a></h6>
                                             </div>
                                          </div>
                                          <div class="course__more d-flex justify-content-between align-items-center">
                                             <div class="course__status d-flex align-items-center">
                                                <span class="green">$46.00</span>
                                                <span class="old-price">$68.00</span>
                                             </div>
                                             <div class="course__btn">
                                                <a href="course-details" class="link-btn">
                                                   Know Details
                                                   <i class="far fa-arrow-right"></i>
                                                   <i class="far fa-arrow-right"></i>
                                                </a>
                                             </div>
                                          </div>
                                       </div>
                                       <div class="course__item course__item-3 swiper-slide white-bg mb-30 fix">
                                          <div class="course__thumb w-img p-relative fix">
                                             <a href="course-details">
                                                <img src="../assets/img/course/course-4.jpg" alt="">
                                             </a>
                                             <div class="course__tag">
                                                <a href="#" class="blue">Marketing</a>
                                             </div>
                                          </div>
                                          <div class="course__content">
                                             <div class="course__meta d-flex align-items-center justify-content-between">
                                                <div class="course__lesson">
                                                   <span><i class="far fa-book-alt"></i>22 Lesson</span>
                                                </div>
                                                <div class="course__rating">
                                                   <span><i class="icon_star"></i>4.5 (42)</span>
                                                </div>
                                             </div>
                                             <h3 class="course__title"><a href="course-details">The business Intelligence analyst Course 2022</a></h3>
                                             <div class="course__teacher d-flex align-items-center">
                                                <div class="course__teacher-thumb mr-15">
                                                   <img src="../assets/img/course/teacher/teacher-4.jpg" alt="">
                                                </div>
                                                <h6><a href="instructor-details">Eleanor Fant</a></h6>
                                             </div>
                                          </div>
                                          <div class="course__more d-flex justify-content-between align-items-center">
                                             <div class="course__status d-flex align-items-center">
                                                <span class="blue">$62.00</span>
                                                <span class="old-price">$97.00</span>
                                             </div>
                                             <div class="course__btn">
                                                <a href="course-details" class="link-btn">
                                                   Know Details
                                                   <i class="far fa-arrow-right"></i>
                                                   <i class="far fa-arrow-right"></i>
                                                </a>
                                             </div>
                                          </div>
                                       </div>
                                    </div>
                                    <!-- Add Pagination -->
                                    <div class="swiper-pagination"></div>
                                 </div>
                              </div>
                           </div>
                        </div>
                     </div>
                  </div>
                  <div class="col-xxl-4 col-xl-4 col-lg-4">
                     <div class="course__sidebar pl-70 p-relative">
                        <div class="course__shape">
                           <img class="course-dot" src="../assets/img/course/course-dot.png" alt="">
                        </div>
                        <div class="course__sidebar-widget-2 white-bg mb-20">
                           <div class="course__video">
                              <div class="course__video-thumb w-img mb-25">
                                 <img src="../assets/img/course/video/course-video.jpg" alt="">
                                 <div class="course__video-play"> 
                                    <a href="https://youtu.be/yJg-Y5byMMw" data-fancybox="" class="play-btn"> <i class="fas fa-play"></i> </a>
                                 </div>
                              </div>
                              <div class="course__video-meta mb-25 d-flex align-items-center justify-content-between">
                                 <div class="course__video-price">
                                    <h5>$74.<span>00</span> </h5>
                                    <h5 class="old-price">$129.00</h5>
                                 </div>
                                 <div class="course__video-discount">
                                    <span>68% OFF</span>
                                 </div>
                              </div>
                              <div class="course__video-content mb-35">
                                 <ul>
                                    <li class="d-flex align-items-center">
                                       <div class="course__video-icon">
                                          <svg version="1.1" xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" x="0px" y="0px" viewBox="0 0 16 16" style="enable-background:new 0 0 16 16;" xml:space="preserve">
                                             <path class="st0" d="M2,6l6-4.7L14,6v7.3c0,0.7-0.6,1.3-1.3,1.3H3.3c-0.7,0-1.3-0.6-1.3-1.3V6z"/>
                                             <polyline class="st0" points="6,14.7 6,8 10,8 10,14.7 "/>
                                          </svg>
                                       </div>
                                       <div class="course__video-info">
                                          <h5><span>Instructor :</span> Eleanor Fant</h5>
                                       </div>
                                    </li>
                                    <li class="d-flex align-items-center">
                                       <div class="course__video-icon">
                                          <svg version="1.1" xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" x="0px" y="0px" viewBox="0 0 24 24" style="enable-background:new 0 0 24 24;" xml:space="preserve">
                                             
                                             <path class="st0" d="M4,19.5C4,18.1,5.1,17,6.5,17H20"/>
                                             <path class="st0" d="M6.5,2H20v20H6.5C5.1,22,4,20.9,4,19.5v-15C4,3.1,5.1,2,6.5,2z"/>
                                          </svg>
                                       </div>
                                       <div class="course__video-info">
                                          <h5><span>Lectures :</span>14</h5>
                                       </div>
                                    </li>
                                    <li class="d-flex align-items-center">
                                       <div class="course__video-icon">
                                          <svg version="1.1" xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" x="0px" y="0px" viewBox="0 0 16 16" style="enable-background:new 0 0 16 16;" xml:space="preserve">
                                             <circle class="st0" cx="8" cy="8" r="6.7"/>
                                             <polyline class="st0" points="8,4 8,8 10.7,9.3 "/>
                                          </svg>
                                       </div>
                                       <div class="course__video-info">
                                          <h5><span>Duration :</span>6 weeks</h5>
                                       </div>
                                    </li>
                                    <li class="d-flex align-items-center">
                                       <div class="course__video-icon">
                                          <svg>
                                             <path class="st0" d="M13.3,14v-1.3c0-1.5-1.2-2.7-2.7-2.7H5.3c-1.5,0-2.7,1.2-2.7,2.7V14"/>
                                             <circle class="st0" cx="8" cy="4.7" r="2.7"/>
                                          </svg>
                                       </div>
                                       <div class="course__video-info">
                                          <h5><span>Enrolled :</span>20 students</h5>
                                       </div>
                                    </li>
                                    <li class="d-flex align-items-center">
                                       <div class="course__video-icon">
                                          <svg>
                                             <circle class="st0" cx="8" cy="8" r="6.7"/>
                                             <line class="st0" x1="1.3" y1="8" x2="14.7" y2="8"/>
                                             <path class="st0" d="M8,1.3c1.7,1.8,2.6,4.2,2.7,6.7c-0.1,2.5-1,4.8-2.7,6.7C6.3,12.8,5.4,10.5,5.3,8C5.4,5.5,6.3,3.2,8,1.3z"/>
                                          </svg>
                                       </div>
                                       <div class="course__video-info">
                                          <h5><span>Language :</span>English</h5>
                                       </div>
                                    </li>
                                 </ul>
                              </div>
                              <div class="course__payment mb-35">
                                 <h3>Payment:</h3>
                                 <a href="#">
                                    <img src="../assets/img/course/payment/payment-1.png" alt="">
                                 </a>
                              </div>
                              <div class="course__enroll-btn">
                                 <a href="contact" class="e-btn e-btn-7 w-100">Enroll <i class="far fa-arrow-right"></i></a>
                              </div>
                           </div>
                        </div>
                        <div class="course__sidebar-widget-2 white-bg mb-20">
                           <div class="course__sidebar-course">
                              <h3 class="course__sidebar-title">Related courses</h3>
                              <ul>
                                 <li>
                                    <div class="course__sm d-flex align-items-center mb-30">
                                       <div class="course__sm-thumb mr-20">
                                          <a href="#">
                                             <img src="../assets/img/course/sm/course-sm-1.jpg" alt="">
                                          </a>
                                       </div>
                                       <div class="course__sm-content">
                                          <div class="course__sm-rating">
                                             <ul>
                                                <li><a href="#"> <i class="icon_star"></i> </a></li>
                                                <li><a href="#"> <i class="icon_star"></i> </a></li>
                                                <li><a href="#"> <i class="icon_star"></i> </a></li>
                                                <li><a href="#"> <i class="icon_star"></i> </a></li>
                                                <li><a href="#"> <i class="icon_star"></i> </a></li>
                                             </ul>
                                          </div>
                                          <h5><a href="#">Development</a></h5>
                                          <div class="course__sm-price">
                                             <span>$54.00</span>
                                          </div>
                                       </div>
                                    </div>
                                 </li>
                                 <li>
                                    <div class="course__sm d-flex align-items-center mb-30">
                                       <div class="course__sm-thumb mr-20">
                                          <a href="#">
                                             <img src="../assets/img/course/sm/course-sm-2.jpg" alt="">
                                          </a>
                                       </div>
                                       <div class="course__sm-content">
                                          <div class="course__sm-rating">
                                             <ul>
                                                <li><a href="#"> <i class="icon_star"></i> </a></li>
                                                <li><a href="#"> <i class="icon_star"></i> </a></li>
                                                <li><a href="#"> <i class="icon_star"></i> </a></li>
                                                <li><a href="#"> <i class="icon_star"></i> </a></li>
                                                <li><a href="#"> <i class="icon_star"></i> </a></li>
                                             </ul>
                                          </div>
                                          <h5><a href="#">Data Science</a></h5>
                                          <div class="course__sm-price">
                                             <span>$72.00</span>
                                          </div>
                                       </div>
                                    </div>
                                 </li>
                                 <li>
                                    <div class="course__sm d-flex align-items-center mb-10">
                                       <div class="course__sm-thumb mr-20">
                                          <a href="#">
                                             <img src="../assets/img/course/sm/course-sm-3.jpg" alt="">
                                          </a>
                                       </div>
                                       <div class="course__sm-content">
                                          <div class="course__sm-rating">
                                             <ul>
                                                <li><a href="#"> <i class="icon_star"></i> </a></li>
                                                <li><a href="#"> <i class="icon_star"></i> </a></li>
                                                <li><a href="#"> <i class="icon_star"></i> </a></li>
                                                <li><a href="#"> <i class="icon_star"></i> </a></li>
                                                <li><a href="#"> <i class="icon_star"></i> </a></li>
                                             </ul>
                                          </div>
                                          <h5><a href="#">UX Design</a></h5>
                                          <div class="course__sm-price">
                                             <span>Free</span>
                                          </div>
                                       </div>
                                    </div>
                                 </li>
                              </ul>
                           </div>
                        </div>
                     </div>
                  </div>
               </div>
            </div>
         </section>
         <!-- page title area end -->


         <!-- cta area start -->
         <section class="cta__area mb--120">
            <div class="container">
               <div class="cta__inner blue-bg fix">
                  <div class="cta__shape">
                     <img src="../assets/img/cta/cta-shape.png" alt="">
                  </div>
                  <div class="row align-items-center">
                     <div class="col-xxl-7 col-xl-7 col-lg-8 col-md-8">
                        <div class="cta__content">
                           <h3 class="cta__title">You can be your own Guiding star with our help</h3>
                        </div>
                     </div>
                     <div class="col-xxl-5 col-xl-5 col-lg-4 col-md-4">
                        <div class="cta__more d-md-flex justify-content-end p-relative z-index-1">
                           <a href="contact" class="e-btn e-btn-white">Get Started</a>
                        </div>
                     </div>
                  </div>
               </div>
            </div>
         </section>
         <!-- cta area end -->


      </main>

         <!-- footer area start -->
         <footer>
            <div class="footer__area footer-bg">
               <div class="footer__top pt-190 pb-40">
                  <div class="container">
                     <div class="row">
                        <div class="col-xxl-3 col-xl-3 col-lg-3 col-md-4 col-sm-6">
                           <div class="footer__widget mb-50">
                              <div class="footer__widget-head mb-22">
                                 <div class="footer__logo">
                                    <a href="index">
                                       <img src="../assets/img/logo/logo-2.png" alt="">
                                    </a>
                                 </div>
                              </div>
                              <div class="footer__widget-body">
                                 <p>Great lesson ideas and lesson plans for ESL teachers! Educators can customize lesson plans to best.</p>

                                 <div class="footer__social">
                                    <ul>
                                       <li><a href="#"><i class="social_facebook"></i></a></li>
                                       <li><a href="#" class="tw"><i class="social_twitter"></i></a></li>
                                       <li><a href="#" class="pin"><i class="social_pinterest"></i></a></li>
                                    </ul>
                                 </div>
                              </div>
                           </div>
                        </div>
                        <div class="col-xxl-2 offset-xxl-1 col-xl-2 offset-xl-1 col-lg-3 offset-lg-0 col-md-2 offset-md-1 col-sm-5 offset-sm-1">
                           <div class="footer__widget mb-50">
                              <div class="footer__widget-head mb-22">
                                 <h3 class="footer__widget-title">Company</h3>
                              </div>
                              <div class="footer__widget-body">
                                 <div class="footer__link">
                                    <ul>
                                       <li><a href="#">About</a></li>
                                       <li><a href="#">Courses</a></li>
                                       <li><a href="#">Events</a></li>
                                       <li><a href="#">Instructor</a></li>
                                       <li><a href="#">Career</a></li>
                                       <li><a href="#">Become a Teacher</a></li>
                                       <li><a href="#">Contact</a></li>
                                    </ul>
                                 </div>
                              </div>
                           </div>
                        </div>
                        <div class="col-xxl-2 col-xl-2 col-lg-2 offset-lg-0 col-md-3 offset-md-1 col-sm-6">
                           <div class="footer__widget mb-50">
                              <div class="footer__widget-head mb-22">
                                 <h3 class="footer__widget-title">Platform</h3>
                              </div>
                              <div class="footer__widget-body">
                                 <div class="footer__link">
                                    <ul>
                                       <li><a href="#">Browse Library</a></li>
                                       <li><a href="#">Library</a></li>
                                       <li><a href="#">Partners</a></li>
                                       <li><a href="#">News & Blogs</a></li>
                                       <li><a href="#">FAQs</a></li>
                                       <li><a href="#">Tutorials</a></li>
                                    </ul>
                                 </div>
                              </div>
                           </div>
                        </div>
                        <div class="col-xxl-4 col-xl-4 col-lg-4 col-md-5 col-sm-6">
                           <div class="footer__widget footer__pl-70 mb-50">
                              <div class="footer__widget-head mb-22">
                                 <h3 class="footer__widget-title">Subscribe</h3>
                              </div>
                              <div class="footer__widget-body">
                                 <div class="footer__subscribe">
                                    <form action="#">
                                       <div class="footer__subscribe-input mb-15">
                                          <input type="email" placeholder="Your email address">
                                          <button type="submit">
                                             <i class="far fa-arrow-right"></i>
                                             <i class="far fa-arrow-right"></i>
                                          </button>
                                       </div>
                                    </form>
                                    <p>Get the latest news and updates right at your inbox.</p>
                                 </div>
                              </div>
                           </div>
                        </div>
                     </div>
                  </div>
               </div>
               <div class="footer__bottom">
                  <div class="container">
                     <div class="row">
                        <div class="col-xxl-12">
                           <div class="footer__copyright text-center">
                              <p>© 2022 Educal, All Rights Reserved. Design By <a href="index">Theme Pure</a></p>
                           </div>
                        </div>
                     </div>
                  </div>
               </div>
            </div>
         </footer>
         <!-- footer area end -->
      <!-- JS here -->
      <script src="../assets/js/vendor/jquery-3.5.1.min.js"></script>
      <script src="../assets/js/vendor/waypoints.min.js"></script>
      <script src="../assets/js/bootstrap.bundle.min.js"></script>
      <script src="../assets/js/jquery.meanmenu.js"></script>
      <script src="../assets/js/swiper-bundle.min.js"></script>
      <script src="../assets/js/owl.carousel.min.js"></script>
      <script src="../assets/js/jquery.fancybox.min.js"></script>
      <script src="../assets/js/isotope.pkgd.min.js"></script>
      <script src="../assets/js/parallax.min.js"></script>
      <script src="../assets/js/backToTop.js"></script>
      <script src="../assets/js/jquery.counterup.min.js"></script>
      <script src="../assets/js/ajax-form.js"></script>
      <script src="../assets/js/wow.min.js"></script>
      <script src="../assets/js/imagesloaded.pkgd.min.js"></script>
      <script src="../assets/js/main.js"></script>
      <script src="../assets/js/star.js"></script>
   </body>
</html>

