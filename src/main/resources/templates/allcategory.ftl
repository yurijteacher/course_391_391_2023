<#import "templ/templ.ftl" as c>
<@c.pages>
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
                        <a href="/category/${category.id}">
                            <img src="${category.image}" class="card-img-top" alt="car">
                            <div class="card-body">
                                <h5 class="card-title">${category.name}</h5>

                                <p class="card-text">${category.description}</p>
                            </div>
                        </a>
                    </div>
                </div>
            </#list>
        </#if>
    </div>
</@c.pages>