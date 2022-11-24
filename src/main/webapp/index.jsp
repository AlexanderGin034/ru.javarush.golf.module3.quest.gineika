<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="WEB-INF/header.jsp"%>

<div class="container col-xxl-8 px-4 py-5">
    <div class="row flex-lg-row-reverse align-items-center g-5 py-5">

        <main class="text-center form-signin w-50 m-auto">
            <form action="login" method="post">
                <div class="mb-3">
                    <label for="exampleInputEmail1" class="form-label">Логин или мыло</label>
                    <input type="text" name="login" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
                </div>
                <div class="mb-3">
                    <label for="exampleInputPassword1" class="form-label">Пароль</label>
                    <input type="password" class="form-control" id="exampleInputPassword1">
                </div>

                <button type="submit" class="btn btn-primary">Отправить</button>
            </form>
        </main>
    </div>

</div>

<%@ include file="WEB-INF/footer.jsp"%>