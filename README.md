# 已實作功能
* BackEnd
  * User
    * 註冊
    * 登入驗證
  * Post
    * 新增文章
    * 刪除文章
    * 修改文章
    * 取得所有文章
  * Comment
    * 新增留言 
* FrontEnd
  * 各頁面*View.vue建置完成
  * 登入功能
  * 註冊功能
  * 文章發布功能
# 資料夾結構
* BackEnd
  * controller: 處理FrontEnd需求
  * domain: 放置Entity
  * repository: 與Database互動
  * service: 處理業務邏輯
# 版本資訊
### BackEnd
* Oracle OpenJDK 17.0.2
* Spring Boot 3.2.5
* MySql 8.4.0
* Junit 5.9.1

### FrontEnd
* Vue 3.4.21
* 使用TypeScript

# 執行說明
* BackEnd
  * cd ./SocialMediaAPP
  * ./mvnw spring-boot:run

* FrontEnd
  * cd ./SocialMediaAPP/frontEnd/vue
  * npm install
  * npm run dev
 
# DML/DDL
* 放置於DB資料夾當中
* DML以不同功能拆分為各個SQL檔

