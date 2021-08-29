    fun validator(nilaiPemain:String):Boolean {
        return if (nilaiPemain != "GUNTING" && nilaiPemain != "BATU" &&
            nilaiPemain != "KERTAS"){
                println("")
                println("KETERANGAN:")
                println("Inputan salah. Pemain hanya dapat menginput: Gunting, Batu atau Kertas")
                println("Silahkan input kembali!!")
                println("")
                false
        } else {
            true
        }

    }