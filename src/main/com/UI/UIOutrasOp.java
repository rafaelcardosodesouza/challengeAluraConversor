package main.com.UI;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Scanner;

public class UIOutrasOp {
    public static void exibirSubMenuOutrasOpcoes() throws InterruptedException {
        Scanner sc = new Scanner(System.in);

        HashMap<String, String> currencies = new HashMap<>();
        currencies.put("BRL", "Real Brasileiro");
        currencies.put("AED", "Dirham dos Emirados Árabes Unidos");
        currencies.put("AFN", "Afegane afegão");
        currencies.put("ALL", "Lek albanês");
        currencies.put("AMD", "Dram armênio");
        currencies.put("ANG", "Florim das Antilhas Holandesas");
        currencies.put("AOA", "Kwanza angolano");
        currencies.put("ARS", "Peso argentino");
        currencies.put("AUD", "Dólar australiano");
        currencies.put("AWG", "Florim de Aruba");
        currencies.put("AZN", "Manat azerbaijano");
        currencies.put("BAM", "Marco conversível da Bósnia e Herzegovina");
        currencies.put("BBD", "Dólar de Barbados");
        currencies.put("BDT", "Taka bengalesa");
        currencies.put("BGN", "Lev búlgaro");
        currencies.put("BHD", "Dinar bareinita");
        currencies.put("BIF", "Franco burundiano");
        currencies.put("BMD", "Dólar das Bermudas");
        currencies.put("BND", "Dólar de Brunei");
        currencies.put("BOB", "Boliviano boliviano");
        currencies.put("BSD", "Dólar das Bahamas");
        currencies.put("BTN", "Ngultrum butanês");
        currencies.put("BWP", "Pula de Botsuana");
        currencies.put("BYN", "Rublo bielorrusso");
        currencies.put("BZD", "Dólar do Belize");
        currencies.put("CAD", "Dólar canadense");
        currencies.put("CDF", "Franco congolês");
        currencies.put("CHF", "Franco suíço");
        currencies.put("CLP", "Peso chileno");
        currencies.put("CNY", "Yuan chinês");
        currencies.put("COP", "Peso colombiano");
        currencies.put("CRC", "Colón costa-riquenho");
        currencies.put("CUP", "Peso cubano");
        currencies.put("CVE", "Escudo cabo-verdiano");
        currencies.put("CZK", "Coroa checa");
        currencies.put("DJF", "Franco do Djibuti");
        currencies.put("DKK", "Coroa dinamarquesa");
        currencies.put("DOP", "Peso dominicano");
        currencies.put("DZD", "Dinar argelino");
        currencies.put("EGP", "Libra egípcia");
        currencies.put("ERN", "Nakfa eritreia");
        currencies.put("ETB", "Birr etíope");
        currencies.put("EUR", "Euro");
        currencies.put("FJD", "Dólar fijiano");
        currencies.put("FKP", "Libra das Ilhas Falkland");
        currencies.put("FOK", "Coroa feroesa");
        currencies.put("GBP", "Libra esterlina britânica");
        currencies.put("GEL", "Lari georgiano");
        currencies.put("GGP", "Libra de Guernsey");
        currencies.put("GHS", "Cedi ganês");
        currencies.put("GIP", "Libra de Gibraltar");
        currencies.put("GMD", "Dalasi gambiano");
        currencies.put("GNF", "Franco guineense");
        currencies.put("GTQ", "Quetzal guatemalteco");
        currencies.put("GYD", "Dólar da Guiana");
        currencies.put("HKD", "Dólar de Hong Kong");
        currencies.put("HNL", "Lempira hondurenha");
        currencies.put("HRK", "Kuna croata");
        currencies.put("HTG", "Gourde haitiano");
        currencies.put("HUF", "Forint húngaro");
        currencies.put("IDR", "Rupia indonésia");
        currencies.put("ILS", "Novo shekel israelense");
        currencies.put("IMP", "Libra da Ilha de Man");
        currencies.put("INR", "Rupia indiana");
        currencies.put("IQD", "Dinar iraquiano");
        currencies.put("IRR", "Rial iraniano");
        currencies.put("ISK", "Coroa islandesa");
        currencies.put("JEP", "Libra de Jersey");
        currencies.put("JMD", "Dólar jamaicano");
        currencies.put("JOD", "Dinar jordaniano");
        currencies.put("JPY", "Iene japonês");
        currencies.put("KES", "Xelim queniano");
        currencies.put("KGS", "Som quirguiz");
        currencies.put("KHR", "Riel cambojano");
        currencies.put("KID", "Dólar de Kiribati");
        currencies.put("KMF", "Franco comorense");
        currencies.put("KRW", "Won sul-coreano");
        currencies.put("KWD", "Dinar kuwaitiano");
        currencies.put("KYD", "Dólar das Ilhas Cayman");
        currencies.put("KZT", "Tenge cazaque");
        currencies.put("LAK", "Kip laosiano");
        currencies.put("LBP", "Libra libanesa");
        currencies.put("LKR", "Rupia do Sri Lanka");
        currencies.put("LRD", "Dólar liberiano");
        currencies.put("LSL", "Loti do Lesoto");
        currencies.put("LYD", "Dinar líbio");
        currencies.put("MAD", "Dirham marroquino");
        currencies.put("MDL", "Leu moldavo");
        currencies.put("MGA", "Ariary malgaxe");
        currencies.put("MKD", "Dinar macedônio");
        currencies.put("MMK", "Kyat de Mianmar");
        currencies.put("MNT", "Tugrik mongol");
        currencies.put("MOP", "Pataca de Macau");
        currencies.put("MRU", "Ouguiya mauritana");
        currencies.put("MUR", "Rupia mauriciana");
        currencies.put("MVR", "Rufiyaa maldiva");
        currencies.put("MWK", "Kwacha malauiana");
        currencies.put("MXN", "Peso mexicano");
        currencies.put("MYR", "Ringgit malaio");
        currencies.put("MZN", "Metical moçambicano");
        currencies.put("NAD", "Dólar namibiano");
        currencies.put("NGN", "Naira nigeriana");
        currencies.put("NIO", "Córdoba nicaraguense");
        currencies.put("NOK", "Coroa norueguesa");
        currencies.put("NPR", "Rupia nepalesa");
        currencies.put("NZD", "Dólar neozelandês");
        currencies.put("OMR", "Rial omanense");
        currencies.put("PAB", "Balboa panamenho");
        currencies.put("PEN", "Sol peruano");
        currencies.put("PGK", "Kina da Papua-Nova Guiné");
        currencies.put("PHP", "Peso filipino");
        currencies.put("PKR", "Rupia paquistanesa");
        currencies.put("PLN", "Zloty polonês");
        currencies.put("PYG", "Guarani paraguaio");
        currencies.put("QAR", "Rial catariano");
        currencies.put("RON", "Leu romeno");
        currencies.put("RSD", "Dinar sérvio");
        currencies.put("RUB", "Rublo russo");
        currencies.put("RWF", "Franco ruandês");
        currencies.put("SAR", "Rial saudita");
        currencies.put("SBD", "Dólar das Ilhas Salomão");
        currencies.put("SCR", "Rupia das Seychelles");
        currencies.put("SDG", "Libra sudanesa");
        currencies.put("SEK", "Coroa sueca");
        currencies.put("SGD", "Dólar de Singapura");
        currencies.put("SHP", "Libra de Santa Helena");
        currencies.put("SLE", "Leone de Serra Leoa");
        currencies.put("SLL", "Leone de Serra Leoa");
        currencies.put("SOS", "Xelim somali");
        currencies.put("SRD", "Dólar do Suriname");
        currencies.put("SSP", "Libra sul-sudanesa");
        currencies.put("STN", "Dobra de São Tomé e Príncipe");
        currencies.put("SYP", "Libra síria");
        currencies.put("SZL", "Lilangeni da Suazilândia");
        currencies.put("THB", "Baht tailandês");
        currencies.put("TJS", "Somoni tajique");
        currencies.put("TMT", "Manat turcomeno");
        currencies.put("TND", "Dinar tunisiano");
        currencies.put("TOP", "Pa'anga tonganesa");
        currencies.put("TRY", "Lira turca");
        currencies.put("TTD", "Dólar de Trinidad e Tobago");
        currencies.put("TVD", "Dólar de Tuvalu");
        currencies.put("TWD", "Novo dólar taiwanês");
        currencies.put("TZS", "Xelim tanzaniano");
        currencies.put("UAH", "Hryvnia ucraniano");
        currencies.put("UGX", "Xelim ugandense");
        currencies.put("USD", "Dólar dos Estados Unidos");
        currencies.put("UYU", "Peso uruguaio");
        currencies.put("UZS", "Som uzbeque");
        currencies.put("VES", "Bolívar venezuelano");
        currencies.put("VND", "Dong vietnamita");
        currencies.put("VUV", "Vatu de Vanuatu");
        currencies.put("WST", "Tala samoana");
        currencies.put("XAF", "Franco CFA Central Africano");
        currencies.put("XCD", "Dólar do Caribe Oriental");
        currencies.put("XDR", "Direitos Especiais de Saque");
        currencies.put("XOF", "Franco CFA da África Ocidental");
        currencies.put("XPF", "Franco CFP");
        currencies.put("YER", "Rial iemenita");
        currencies.put("ZAR", "Rand sul-africano");
        currencies.put("ZMW", "Kwacha zambiano");
        currencies.put("ZWL", "Dólar do Zimbábue");

        int count = 0;
        for (String code : currencies.keySet()) {
            System.out.printf("%-5s: %-40s", code, currencies.get(code));
            count++;
            if (count % 2 == 0) {
                System.out.println();
                Thread.sleep(200);
            }

        }

        try {
            System.out.print("Qual a moeda de origem? (exemplo BRL) ");
            String moedaOrigem = sc.nextLine();

            System.out.println("Qual moeda de destino? (Exemplo USD)");
            String moedaDestino = sc.nextLine();

        }catch (Exception e){
            System.out.println(e.getMessage());
        }



        }


}
