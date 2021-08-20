class ValidasiInput(var nilaiPemain:String) {
    var nilaiValid1:String = "GUNTING"
    var nilaiValid2:String = "BATU"
    var nilaiValid3:String = "KERTAS"
    var hasil:Boolean = true

    fun cek():Boolean {
        if (nilaiPemain != nilaiValid1 && nilaiPemain != nilaiValid2 &&
            nilaiPemain != nilaiValid3){
            hasil = false
            println("")
            println("KETERANGAN:")
            println("Inputan salah. Pemain hanya dapat menginput: Gunting, Batu atau Kertas")
            println("Silahkan input kembali!!")
            println("")
        } else {
            hasil = true
        }
        return hasil
    }
}