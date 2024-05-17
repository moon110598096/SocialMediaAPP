<script lang="ts" setup>
import {ElForm} from 'element-plus'
import {ElFormItem} from 'element-plus'
import {ElButton} from 'element-plus'
import {ElInput} from 'element-plus'
import { reactive } from 'vue'
import {RouterLink} from "vue-router";
import axios from 'axios';
import router from '../router';

const form = reactive({
  phoneNumber: '',
  password : '',
  name : '',
  email : '',
  biography : '',
})

const signup = async () => {
  try {
    axios.defaults.baseURL = 'http://localhost:8080'
    const response = await axios.post(
        'api/user/user', {
          userId:form.phoneNumber,
          password:form.password,
          userName:form.name,
          email:form.email,
          biography:form.biography,
        });

    if (response.data === true) {
      alert('創建成功');
      await router.push({name: 'login'});
    } else {
      alert('創建失敗');
    }
  } catch (error) {
    console.error('失敗', error);
    alert('創建失敗');
  }
};

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
        <el-button type="primary" @click="signup">Complete!</el-button>
      </el-form-item>
    </el-form>
  </div>
</template>
