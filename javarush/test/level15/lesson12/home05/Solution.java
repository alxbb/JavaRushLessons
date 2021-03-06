package com.javarush.test.level15.lesson12.home05;

/* Перегрузка конструкторов
1. В классе Solution создайте по 3 конструктора для каждого модификатора доступа.
2. В отдельном файле унаследуйте класс SubSolution от класса Solution.
3. Внутри класса SubSolution создайте конструкторы командой Alt+Insert -> Constructors.
4. Исправьте модификаторы доступа конструкторов в SubSolution так, чтобы они соответствовали конструкторам класса Solution.
*/

public class Solution {
    private Solution(String s) {}
    private Solution(boolean b) {}
    private Solution(Boolean B) {}

            Solution(int i) {}
            Solution(byte b) {}
            Solution(short s) {}

    protected Solution(float f) {}
    protected Solution(double d) {}
    protected Solution(Double D) {}

    public Solution(Float F) {}
    public Solution(Integer I) {}
    public Solution() {}
}

