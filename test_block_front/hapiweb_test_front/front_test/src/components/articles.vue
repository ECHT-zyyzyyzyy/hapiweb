<template>
    <div>
      <el-table
        :data="artileList"
        style="width: 100%">
        <el-table-column
          prop="title"
          label="name"
          width="180">
        </el-table-column>
        <el-table-column
          prop="authorGk"
          label="author">
        </el-table-column>
      </el-table>
    </div>
</template>

<script>
export default {
  data () {
    return {
      artileList: []
    }
  },
  methods: {
    async getArticleList () {
      const bkey = this.$route.params.bkey
      const { data: res } = await this.$http.get('/post/getBlockPosts/' + bkey)
      this.artileList = res.posts
      console.log(res)
    }
  },
  created: function () {
    this.getArticleList()
  }
}
</script>

<style lang="less" scoped>

</style>
