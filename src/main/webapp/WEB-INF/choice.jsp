<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="header.jsp"%>

<div class="d-flex justify-content-center pt-5">
    <form method="post" action="yourChoice" class="col-8">
        <p class="h2">${question}</p>
        <div class="form-check" >
            <input class="form-check-input" type="radio" name="flexRadioDefault" id="flexRadioDefault1" value="1">
            <label class="form-check-label" for="flexRadioDefault1">
                ${answer1}
            </label>
        </div>
        <div class="form-check">
            <input class="form-check-input" type="radio" name="flexRadioDefault" id="flexRadioDefault2" value="2">
            <label class="form-check-label" for="flexRadioDefault2">
                ${answer2}
            </label>
        </div>
        <button type="submit" class="btn btn-outline-primary mt-2 mb-3">Signal</button>
        <%@ include file="statistics.jsp"%>
    </form>
</div>

<%@ include file="footer.jsp"%>
