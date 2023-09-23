import kotlin.jvm.internal.Intrinsics.Kotlin

fun maximumPairwiseProduct(a: IntArray): Long {
    var largest = Int.MIN_VALUE
    var secondLargest = Int.MIN_VALUE
// ;istv = [1,2,3]
    a.forEach { i ->
        if (i > largest) {
            secondLargest = largest
            largest = i
        } else if (i > secondLargest) {
            secondLargest = i

        }
    }

    return largest.toLong() * secondLargest.toLong()

}
