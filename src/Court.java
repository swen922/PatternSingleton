
/** Одиночка, также известен как: Singleton */

public class Court {

    public static void main(String[] args) {
        King king1 = King.getKingInstance();
        System.out.println(king1);
        King king2 = King.getKingInstance();
        System.out.println(king2);

        System.out.println("king1 == king2 = " + (king1 == king2));

    }


}
