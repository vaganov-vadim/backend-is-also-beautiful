# backend-is-also-beautiful

Материалы для доклада "Backend - это тоже красиво"

## Об авторе

Меня зовут Ваганов Вадим, я руководитель разработки и Head of Profession Backend в Газпромбанке.
Я обожаю делиться опытом, а также обучать и приносить пользу другим. Все мои доклады я строю на своих личных 
историях, так что этот будет таким же. Если тебе понравится доклад и ты захочешь ознакомиться с другим моим 
контентом - приглашаю в [мой телеграм-канал](https://t.me/vaganov_vadim). Погнали!

## Проблема: что делать, если есть трудности с презентацией и оценкой своей работы

Фронтэндерам и мобильщикам чуть проще в начале пути разработчика, чем бэкендерам: они могут нарисовать красивую 
кнопочку, сделать что-то 
визуальное, даже если логика проста, то визуал можно "продать" - банально это можно показать друзьям.

```text
ТЫ СДЕЛАЛ ЧТО-ТО ИЗ НИЧЕГО? ДА ТЫ ПРОСТО БОГ! ГДЕ ЭТОМУ НАУЧИТЬСЯ?
```

![button.png](static/button.png)

А бэкендерам что показать? Как в консольку выводим циферки?

![console.png](static/console.png)

```text
Ты правда делал это целую неделю? Может, стоит заняться чем-то покруче?
```

![img.png](static/doge-meme.png)

Ладно, это скорее шутка (хоть и с долей правды), но проблема демонстрации результатов своей работы бэкендерам правда 
есть - коллеге, боссу, бизнесу, да самому себе, в конце концов.

Решение есть - метрики, визуализация, мониторинг.

**Обещание:**
дам вам мотивацию погрузиться в мониторинг, объясню, почему стоит потратить время на его изучение, и почему благодаря 
мониторингу вы станете более крутым инженером!

## Как метрики и мониторинг могут помочь решить эту проблему

![performance.png](static/performance.png)

## Что отслеживать в backend-приложениях

## Почему мониторинг — это навык, который стоит прокачать любому инженеру

## Подведение итогов

## Попробовать поиграться локально


```bash
docker compose -f local/docker-compose.yml up
```

```bash
./gradlew bootRun
```

```bash
for i in $(seq 1 1000); do
  curl -sS -o /dev/null http://localhost:8080/demo
done
```

Открыть http://localhost:3000
