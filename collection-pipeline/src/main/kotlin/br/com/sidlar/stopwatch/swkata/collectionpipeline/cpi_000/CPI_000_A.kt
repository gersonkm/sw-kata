package br.com.sidlar.stopwatch.swkata.collectionpipeline.cpi_000

interface CPI_000_A {

    /**
     * Este método deverá extrair, para cada elemento de [coffeeBrands], o [CoffeeBrand.name] em um [List].
     *
     * **Observações**
     *  - Para mais informações sobre o modelo de domínio, consulte o arquivo '*-model.kt'.
     *
     * **Exemplos**
     * - Ex. 1)
     *      ```
     *         List [
     *            CoffeeBrand (name: "Caribou"),
     *            CoffeeBrand (name: "dunkin donuts"),
     *            CoffeeBrand (name: "Kopi Luwak"),
     *            CoffeeBrand (name: "FOLGERS")
     *          ]
     *          =>
     *          List ["Caribou", "dunkin donuts", "Kopi Luwak", "FOLGERS"]
     *       ```
     *
     * O que deve ser entregue?
     *  - Implementação da solução nas linguagens Java e Kotlin.
     *  - Testes de unidade escritos em Kotlin.
     */
    fun solve(): List<String>

}