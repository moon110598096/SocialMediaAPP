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
const historyForm = reactive({
  postList:''
})

const form = reactive ({
  postContent : '',
})

const refreshSubmit = async () => {
  try {
    axios.defaults.baseURL = 'http://localhost:8080'
    const response = await axios.get(
        'api/article/article');

    historyForm.postList = response.data
  } catch (error) {
    console.error('失敗', error);
    alert('發表失敗');
  }
}
const commentSubmit = async (postID) => {

}
const EditSubmit = async (postID) => {

}
const DelSubmit = async (postID) => {
  axios.defaults.baseURL = 'http://localhost:8080'
  try{
  const response = await axios.delete(
      'api/article/article/', {postID});

  if (response.data === true) {
    alert('刪除成功');
  } else {
    alert('刪除失敗');
  }
} catch (error) {
  console.error('失敗', error);
  alert('刪除失敗');
}
}
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
  <div class="postFeature">
    <el-form :model="form" label-width="auto" style="max-width: 600px">
      <el-form-item label="Post">
        <el-input v-model="form.postContent" />
      </el-form-item>
      <el-form-item class="form-button">
        <el-button type="primary" @click="postSubmit">發表!</el-button>
      </el-form-item>
    </el-form>
    <el-form :model="historyForm" label-width="auto" style="max-width: 600px">
      <el-form-item class="refresh-form-button">
        <el-button type="primary" @click="refreshSubmit">列出所有發文!</el-button>
      </el-form-item>
      <li v-for="(item, index) in historyForm.postList">
        {{ item.authorID }}:{{ item.content }}
        <el-button type="primary" @click="commentSubmit(item.articleID)">留言</el-button>
        <el-button type="primary" @click="EditSubmit(item.articleID)">修改</el-button>
        <el-button type="primary" @click="DelSubmit(item.articleID)">刪除</el-button>
      </li>
    </el-form>
  </div>
</template>
