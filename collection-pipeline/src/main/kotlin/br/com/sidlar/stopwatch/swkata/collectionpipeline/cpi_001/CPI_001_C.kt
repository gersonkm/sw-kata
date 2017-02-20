package br.com.sidlar.stopwatch.swkata.collectionpipeline.cpi_001

import java.util.*

interface CPI_001_C {

    /**
     * Este método deverá indexar cada elemento de [livros] por [Livro.id] em um [SortedMap].
     * A ordem de iteração dos elementos do [SortedMap] deverá ser a ordem natural da chave.
     *
     * **Observações**
     *  - Para mais informações sobre o modelo de domínio, consulte o arquivo '*-model.kt'.
     *
     * **Exemplos**
     * - Ex. 1)
     *      ```
     *         List [
     *            Livro (id: 6, dataPublicacao: 11/08/2008),
     *            Livro (id: 9, dataPublicacao: 19/05/2006),
     *            Livro (id: 5, dataPublicacao: 02/10/2004),
     *            Livro (id: 1, dataPublicacao: 08/07/1999),
     *            Livro (id: 3, dataPublicacao: 28/05/2008)
     *          ]
     *          =>
     *          Map { /* entradas na ordem da chave */
     *            1: Livro (id: 1, dataPublicacao: 08/07/1999),
     *            3: Livro (id: 3, dataPublicacao: 28/05/2008),
     *            5: Livro (id: 5, dataPublicacao: 02/10/2004),
     *            6: Livro (id: 6, dataPublicacao: 11/08/2008),
     *            9: Livro (id: 9, dataPublicacao: 19/05/2006)
     *          }
     *       ```
     *
     * O que deve ser entregue?
     *  - Implementação da solução nas linguagens Java e Kotlin.
     *  - Testes de unidade escritos em Kotlin.
     */
    fun solve(livros: List<Livro>): SortedMap<Int, Livro>

}