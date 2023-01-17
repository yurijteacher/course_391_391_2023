<#import "templ/templ.ftl" as c>
<@c.pages>

    <h1>Cart</h1>

    <table class="table">
        <thead>
        <tr>
            <#--            <th>id</th>-->
            <th>image</th>
            <th>name</th>
            <th>description</th>
            <th>price</th>

            <th>quantity</th>
            <th>value</th>
            <th>update</th>
            <th>delete</th>
        </tr>
        </thead>

        <tbody>
        <#list itemsCart as item>

            <form method="post" action="/updateProductFromCart">
                <tr>
                    <td><img src="${item.product.image}" alt="${item.product.name}" style="width:28px;height:28px;"></td>

                    <input type="hidden" name="id" value="${item.product.id}">

                    <td>${item.product.name}</td>

                    <td>${item.product.description}</td>

                    <td>${item.product.price}</td>

                    <td><input type="text" name="quantity" value="${item.quantity}" size="5"></td>

                    <td> ${item.quantity * item.product.price}</td>

                    <td><input type="submit" value="update"></td>
            </form>

            <form action="/deleteItemCart" method="post" ?>
                <input type="hidden" name="id" value="${item.product.id}">
                <td>
                    <button type="submit">delete</button>
                </td>
            </form>
            </tr>
        </#list>

        </tbody>
    </table>


    <p>Sum el: ${total} </p>
    <p>Total Value: ${value} </p>

    <hr>
    <p>
    <form action="/deleteAllItem" method="post">
        <td>
            <button type="submit">delete</button>
        </td>
    </form>
    </p>

    <p>Перехід на форму аутентифікації</p>
    <form action="/login" method="get">
        <button type="submit">add</button>
    </form>


</@c.pages>