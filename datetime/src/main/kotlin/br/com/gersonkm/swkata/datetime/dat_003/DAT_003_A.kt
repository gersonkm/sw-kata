package br.com.gersonkm.swkata.datetime.dat_003

import java.time.LocalDate

interface DAT_003_A {

    /**
     * Este método deverá extrair todos os dias úteis da semana em que se encontra a [data]. Datas com mês/ano
     * diferente da data informada ([data]) não deverão ser retornadas.
     *
     * **Observações**
     * - Considere 'dias úteis' os seguintes dias: SEG, TER, QUA, QUI e SEX.
     * - Considere 'semana' o intervalo de dias que começa no DOM e termina no SAB.
     * - A collection retornada não deverá conter nenhuma data duplicada.
     * - Os dias ([LocalDate]) deverão aparecer na ordem da menor data para a maior data.
     *
     * **Exemplos**
     *  - Ex. 1) 07/01/2017 (SAB) => [02/01/2017 (SEG), 03/01/2017 (TER), 04/01/2017 (QUA), 05/01/2017 (QUI), 06/01/2017 (SEX)]
     *  - Ex. 2) 29/01/2017 (DOM) => [30/01/2017 (SEG), 31/01/2017 (TER)]
     *  - Ex. 3) 30/04/2017 (DOM) => []
     */
    fun solve(data: LocalDate): Set<LocalDate>

}