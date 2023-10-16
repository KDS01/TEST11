<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Stage 1</title>
    <style>
        .linesbox{
            cursor: pointer;
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
        .li{
            color: white;
        }
        .ul{
            color: white;
        }
        .menubox{
            font-weight: bolder;
            color: white;
            background-color: rgb(0, 0, 0);
            position: absolute;
            right: -6%;
            top: 5%;
            padding-right: 0px;
            margin-bottom: 5%;
            width: 15%;
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
        .temp{
            position: absolute;
            width: 75px;
            height: 75px;
            background-color: white;
        }
    
    </style>
    <!-- <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous"> -->
    <!-- <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script> -->
</head>
<body style="background-color: black;">
    <div class="namebox"style="z-index: 2;">
        이름박스
    </div>
    <div class="linesbox" id="linebox" style="z-index: 1;" onclick='toNextStage(stage1Start)'>
    	진행하려면 여기를 클릭하세요
    </div>
    <form action="/Deep_sleep1/deep_sleep/stage1/stage1-1.jsp">
        <button class="temp">임시버튼</button>
    </form>
    
   	<script src="/Deep_sleep1/deep_sleep/scripts/stage1.js"></script>
</body>
</html>