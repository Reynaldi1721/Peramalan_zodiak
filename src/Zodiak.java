public class Zodiak {
    private String zodiak;
    private String nama;
    private int ramal;
    private String kata;
    private String Kata1;
    private String kata2;
    private String pil;



    public Zodiak() {
        this.zodiak = zodiak;
        this.nama = nama;
    }

    public String getPil() {
        return pil;
    }

    public void setPil(String pil) {
        this.pil = pil;
    }

    public String getZodiak() {
        return zodiak;
    }

    public void setZodiak(String zodiak) {
        this.zodiak = zodiak;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKata() {
        return kata;
    }

    public void setKata(String kata) {
        this.kata = kata;
    }

    public String getKata1() {
        return Kata1;
    }

    public void setKata1(String kata1) {
        Kata1 = kata1;
    }

    public String getKata2() {
        return kata2;
    }

    public void setKata2(String kata2) {
        this.kata2 = kata2;
    }

    public int getRamal() {
        return ramal;
    }

    public void setRamal(int ramal) {
        this.ramal = ramal;
    }

    @Override
    public String toString() {
        return "Zodiak{" +
                "zodiak='" + zodiak + '\'' +
                ", nama='" + nama + '\'' +
                '}';
    }

    public String cpr(){
        return getNama() +"\n" + "Capricorn " +"\n" +
                "Tanggal : 22 des - 19 jan" + "\n" +
                "Lambang : Kambing" + "\n" +
                "Capricorn sangat ambisius dalam mencapai hal yang diinginkan, hingga ia harus mengeluarkan semua " +"\n" +
                "kebijaksanaan dalam bekerja, tak melepas tanggung jawab, dan keseriusan dalam belajar." +"\n" +
                "Namun, dibalik kegigihannya yang merupakan sifat baik dari Capricorn, ia juga memiliki sifat yang " +"\n" +
                "buruk, yakni suka memandang negatif.";

    }
    public String aqr(){
        return getNama() +"\n" +"Aquarius " +"\n" +
                "Tanggal : 20 jan - 18 feb" + "\n" +
                "Lambang : Pembawa Air" + "\n" +
                "Melambangkan gelombang air yang memiliki alur, pemilik salah satu sifat 12 zodiak lengkap " + "\n" +
                "yakni Aquarius ini ternyata sangat tertarik dengan dunia petualangan. Mereka pun sangat memiliki" + "\n" +
                " rasa ingin tahu yang tinggi, berjiwa kemanusiaan, gerak cepat, progesif, hingga mampu memberikan" + "\n" +
                " manfaat untuk orang yang ada disekitarnya." + "\n" +
                "Akan tetapi, ternyata ada juga sifat yang membuat Aquarius menjadi seseorang yang tak mengasyikkan, " +"\n" +
                "yakni karena memiliki sifat buruk seperti suka membantah, pemberontak, tidak konsisten, tidak bisa " +"\n" +
                "diharapkan, malas berpikir. Namun, meski begitu Aquarius termasuk dalam golongan zodiak yang stabil " +"\n" +
                "dan memiliki ketahanan yang cukup baik.";

    }
    public String pis(){
        return getNama() +"\n" +"Pisces " +"\n" +
                "Tanggal : 19 feb - 20 mar" + "\n" +
                "Lambang : Dua ekor ikan" + "\n" +
                "Secara umum, Pisces merupakan zodiak yang memiliki sifat manja dan penuh dengan cinta. " +"\n" +
                "Mereka selelu memperlihatkan kepercayaan, kesepahaman, puitis, penyuka musik, setia, penghibur, " +"\n" +
                "dan pantang menyerah." +"\n" +
                "Namun, Pisces ternyata juga memiliki sifat yang membuatnya menjadi merasa bingung, sering merasa " +"\n" +
                "bersalah, mudah kecewa, khawatir yang berlebih, risau, hingga mudah menjadi sasaran penipuan." +"\n" +
                "Sifat yang kadang mudah mengalami perubahan dari kebalikan baik dan buruk, membuat Pisces " +"\n" +
                "masuk dalam kategori variabel, sehingga zodiak ini bisa dibilang fleksibel.";
    }
    public String ars(){
        return getNama() +"\n" +"Aries " +"\n" +
                "Tanggal : 21 mar - 20 apr" + "\n" +
                "Lambang : Domba" +"\n" +
                " Aries dikenal sebagai seseorang yang melambangkan keberanian. Tidak hanya itu, " +"\n" +
                "mereka juga memiliki keyakinan diri yang tinggi, inisiatif, mengutamakan tindakan, " +"\n" +
                "memiliki pertahanan diri, pejuang, dan pecinta juga." + "\n" +
                "Namun, ada kalanya Aries juga memiliki sifat yang negatif yakni seperti terlalu pemikir, " +"\n" +
                "agak kasar, sombong, agresif, melakukan pekerjaan yang tidak diselesaikan dengan sempurna, " +"\n" +
                "hingga memiliki kelemahan. Di sini, zodiak Aries termasuk dalam kategori kardinal," +"\n" +
                " atau yang dimaksud zodiak yang aktif.";

    }
    public String tar(){
        return getNama() +"\n" +"Taurus " +"\n" +
                "Tanggal : 21 apr - 20 mei" + "\n" +
                "Lambang : Sapi" +"\n" +
                "Sifat umum Taurus adalah sangat " +"\n" +
                "mengutamakan kekayaannya, sehingga ia pun gemar berpelesiran, memiliki rasa loyalitas yang tinggi, " +"\n" +
                "murah rezeki, hingga memiliki rasa ketabahan yang besar." +"\n" +
                "Meski demikian, ada kalanya Taurus juga bersikap terlalu mengekang, keras hati, " +"\n" +
                "dan sering terjebak dalam pikiran yang buntu. Mungkin hal tersebut masuk dalam sifat buruk dari Taurus, " +"\n" +
                "sehingga zodiak ini termasuk dalam kategori tetap atau bisa juga stabil, dalam urusan ketabahan, " +"\n" +
                "daya tahan, hingga kesempurnaan." ;
    }
    public String gem(){
        return getNama() +"\n" +"Gemini " +"\n" +
                "Tanggal : 21 mei - 20 jun" + "\n" +
                "Lambang : Anak Kembar" +"\n" +
                "Gemini condong memiliki sifat yang aktif, dimana ia sangat terampil dalam hal berkomunikasi, cerdas, " +"\n" +
                "multi talenta, senang bepergian, hingga mudah akrab dengan orang lain." +"\n" +
                "Namun, jika dilihat dari sifat buruknya, Gemini juga kerap menjadi seseorang yang suka bersikap " +"\n" +
                "kekanak-kanakan, bermuka dua, gugup, berbicara omong kosong, suka berpura-pura, hingga bersikap hanya" +"\n" +
                "sekejap saja. Untuk kategori, Gemini masuk dalam zodiak yang variabel, karena ia termasuk orang yang " +"\n" +
                "kreatif meski tidak terlalu praktis.";
    }
    public String can(){
        return getNama() +"\n" +"Cancer " +"\n" +
                "Tanggal : 21 jun - 20 jul" + "\n" +
                "Lambang : Kepiting" +"\n" +
                "Cancer merupakan salah satu zodiak yang memiliki sifat baik berupa keramahan, rasa simpati yang tinggi, " +"\n" +
                "pelindung yang baik, senang dengan kehidupan rumah tangga, memiliki rasa kesabaran yang besar, jujur, dan cerdas." +"\n" +
                "Namun, Cancer juga memiliki sifat buruk, di antaranya adalah " +"\n" +
                "suka bersikap kekanak-kanakan, suka berpura-pura, terlalu memaksakan sesuatu, " +"\n" +
                "hingga tidak suka dengan hal-hal yang berbau perpisahan. Cancer juga masuk dalam kategori kardinal, " +"\n" +
                "yakni sebagai zodiak yang aktif. Karena di sini, Cancer dianggap baik untuk memulai seiap proyek baru.";
    }
    public String leo(){
        return getNama() +"\n" +"Leo " +"\n" +
                "Tanggal : 21 jul - 21 august" + "\n" +
                "Lambang : Singa" +"\n" +
                "Melambangkan singa, Leo bisa dibilang merupakan zodiak yang memiliki sifat yang amat menonjol dari 12 sifat zodiak lengkap." +"\n" +
                "Seperti lambangnya, Leo sangat menggambarkan kemegahan, kepemimpinan, murah hati, penuh cinta, ramah," +"\n" +
                " memiliki aura kagungan, keberanian, hingga berbakat dalam hal menghibur." +"\n" +
                "Namun, dibalik itu, Leo ternyata juga memiliki beberapa sifat buruk. Mulai dari " +"\n" +
                "suka memperlihatkan kekuasaan, mengejar kemewahan, memiliki ego yang tinggi, banyak bicara, hingga suka pamer. " +"\n" +
                "Untuk kategori, Leo masuk kualifikasi tetap, di mana ia akan baik untuk memastikan sesuatu berjalan dengan lancar atau berhasil.";
    }
    public String vir(){
        return getNama() +"\n" +"Virgo " +"\n" +
                "Tanggal : 22 August - 22 Sept" + "\n" +
                "Lambang : Putri Cantik" +"\n" +
                "Dari sifat 12 zodiak lengkap, salah satunya ada zodiak Virgo. Zodiak yang mengutamakan kesehatan, " +"\n" +
                "Virgo juga sangat berkonsentrasi dan disiplin. Tidak hanya itu, Virgo juga suka bekerja, " +"\n" +
                "selalu ingin memberikan hasil kerja yang sempurna, praktis, siap melayani, hingga komperehensif." +"\n" +
                "Namun, Virgo juga memiliki beberapa sifat buruk lho, yakni sering merasa khawatir yang berlebih, " +"\n" +
                "cerewet, suka mengkritik, berpandangan sempit, suka mengeluh, hingga tidak mudah mengaku kalah. " +"\n" +
                "Selain itu, Virgo juga termasuk dalam kategori zodiak yang variabel, di mana Virgo merupakan zodiak yang kreatif.";
    }
    public String lib(){
        return getNama() +"\n" +"Libra " +"\n" +
                "Tanggal : 23 Sep - 22 okt" + "\n" +
                "Lambang : Timbangan (Neraca)" +"\n" +
                "Zodiak berlambang neraca ini ternyata memiliki sifat yang mengutamakan kesetaraan. Ciri khasnya, " +"\n" +
                "Libra dikenal seimbang, aliansi, diplomasi, suka membantu, selalu merasa ceria, " +"\n" +
                "sangat baik sebagai pasangan yang ideal, karena menyukai keadilan." +"\n" +
                "Namun, ada kalanya sifat Libra sangat berbalik. Di mana Libra suka berpura-pura, tidak jujur, " +"\n" +
                "menyampaikan tujuan yang kurang tegas, atau tindakan kurang seimbang. Selain itu, " +"\n" +
                "Libra juga termasuk dalam kategori kardinal.";
    }
    public String sco(){
        return getNama() +"\n" +"Scorpio " +"\n" +
                "Tanggal : 23 okt - 22 nov" + "\n" +
                "Lambang : Kalajengking" +"\n" +
                "Zodiak yang melambangkan kalajengking ini disebut memiliki sifat yang sangat dekat kaitannya dengan kreativitas. " +"\n" +
                "Tidak hanya itu, Scorpio juga memiliki keinginan yang kuat, kemewahan, punya stamina serta daya sensual yang tinggi, " +"\n" +
                "hingga memiliki bakat menyembuhkan." +"\n" +
                "Meski begitu, Scorpio juga ternyata mudah sekali cemburu, suka membinasakan diri, hingga fanatik. " +"\n" +
                "Untuk kategori, Scorpio masuk dalam kategori tetap, yakni termasuk zodiak yang stabilitas, ketabahan, " +"\n" +
                "ketahanan, dan kesempurnaan.";
    }
    public String sag(){
        return getNama() +"\n" +"Sagitarius " +"\n" +
                "Tanggal : 23 Nov - 22 Des" + "\n" +
                "Lambang : Centaur (Manusia Berbadan Kuda)" +"\n" +
                "Sagitarius mengutamakan peminatan terhadap belajar. Selain itu, Sagitarius juga merupakan zodiak yang optimis, " +"\n" +
                "memiliki pemahaman diri yang baik, mempunyai cita-cita dan impian yang tinggi, bijaksana, senang bereksplorasi." +"\n" +
                "Untuk sifat lainnya yang dinilai merupakan sifat buruk, di antaranya adalah Sagitarius termasuk pribadi yang lalai, " +"\n" +
                "tidak mematuhi hukum, memiliki kegelisahan yang besar, tidak jujur dan cenderung tidak bertanggung jawab. " +"\n" +
                "Sagitarius juga masuk dalam kategori variabel, karena mereka mudah mengalami daya perubahan, daya adaptasi dan daya keseimbangan.";
    }

    public void uang(){
        if(getRamal() == 0){
            setKata("Keuanganmu mungkin akan terguncang, tetaplah berhati-hati.");
        }else if (getRamal() == 1){
            setKata("Jangan terlalu boros, kamu akan mengalami masalah keuangan.");
        }else if (getRamal() == 2) {
            setKata("Tidak ada salahnya untuk membuat tabungan pensiun sejak dini.");
        }else if (getRamal() == 3) {
            setKata("Kamu terlalu konsumtif, tetapi kamu bisa memilih antara keinginan dan kebutuhan.");
        }else if (getRamal() == 4) {
            setKata("Jika tidak mampu mengendalikan keuangan, kamu bisa tergoda untuk utang.");
        }else if (getRamal() == 5) {
            setKata("Berinvestasi bisa kamu lakukan tetapi kamu harus mengetahuinya terlebih dahulu.");
        }else if (getRamal() == 6) {
            setKata("Kamu tergoda untuk berbelanja banyak karena banyak diskon.");
        }else if (getRamal() == 7) {
            setKata("Jika tidak dapat membuat anggaran, kamu bisa meminta bantuan orang yang sudah ahli di bidangnya.");
        }else if (getRamal() == 8) {
            setKata("Menabunglah untuk kebutuhan tak terduga, ini sangat penting.");
        }else if (getRamal() == 9) {
            setKata("Investasi akan menguntungkanmu di kemudian hari.");
        }
    }
    public void love(){
        if(getRamal() == 0){
            setKata1("Single: Jika kamu ingin PDKT cobalah untuk melakukan hal kecil dulu." +
                    "\n" +
                    "Couple: Jangan mudah marah, hal ini membuat pasanganmu merasa bingung.");
        }else if (getRamal() == 1){
            setKata1("Single: Jangan membuat si dia merasa risih, kesempatan untuk mendekati si dia akan hilang." +
                    "\n" +
                    "Couple: Jujurlah pada dirimu sendiri jika kamu tidak memiliki perasaan kepada pasanganmu.");
        }else if (getRamal() == 2) {
            setKata1("Single: Kamu mudah menyerah untuk mendapatkan hatinya." +
                    "\n" +
                    "Couple: Kamu mengerti keadaan pasanganmu, berikan semangat dan dukungan bila dia membutuhkannya.");
        }else if (getRamal() == 3) {
            setKata1("Single: Jika memang berjodoh kamu akan bertemu lagi dengan si dia." +
                    "\n" +
                    "Couple: Jangan paksa pasanganmu untuk melakukan apa yang kamu mau,.");
        }else if (getRamal() == 4) {
            setKata1("Single: Kamu membutuhkan orang yang bisa mengimbangimu dengan gaya hidup yang sama." +
                    "\n" +
                    "Couple: Terlalu egois pada pasangan bisa menghancurkan hubungan.");
        }else if (getRamal() == 5) {
            setKata1("Single: Kamu tertarik untuk menikmati waktu bersama dengan sahabatmu." +
                    "\n" +
                    "Couple: Cari tahu apa yang membuat pasanganmu menjadi mudah marah.");
        }else if (getRamal() == 6) {
            setKata1("Single: Si dia sepertinya memberikan sinyal kepadamu." +
                    "\n" +
                    "Couple: Kamu harusnya dapat bersyukur memiliki pasangan yang setia.");
        }else if (getRamal() == 7) {
            setKata1("Single: Kamu tengah mendekati seseorang, sepertinya si dia juga memiliki perasaan denganmu." +
                    "\n" +
                    "Couple: Jangan membuang kesempatan untuk menghasilkan waktu bersama.");
        }else if (getRamal() == 8) {
            setKata1("Single: Cobalah meminta bantuan teman untuk mencari tahu tentang si dia." +
                    "\n" +
                    "Couple: Tak menjadi masalah jika kamu perlu membicarakan tentang status hubunganmu.");
        }else if (getRamal() == 9) {
            setKata1("Single: Kamu akan menyesal karena si dia yang benar-benar mencintaimu pergi meninggalkanmu." +
                    "\n" +
                    "Couple: Tidak terlalu buruk untuk membuat pasangan");
        }
    }
    public void umum(){
        if(getRamal() == 0){
            setKata2("Jangan terlalu sombong, kamu akan dijauhi banyak orang.");
        }else if (getRamal() == 1){
            setKata2("Sesekali kamu bisa mencari suasana baru untuk bekerja.");
        }else if (getRamal() == 2) {
            setKata2("Jangan mudah terprofokasi orang lain, kamu bisa tidak fokus.");
        }else if (getRamal() == 3) {
            setKata2("Terlalu banyak pikiran yang bisa membuatmu sakit.");
        }else if (getRamal() == 4) {
            setKata2("Ambil keputusan yang tepat jangan sampai menyesal.");
        }else if (getRamal() == 5) {
            setKata2("Tak mudah menyerah untuk mendapatkan apa yang kamu inginkan, tetapi jangan berlebihan.");
        }else if (getRamal() == 6) {
            setKata2("Untuk menyelesaikan pekerjaan kamu perlu memiliki energi yang lebih.");
        }else if (getRamal() == 7) {
            setKata2("Kamu sangat bersemangat untuk menyelesaikan pekerjaan dengan teliti.");
        }else if (getRamal() == 8) {
            setKata2("Cobalah untuk mencari tahu apa yang membuatmu menjadi cemas.");
        }else if (getRamal() == 9) {
            setKata2("Kamu akan mengerti tentang menjaga kesehatan saat kamu merasakan sakit.");
        }
    }
}
