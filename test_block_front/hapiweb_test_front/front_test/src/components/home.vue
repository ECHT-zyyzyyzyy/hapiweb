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
            <el-menu-item index="2" @click="logout" style="color: red">退出</el-menu-item>
        </el-menu>
    </el-header>
    <el-container>
      <el-aside width="200px">
        <el-menu
            default-active="2"
            class="el-menu-vertical-demo"
            @open="handleOpen"
            @close="handleClose"
            background-color="transparent"
            text-color="black"
            active-text-color="rgb(255, 86, 114)"
            router>
          <el-menu-item :index=" '/articleList/' + item.genkey" v-for="item in menuList" :key="item.genkey">
            <template slot="title">
              <i class="el-icon-location"></i>
              <span>{{ item.name }}</span>
            </template>
          </el-menu-item>
        </el-menu>
      </el-aside>
      <el-main>
          <router-view></router-view>
      </el-main>
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
      },
      menuList: []
    }
  },
  methods: {
    logout () {
      window.sessionStorage.clear()
      this.$router.push('login')
      this.$message.success('退出成功')
    },
    async getMenuList () {
      const { data: res } = await this.$http.get('block/list')
      this.menuList = res.blocks
      console.log(res)
    }
  },
  created: function () {
    this.getMenuList()
    this.$data.userDto.user.username = window.sessionStorage.getItem('username')
  }
}
</script>

<style lang='less' scoped>
    .home-container{
        height: 100%;
    }

    .el-header{
        background-color: rgb(255, 255, 255);
        display: flex;
        justify-content: space-between;
        align-items: center;
        font-size: 20px;
        border-bottom: rgb(216, 216, 216) 1px solid;
        padding: 20px;
    }

    .el-aside{
        background-color: #ffffffb4;
        border: rgb(216, 216, 216) 1px solid;
    }

    .el-main{
        background-color: #ffffffd2;
    }

    .user-block{
        align-items: center;
    }

</style>
