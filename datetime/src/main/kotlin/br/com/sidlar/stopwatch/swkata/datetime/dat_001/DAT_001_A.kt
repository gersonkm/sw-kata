package br.com.sidlar.stopwatch.swkata.datetime.dat_001

import org.threeten.extra.Days
import org.threeten.extra.Weeks
import java.time.DayOfWeek
import java.time.LocalDate

interface DAT_001_A {

    /**
     * Este método deverá calcular a data resultante da adição de uma quantidade de semanas ([semanas])
     * e de dias ([dias]) sobre uma determinada data ([data]).
     *
     * Se [forcaDiaUtil] for `true`, caso a data resultante não seja um dia útil, então deverá retornar
     * o próximo dia útil em que o dia da semana seja [diaUtilPadrao].
     *
     * **Observações**
     *  - Considere 'dias úteis' os seguintes dias: SEG, TER, QUA, QUI e SEX.
     *  - Se [forcaDiaUtil] for `true` e [diaUtilPadrao] for um fim de semana, lança [IllegalArgumentException].
     *  - Se [semanas] for negativo, subtrai a quantidade de semanas de [data].
     *  - Se [dias] for negativo, subtrai a quantidade de dias de [data].
     *
     * **Exemplos**
     *  - Ex. 1) 05/01/2017 + 2 semanas + 1 dia => 20/01/2017
     *  - Ex. 2) 28/02/2017 + 3 dias => 03/03/2017
     *  - Ex. 3) 05/01/2017 + -1 semanas + -2 dias => 27/12/2016
     *  - Ex. 4) 05/01/2017 + 2 dias => 07/01/2017
     *  - Ex. 5) 05/01/2017 + 2 dias (forcaDiaUtil: true) => 09/01/2017
     *  - Ex. 6) 05/01/2017 + 1 dia (forcaDiaUtil: true, diaUtilPadrao: SUNDAY) => lança IllegalArgumentException
     */
    fun solve(data: LocalDate, semanas: Weeks = Weeks.ZERO, dias: Days = Days.ZERO, forcaDiaUtil: Boolean = false, diaUtilPadrao: DayOfWeek = DayOfWeek.MONDAY): LocalDate

}