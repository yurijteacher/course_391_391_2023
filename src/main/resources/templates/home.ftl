<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Головна сторінка сайту</title>
<!--    <link rel="stylesheet" href="css/main.css">-->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
</head>
<body>


<div class="container-fluid">

    <div class="row">
        <div class="col">
            <nav class="navbar navbar-expand-lg bg-body-tertiary">
                <div class="container-fluid">
                    <a class="navbar-brand" href="#">Navbar</a>
                    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                        <span class="navbar-toggler-icon"></span>
                    </button>
                    <div class="collapse navbar-collapse" id="navbarSupportedContent">
                        <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                            <li class="nav-item">
                                <a class="nav-link active" aria-current="page" href="#">Home</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="#">Link</a>
                            </li>
                            <li class="nav-item dropdown">
                                <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                                    Dropdown
                                </a>
                                <ul class="dropdown-menu">
                                    <li><a class="dropdown-item" href="#">Action</a></li>
                                    <li><a class="dropdown-item" href="#">Another action</a></li>
                                    <li><hr class="dropdown-divider"></li>
                                    <li><a class="dropdown-item" href="#">Something else here</a></li>
                                </ul>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link disabled">Disabled</a>
                            </li>
                        </ul>
                        <form class="d-flex" role="search">
                            <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
                            <button class="btn btn-outline-success" type="submit">Search</button>
                        </form>
                    </div>
                </div>
            </nav>
        </div>
    </div>
    <div class="row">


        <div class="col-4">
            <h1>${hello}</h1>
            <div class="left-menu">
            <ul class="list-group">
                <li class="list-group-item active" aria-current="true">An active item</li>
                <li class="list-group-item">A second item</li>
                <li class="list-group-item">A third item</li>
                <li class="list-group-item">A fourth item</li>
                <li class="list-group-item">And a fifth one</li>
            </ul>
        </div>
        </div>
        <div class="col-8">
            <div class="name-car">
            <h1>Category</h1>
            </div>
            <nav aria-label="Page navigation example">
                <ul class="pagination">
                    <li class="page-item"><a class="page-link" href="#">Previous</a></li>
                    <li class="page-item"><a class="page-link" href="#">1</a></li>
                    <li class="page-item"><a class="page-link" href="#">2</a></li>
                    <li class="page-item"><a class="page-link" href="#">3</a></li>
                    <li class="page-item"><a class="page-link" href="#">Next</a></li>
                </ul>
            </nav>
            <div class="row row-cols-1 row-cols-md-2 g-4">


                <#if listCategory??>
                <#list listCategory as category>

                <div class="col">
                    <div class="card">
                        <img src="${category.image}" class="card-img-top" alt="car">
                        <div class="card-body">
                            <h5 class="card-title">${category.name}</h5>
                            <p class="card-text">${category.description}</p>
                        </div>
                    </div>
                </div>
                </#list>
                </#if>



<#--                <div class="col">-->
<#--                    <div class="card">-->
<#--                        <img src="image/car.jpg" class="card-img-top" alt="car">-->
<#--                        <div class="card-body">-->
<#--                            <h5 class="card-title">Card title</h5>-->
<#--                            <p class="card-text">This is a longer card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.</p>-->
<#--                        </div>-->
<#--                    </div>-->
<#--                </div>-->
<#--                <div class="col">-->
<#--                    <div class="card">-->
<#--                        <img src="image/car.jpg" class="card-img-top" alt="...">-->
<#--                        <div class="card-body">-->
<#--                            <h5 class="card-title">Card title</h5>-->
<#--                            <p class="card-text">This is a longer card with supporting text below as a natural lead-in to additional content.</p>-->
<#--                        </div>-->
<#--                    </div>-->
<#--                </div>-->
<#--                <div class="col">-->
<#--                    <div class="card">-->
<#--                        <img src="image/car.jpg" class="card-img-top" alt="...">-->
<#--                        <div class="card-body">-->
<#--                            <h5 class="card-title">Card title</h5>-->
<#--                            <p class="card-text">This is a longer card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.</p>-->
<#--                        </div>-->
<#--                    </div>-->
<#--                </div>-->
            </div>



        </div>
    </div>


    <div class="row">
        <div class="col">
            <div class="btn-group" role="group" aria-label="Basic outlined example">
                <button type="button" class="btn btn-outline-primary">Left</button>
                <button type="button" class="btn btn-outline-primary">Middle</button>
                <button type="button" class="btn btn-outline-primary">Right</button>
            </div>

        </div>
    </div>



