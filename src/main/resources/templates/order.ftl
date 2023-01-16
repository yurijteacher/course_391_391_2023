<#import "templ/templ.ftl" as c>

<@c.pages>

    <h1> Form Order </h1>

    <h2>Product By Cart</h2>

    <table class="table">
        <thead>
        <tr>
            <th>name</th>
            <th>description</th>
            <th>price</th>
            <th>quantity</th>
            <th>value</th>
        </tr>
        </thead>

        <tbody>
        <#list itemsCart as item>
            <tr>
                <td>${item.product.name}</td>
                <td>${item.product.description}</td>
                <td>${item.product.price}</td>
                <td>${item.quantity}</td>
                <td> ${item.quantity * item.product.price}</td>
            </tr>
        </#list>

        </tbody>
    </table>

    <p>Total Value: ${value} </p>


    <h2>Client</h2>
    <p> firstName: ${client.firstName}</p>
    <p> lastName: ${client.lastName}</p>
    <p> phone: ${client.phone}</p>
    <p> email: ${client.email}</p>
    <p> address: ${address.country} , ${address.city}, ${address.building}</p>


    <h2>Payment</h2>
    <p>asd sad</p>
    <select name="payment1">
        <option value="cash" selected>Оплата готівкою</option>
        <option value="card">Оплата картою</option>
    </select>


    <h2>Delivery</h2>
    <select name="delivery1">
        <option value="q1" selected>Самовивіз</option>
        <option value="q2">Нова пошта</option>
        <option value="q3">Пошта України</option>
        <option value="q4">новий</option>
    </select>

    <p>ds sda</p>

    <form action="/buy" method="post">
        <input type="submit" value="buy">
    </form>

</@c.pages>