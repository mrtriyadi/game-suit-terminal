class Pemain(var namaPemain:String) {
    val nama:String = namaPemain

    lateinit var nilai:String

    fun input():Unit{
        do {
            print("Masukan Pilihan $namaPemain: ")
            nilai = readLine().toString().uppercase()

            //mengecek apakah inputan pemain valid
            //pemain hanya dapat menginput: Gunting, Batu atau Kertas
            //bila tidak valid, pemain harus mengulang inputan
            val valid = validator(nilai)
        } while (!valid)
    }

}