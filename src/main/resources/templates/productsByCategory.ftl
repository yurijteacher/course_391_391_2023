<#import "templ/templ.ftl" as c>
<@c.pages>

    <div class="row row-cols-1 row-cols-md-3 g-4">

        <#if allProductByCategory??>
            <#list allProductByCategory as product>

                <form action="/addNewProductToCart" method="post">
                    <input type="hidden" name="id" value="${product.id}">
                    <div class="col">
                        <div class="card" style="width: 18rem;">
                            <img src="${product.image}" class="card-img-top" alt="${product.name}">
                            <div class="card-body">
                                <h5 class="card-title">${product.name}</h5>
                                <p class="card-text">${product.description}</p>
                            </div>
                            <ul class="list-group list-group-flush">
                                <li class="list-group-item">
                                    <input type="text" name="quantity" value="1">
                                </li>
                                <li class="list-group-item">
                                    <p class="card-text">${product.price}</p>
                                </li>
                                <li class="list-group-item">
                                    <p class="card-text">${product.categories.name}</p>
                                </li>
                            </ul>
                            <div class="card-body">
                                <#--                <input class="btn btn-success" type="submit" value="addToCart">-->
                                <button class="btn btn-success" type="submit">addToCart</button>
                                <a href="#" class="card-link">Show the product</a>
                            </div>
                        </div>
                    </div>
                </form>

            </#list>
        </#if>
    </div>


</@c.pages>