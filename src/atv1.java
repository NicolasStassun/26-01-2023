import java.util.Scanner;

public class atv1 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        String DMA;

        System.out.println("Mês por extenso");

        System.out.println("Informe a data por extenso no formato DD/MM/AAA: ");
        DMA = sc.next();
        sc.nextLine();
        String[] splitted= DMA.split("/");

        String DIA = splitted[0];
        String MES = splitted[1];
        String ANO = splitted[2];



        escreveExtenso(MES,DIA,ANO);

    }
    public static void escreveExtenso(String MES, String DIA, String ANO){

        if(MES.equals("1") || MES.equals("01")) {
            if (DIA.equals("1") || DIA.equals("2") || DIA.equals("3") || DIA.equals("4") || DIA.equals("5") || DIA.equals("6") || DIA.equals("7") || DIA.equals("8") || DIA.equals("9") || DIA.equals("10") || DIA.equals("11") || DIA.equals("12") || DIA.equals("13") || DIA.equals("14") || DIA.equals("15") || DIA.equals("16") || DIA.equals("17") || DIA.equals("18") || DIA.equals("19") || DIA.equals("1") || DIA.equals("20") || DIA.equals("21") || DIA.equals("22") || DIA.equals("23") || DIA.equals("24") || DIA.equals("25") || DIA.equals("26") || DIA.equals("27") || DIA.equals("28") || DIA.equals("29") || DIA.equals("30") || DIA.equals("31")) {
                System.out.println(DIA + " de janeiro de " + ANO);
            }
            else{
                System.out.println("Data inválida");
            }
        }
        else if(MES.equals("2") || MES.equals("02")) {
            if (DIA.equals("1") || DIA.equals("2") || DIA.equals("3") || DIA.equals("4") || DIA.equals("5") || DIA.equals("6") || DIA.equals("7") || DIA.equals("8") || DIA.equals("9") || DIA.equals("10") || DIA.equals("11") || DIA.equals("12") || DIA.equals("13") || DIA.equals("14") || DIA.equals("15") || DIA.equals("16") || DIA.equals("17") || DIA.equals("18") || DIA.equals("19") || DIA.equals("1") || DIA.equals("20") || DIA.equals("21") || DIA.equals("22") || DIA.equals("23") || DIA.equals("24") || DIA.equals("25") || DIA.equals("26") || DIA.equals("27") || DIA.equals("28") || DIA.equals("29")) {
                System.out.println(DIA + " de fevereiro de "+ANO);
            }
            else{
                System.out.println("Data inválida");
            }
        }
        else if(MES.equals("3") || MES.equals("03")) {
            if (DIA.equals("1") || DIA.equals("2") || DIA.equals("3") || DIA.equals("4") || DIA.equals("5") || DIA.equals("6") || DIA.equals("7") || DIA.equals("8") || DIA.equals("9") || DIA.equals("10") || DIA.equals("11") || DIA.equals("12") || DIA.equals("13") || DIA.equals("14") || DIA.equals("15") || DIA.equals("16") || DIA.equals("17") || DIA.equals("18") || DIA.equals("19") || DIA.equals("1") || DIA.equals("20") || DIA.equals("21") || DIA.equals("22") || DIA.equals("23") || DIA.equals("24") || DIA.equals("25") || DIA.equals("26") || DIA.equals("27") || DIA.equals("28") || DIA.equals("29") || DIA.equals("30") || DIA.equals("31")) {

                System.out.println(DIA +" de março de "+ANO);
            }
            else{
                System.out.println("Data inválida");
            }
        }
        else if(MES.equals("4") || MES.equals("04")) {
            if (DIA.equals("1") || DIA.equals("2") || DIA.equals("3") || DIA.equals("4") || DIA.equals("5") || DIA.equals("6") || DIA.equals("7") || DIA.equals("8") || DIA.equals("9") || DIA.equals("10") || DIA.equals("11") || DIA.equals("12") || DIA.equals("13") || DIA.equals("14") || DIA.equals("15") || DIA.equals("16") || DIA.equals("17") || DIA.equals("18") || DIA.equals("19") || DIA.equals("1") || DIA.equals("20") || DIA.equals("21") || DIA.equals("22") || DIA.equals("23") || DIA.equals("24") || DIA.equals("25") || DIA.equals("26") || DIA.equals("27") || DIA.equals("28") || DIA.equals("29") || DIA.equals("30")) {

                System.out.println(DIA+ " de abril de "+ANO);
            }
            else{
                System.out.println("Data inválida");
            }
        }
        else if(MES.equals("5") || MES.equals("05")){
            if (DIA.equals("1") || DIA.equals("2") || DIA.equals("3") || DIA.equals("4") || DIA.equals("5") || DIA.equals("6") || DIA.equals("7") || DIA.equals("8") || DIA.equals("9") || DIA.equals("10") || DIA.equals("11") || DIA.equals("12") || DIA.equals("13") || DIA.equals("14") || DIA.equals("15") || DIA.equals("16") || DIA.equals("17") || DIA.equals("18") || DIA.equals("19") || DIA.equals("1") || DIA.equals("20") || DIA.equals("21") || DIA.equals("22") || DIA.equals("23") || DIA.equals("24") || DIA.equals("25") || DIA.equals("26") || DIA.equals("27") || DIA.equals("28") || DIA.equals("29") || DIA.equals("30") || DIA.equals("31")) {

                System.out.println(DIA+ " de maio de "+ANO);

            }
            else{
                System.out.println("Data inválida");
            }
        }
        else if(MES.equals("6") || MES.equals("06")){
            if (DIA.equals("1") || DIA.equals("2") || DIA.equals("3") || DIA.equals("4") || DIA.equals("5") || DIA.equals("6") || DIA.equals("7") || DIA.equals("8") || DIA.equals("9") || DIA.equals("10") || DIA.equals("11") || DIA.equals("12") || DIA.equals("13") || DIA.equals("14") || DIA.equals("15") || DIA.equals("16") || DIA.equals("17") || DIA.equals("18") || DIA.equals("19") || DIA.equals("1") || DIA.equals("20") || DIA.equals("21") || DIA.equals("22") || DIA.equals("23") || DIA.equals("24") || DIA.equals("25") || DIA.equals("26") || DIA.equals("27") || DIA.equals("28") || DIA.equals("29") || DIA.equals("30")) {

                System.out.println(DIA+ " de junho de "+ANO);
            }
            else{
                System.out.println("Data inválida");
            }
        }
        else if(MES.equals("7") || MES.equals("07")){
            if (DIA.equals("1") || DIA.equals("2") || DIA.equals("3") || DIA.equals("4") || DIA.equals("5") || DIA.equals("6") || DIA.equals("7") || DIA.equals("8") || DIA.equals("9") || DIA.equals("10") || DIA.equals("11") || DIA.equals("12") || DIA.equals("13") || DIA.equals("14") || DIA.equals("15") || DIA.equals("16") || DIA.equals("17") || DIA.equals("18") || DIA.equals("19") || DIA.equals("1") || DIA.equals("20") || DIA.equals("21") || DIA.equals("22") || DIA.equals("23") || DIA.equals("24") || DIA.equals("25") || DIA.equals("26") || DIA.equals("27") || DIA.equals("28") || DIA.equals("29") || DIA.equals("30") || DIA.equals("31")) {

                System.out.println(DIA+ " de julho de "+ANO);
            }
            else{
                System.out.println("Data inválida");
            }
        }
        else if(MES.equals("8") || MES.equals("08")){
            if (DIA.equals("1") || DIA.equals("2") || DIA.equals("3") || DIA.equals("4") || DIA.equals("5") || DIA.equals("6") || DIA.equals("7") || DIA.equals("8") || DIA.equals("9") || DIA.equals("10") || DIA.equals("11") || DIA.equals("12") || DIA.equals("13") || DIA.equals("14") || DIA.equals("15") || DIA.equals("16") || DIA.equals("17") || DIA.equals("18") || DIA.equals("19") || DIA.equals("1") || DIA.equals("20") || DIA.equals("21") || DIA.equals("22") || DIA.equals("23") || DIA.equals("24") || DIA.equals("25") || DIA.equals("26") || DIA.equals("27") || DIA.equals("28") || DIA.equals("29") || DIA.equals("30") || DIA.equals("31")) {

                System.out.println(DIA+ " de agosto de "+ANO);
            }
            else{
                System.out.println("Data inválida");
            }
        }
        else if(MES.equals("9") || MES.equals("09")){
            if (DIA.equals("1") || DIA.equals("2") || DIA.equals("3") || DIA.equals("4") || DIA.equals("5") || DIA.equals("6") || DIA.equals("7") || DIA.equals("8") || DIA.equals("9") || DIA.equals("10") || DIA.equals("11") || DIA.equals("12") || DIA.equals("13") || DIA.equals("14") || DIA.equals("15") || DIA.equals("16") || DIA.equals("17") || DIA.equals("18") || DIA.equals("19") || DIA.equals("1") || DIA.equals("20") || DIA.equals("21") || DIA.equals("22") || DIA.equals("23") || DIA.equals("24") || DIA.equals("25") || DIA.equals("26") || DIA.equals("27") || DIA.equals("28") || DIA.equals("29") || DIA.equals("30")) {

                System.out.println(DIA+ " de setembro de "+ANO);
            }
            else{
                System.out.println("Data inválida");
            }
        }
        else if(MES.equals("10")){
            if (DIA.equals("1") || DIA.equals("2") || DIA.equals("3") || DIA.equals("4") || DIA.equals("5") || DIA.equals("6") || DIA.equals("7") || DIA.equals("8") || DIA.equals("9") || DIA.equals("10") || DIA.equals("11") || DIA.equals("12") || DIA.equals("13") || DIA.equals("14") || DIA.equals("15") || DIA.equals("16") || DIA.equals("17") || DIA.equals("18") || DIA.equals("19") || DIA.equals("1") || DIA.equals("20") || DIA.equals("21") || DIA.equals("22") || DIA.equals("23") || DIA.equals("24") || DIA.equals("25") || DIA.equals("26") || DIA.equals("27") || DIA.equals("28") || DIA.equals("29") || DIA.equals("30") || DIA.equals("31")) {

                System.out.println(DIA+ " de outubro de "+ANO);
            }
            else{
                System.out.println("Data inválida");
            }
        }
        else if(MES.equals("11")){
            if (DIA.equals("1") || DIA.equals("2") || DIA.equals("3") || DIA.equals("4") || DIA.equals("5") || DIA.equals("6") || DIA.equals("7") || DIA.equals("8") || DIA.equals("9") || DIA.equals("10") || DIA.equals("11") || DIA.equals("12") || DIA.equals("13") || DIA.equals("14") || DIA.equals("15") || DIA.equals("16") || DIA.equals("17") || DIA.equals("18") || DIA.equals("19") || DIA.equals("1") || DIA.equals("20") || DIA.equals("21") || DIA.equals("22") || DIA.equals("23") || DIA.equals("24") || DIA.equals("25") || DIA.equals("26") || DIA.equals("27") || DIA.equals("28") || DIA.equals("29") || DIA.equals("30")) {

                System.out.println(DIA+ " de novembro de "+ANO);
            }
            else{
                System.out.println("Data inválida");
            }
        }
        else if(MES.equals("12")){
            if (DIA.equals("1") || DIA.equals("2") || DIA.equals("3") || DIA.equals("4") || DIA.equals("5") || DIA.equals("6") || DIA.equals("7") || DIA.equals("8") || DIA.equals("9") || DIA.equals("10") || DIA.equals("11") || DIA.equals("12") || DIA.equals("13") || DIA.equals("14") || DIA.equals("15") || DIA.equals("16") || DIA.equals("17") || DIA.equals("18") || DIA.equals("19") || DIA.equals("1") || DIA.equals("20") || DIA.equals("21") || DIA.equals("22") || DIA.equals("23") || DIA.equals("24") || DIA.equals("25") || DIA.equals("26") || DIA.equals("27") || DIA.equals("28") || DIA.equals("29") || DIA.equals("30") || DIA.equals("31")) {

                System.out.println(DIA+ " de dezembro de "+ANO);
            }
            else{
                System.out.println("Data inválida");
            }
        }

    }


}
