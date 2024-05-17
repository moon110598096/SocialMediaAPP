<script lang="ts" setup>
import {ElForm} from 'element-plus'
import {ElFormItem} from 'element-plus'
import {ElButton} from 'element-plus'
import {ElInput} from 'element-plus'
import { reactive } from 'vue'
import {RouterLink} from "vue-router";

const form = reactive({
  phoneNumber: '',
  password : '',
  name : '',
  email : '',
  biography : '',
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
      <el-form-item label="Name">
        <el-input v-model="form.name" />
      </el-form-item>
      <el-form-item label="email">
        <el-input v-model="form.email" />
      </el-form-item>
      <el-form-item label="個人簡介">
        <el-input v-model="form.biography" />
      </el-form-item>
      <el-form-item class="form-button">
        <el-button type="primary" @click="onLoginSubmit">Complete!</el-button>
      </el-form-item>
    </el-form>
  </div>
</template>
