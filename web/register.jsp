<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>小米商城-用户注册</title>
    <link rel="stylesheet" href="css/reigster.css">
</head>
<body>
    <div id="container">
        <div id="logo">
            <img src="images/logo.png" alt="">
        </div>
        <div id="title">
            注册小米账号
        </div>
        <div id="regform">
            <div class="reg_info">注册账号</div>
            <input type="text" name="username" id="username" placeholder="输入账号">
            <div class="info" id="errorMsg">成功注册帐号后，国家/地区将不能被修改</div>
            <div class="reg_info">初始密码</div>
            <input type="password" name="password" id="password" placeholder="初始密码">
            <div class="info">密码要符合3/4原则，包含大/小写字母、数字，符号中的三种</div>
            <input type="submit" id="register-btn" value="立即注册">
        </div>
        <div id="licence">
            已阅读并同意：小米 <strong>用户协议</strong> 和 <strong>隐私政策</strong>
        </div>
    </div>
    <footer>
        <!-- 100% 180 p100 -->
        <a href="#">简体</a>| <a href="#">繁体</a>| <a href="#">English</a>| <a href="#">常见问题</a>| <a href="#">隐私政策</a>
        <br />
        <p>小米公司版权所有-京ICP备10046444-<img src="images/ghs.png" alt="">京公网安备11010802020134号-京ICP证110507号</p>
    </footer>
    <script src="js/jquery/jquery-3.4.1.js"></script>
    <script>
        $(document).ready(function(){
            $('#register-btn').click(function () {
                $.ajax({
                    url: "/xaiomi/consumer/register",
                    method: "post",
                    data: {
                        "username": $('#username').val(),
                        "password": $('#password').val()
                    },
                    success: function (response) {
                        console.log("请求成功");
                        console.log(response);
                        if(response.errorCode == '111') {
                            alert("注册成功");
                            window.location = "/xaiomi/login.jsp";
                        } else {
                            $('#errorMsg').text(response.objectMap.msg).css("color","red");
                        }
                    },
                    error: function (response) {
                        $('#errorMsg').text("请求迷路了~~").css("color","red");
                    }
                });
            });
        });
    </script>
</body>
</html>