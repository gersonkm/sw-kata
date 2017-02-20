package br.com.sidlar.stopwatch.swkata.collectionpipeline.cpi_000

interface CPI_000_B {

    /**
     * Este método deverá juntar os [CoffeeBrand.name] de [coffeeBrands] em uma [String] através do separador ", "
     * (uma vírgula seguida de um espaço).
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
     *          "Caribou, dunkin donuts, Kopi Luwak, FOLGERS"
     *       ```
     *
     * O que deve ser entregue?
     *  - Implementação da solução nas linguagens Java e Kotlin.
     *  - Testes de unidade escritos em Kotlin.
     */
    fun solve(coffeeBrands: List<CoffeeBrand>): String

}