<template>
    <h3>文章列表</h3>
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
      const { data: res } = await this.$http.get('/post/queryForList/' + bkey)
      this.artileList = res.posts
    }
  },
  created: function () {
    this.getArticleList()
  }
}
</script>

<style lang="less" scoped>

</style>
