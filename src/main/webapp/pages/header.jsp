<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<header>
    <div>
        <span class="login"><sec:authentication property="principal.username"/></span>
        <a class="btn btn-primary btn-xs" href="/doctors">doctors</a>
        <a class="btn btn-default btn-xs" href="/logout" role="link">logout</a>
    </div>
</header>