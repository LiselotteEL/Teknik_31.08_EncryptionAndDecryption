public class Main {

    public static void main(String[] args) {


        char[] txt = new char[]{'h', 'e', 'j'};
        char[] encTxt = new char[]{};
        int i = 0;
        int j = 0;

        char[] alphabet = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'æ', 'ø', 'å', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '.', '_', ' '};

        char[] encryption = new char[]{' ', '_', '.', '9', '8', '7', '6', '5', '4', '3', '2', '1', '0', 'å', 'ø', 'æ', 'z', 'y', 'x', 'v', 'w', 'u', 't', 's', 'r', 'q', 'p', 'o', 'n', 'm', 'l', 'k', 'j', 'i', 'h', 'g', 'f', 'e', 'd', 'c', 'b', 'a'};

        for ( i = 0; i < 2 ; i++) {


            if (txt[i] == alphabet[j]) {
                encTxt[i] = encryption[j];
            } else {
                j++;


            }


        }
        System.out.println(j);
    }
}