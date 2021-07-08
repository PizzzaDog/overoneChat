<jsp:include page="header.jsp"/>
<html>
<body>
<form action="/user/create" method="post">
    <div class="mb-3">
        <label for="exampleInputEmail1" class="form-label">Username</label>
        <input type="text" class="form-control" name="username" id="exampleInputEmail1" aria-describedby="emailHelp">
        <div id="emailHelp" class="form-text">You can't change username after registration!!!</div>
    </div>
    <div class="mb-3">
        <label for="exampleInputPassword1" class="form-label">Age</label>
        <input type="text" class="form-control" name="password" id="exampleInputPassword1">
    </div>
    <div class="mb-3 form-check">
        <input type="checkbox" class="form-check-input" id="exampleCheck1">
        <label class="form-check-label" for="exampleCheck1">I'm 18+ old.</label>
    </div>
    <button type="submit" class="btn btn-primary">Create user</button>
</form>
</body>
</html>