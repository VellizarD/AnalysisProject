Feature: Добавяне на нова Крава
		Scenario Outline: Добавяне на нова Крава
			Given Потребителя отваря екрана за Добавяне на нова Крава
			When Въведе име на Крава "<name>"
			And Въведе възраст на Крава "<age>"
			And Въведе пол на крава "<sex>"
			And Въведе дата на последно раждане на Крава "<lastBirthDate>"
			And Въведе идентификационен номер на Крава "<idNumber>"
			And Въведе порода на Крава "<breed>"
			And Натиска бутона за Добавяне на нова Крава
			Then Вижда съобщение "<expectedMessage>"

			Examples:
			|name|age|sex|lastBirthDate|idNumber|breed|expectedMessage|
			|Ivanka|2|Female|1990-02-06|testID|Dexter|Успешно добавихте нова крава|
			|Ivan|2|Male||testID|Dexter|Успешно добавихте нова крава|
			|Ivanka|-2|Female|1990-02-06|testID|Dexter|Възрастта на кравата е невалидна|
			|Ivanka|2|Female|1990-02-06|existingID|Dexter|Крава с този идентификационен номер вече съществува в системата|
			|Ivanka|2|Female|2025-09-02|testID|Dexter|Датата на последно раждане е невалидна|
			||2|Male|1990-02-06|testID|Dexter|Моля Въведете име на Кравата|