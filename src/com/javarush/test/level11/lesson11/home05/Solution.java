package com.javarush.test.level11.lesson11.home05;

/* От школьника к рабству
Написать четыре класса: Schoolboy(школьник), Student(студент), Worker(Сотрудник), Slave (Раб)
Унаследовать студента от школьника, сотрудника от студента, раба от сотрудника.
*/

class Solution {
    public static class Schoolboy {
    }

    public static class Student extends Schoolboy {
    }

    public static class Worker extends Student {
    }

    public static class Slave extends Worker {
    }

}
