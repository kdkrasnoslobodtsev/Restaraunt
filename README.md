# Работа выполнена Краснослободцевым Кириллом (БПИ218), совместно с Мавлетовой Кариной (БПИ216)

## Описание JSON файлов
#### 1. Cookers:
Содержит объект повара Cooker:
+ имя повара
+ id

#### 2. Menu:
Данный JSON-файл читается в список menuDishes.
Файл содержит массив объектов MenuDish:

+ id блюда
+ название
+ стоимость
+ наличие в меню
+ массив id необходимых продуктов
+ массив нужного для блюда числа продуктов
+ массив id операций, нужных для приготовления блюда


#### 3. Menu:
Данный JSON-файл читается в список operations.
Файл содержит массив объектов Operation:

+ id операции
+ имя операции
+ время выполнения операции

#### 4. Products:
Данный JSON-файл читается в список products.
Файл содержит массив объектов Product:

+ id продукта
+ название продукта
+ тип продукта (еда или нет)
+ поставщик
+ единицы измерения
+ кол-во на складе

#### 5. VisitorsOrders:
Данный JSON-файл читается в список visitorOrders.
Файл содержит массив объектов VisitorOrder:

+ имя посетителя
+ массив id блюд

## Описание работы программы:
+ Чтение данных из JSON файлов
+ Приветствие
+ Далее обработка заказа каждого пользователя
+ Выводятся блюда, заказанные гостем
+ Далее идёт проверка на то, доступно ли данное блюдо в меню, и хватает ли для него ингредиентов, на основе полученных далее работа идёт только с доступными блюдами
+ Идёт подсчёт общей стоимости заказа
+ Идет подсчет времени приготовления заказа

