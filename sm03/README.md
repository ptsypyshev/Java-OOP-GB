Написать программу на языках С# или С++, в которой идёт со следующими геометрическими фигурами:
    1. Треугольник
    2. Квадрат
    3. Прямоугольник.
    4. Круг
В программе имеется массив фигур, с которым можно сделать следующие операции:
    1.Добавить новую фигуру
    2.Посчитать периметр у всех фигур
    3.Посчитать площадь у всех фигур
Для фигуры использовать базовый абстрактный класс фигуры, у которого есть методы посчитать периметр и посчитать площадь фигуры. Массив фигур в программе должен быть представлен как массив объектов этого базового класса. Массив фигур должен создаваться и вся работа с ним идёт внутри main. При создании фигур необходимо осуществлять проверку входных данных на возможность создания данной фигуры и в случае ошибки выдавать соответствующие сообщения.



abstract class Figure
    public abstract double getSquare();

abstract class Polygon extends Figure implements Perimetrable
    private int numberOfSides;
    private double[] sides;
    public double getPerimeter() {
        return Perimetr
    }

interface Perimetrable    
    public double getPerimeter();

interface CircleLengther    
    public double CircleLengther();

Наследники:
    Triagnle extends Polygon 
    Square extends Rectangle 
    Rectangle extends Polygon 
    Circle extends Figure implements CircleLengther
<!-- 
    FigureFabric.createNew(type, side1, side2, side3)
    FigureFabric.createNew(type, side1, side2)
    FigureFabric.createNew(type, side1)
    FigureFabric.createNew(type, radius)
    FigureFabric.createNew(Fg.TRIANGLE, 10) -->

    List<Fugure> lst = new ArrayList<Figure>();