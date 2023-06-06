package id.infinitelearning.KotlinSubmission.exercise4

fun main() {

    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */

    val num1 = 10
    val num2 = 0

    try {
        val result = pembagian(num1, num2)
        println("Hasil pembagian: $result")
    } catch (e: ArithmeticException) {
        println("Terjadi kesalahan aritmatika: ${e.message}")
    } catch (e: Exception) {
        println("Terjadi kesalahan: ${e.message}")
    }

}

fun pembagian(a: Int, b: Int): Int {
    return b / a
}
