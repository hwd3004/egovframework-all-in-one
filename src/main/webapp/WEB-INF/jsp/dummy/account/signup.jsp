<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp"%>

<h3>sign up</h3>

<form id="form_signup" action="post">
  <label>
    <span>user id</span>
    <input type="text" name="userId" />
  </label>

  <br />

  <label>
    <span>password</span>
    <input type="password" name="userPassword" />
  </label>

  <br />

  <label>
    <span>confirm password</span>
    <input type="password" name="confirmPassword" />
  </label>

  <br />

  <input type="submit" />
</form>

<script src="/js/dummy/account/signup.js"></script>

<%@ include file="../layout/footer.jsp"%>
