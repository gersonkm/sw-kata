package br.com.sidlar.stopwatch.swkata.collectionpipeline.cpi_001

import java.time.LocalDate

/**
 * Entity (DDD) representando um livro.
 *
 * Apesar do ISBN ser único por livro, a identidade desta classe, por questão de performance, é o [id].
 *
 * @param [id] identificador (único), não nulo, de um livro.
 * @param [isbn] ISBN-13, sendo único por livro.
 * @param [titulo] título do livro
 * @param [dataPublicacao] data de publicação do livro
 * @param [autores] nomes dos autores do livro
 */
class Livro(val id: Int, val isbn: String, val titulo: String, val dataPublicacao: LocalDate, val autores: List<String>) {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other?.javaClass != javaClass) return false

        other as Livro

        if (id != other.id) return false

        return true
    }

    override fun hashCode(): Int {
        return id
    }
}