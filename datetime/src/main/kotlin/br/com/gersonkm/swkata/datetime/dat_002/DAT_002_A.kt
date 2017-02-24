package br.com.gersonkm.swkata.datetime.dat_002

import com.google.common.collect.Range
import java.time.LocalDate
import java.time.YearMonth

interface DAT_002_A {

    /**
     * Este método deverá produzir uma lista com todas as datas ([LocalDate]) presentes no intervalo de
     * dois meses ([monthInterval]), iniciando no primeiro dia do mês inicial e terminando no último dia do
     * mês final.
     *
     * **Observações**
     * - a implementação da lista ([List]) a ser retornada deverá ser [ArrayList];
     * - a lista retornada não deverá conter nenhuma data duplicada;
     * - os dias ([LocalDate]) deverão aparecer na ordem da menor data para a maior data;
     *
     * **Exemplos**
     *  - Ex. 1) 02/2017 ~ 04/2017 => [01/02/2017, 02/02/2017, ..., 29/04/2017, 30/04/2017]
     *  - Ex. 2) 12/2017 ~ 01/2018 => [01/12/2017, 02/12/2017, ..., 30/01/2018, 31/01/2018]
     *  - Ex. 3) 02/2020 ~ 02/2020 => [01/02/2020, 02/02/2020, ..., 28/02/2020, 29/02/2020]
     */
    fun solve(monthInterval: Range<YearMonth>): List<LocalDate>

}