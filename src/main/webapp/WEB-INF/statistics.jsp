<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--<%@ include file="header.jsp"%>--%>

<div class="card">
    <div class="card-header">
        ${name}
    </div>
    <div class="card-body">
        <p class="card-text">
            wi<b style="color: brown">n</b>: <b style="color: brown">${win}</b><br>
            l<b style="color: brown">o</b>st: <b style="color: brown">${lost}</b><br>
            <b style="color: brown">game</b>s: <b style="color: brown">${game}</b><br>
            IP: <b style="color: brown">${ip}</b>

        </p>
    </div>
</div>

<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js" integrity="sha384-oBqDVmMz9ATKxIep9tiCxS/Z9fNfEXiDAYTujMAeBAsjFuCZSmKbSSUnQlmh/jp3" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.min.js" integrity="sha384-cuYeSxntonz0PPNlHhBs68uyIAVpIIOZZ5JqeqvYYIcEL727kskC66kF92t6Xl2V" crossorigin="anonymous"></script>

<%--<%@ include file="footer.jsp"%>--%>