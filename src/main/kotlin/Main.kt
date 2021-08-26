fun main() {
    println("Informe o tamanho da matriz A ")
    print("Linhas: ")
    var linhas = readLine()!!.toInt()
    print("Colunas: ")
    var colunas = readLine()!!.toInt()
    val a = Matriz(linhas, colunas)
    println("Informe os elementos de A: ")
    for (i in 0..a.linhas - 1) {
        for (j in 0..a.colunas - 1) {
            a.matriz[i][j] = readLine()!!.toInt()
        }
    }
    println("Informe o tamanho da matriz B ")
    print("Linhas: ")
    linhas = readLine()!!.toInt()
    print("Colunas: ")
    colunas = readLine()!!.toInt()
    val b = Matriz(linhas, colunas)
    println("Informe os elementos de B: ")
    for (i in 0..b.linhas - 1) {
        for (j in 0..b.colunas - 1) {
            b.matriz[i][j] = readLine()!!.toInt()
        }
    }

    while (true) {
        println("O que deseja fazer?")
        println("1 -> somar | 2 -> subtrair")
        println("3 -> multiplicar | 4 -> oposta")
        println("5 -> transposta")
        println("0 -> sair")
        val input = readLine()!!.toInt()
        when (input) {
            1 -> a.add(b)
            2 -> a.sub(b)
            3 -> a.times(b)
            4 -> {
                println("Matriz oposta de A: ")
                a.oposite()
                println("Matriz oposta de B: ")
                b.oposite()
            }
            5 -> {
                println("Matriz transposta de A: ")
                a.trans()
                println("Matriz transposta de B: ")
                b.trans()
            }
            0 -> break
        }
    }
}