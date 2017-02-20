package br.com.sidlar.stopwatch.swkata.collectionpipeline.cpi_001

interface CPI_001_A {

    /**
     * Este método deverá criar, para cada elemento de [livros], uma entrada no [Map] onde a chave é [Livro.isbn]
     * e o valor é [Livro.titulo].
     *
     * **Observações**
     *  - Não é necessário garantir nenhuma ordem de iteração específica das entradas no [Map].
     *  - Para mais informações sobre o modelo de domínio, consulte o arquivo '*-model.kt'.
     *
     * **Exemplos**
     * - Ex. 1)
     *      ```
     *         List [
     *            Livro (isbn: "9780132350884", titulo: "A Handbook of Agile Software Craftsmanship"),
     *            Livro (isbn: "9780321349606", titulo: "Java Concurrency in Practice"),
     *            Livro (isbn: "9780131177055", titulo: "Working Effectively with Legacy Code"),
     *            Livro (isbn: "9780201485677", titulo: "Refactoring: Improving the Design of Existing Code"),
     *            Livro (isbn: "9780321356680", titulo: "Effective Java (2nd Edition)")
     *          ]
     *          =>
     *          Map { /* entradas em qualquer ordem */
     *            "9780131177055": "Working Effectively with Legacy Code",
     *            "9780321349606": "Java Concurrency in Practice",
     *            "9780132350884": "A Handbook of Agile Software Craftsmanship",
     *            "9780321356680": "Effective Java (2nd Edition)",
     *            "9780201485677": "Refactoring: Improving the Design of Existing Code"
     *          }
     *       ```
     *
     * O que deve ser entregue?
     *  - Implementação da solução nas linguagens Java e Kotlin.
     *  - Testes de unidade escritos em Kotlin.
     */
    fun solve(livros: List<Livro>): Map<String, String>

}