class Pemain(var namaPemain:String) {
    var nama:String = namaPemain
    lateinit var nilai:String

    fun input():Unit{
        do {
            print("Masukan Pilihan $nama: ")
            nilai = readLine().toString().uppercase()

            //mengecek apakah inputan pemain valid
            //pemain hanya dapat menginput: Gunting, Batu atau Kertas
            //bila tidak valid, pemain harus mengulang inputan
            val validasi = ValidasiInput(nilai)
            val valid = validasi.cek()
        } while (!valid)
    }

}