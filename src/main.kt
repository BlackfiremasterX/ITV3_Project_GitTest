import kotlin.math.sqrt

fun main() {

    Info()
    var user_answer = ""
    var run = true

    loop@ while (true) {
        print(
            "\n\nВыберите задачу из списка!\n" +
                    "Вводите Ваш запрос:"
        )
        user_answer = readLine().toString().toLowerCase()
        when (user_answer) {
            "b1" -> Begin1()
            "b2" -> Begin2()
            "b13" -> Begin13()
            "b14" -> Begin14()
            "b15" -> bebra15()

            else -> print("Такой задачи в списке нет!")
        }
        run = true
        while (run) {
            print("\n\nПродолжить?[y/n]")
            user_answer = readLine().toString().toLowerCase()
            when (user_answer) {
                "y" -> {
                    print("Продолжаем")
                    for (i in 0..2) {
                        Thread.sleep(333)
                        print(".")
                    }
                    run = false
                    continue@loop
                }
                "n" -> {
                    print("До свидания")
                    for (i in 0..2) {
                        Thread.sleep(333)
                        print("!")
                    }
                    run = false
                    break@loop
                }
                else -> print("Тут всего 2 варианта ответа[y/n]")
            }
        }
    }
}


fun Info() {
    print("Бобро пожаловать в консольную версию задачника с примерами!\n")
    Thread.sleep(500)
    print ("y - кнопка отвечающая за ответ \"да\"\n")
    Thread.sleep(500)
    print("n - кнопка отвечающая за ответ \"нет\"\n")
    Thread.sleep(500)
    print("Код задачи определяется ее первой буквой в названии\n")
    Thread.sleep(500)
    print("+ порядковый номер в списке.\n")
    Thread.sleep(500)
    print("Например, Begin1 - b1.\n")
    Thread.sleep(500)
    print("После ввода ответа нужно нажать клавишу Enter!")
    Thread.sleep(500)
}

fun Begin1() {

    println("\n\nBegin1. Дана сторона квадрата a. Найти его периметр P = 4*a")
    print("Введите сторону квадрата a: ")
    var a = readLine()!!.toDouble()
    var P = 4 * a
    print("Периметр квадрата со стороной а = $a: $P")

}
fun Begin2()
{
print("БЕБРА")
}

fun Begin13() {
    print("Примечание: R1 > R2")
    print("\nВведите R1:")
    var R1 = readLine()!!.toDouble()
    print("Введите R2:")
    var R2 = readLine()!!.toDouble()
    if (R1 > R2) {
        println("Сейчас мы будем искать S1 по формуле S1=pi*(R1)^2")
        print("\n Вычисление");Thread.sleep(333)
        print(".");Thread.sleep(555)
        print(".");Thread.sleep(555)
        print(".");Thread.sleep(555)
        var pi = 3.14
        var S1 = pi*(R1*R1)
        println("\nПлощадь равна $S1");Thread.sleep(655)
        println("Сейчас мы будем искать S2 по формуле S2=pi*(R2)^2")
        print("\n Вычисление");Thread.sleep(333)
        print(".");Thread.sleep(555)
        print(".");Thread.sleep(555)
        print(".");Thread.sleep(555)
        var S2 = pi*(R2*R2)
        println("\nПлощадь равна $S2");Thread.sleep(565)
        print("\n Сейчас будем искать S3 по формуле S3=S1-S2")
        var S3 = S1-S2
        print("\n Идёт вычесление");Thread.sleep(333)
        print(".");Thread.sleep(555)
        print(".");Thread.sleep(555)
        print(".");Thread.sleep(555)
        print("\n Вот и результат: $S3")
    } else {
        print("Читай условие, Тупень!!! Не возвращайся, пока не поумнеешь!!!\n")

    }

}

fun Begin14(){
    println("Введите длину окружности ")
    var l = readLine()!!.toDouble()

    var p = 3.14
    var r = ( (l) / (2*p)  )
    val s = ((p*sqrt(r)))
    println("Площадь -  ")
    print(s)
    println("")
    print("Радиус - ")
    println("")
    println(r)



}


fun bebra15(){
    println("Введите площадь круга.")
    var S1 = readLine()!!.toDouble()
    var R1 = S1/3.14
    var R2 = sqrt(R1)
    var D1 = R2*2
    var L1 = 2*3.14*R2; Thread.sleep(300)
    println("Диаметр: " + D1); Thread.sleep(300)
    println("Длина: " + L1); Thread.sleep(300)
}








