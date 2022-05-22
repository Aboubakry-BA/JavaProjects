public class BruteForce implements Attack {

    // @Override
    public void attack(String psw) {
        char tab[] = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's',
                't', 'u', 'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N',
                'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '0', '1', '2', '3', '4', '5', '6', '7', '8',
                '9' };
        for (int i = 0; i < tab.length; i++) {
            String test = String.valueOf(tab[i]);
            for (int j = 0; j < tab.length; j++) {
                String test2 = test + "" + String.valueOf(tab[j]);
                for (int k = 0; k < tab.length; k++) {
                    String test3 = test2 + "" + String.valueOf(tab[k]);
                    for (int l = 0; l < tab.length; l++) {
                        String test4 = test3 + "" + String.valueOf(tab[l]);
                        System.out.println(test4);
                        if (test4.equals(psw)) {
                            System.out.println("Le mot de passe est " + test4);
                            return;
                        }
                        for (int m = 0; m < tab.length; m++) {
                            String test5 = test4 + "" + String.valueOf(tab[m]);
                            System.out.println(test5);
                            if (test5.equals(psw)) {
                                System.out.println("Le mot de passe est " + test5);
                                return;
                            }
                            for (int n = 0; n < tab.length; n++) {
                                String test6 = test5 + "" + String.valueOf(tab[n]);
                                System.out.println(test6);
                                if (test6.equals(psw)) {
                                    System.out.println("Le mot de passe est " + test6);
                                    return;
                                }
                                for (int o = 0; o < tab.length; o++) {
                                    String test7 = test6 + "" + String.valueOf(tab[o]);
                                    System.out.println(test7);
                                    if (test7.equals(psw)) {
                                        System.out.println("Le mot de passe est " + test7);
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}