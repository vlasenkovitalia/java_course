package com.examples;

import java.util.Calendar;
import java.util.Date;
import java.util.Formatter;

public class DateTimeFormattingDemo {
    static void main(String[] args) {
        // Получаем текущее время
        Date now = new Date();
        Calendar cal = Calendar.getInstance();

        Formatter formatter = new Formatter();

        // 1. %tH и %tM - часы и минуты (24-часовой формат)
        formatter.format("1. Текущее время:%n");
        formatter.format("   %tH:%tM:%tS (часы:минуты:секунды)%n", now, now, now);
        formatter.format("   %tH часов %tM минут %tS секунд%n%n", cal, cal, cal);

        // 2. %tI - часы в 12-часовом формате
        formatter.format("2. 12-часовой формат:%n");
        formatter.format("   %tI:%tM %Tp (AM/PM)%n", now, now, now);
        formatter.format("   Сейчас %tI часов %tM минут %Tp%n%n", cal, cal, cal);

        // 3. %tY, %tm, %td - год, месяц, день
        formatter.format("3. Дата:%n");
        formatter.format("   Полная дата: %tY-%tm-%td%n", now, now, now);
        formatter.format("   Дата: %td.%tm.%tY%n", cal, cal, cal);
        formatter.format("   Альтернативно: %1$td/%1$tm/%1$tY%n%n", now);

        // 4. %tS и %tL - секунды и миллисекунды
        formatter.format("5. Точное время:%n");
        formatter.format("   %tH:%tM:%tS.%tL%n", now, now, now, now);
        formatter.format("   Текущая миллисекунда: %tL%n%n", System.currentTimeMillis());

        // 5. Форматирование интервалов времени
        formatter.format("7. Интервалы времени:%n");
        long startTime = System.currentTimeMillis();

        // Имитируем работу
        try {
            Thread.sleep(1234); // 1.234 секунды
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;

        formatter.format("   Начало: %tH:%tM:%tS.%tL%n",
                startTime, startTime, startTime, startTime);
        formatter.format("   Конец:  %tH:%tM:%tS.%tL%n",
                endTime, endTime, endTime, endTime);
        formatter.format("   Длительность: %d мс (%.3f секунды)%n%n",
                duration, duration / 1000.0);

        // Выводим результат
        System.out.println(formatter);

        // Закрываем Formatter
        formatter.close();

        // Пример с String.format
        String timestamp = String.format("Текущее время: %tH:%tM:%tS", now, now, now);
        System.out.println(timestamp);

        // Пример одного аргумента с индексом
        String dateStr = String.format("Дата: %1$td.%1$tm.%1$tY", now);
        System.out.println(dateStr);
    }
}