package bitwisee;

public class uppertolowercase {
    public static void main(String[] args) {
        for( char ch='A';ch<='Z';ch++){
            System.out.println((char) (ch | 32));         //32=' '
        }
}
}
