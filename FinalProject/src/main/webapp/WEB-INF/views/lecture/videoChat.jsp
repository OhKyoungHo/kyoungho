<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>

<!DOCTYPE html>
<html>
  <head>
    <meta charset='utf-8'>
    <meta http-equiv='X-UA-Compatible' content='IE=edge'>
    <title>PeerChat</title>
    <meta name='viewport' content='width=device-width, initial-scale=1'>
    <link rel='stylesheet' type='text/css' media='screen' href='/assets/css/videoChat.css'>
  </head>
  <body>

    <div id="videos">
      <video class="video-player" id="user-1" autoplay playsinline></video>
      <video class="video-player" id="user-2" autoplay playsinline></video>
    </div>

    <div id="controls">

        <div class="control-container" id="camera-btn">
            <img src="/assets/img/icon/videoChat/camera.png" />
        </div>

        <div class="control-container" id="mic-btn">
            <img src="/assets/img/icon/videoChat/mic.png" />
        </div>

        <a href="lobby.html">
            <div class="control-container" id="leave-btn">
                <img src="/assets/img/icon/videoChat/phone.png" />
            </div>
        </a>

    </div>
    
    <!-- These scripts will be served by Spring Boot -->
    <script src="https://192.168.0.57:3000/socket.io/socket.io.js"></script>
    <script src="https://unpkg.com/peerjs@1.4.7/dist/peerjs.min.js"></script>
    <script src="/assets/js/videoChat-client.js"></script>
  </body>
</html>