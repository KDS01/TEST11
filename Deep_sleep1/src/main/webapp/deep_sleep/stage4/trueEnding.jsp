<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
        .linesbox{
            position: relative;
            left: 0px;
            bottom: 0px;
            width: 60%;
            height: 20%;
            margin-bottom: 10px;
            margin-left: 3rem;
            margin-right: 5rem;
            padding-top: 1rem;
            padding-left: 1rem;
            position: fixed;
            color: white;
            font-style: oblique;
            font-size: 15px;
            background-color: plum;
            box-sizing: content-box;
            display: block;
            opacity: 0.5;
            border-radius: 15px;
        }
        .namebox{
            position: absolute;
            font-size: 15px;
            box-sizing: border-box;
            padding-top: 18px;
            padding-bottom: 18px;
            padding-left: 45px;
            padding-right: 45px;
            color: black;
            background-color: white;
            display: block;
            left: 1%;
            bottom: 22%;
            border-radius: 15px;
        }
        body{
            background-image:url('/Deep_sleep1/deep_sleep/images/trueEnding.png');
            background-repeat: no-repeat;
            background-size: 1800px;
            
        }
        .menubox{
            color: black;
            background-color: white;
            position: absolute;
            right: 0%;
            bottom: 75%;
            padding-right: 0px;
            margin-bottom: 5%;
            width: 12%;
            border-radius: 10px;
            overflow: hidden;
        }
        .submenu {
        height: 0;
        overflow: hidden;
        }
        .menubox > li:hover {
        transition-duration: 0.5s;
        }
        .menubox > li:hover .submenu {
         height: 50px;
        transition-duration: 0.5s;
        }
        .timer{
            top: 0%;
            left: 50%;
        }
        .temp{
            position: absolute;
            width: 75px;
            height: 75px;
            background-color: white;
        }
    </style>
</head>
<body style="background-color:  black;">
    <div class="namebox"style="z-index: 2;">
        이름박스
    </div>
    <button type="button" class="linesbox z-index: 1;">
        대사 배열 하나씩 띄우기<br>
    </button>
    <div class="door" onclick='frontDoor()'></div>
    <div class="doorLock" onclick=""></div>
    <div class="upstair" onclick=""></div>
    <div class="downstair" onclick=""></div>

    <form action="/Deep_sleep1/deep_sleep/stage1/index.jsp">
        <button class="temp">임시버튼</button>
    </form>
    <script src="/Deep_sleep1/deep_sleep/scripts/stage1.js"></script>
</body>
</html>