package id.infinitelearning.KotlinSubmission.exercise1

/**
Latihan 1 done
Lengkapi fungsi myProfile di bawah ini dengan membuat variabel dengan ketentuan dibawah ini:
- Variable bertipe data string yang menyimpan nilai nama depan Anda.
- Variable bertipe data string yang menyimpan nilai nama belakang Anda.
- Variable bertipe data number yang menyimpan nilai umur Anda.
- Variable bertipe data boolean yang menyimpan nilai status Anda (single atau tidak)
- Dan cetak setiap variabel ke layar saat fungsi myProfile() di panggil
 */
fun myProfile() {
    var namaDepan = "Yevi"
    var namaBelakang = "Septiray"
    var umur = 21
    var single = true

    println("Nama depan     : $namaDepan")
    println("Nama Belakang  : $namaBelakang")
    println("Usia           : $umur")
    println("Status         : " + if (single) "single" else "ga single")    
}


/**
 *  Latihan 2 done
 *  Lengkapi fungsi di bawah ini agar dapat mencetak nilai dari parameter-parameter yang ada dengan fungsi println
 */
fun groupDetail(groupId: Int, groupMember: List<Any>, session: String) { //: Any{ <- ini juga ga dipakai

    println("ID Group   : $groupId")
    println("Anggota    : " + groupMember.joinToString(", "))
    println("Sesi       : $session")
    //return arrayOf(groupId, groupMember, session) <- ini ga dipakai soalnya disuruh pake println
}

/**
 * Latihan 3 done
 * Buat variable yang berisi daftar anggota group kamu,
 * Kemudian akses item yang berisi nama Anda dari variable tersebut, lalu jadikan nilai kembalian untuk fungsi myGroup ini
 *                                 ---------------------------------------------------------------------------------------
 */
fun myGroup(): String {
    val anggota = arrayOf("Deja Vu","Sabrina Kurnia", "Rafy Djauhari", "Rizki Ramdani", "Berlian Ari Andani","Yevi Septiray","Damar Bambang")
    return anggota[0]
}

/**
 * Latihan 4 done
 * Ubah nilai kembalian untuk fungsi totalMember ini dengan rumus:
 *
 *      total mentor + jumlah anggota group
 *
 */
fun totalMember(): Int {
    val mentor = arrayOf("Dian", "Shasa", "Hasan", "Reza")
    val countOfGroup = 6

    return mentor.size + countOfGroup
}

fun main() {

    myProfile()

    val myGroup = myGroup()
    println("My Group is: $myGroup")

    val totalMember = totalMember()
    println("Total Member group + Mentor: $totalMember")

    /**
     *  Latihan 5 tinggal disesuaikan aja, id groupnya, nama anggota, sama sesinya
     *  Ubah nilai argumen-argumen dari fungsi groupDetail di bawah ini sesuai dengan data group kamu
     *
     */
    groupDetail(4, listOf("Yevi Septiray", "Sabrina Kurnia", "rafy Djauhari","Rizki Ramdani","Damar Bambang","Berlian Ari Andani"), "Pagi")

}