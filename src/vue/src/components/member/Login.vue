<template>
   <div>
    <h2>Login Form</h2>
    <form action="#" method="post">
        <div class="imgcontainer">
            <img src="https://www.mpps.co.kr/kfcs_api_img/KFCS/goods/DL_2173811_20200225154413370.png" alt="Avatar" class="avatar">
        </div>
        <div class="container">
            <label><b>Username</b></label>
            <input type="text" placeholder="Enter Username" name="uname" required>
            <label><b>Password</b></label>
            <input type="password" placeholder="Enter Password" name="psw" required>
            <router-link to="/calculator">
            <button @click="login" type="submit">Login</button>
            </router-link>
                <label>
                <input type="checkbox" checked="checked" name="remember"> Remember me
            </label>
        </div>
        <div class="container" style="background-color:rgba(255, 214, 103, 0.4)">
            <button type="button" class="cancelbtn">Cancel</button>
            <span class="psw">Forgot <a href="#">password?</a></span>
        </div>
    </form>
   </div>
</template>
<script>
    export default {
        name: "Login",

    }
</script>
<style scoped>
    form {border: 3px solid rgba(254, 255, 187, 0.18);}
    input[type=text], input[type=password] {
        width: 100%;
        padding: 12px 20px;
        margin: 8px 0;
        display: inline-block;
        border: 1px solid #ccc;
        box-sizing: border-box;
    }
    button {
        background-color: rgba(12, 41, 146, 0.6);
        color: #EAE9E2DB;
        padding: 14px 20px;
        margin: 8px 0;
        border: none;
        cursor: pointer;
        width: 100%;
    }
    button:hover {
        opacity: 0.8;
    }
    .cancelbtn {
        width: auto;
        padding: 10px 18px;
        background-color: rgba(244, 67, 54, 0.95);
    }
    .imgcontainer {
        text-align: center;
        margin: 24px 0 12px 0;
    }
    img.avatar {
        width: 40%;
        border-radius: 50%;
    }
    .container {
        padding: 16px;
    }
    span.psw {
        float: right;
        padding-top: 16px;
    }
    /* Change styles for span and cancel button on extra small screens */
    @media screen and (max-width: 300px) {
        span.psw {
            display: block;
            float: none;
        }
        .cancelbtn {
            width: 100%;
        }
    }
</style>