<jsp:include page="header.jsp"/>
<html>
<body>
<h1>Create your info</h1>

<form action="/personalInfo" method="post">
    <div class="mb-3">
        <label for="exampleInputEmail1" class="form-label">About me</label>
        <input type="text" class="form-control" name="about" id="exampleInputEmail1" aria-describedby="emailHelp">
        <div id="emailHelp" class="form-text">You can't change username after registration!!!</div>
    </div>
    <div>
        <div class="form-check">
            <input class="form-check-input" type="radio" name="myStatus" id="FREE" value="FREE">
            <label class="form-check-label" for="FREE">
                FREE
            </label>
        </div>
        <div class="form-check">
            <input class="form-check-input" type="radio" name="myStatus" id="SINGLE" checked value="SINGLE">
            <label class="form-check-label" for="SINGLE">
                SINGLE
            </label>
        </div>
    </div>
    <button type="submit" class="btn btn-primary">Create info</button>
</form>
</body>
</html>