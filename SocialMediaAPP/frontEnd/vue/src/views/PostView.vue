<script lang="ts" setup>
import {ElForm} from 'element-plus'
import {ElFormItem} from 'element-plus'
import {ElButton} from 'element-plus'
import {ElInput} from 'element-plus'
import { reactive } from 'vue'
import {RouterLink, useRoute} from "vue-router";
import axios from "axios";
import router from "@/router";

const route = useRoute();
let userId = route.params.userID;
let loginChecked = route.params.userChecked;

const form = reactive ({
  postContent : '',
})
const postSubmit = async () => {
  try {
    axios.defaults.baseURL = 'http://localhost:8080'
    const response = await axios.post(
        'api/article/article', {
          authorID:userId,
          content:form.postContent,
        });

    if (response.data === true) {
      alert('發表成功');
    } else {
      alert('發表失敗');
    }
  } catch (error) {
    console.error('失敗', error);
    alert('發表失敗');
  }
}

</script>

<template>
  <div class="login">
    <el-form :model="form" label-width="auto" style="max-width: 600px">
      <el-form-item label="Post">
        <el-input v-model="form.postContent" />
      </el-form-item>
      <el-form-item class="form-button">
        <el-button type="primary" @click="postSubmit">發表!</el-button>
      </el-form-item>
    </el-form>
  </div>
</template>
