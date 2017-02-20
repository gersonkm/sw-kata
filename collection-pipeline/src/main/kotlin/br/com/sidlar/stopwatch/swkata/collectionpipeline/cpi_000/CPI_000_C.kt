package br.com.sidlar.stopwatch.swkata.collectionpipeline.cpi_000

interface CPI_000_C {

    /**
     * Este método deverá juntar os [CoffeeBrand.name] de [coffeeBrands] em uma [String], com todas as letras
     * convertidas em maiúsculas, através do separador " / ", mostrando no máximo 3 [CoffeeBrand.name]. Caso
     * [coffeeBrands] tenha 4 ou mais elementos, deverá mostrar um quarto (e último) token com a string "...".
     *
     * **Observações**
     *  - Para mais informações sobre o modelo de domínio, consulte o arquivo '*-model.kt'.
     *
     * **Exemplos**
     * - Ex. 1)
     *      ```
     *         List [
     *            CoffeeBrand (name: "Caribou"),
     *            CoffeeBrand (name: "dunkin donuts")
     *          ]
     *          =>
     *          "CARIBOU / DUNKIN DONUTS"
     *       ```
     *
     * - Ex. 2)
     *      ```
     *         List [
     *            CoffeeBrand (name: "Caribou"),
     *            CoffeeBrand (name: "dunkin donuts"),
     *            CoffeeBrand (name: "Kopi Luwak"),
     *            CoffeeBrand (name: "FOLGERS")
     *          ]
     *          =>
     *          "CARIBOU / DUNKIN DONUTS / KOPI LUWAK / ..."
     *       ```
     *
     * - Ex. 3)
     *      ```
     *         List [
     *            CoffeeBrand (name: "Caribou"),
     *            CoffeeBrand (name: "dunkin donuts"),
     *            CoffeeBrand (name: "Kopi Luwak"),
     *            CoffeeBrand (name: "FOLGERS"),
     *            CoffeeBrand (name: "Gloria Jean's")
     *          ]
     *          =>
     *          "CARIBOU / DUNKIN DONUTS / KOPI LUWAK / ..."
     *       ```
     *
     * O que deve ser entregue?
     *  - Implementação da solução nas linguagens Java e Kotlin.
     *  - Testes de unidade escritos em Kotlin.
     */
    fun solve(coffeeBrands: List<CoffeeBrand>): String

}