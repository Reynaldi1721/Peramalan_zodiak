import java.lang.invoke.SwitchPoint;
import java.util.Scanner;
import java.util.Random;
public class Mainapp {
    public static void main(String[] args) {
        Zodiak a = new Zodiak();
        Scanner obj = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("masukkan Zodiak kamu");
        a.setZodiak(obj.nextLine());
        System.out.println("masukkan Nama kamu");
        a.setNama(obj.nextLine());

        if (a.getZodiak().equals("capricorn")){
            System.out.println(a.cpr()+"\n");
            System.out.println("apakah "+a.getNama()+ " ingin ramalan zodiak hari ini"+"\n" +
                    "1.ia" +"\n" +
                    "2.tidak" +"\n");
            a.setPil(obj.nextLine());
                if (a.getPil().equals("1")){
                    a.setRamal(rand.nextInt(9));
                    a.uang();
                    a.love();
                    a.umum();
                    System.out.println("keuangan = \n"+ a.getKata());
                    System.out.println("percintan = \n"+a.getKata1());
                    System.out.println("umum = \n"+ a.getKata2());
                    System.out.println("\n Terima kasih ");
                }else{
                    System.out.println("Terima kasih ");
                }

        } else if (a.getZodiak().equals("aquarius")){
            System.out.println(a.aqr()+"\n");
            System.out.println("apakah "+a.getNama()+ " ingin ramalan zodiak hari ini"+"\n" +
                    "1.ia" +"\n" +
                    "2.tidak" +"\n");
            a.setPil(obj.nextLine());
            if (a.getPil().equals("1")){
                a.setRamal(rand.nextInt(9));
                a.uang();
                a.love();
                a.umum();
                System.out.println("keuangan = \n"+ a.getKata());
                System.out.println("percintan = \n"+a.getKata1());
                System.out.println("umum = \n"+ a.getKata2());
                System.out.println("\n Terima kasih ");
            }else{
                System.out.println("Terima kasih ");
            }
        }else if (a.getZodiak().equals("pisces")){
            System.out.println(a.pis()+"\n");
            System.out.println("apakah "+a.getNama()+ " ingin ramalan zodiak hari ini"+"\n" +
                    "1.ia" +"\n" +
                    "2.tidak" +"\n");
            a.setPil(obj.nextLine());
            if (a.getPil().equals("1")){
                a.setRamal(rand.nextInt(9));
                a.uang();
                a.love();
                a.umum();
                System.out.println("keuangan = \n"+ a.getKata());
                System.out.println("percintan = \n"+a.getKata1());
                System.out.println("umum = \n"+ a.getKata2());
                System.out.println("\n Terima kasih ");
            }else{
                System.out.println("Terima kasih ");
            }
        }else if (a.getZodiak().equals("aries")){
            System.out.println(a.ars()+"\n");
            System.out.println("apakah "+a.getNama()+ " ingin ramalan zodiak hari ini"+"\n" +
                    "1.ia" +"\n" +
                    "2.tidak" +"\n");
            a.setPil(obj.nextLine());
            if (a.getPil().equals("1")){
                a.setRamal(rand.nextInt(9));
                a.uang();
                a.love();
                a.umum();
                System.out.println("keuangan = \n"+ a.getKata());
                System.out.println("percintan = \n"+a.getKata1());
                System.out.println("umum = \n"+ a.getKata2());
                System.out.println("\n Terima kasih ");
            }else{
                System.out.println("Terima kasih ");
            }
        }else if (a.getZodiak().equals("taurus")){
            System.out.println(a.tar()+"\n");
            System.out.println("apakah "+a.getNama()+ " ingin ramalan zodiak hari ini"+"\n" +
                    "1.ia" +"\n" +
                    "2.tidak" +"\n");
            a.setPil(obj.nextLine());
            if (a.getPil().equals("1")){
                a.setRamal(rand.nextInt(9));
                a.uang();
                a.love();
                a.umum();
                System.out.println("keuangan = \n"+ a.getKata());
                System.out.println("percintan = \n"+a.getKata1());
                System.out.println("umum = \n"+ a.getKata2());
                System.out.println("\n Terima kasih ");
            }else{
                System.out.println("Terima kasih ");
            }
        }else if (a.getZodiak().equals("gemini")){
            System.out.println(a.gem()+"\n");
            System.out.println("apakah "+a.getNama()+ " ingin ramalan zodiak hari ini"+"\n" +
                    "1.ia" +"\n" +
                    "2.tidak" +"\n");
            a.setPil(obj.nextLine());
            if (a.getPil().equals("1")){
                a.setRamal(rand.nextInt(9));
                a.uang();
                a.love();
                a.umum();
                System.out.println("keuangan = \n"+ a.getKata());
                System.out.println("percintan = \n"+a.getKata1());
                System.out.println("umum = \n"+ a.getKata2());
                System.out.println("\n Terima kasih ");
            }else{
                System.out.println("Terima kasih ");
            }
        }else if (a.getZodiak().equals("cancer")){
            System.out.println(a.can()+"\n");
            System.out.println("apakah "+a.getNama()+ " ingin ramalan zodiak hari ini"+"\n" +
                    "1.ia" +"\n" +
                    "2.tidak" +"\n");
            a.setPil(obj.nextLine());
            if (a.getPil().equals("1")){
                a.setRamal(rand.nextInt(9));
                a.uang();
                a.love();
                a.umum();
                System.out.println("keuangan = \n"+ a.getKata());
                System.out.println("percintan = \n"+a.getKata1());
                System.out.println("umum = \n"+ a.getKata2());
                System.out.println("\n Terima kasih ");
            }else{
                System.out.println("Terima kasih ");
            }
        }else if (a.getZodiak().equals("leo")){
            System.out.println(a.leo()+"\n");
            System.out.println("apakah "+a.getNama()+ " ingin ramalan zodiak hari ini"+"\n" +
                    "1.ia" +"\n" +
                    "2.tidak" +"\n");
            a.setPil(obj.nextLine());
            if (a.getPil().equals("1")){
                a.setRamal(rand.nextInt(9));
                a.uang();
                a.love();
                a.umum();
                System.out.println("keuangan = \n"+ a.getKata());
                System.out.println("percintan = \n"+a.getKata1());
                System.out.println("umum = \n"+ a.getKata2());
                System.out.println("\n Terima kasih ");
            }else{
                System.out.println("Terima kasih ");
            }
        }else if (a.getZodiak().equals("virgo")){
            System.out.println(a.vir()+"\n");
            System.out.println("apakah "+a.getNama()+ " ingin ramalan zodiak hari ini"+"\n" +
                    "1.ia" +"\n" +
                    "2.tidak" +"\n");
            a.setPil(obj.nextLine());
            if (a.getPil().equals("1")){
                a.setRamal(rand.nextInt(9));
                a.uang();
                a.love();
                a.umum();
                System.out.println("keuangan = \n"+ a.getKata());
                System.out.println("percintan = \n"+a.getKata1());
                System.out.println("umum = \n"+ a.getKata2());
                System.out.println("\n Terima kasih ");
            }else{
                System.out.println("Terima kasih ");
            }
        }else if (a.getZodiak().equals("libra")){
            System.out.println(a.lib()+"\n");
            System.out.println("apakah "+a.getNama()+ " ingin ramalan zodiak hari ini"+"\n" +
                    "1.ia" +"\n" +
                    "2.tidak" +"\n");
            a.setPil(obj.nextLine());
            if (a.getPil().equals("1")){
                a.setRamal(rand.nextInt(9));
                a.uang();
                a.love();
                a.umum();
                System.out.println("keuangan = \n"+ a.getKata());
                System.out.println("percintan = \n"+a.getKata1());
                System.out.println("umum = \n"+ a.getKata2());
                System.out.println("\n Terima kasih ");
            }else{
                System.out.println("Terima kasih ");
            }
        }else if (a.getZodiak().equals("scorpio")){
            System.out.println(a.sco()+"\n");
            System.out.println("apakah "+a.getNama()+ " ingin ramalan zodiak hari ini"+"\n" +
                    "1.ia" +"\n" +
                    "2.tidak" +"\n");
            a.setPil(obj.nextLine());
            if (a.getPil().equals("1")){
                a.setRamal(rand.nextInt(9));
                a.uang();
                a.love();
                a.umum();
                System.out.println("keuangan = \n"+ a.getKata());
                System.out.println("percintan = \n"+a.getKata1());
                System.out.println("umum = \n"+ a.getKata2());
                System.out.println("\n Terima kasih ");
            }else{
                System.out.println("Terima kasih ");
            }
        }else if (a.getZodiak().equals("sagitarius")){
            System.out.println(a.sag()+"\n");
            System.out.println("apakah "+a.getNama()+ " ingin ramalan zodiak hari ini"+"\n" +
                    "1.ia" +"\n" +
                    "2.tidak" +"\n");
            a.setPil(obj.nextLine());
            if (a.getPil().equals("1")){
                a.setRamal(rand.nextInt(9));
                a.uang();
                a.love();
                a.umum();
                System.out.println("keuangan = \n"+ a.getKata());
                System.out.println("percintan = \n"+a.getKata1());
                System.out.println("umum = \n"+ a.getKata2());
                System.out.println("\n Terima kasih ");
            }else{
                System.out.println("Terima kasih ");
            }
        }else{
            System.out.println("salah masukkan zodiak");
        }
    }
}
