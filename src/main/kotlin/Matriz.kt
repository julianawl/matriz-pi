class Matriz(val linhas: Int, val colunas: Int) {
    val matriz = Array(linhas) { Array(colunas) { 0 } }

    fun add(b: Matriz) {
        when {
            (linhas == b.linhas) && (colunas == b.colunas) -> {
                for (i in 0..linhas - 1) {
                    print("| ")
                    for (j in 0..colunas - 1) {
                        val resultado = Matriz(linhas, colunas)
                        resultado.matriz[i][j] = matriz[i][j].plus(b.matriz[i][j])
                        print("${resultado.matriz[i][j]}" + " ")
                    }
                    print("|")
                    println()
                }
            }
            else -> {
                println("Não é possível calcular esse tipo de matriz")
                println("Para somar: as matrizes devem ser de mesma ordem")
            }
        }
    }

    fun sub(b: Matriz) {
        when {
            (linhas == b.linhas) && (colunas == b.colunas) -> {
                for (i in 0..linhas - 1) {
                    print("| ")
                    for (j in 0..colunas - 1) {
                        val resultado = Matriz(linhas, colunas)
                        resultado.matriz[i][j] = matriz[i][j].minus(b.matriz[i][j])
                        print("${resultado.matriz[i][j]}" + " ")
                    }
                    print("|")
                    println()
                }
            }
            else -> {
                println("Não é possível calcular esse tipo de matriz")
                println("Para subtrair: as matrizes devem ser de mesma ordem")
            }
        }
    }

    fun times(b: Matriz) {
        var soma: Int
        when {
            colunas == b.linhas -> {
                for (i in 0..b.colunas - 1) {
                    print("| ")
                    for (j in 0..linhas - 1) {
                        soma = 0
                        val resultado = Matriz(linhas, b.colunas)
                        for (k in 0..colunas - 1)
                            soma += matriz[j][k].times(b.matriz[k][i])
                        resultado.matriz[j][i] = soma
                        print("${resultado.matriz[j][i]}" + " ")
                    }
                    print("|")
                    println()
                }
            }
            else -> {
                println("Não é possível calcular esse tipo de matriz")
                println("Para multiplicar matrizes: colunas de A = linhas de B")
            }
        }
    }

    fun div(b: Matriz) {

    }

    fun oposite() {
        val op = Matriz(linhas, colunas)
        for (i in 0..linhas - 1) {
            print("| ")
            for (j in 0..colunas - 1) {
                val elemento = matriz[i][j]
                op.matriz[i][j] = ((elemento * -2) + elemento)
                print("${op.matriz[i][j]}" + " ")
            }
            print("|")
            println()
        }
    }

    fun trans() {
        val transposta = Matriz(colunas, linhas)
        for (i in 0..colunas - 1) {
            print("| ")
            for (j in 0..linhas - 1) {
                transposta.matriz[i][j] = matriz[j][i]
                print("${transposta.matriz[i][j]}" + " ")
            }
            print("|")
            println()
        }
    }
}