<script lang="ts" setup>
import {ElForm} from 'element-plus'
import {ElFormItem} from 'element-plus'
import {ElButton} from 'element-plus'
import {ElInput} from 'element-plus'
import { reactive } from 'vue'
import {RouterLink} from "vue-router";
const form = reactive ({
  post : '',
})
const onLoginSubmit = () => {
  console.log('Login!')
}

</script>

<template>
  <div class="login">
    <el-form :model="form" label-width="auto" style="max-width: 600px">
      <el-form-item label="Post">
        <el-input v-model="form.post" />
      </el-form-item>
      <el-form-item class="form-button">
        <RouterLink to="/comment">Comment</RouterLink>
      </el-form-item>
    </el-form>
  </div>
</template>
