# job4j_fast_food_payment

* [Описание](#описание)
* [Технологии](#технологии)
* [Функционал](#функционал)

## Описание
REST-сервис, который обрабатывает новые платежи и производит возврат существующих. 
Является частью проекта [job4j_fast_food](https://github.com/hasover/job4j_fast_food).

## Технологии
* Spring Boot (Web, Data)
* PostgreSQL
* Liquibase
* Maven

## Функционал

Сервис определяет конечную точку `/payments`, с которой можно производить следующие операции:

- POST запрос для проведения нового платежа.
- DELETE запрос отмены платежа и возврата средств.