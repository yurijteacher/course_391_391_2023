<#import "templ/templ.ftl" as c>

<@c.pages>

    <h1> Form Login</h1>

    <form action="/login" method="post">

        <table>
            <tr>
                <td><label for="username">Username</label>
                    <input type="text" name="username" placeholder="user"></td>
            </tr>
            <tr>
                <td><label for="password">Password</label>
                    <input type="password" name="password"></td>
            </tr>
            <tr>
                <td><input type="submit" value="add"></td>
            </tr>
        </table>
    </form>

</@c.pages>