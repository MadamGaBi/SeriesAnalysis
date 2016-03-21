# SeriesAnalysis

Реализует следующие методы для класса TemperatureSeriesAnalysis по работе с рядом измерений температур.
Покрытие тестами ~ 100% (включая тесты на исключительные ситуации).
Описание методов класса приведено ниже.

- double average()
Вычисляет средние значение температуры. Если ряд пустой генерирует IllegalArgumentException.

- double deviation()
Возвращает cреднеквадрати́ческое отклоне́ние температуры. Если ряд пустой генерирует IllegalArgumentExcepti

- double min()
Возвращает минимальную температур. Если ряд пустой генерирует IllegalArgumentException.

- double max()
Возвращает максимальную температур. Если ряд пустой генерирует IllegalArgumentException.

- double findTempClosestToZero()
Возвращает значение температуры ближайшее к 0. Если ряд пустой генерирует IllegalArgumentException.
Если в ряде несколько значений одинаково близки к 0 (к примеру -0.2 и 0.2), то возвращается положительное (большее) (т.е. 0.2)

- double findTempClosestToValue(double tempValue)
Аналогично предыдущему методу, только возвращает значение ближайшее к указанному tempValue

- double[] findTempsLessThan(double tempValue)
Возвращает массив со значениями температуры меньше указанного tempValue. Если ряд пустой генерирует IllegalArgumentException.

- double[] findTempsGreaterThan(double tempValue)
Возвращает массив со значениями температуры больше либо равно указанного tempValue. Если ряд пустой генерирует IllegalArgumentException.

- TempSummaryStatistics summaryStatistics()
Возвращает immutable экземпляр класса TempSummaryStatistics в котором содержится информация:
- double avgTemp;
- double devTemp;
- double minTemp;
- double maxTemp;
Если ряд пустой генерирует IllegalArgumentException.

- int addTemps(double ... temps)
Добавляет в конец ряда уже имеющихся данных новые значения температур, возвращает суммарное число значений температур.
Структура (массив) используемая в классе TemperatureSeriesAnalysis для хранения уже переданных температур
должна увеличиваться в 2 раза, если в ней нет места для хранения новых значений.

класс TemperatureSeriesAnalysis должен иметь конструктор по умолчанию и конструктор с параметром принимающий начальный ряд температур
если в переданном ряде температур, встречается хоть одно значение меньше чем -273С,
то все значения из данного ряда не должны добавляться к основному ряду и должно выбрасываться исключение InputMismatchException