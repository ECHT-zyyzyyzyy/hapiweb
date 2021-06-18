<template>
    <div>
      <h3>文章列表</h3>
      <el-row>
        <el-col :span="16" style=""><div>title</div></el-col><el-col :span="8" style="background-color: rgb(184, 184, 184)"><div>author</div></el-col>
      </el-row>
      <el-row class="articleMember" v-for="item in articleList" :key="item.genkey">
        <el-col class="articleTitle" :span="16" ><div>{{ item.title }}</div></el-col><el-col :span="8" class="articleAuthor"><div>{{ item.authorGk }}</div></el-col>
      </el-row>
    </div>
</template>

<script>
export default {
  data () {
    return {
      articleList: []
    }
  },
  methods: {
    async getArticleList () {
      const bkey = this.$route.params.bkey
      const { data: res } = await this.$http.get('/post/getBlockPosts/' + bkey)
      this.articleList = res.posts
      console.log(res)
    },
    gotoArticle () {
      console.log('hello')
    }
  },
  created: function () {
    this.getArticleList()
  }
}
</script>

<style lang="less" scoped>
  .el-row {
    margin-bottom: 20px;
    &:last-child {
      margin-bottom: 0;
    }
  }
  .el-col {
    border-radius: 4px;
    background-color: rgb(238, 184, 184);
    border-radius: 0px;
    padding-left: 5px;
  }
  .articleTitle{
    height: 30px;
    background-color: rgb(235, 204, 204);
    line-height: 30px;
  }
  .articleAuthor{
    height: 30px;
    background-color: rgb(221, 221, 221);
    font-size: 10px;
    line-height: 30px;
  }
</style>
