<script lang="ts" setup>
import {ElForm} from 'element-plus'
import {ElFormItem} from 'element-plus'
import {ElButton} from 'element-plus'
import {ElInput} from 'element-plus'
import { reactive } from 'vue'
import {RouterLink} from "vue-router";

const form = reactive({
  phoneNumber: '',
  password : ''
})

const onLoginSubmit = () => {
  console.log('Login!')
}

</script>

<template>
  <div class="login">
    <el-form :model="form" label-width="auto" style="max-width: 600px">
      <el-form-item label="Phone Number">
        <el-input v-model="form.phoneNumber" />
      </el-form-item>
      <el-form-item label="Password">
        <el-input v-model="form.password" />
      </el-form-item>
      <el-form-item class="form-button">
        <el-button type="primary" @click="onLoginSubmit">Login</el-button>
        <RouterLink to="/signup">Signup</RouterLink>
      </el-form-item>
    </el-form>
  </div>
</template>
