package com.javarush.test.level11.lesson06.task05;

/* ИТ-компания
Написать девять классов: Worker(сотрудник), Clerk (клерк), IT (ИТ-специалист), Programmer(программист),
ProjectManager(менеджер проекта), CTO(технический директор), HR(рекрутер), OfficeManager(офис-менеджер), Cleaner (уборщик).
Унаследовать программиста, менеджера проекта и технического директора от ИТ-специалиста.
Унаследовать рекрутера, уборщика и офис-менеджера от клерка.
Унаследовать клерка и ИТ-специалиста от сотрудника.
*/

class Solution {
    public static class Worker {
    }

    public static class Clerk extends Worker {
    }

    public static class IT extends Worker {
    }

    public static class Programmer extends IT {
    }

    public static class ProjectManager extends IT {
    }

    public static class CTO extends IT {
    }

    public static class HR extends Clerk {
    }

    public static class OfficeManager extends Clerk {
    }

    public static class Cleaner extends Clerk {
    }


}