<!--    <div class="row">-->
<!--        <div class="col-12 col-sm-4 col-md-4">Колонка 1</div>-->
<!--        <div class="col-12 col-sm-8 col-md-4">Колонка 2</div>-->
<!--        <div class="col-12 col-md-4">Колонка 3</div>-->
<!--        <div class="col-12">Колонка 4</div>-->
<!--    </div>-->
</div>





<!--<div>-->
<!--    <h1>H1</h1>-->
<!--    <h2>H2</h2>-->
<!--    <h3>H3</h3>-->
<!--    <h4>H4</h4>-->
<!--    <h5>H1</h5>-->
<!--    <h6>H2</h6>-->
<!--    <h7>H3</h7>-->
<!--    <h8>H4</h8>-->
<!--</div>-->
<!--<p>adg as dgas dgsag dgfsad ga dadgf</p>-->


<!--<p>adg as <b>dgas</b> dgsag dgfsad ga dadgf</p>-->
<!--<p>adg as <i>dgas</i> dgsag dgfsad ga dadgf</p>-->

<!--<p>asa As aSA saSAs </p>-->

<!--<ul>-->
<!--    <li>C#</li>-->
<!--    <li>JAVA</li>-->
<!--</ul>-->

<!--<table>-->
<!--    <tr>-->
<!--        <th>Назва</th>-->
<!--        <th>Мова програмування</th>-->
<!--        <th>Рейтинг</th>-->
<!--    </tr>-->

<!--    <tr>-->
<!--        <td>1</td>-->
<!--        <td>С#</td>-->
<!--        <td>перше</td>-->
<!--    </tr>-->
<!--    <tr>-->
<!--        <td>2</td>-->
<!--        <td>JAVA</td>-->
<!--        <td>друге</td>-->
<!--    </tr>-->
<!--</table>-->

<!--<br>-->
<!--<label>Username</label>-->
<!--<input type="text" id="name" placeholder="введіть ім'я">-->
<!--<input type="submit" value="add">-->

<!--<br>-->
<!--<input type="radio" name="gender" value="men">Чоловік</input>-->
<!--<input type="radio" name="gender" value="f">Жінка</input>-->

<!--<br>-->
<!--<select name="job">-->
<!--    <option selected value="student">Cтудент</option>-->
<!--    <option value="teacher">Викладач</option>-->
<!--    <option value="pr">Програміст</option>-->
<!--</select>-->

<!--<br>-->
<!--<select name="job" multiple size="5">-->
<!--    <option selected value="student">Cтудент</option>-->
<!--    <option value="teacher">Викладач</option>-->
<!--    <option value="pr">Програміст</option>-->
<!--</select>-->


<!--<input type="file"><br/>-->
<!--<br>-->
<!--<h1>Car</h1>-->
<!--<img src="image/car.jpg" alt="car !">-->



<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js" integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js" integrity="sha384-oBqDVmMz9ATKxIep9tiCxS/Z9fNfEXiDAYTujMAeBAsjFuCZSmKbSSUnQlmh/jp3" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.min.js" integrity="sha384-mQ93GR66B00ZXjt0YO5KlohRA5SY2XofN4zfuZxLkoj1gXtW8ANNCe9d5Y3eG5eD" crossorigin="anonymous"></script>
</body>
</html>