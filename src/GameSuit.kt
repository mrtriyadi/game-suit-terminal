fun main(){
    val pemain1 = Pemain("Player1")
    val pemain2 = Pemain("Player2")

    do {
        //menampilkan header game
        println("=================================")
        println("Game Suit Terminal Kotlin Version")
        println("=================================")

        //INPUTAN PEMAIN
        //input Pemain1
        pemain1.input()

        //input Pemain2
        pemain2.input()

        //mengecek siapa yang menang dengan fungsi yang ada di class CekHasil
        cekHasil(pemain1,pemain2)

    } while(ulang()==true)

}