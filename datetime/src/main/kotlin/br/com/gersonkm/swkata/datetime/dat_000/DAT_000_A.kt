package br.com.gersonkm.swkata.datetime.dat_000

import java.time.LocalDate

interface DAT_000_A {

    /**
     * Este método deverá calcular a próxima data a partir da data ([data]) especificada.
     *
     * **Exemplos**
     *  - Ex. 1) 05/01/2017 => 06/01/2017
     *  - Ex. 2) 28/02/2017 => 01/03/2017
     */
    fun solve(data: LocalDate): LocalDate

}