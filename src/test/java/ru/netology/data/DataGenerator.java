package ru.netology.data;

import com.github.javafaker.Faker;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Random;

public class DataGenerator {
    private static Random random = new Random();

    DataGenerator() {
    }

    public static RequestInfo generateRequest(String locale) {
        Faker faker = new Faker(new Locale(locale));
        return new RequestInfo(generateCity(),
                faker.name().lastName() + " " + faker.name().firstName(),
                faker.phoneNumber().phoneNumber());
    }

    public static String generateCity() {
        String[] cities = new String[]{"Магас", "Йошкар-Ола", "Иваново", "Челябинск", "Майкоп", "Горно-Алтайск",
                "Уфа", "Улан-Удэ", "Махачкала", "Нальчик", "Элиста", "Черкесск", "Петрозаводск", "Сыктывкар",
                "Симферополь", "Саранск", "Якутск", "Владикавказ", "Казань", "Кызыл", "Ижевск", "Абакан",
                "Грозный", "Чебоксары", "Барнаул", "Чита", "Петропавловск-Камчатский", "Краснодар", "Красноярск",
                "Пермь", "Владивосток", "Ставрополь", "Хабаровск", "Благовещенск", "Архангельск", "Астрахань",
                "Белгород", "Брянск", "Владимир", "Волгоград", "Вологда", "Воронеж", "Иркутск", "Калининград",
                "Калуга", "Кемерово", "Киров", "Кострома", "Курган", "Курск", "Санкт-Петербург", "Липецк",
                "Магадан", "Красногорск", "Мурманск", "Нижний Новгород", "Великий Новгород", "Новосибирск", "Омск",
                "Оренбург", "Орёл", "Пенза", "Псков", " Ростов-на-Дону", "Рязань", "Самара", "Саратов",
                "Южно-Сахалинск", "Екатеринбург", "Смоленск", "Тамбов", "Тверь", "Томск", "Тула", "Тюмень",
                "Ульяновск", "Ярославль", "Москва", "Севастополь", "Биробиджан", "Нарьян-Мар", "Ханты-Мансийск",
                "Анадырь", "Салехард"};
        return cities[random.nextInt(cities.length)];
    }

    public static String generateDate(int shift) {
        return LocalDate.now().plusDays(shift).format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
    }

}
