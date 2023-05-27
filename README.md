# SpringBoot - Aspect Oriented Programming

Este es un proyecto simple para mostrar qué es y cómo se utiliza AOP.

## Endpoints

#### Users Endpoints

<details>
 <summary><code>GET</code> <code><b>http://localhost:8091/users</b></code> <code>Todos los usuarios</code></summary>

##### Parameters

> None

##### Responses

> | http code     | content-type                      | response                                                            |
> |---------------|-----------------------------------|---------------------------------------------------------------------|
> | `200`         | `application/json;charset=UTF-8`        | json string                                                         |

</details>

<details>
 <summary><code>GET</code> <code><b>http://localhost:8091/users/{id}</b></code> <code>Recuperar usuarios por Id</code></summary>

##### Parameters

> | name              |  type     | data type      | description                         |
> |-------------------|-----------|----------------|-------------------------------------|
> | `id` |  required | int   | El identificador del usuario    |

##### Responses

> | http code     | content-type                      | response                                                            |
> |---------------|-----------------------------------|---------------------------------------------------------------------|
> | `200`         | `application/json;charset=UTF-8`        | json string                                                         |
> | `500`         | `text/html;charset=utf-8`         | None
</details>

<details>
 <summary><code>GET</code> <code><b>http://localhost:8091/users/search/{username}</b></code> <code>Recuperar usuarios por userName</code></summary>

##### Parameters

> | name              |  type     | data type      | description                         |
> |-------------------|-----------|----------------|-------------------------------------|
> | `username` |  required | string   | El nombre del usuario    |

##### Responses

> | http code     | content-type                      | response                                                            |
> |---------------|-----------------------------------|---------------------------------------------------------------------|
> | `200`         | `application/json;charset=UTF-8`        | json string                                                         |
> | `500`         | `text/html;charset=utf-8`         | None                                                                |
</details>