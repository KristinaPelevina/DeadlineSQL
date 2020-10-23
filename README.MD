# Скоро Deadline

##Начало работы

Запустить SUT `(app-deadline.jar)`, которая работает по схеме `schema.sql`

##Шаги

0. Открываем проект в `IntelliJ IDEA`

1. Создаем файл `docker-compose.yml`

2. Запускаем Docker

3. Командой `docker-compose up -d` запускаем работу контейнера

4. Переходим в папку с приложением `сd artifacts`

5. Запускаем приложение: `java -jar app-deadline.jar -P:jdbc.url=jdbc:mysql://192.168.99.100:3306/app -P:jdbc.user=app -P:jdbc.password=pass
`
6. Запускаем тесты `gradelew`

7. КОмандой `docker-compose down` заканчиваем работу