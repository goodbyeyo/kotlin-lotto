package lotto.domain

data class LottoResults(private val results: List<LottoResult>) {
    fun totalPrize(): Int {
        val rankCount = countByRank()
        return rankCount.entries.sumOf { (rank, count) -> rank.prize * count }
    }

    private fun countByRank(): Map<LottoRank, Int> {
        return results.associate { it.rank to it.count }
    }

    fun findAllSortedByMatchCount(): List<LottoResult> = results.sortedByDescending { it.rank.matchCount }
}
