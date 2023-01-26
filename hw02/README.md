# ДЗ 02

## 1. На языке Java реализовать абстрактный класс "Животное"
    Со следующими полями:
    - Рост животного
    - Вес животного
    - Цвет глаз животного
    И методами:
    - Издать звук
    - Напечатать информацию о животном

## 2. Так же реализовать абстрактные классы-наследники от класса "Животное":

### 2.1. Домашнее животное
    Cо следующими свойствами:
    - Кличка
    - Порода
    - Наличие прививок
    - Цвет шерсти
    - Дата рождения
    И методами:
    - Проявлять ласку

### 2.2. Дикое животное
    Cо следующими свойствами:
    - Место обитания
    - Дата нахождения

## 3. Реализовать классы следующих животных, реализующих интерфейсы домашнего животного или дикого животного(надеюсь сами поймёте какое животное домашнее, а какое - дикое):
### 3.1. Кот
    Cо свойством:
    - Наличие шерсти(доступным только для чтения внешним классам)
### 3.2. Тигр
### 3.3. Собака
    Cо свойством:
    - Наличие дрессировки(доступным только для чтения внешним классам)
    И методом:
    - Дрессировать

### 3.4. Волк
    Со свойством:
    - Вожак стаи(доступным только для чтения внешним классам)

## 4. Так же реализовать абстрактный класс "Птица", реализующий интерфейс животное
    С защищённым полем:
    - Высота полёта
    Методом:
    - Летать, выводящий на экран фразу "Я лечу на x метрах, где x - высота полёта
    И защищённым конструктором:
    - Конструктор принемающий высоту полёта

## 5. Реализовать следующие классы-наследники:
- Курица
- Аист

## 6. Для всех классов реализовать методы:
- издавать звук, чтобы он печатал на консоль звук, примерно похожий на звук, который издаёт животное в реальном мире;
- метод напечатать информацию, печатающий на экран все свойства, которые есть у данного животного.
- Так же для всех классов реализовать набор конструкторов, которые необходимы для задания всех свойств объекта, которые они у него есть.
## 7. Реализовать класс "Зоопарк", в котором будет храниться любая структура данных животных(массив, стек, очередь), в котором организовать приватный массив объектов-животных
Со следующими методами:
- Добавить животное в зоопарк (добавляет новое животное в структуру данных, для массива использовать следующий алгоритм https://gospodaretsva.com/urok-27-vstavka-elementov-v-massiv.html , для стека и очереди вы алгоритмы уже знаете)
- Убрать животное с номером i из зоопарка (Использовать этот алгоритм https://gospodaretsva.com/urok-26-udalenie-elementa-iz-odnomernogo-massiva.html для удаления из массива, для удаления из стека и очереди вы алгоритмы знаете)
- Посмотреть информацию о животном с номером i
- Заставить животное с номером i издать звук
- Напечатать информацию о животных, которые есть на данный момент в зоопарке
- Заставить всех животных, которые на данный момент есть в зоопарке, издать звук

Предоставить пользователю консольный интерфейс(консольное меню), который позволяет пользователю добавлять новых животных в зоопарк, убирать животных из зоопарка, печатать информацию о конкретном животном(вводя его номер), печатать информацию о всех животных в зоопарке на данный момент, заставлять животное издавать звук(введя номер животное), заставлять издавать звук всех животных, которые на данный момент есть в зоопарке)

## 8. Задание под звёздочкой(необязательное, но плюсы к карме и к оценкам):
Сделать возможность у животных летать, если это животное птица, проявлять ласку, если это домашнее животное и дрессировать, если это животное собака. 