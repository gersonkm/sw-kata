package br.com.sidlar.stopwatch.swkata.collectionpipeline.cpi_001

interface CPI_001_B {

    /**
     * Este método deverá indexar cada elemento de [livros] por [Livro.isbn] em um [Map].
     * A ordem de iteração dos elementos do [Map] deverá ser [Livro.dataPublicacao].
     *
     * **Observações**
     *  - Para mais informações sobre o modelo de domínio, consulte o arquivo '*-model.kt'.
     *
     * **Exemplos**
     * - Ex. 1)
     *      ```
     *         List [
     *            Livro (isbn: "9780132350884", dataPublicacao: 11/08/2008),
     *            Livro (isbn: "9780321349606", dataPublicacao: 19/05/2006),
     *            Livro (isbn: "9780131177055", dataPublicacao: 02/10/2004),
     *            Livro (isbn: "9780201485677", dataPublicacao: 08/07/1999),
     *            Livro (isbn: "9780321356680", dataPublicacao: 28/05/2008)
     *          ]
     *          =>
     *          Map { /* entradas na ordem de iteração */
     *            "9780201485677": Livro (isbn: "9780201485677", dataPublicacao: 08/07/1999),
     *            "9780131177055": Livro (isbn: "9780131177055", dataPublicacao: 02/10/2004),
     *            "9780321349606": Livro (isbn: "9780321349606", dataPublicacao: 19/05/2006),
     *            "9780321356680": Livro (isbn: "9780321356680", dataPublicacao: 28/05/2008),
     *            "9780132350884": Livro (isbn: "9780132350884", dataPublicacao: 11/08/2008)
     *          }
     *       ```
     *
     * O que deve ser entregue?
     *  - Implementação da solução nas linguagens Java e Kotlin.
     *  - Testes de unidade escritos em Kotlin.
     */
    fun solve(livros: List<Livro>): Map<String, Livro>


}