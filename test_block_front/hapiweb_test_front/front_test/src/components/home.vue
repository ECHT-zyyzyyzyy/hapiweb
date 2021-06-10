<template>
  <el-container class='home-container'>
    <el-header>
        <span>hapiweb不知道干啥的乱七八糟系统</span>
        <div class="user-block">
          <span>{{ userDto.user.username }}</span>
          <el-button type="info" @click="logout">退出</el-button>
        </div>
    </el-header>
    <el-container>
      <el-aside width="200px">Aside</el-aside>
      <el-main>Main</el-main>
    </el-container>
  </el-container>
</template>

<script>
export default {
  data () {
    return {
      userDto: {
        user: {
          genkey: '',
          username: 'adc',
          password: ''
        }
      }
    }
  },
  methods: {
    logout () {
      window.sessionStorage.clear()
      this.$router.push('login')
      this.$message.success('退出成功')
    }
  }
}
</script>

<style lang='less' scoped>
    .home-container{
        height: 100%;
    }

    .el-header{
        background-color: #e0b2b27e;
        display: flex;
        justify-content: space-between;
        align-items: center;
        font-size: 20px;
    }

    .el-aside{
        background-color: #bba4c2b4;
    }

    .el-main{
        background-color: #ece7e1d2;
    }

    .user-block{
        align-items: center;
    }
</style>
