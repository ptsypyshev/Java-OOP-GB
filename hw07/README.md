# ДЗ 07

## Необходимо реализовать свой проект на каком-то другом языке программирования
Проект "Зоопарк" был переписан на языке программирования Go.
Т.к. ООП в Go реализовано своеобразно, вместо наследования было применено встраивание + интерфейсы.
Меню выполнено с помощью паттерна Command.

Функционал повторяет аналогичный для Java-приложения, написанного в предыдущих ДЗ.

Пример вывода меню:
```
1 - Add new animal to zoo
2 - Remove an animal from zoo
3 - Print information about a specific animal
4 - Print information about all the animals in the zoo
5 - Make a sound of specific animal
6 - Make sounds of all the animals in the zoo
7 - Try animal to fly
8 - Try animal to pet
9 - Try animal to train
0 - Quit from Golang Zoo
Enter command number:
```

Пример вывода информации о животных:
```
Enter command number: 4
0 - Cat Height: 123.0, Height: 34.0, Eye color: sdfg, Name: as, Breed: hg, Vaccinations: [asdf], Fur color: sadf, Birth date: 02-01-2020, is woolly: true
1 - Dog Height: 546.0, Height: 5.0, Eye color: sdghf, Name: sg, Breed: hgj, Vaccinations: [sdgf 234 ssh], Fur color: dsg, Birth date: 23-02-2001, is trained: true
2 - Tiger Height: 45.0, Height: 24.0, Eye color: sgf, Habitat: qert, FoundDate: 30-05-2015
3 - Wolf Height: 435.0, Height: 345.0, Eye color: sg, Habitat: sg, FoundDate: 11-05-2021
4 - Hen Height: 453.0, Height: 564.0, Eye color: asdf, Feathers color: hjedt
5 - Stork Height: 234.0, Height: 435.0, Eye color: sdfg, Feathers color: et, Flight Altitude: 23
```