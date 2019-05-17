<template xmlns:v-on="http://www.w3.org/1999/xhtml">
  <!--<div id="app">-->
  <!--<img src="./assets/logo.png">-->
  <!--<router-view/>-->
  <!--</div>-->
  <div class="login">
    <form action="">
      <label for="username">
        <input type="text" v-model.trim="loginData.username" name="username">
      </label>
      <label for="password">
        <input type="text" v-model.trim="loginData.password" name="password">
      </label>
      <input type="button" value="登录" @click="doLogin">
    </form>
  </div>
</template>

<script>
  import utils from './utlis/utils'

  export default {
    name: 'login',
    data () {
      return {
        loginData: {
          username: '',
          password: '',
        }
      }
    },
    method: {
      doLogin () {
        let success = (response) => {
          alert(response.data().msg)
        }
        utils.axiosMethod({
          method: 'POST',
          url: 'user/login',
          data: this.loginData,
          callback: success
        })
      }
    }
  }
</script>

<style>
  #app {
    font-family: 'Avenir', Helvetica, Arial, sans-serif;
    -webkit-font-smoothing: antialiased;
    -moz-osx-font-smoothing: grayscale;
    text-align: center;
    color: #2c3e50;
    margin-top: 60px;
  }
</style>
