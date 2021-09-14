# joopda todolist 과제

---

# 개발환경
+ Tool
  + Intellij, Aquerytool, MySQL 5.7 Command Line Client, MySQL Workbench 8.0 CE, Postman, Git, Sourcetree
+ 기술 및 라이브러리
  + Spring Boot, JSP, JPA, Hibernate, JSTL
  + Maven, LoomBok, yml, Spring Boot DevTools, Spring Data JPA, MySQL Driver, Spring Security, Spring Web
+ front
  + BootStrap 4

---
# ERD
URL : https://aquerytool.com/aquerymain/index/?rurl=c4454161-5905-4058-b83e-c2c27f906941&
Password : vqr2hr

---
# 환경 설정
+ server
  + port : 8000
  + 접속 : localhost:8000 or localhost:8000/
+ MySQL
  + port : 3306
  + DataBase name : joopda
  + username : joopda
  + password : joopda1234
  + 유저셋팅 첨부하겠습니다 : 
  + create user 'joopda'@'%' identified by 'joopda1234';
  + GRANT ALL PRIVILEGES ON *.* TO 'joopda'@'%';
  + CREATE DATABASE joopda CHARACTER SET utf8 DEFAULT COLLATE utf8_general_ci;

+최조 application.yml에서 jpa create로 실행후 이후는 update로 진행

---
# 사용 방법
1.회원가입
2.로그인
3.
+ Home : 홈으로
  + 헤더부분 로그인에 따라 다르게 보이도록 설정
  + 로그인전 : 로그인, 회원가입 활성화
  + 로그인과 회원가입은 Spring Security를 사용하여서 진행
+ To Do List : 완료되지 않은 To Do List 반환
  + 페이징 처리를 이용하여서 출력
  + 상세보기 클릭시 수정 삭제 가능
  + JSTL을 사용하여서 접속된 사용자의 목록과 상세보기가 가능하게 구현
  + 완료 버튼 클릭시 삭제되지 않고 완료처리
+ new To Do List : 새로운 To Do List 작성
  + summernote를 사용하여서 글쓰기 폼 구현
+ Finish List : 완료된 To Do List 반환
  + 완료 처리된 List만 출력
  + 다시 미완료 처리로 돌릴 수 있는 기능 구현
+ Logout : 로그아웃

