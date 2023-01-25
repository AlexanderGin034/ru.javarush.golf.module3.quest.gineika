<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="header.jsp"%>

<div class="d-flex justify-content-center pt-5">
  <form method="post" action="logIn">
    <div class="mb-2">
      <label for="exampleInputEmail1" class="form-label">Log<b style="color: brown">in</b></label>
      <input type="text" name="name" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
    </div>
    <div class="mb-3">
      <label for="exampleInputPassword1" class="form-label">Pass<b style="color: brown">word</b></label>
      <input type="password" name="pass" class="form-control" id="exampleInputPassword1">
    </div>
    <button type="submit" class="btn btn-outline-primary">Signal</button>
  </form>
</div>

<%@ include file="footer.jsp"%>
