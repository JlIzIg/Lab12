# Lab12
Лабораторная работа №12 по дисциплине "Кросс-платформенное программирование"

Выполнить статический анализ кода проекта из предыдущего задания, используя любой из инструментов статического анализа кода (Error Prone, FindBugs/SpotBugs, PMD, PVS Studio, Qodana, SonarJava) и внести исправления или блоки пояснения/предотвращения (suppress) проверки некоторых строк.

Добавить к полученному проекту модуль автоматизированного тестирования с использованием фреймворка JUnit.

Предыдущее задание:

Лабораторная работа №11
Вариант №1

Добавить экспорт данных из предыдущего задания в формате XLSX, JSON, TXT (выбор формата осуществляется пользователем из соответствующего пункта меню GUI)

Пересмотреть и реализовать изменения эргономики интерфейса приложения

Предыдущее задание:

Реализовать сохранение данных из Задания №8 в базе данных используя СУБД MySQL

Получать параметры поиска  на экранной форме и отображать результаты в табличном виде

Реализованы такие методы:

Подключение к БД

Загрузка всех записей из бд в таблицу

Добавление одного животного (случайного животного) в базу данных

Удаление последней записи

Отключение от бд

Задание №8

В отдельном классе реализовать загрузку данных отдельным потоком из JSON любого сайта, отдающего данные  этом формате. Сайт: https://zoo-animal-api.herokuapp.com/animals/rand/
