    //merupakan fungsi untuk menampilkan siapa yang menang
    fun cekHasil(pemain1:Pemain, pemain2:Pemain): Unit {
        lateinit var hasil: String
        if (pemain1.nilai == "BATU" && pemain2.nilai == "BATU") {
            hasil = "Seri"
        }
        if (pemain1.nilai == "BATU" && pemain2.nilai == "KERTAS") {
            hasil= pemain2.nama
        }
        if (pemain1.nilai == "BATU" && pemain2.nilai == "GUNTING") {
            hasil= pemain1.nama
        }
        if (pemain1.nilai == "KERTAS" && pemain2.nilai == "BATU") {
            hasil= pemain1.nama
        }
        if (pemain1.nilai == "KERTAS" && pemain2.nilai == "KERTAS") {
            hasil= "Seri"
        }
        if (pemain1.nilai == "KERTAS" && pemain2.nilai == "GUNTING") {
            hasil= pemain2.nama
        }
        if (pemain1.nilai == "GUNTING" && pemain2.nilai == "BATU") {
            hasil= pemain2.nama
        }
        if (pemain1.nilai == "GUNTING" && pemain2.nilai == "KERTAS") {
            hasil= pemain1.nama
        }
        if (pemain1.nilai == "GUNTING" && pemain2.nilai == "GUNTING") {
            hasil= "Seri"
        }
        println("")
        println("Pemenangnya adalah: $hasil")
        println("")
        println("")
    }
