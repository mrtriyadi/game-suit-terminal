    fun ulang(): Boolean {
        lateinit var ulang: String
        var hasil: Boolean = true
        do{
            print("Apakah ingin mengulang permainan(Y/T)?")
            ulang = readLine().toString().uppercase()
            when(ulang) {
                "Y" -> hasil = true
                "T" -> hasil = false
                else -> println("Anda salah memasukan inputan. bego lo. silahkan input Y atau T")
            }
        //akan diulang apabila user tidak menginput Y atau T
        } while(ulang!="Y" && ulang!="T")
        return hasil
    }