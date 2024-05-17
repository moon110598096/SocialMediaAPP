<script lang="ts" setup>
import {ElForm} from 'element-plus'
import {ElFormItem} from 'element-plus'
import {ElButton} from 'element-plus'
import {ElInput} from 'element-plus'
import { reactive } from 'vue'
import {RouterLink} from "vue-router";
import axios from "axios";
import router from "@/router";

const form = reactive({
  phoneNumber: '',
  password : ''
})

const Login = async () => {
  try {
    axios.defaults.baseURL = 'http://localhost:8080'
    const response = await axios.post(
        'api/user/login', {
          userId:form.phoneNumber,
          password:form.password,
        });

    if (response.data === true) {
      alert('登入成功');
      await router.push({
        name: 'post',
        params: {
          userID: form.phoneNumber,
          userChecked: 'checked'
        }
      });
    } else {
      alert('登入失敗');
    }
  } catch (error) {
    console.error('失敗', error);
    alert('登入失敗');
  }
}

</script>

<template>
  <div class="login">
    <el-form :model="form" label-width="auto" style="max-width: 600px">
      <el-form-item label="Phone Number">
        <el-input v-model="form.phoneNumber" />
      </el-form-item>
      <el-form-item label="Password">
        <el-input type="password" v-model="form.password" />
      </el-form-item>
      <el-form-item class="form-button">
        <el-button type="primary" @click="Login">Login</el-button>
        <RouterLink to="/signup">Signup</RouterLink>
      </el-form-item>
    </el-form>
  </div>
</template>
