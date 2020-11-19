# introduction-to-web-applications

## Подробнее о сборке приложения
```
maven clean install
```
## Подробнее о запуске приложения
Для запуска собранного приложения используйте следующую структуру папок:
```
/application/application.config.yaml
/application/introduction-to-web-applications.jar
/itwa.sh
```
## Подробнее о itwa.sh
Скрипт для запуска/остановки/перезапуска приложения.
```
itwa.sh start/stop/restart
```
Скрипт использует директорию `application` для поиска приложения и файла `application.config.yaml` (содержит кастомные настройки для демонстрации работы приложения).

## Тестирование приложения

Приложение запускается на порту 4443 (см. src/main/resources/application.yaml) и предоставляет следующий контроллер:

```
/api/application-configuration
```

Контроллер возвращает состояние файла `application.config.yaml` на момент запуска приложения в JSON формате.