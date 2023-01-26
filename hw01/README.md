# ДЗ 01

## 1. Реализовать класс товар, содержащий следующие свойства:
- Название
- Цена
- Количество
- Единица измерения

## 2. А так же реализовать следующие классы-наследники:
- Продукты питания, содержащие следующие свойства:
    - Срок годности
- Напитки, содержащие следующие свойства:
    - Объём
- Предметы гигиены, содержащие следующие свойства:
    - Количество штук в упаковке
- Детские товары:
    - Минимальный возраст
    - Гипоаллергенность,

## 3. А так же реализовать слеюущие классы, наследуемые от приведённых выше классов (надеюсь сами разберётесь от каких именно):
- Молоко, содержащиее следующее свойство:
    - Процент жирности
    - Срок годности
- Лимонад
- Хлеб, содержащий следующие свойство:
    - Тип муки
- Яйца, содержащее следующиее свойство:
    - Количество в упаковке
- Маски
- Туалетная бумага, содержащее следующее свойство:
    - Количество слоёв
- Подгузники, содержащие следующее свойства:
    - Размер
    - Минимальный вес
    - Максимальный вес
    - Тип
- Соска

## 4. У всех классов перегрузить метод ToString класса Object, от которого наследуются все классы, в котором будет происходить вывод всей информации о товаре, так же реализовать конструкторы, принемающие все поля.

## 5. Реализовать в классе Program, метод выводящий все данные о товаре. Создать в Main все объекты товаров и проверить работу метода, созданного в классе Program
Ниже представлен вывод информации о созданных экземплярах классов (для реальных классов дополнительно выводится имя класса):
```
Name: Unknown, Price: 100,00, QTY: 1, UoM: kg
Name: Food, Price: 200,00, QTY: 2, UoM: kg, Expiration Date: 2023-01-31
Name: Drink, Price: 50,00, QTY: 10, UoM: ml, Volume in MilliLiters: 500
Name: Hig, Price: 80,00, QTY: 15, UoM: box, QTY per Package: 10
Name: Baby, Price: 1000,00, QTY: 30, UoM: box, Min Age Limit (years): 1, is Hypoallergen: true
Milk - Name: Prostokvashino Milk, Price: 85,00, QTY: 20, UoM: liters, Expiration Date: 2023-01-20, Fatness Percentage: 2,5
Lemonade - Name: Baykal Lemonade, Price: 59,99, QTY: 50, UoM: bottle, Volume in MilliLiters: 1000
Bread - Name: Simple bread, Price: 40,99, QTY: 100, UoM: unit, Expiration Date: 2023-01-18, Flour type: ALLPURPOSEFLOUR
Eggs - Name: Chepfa eggs, Price: 90,00, QTY: 100, UoM: box, Expiration Date: 2023-02-15, QTY per Package: 10
FaceMask - Name: Max factor face mask, Price: 299,99, QTY: 20, UoM: sachet, QTY per Package: 1
ToiletPaper - Name: Zeva Deluxe, Price: 300,00, QTY: 100, UoM: package, QTY per Package: 12, Number of Layers: 3
Diapers - Name: Pampers, Price: 2999,99, QTY: 30, UoM: box, Min Age Limit (years): 0, is Hypoallergen: false, Size: 2, Min weight: 3, Min weight: 6, Type: REGULAR_DIAPERS
Pacifier - Name: Philips, Price: 799,99, QTY: 3, UoM: small_box, Min Age Limit (years): 0, is Hypoallergen: true
```