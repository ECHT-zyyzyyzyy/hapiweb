<template>
  <el-container class='home-container'>
    <el-header>
        <span>hapiweb不知道干啥的乱七八糟系统</span>
        <!-- <div class="user-block">
          欢迎，
          <span>{{ userDto.user.username }}</span>
          <el-button type="info" @click="logout">退出</el-button>
        </div> -->
        <el-menu
            class="el-menu-demo"
            text-color="black"
            mode="horizontal"
            @select="handleSelect"
            background-color="transparent"
            active-text-color="rgb(255, 86, 114)">
            <el-menu-item index="1">{{ userDto.user.username }}</el-menu-item>
            <el-menu-item index="2">处理中心</el-menu-item>
            <el-submenu index="3">
                <template slot="title">我的工作台</template>
                <el-menu-item index="3-1">选项1</el-menu-item>
                <el-menu-item index="3-2">选项2</el-menu-item>
                <el-menu-item index="3-3">选项3</el-menu-item>
                <el-submenu index="3-4">
                    <template slot="title">选项4</template>
                    <el-menu-item index="3-4-1">选项1</el-menu-item>
                    <el-menu-item index="3-4-2">选项2</el-menu-item>
                    <el-menu-item index="3-4-3">选项3</el-menu-item>
                </el-submenu>
            </el-submenu>
            <el-menu-item index="4" disabled>消息中心</el-menu-item>
            <el-menu-item index="5">hapi</el-menu-item>
        </el-menu>
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
          username: ''
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
  },
  created: function () {
    this.$data.userDto.user.username = window.sessionStorage.getItem('username')
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

    .test-color{
        color:rgb(255, 86, 114)
    }
</style>
