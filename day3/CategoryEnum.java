public class CategoryEnum{
    public static void main(String[] args) {
        People chosenCategory = People.KID;

        switch (chosenCategory){
            case MEN : System.out.println("The price for men is 13.57"); break;
            case WOMEN: System.out.println("The price for women is 20.45"); break;
            case KID : System.out.println("The price for kids is 45.6"); break;
            case GRANDMA : System.out.println("The price for grandmas is 56.67"); break;
            case GRANDPA : System.out.println("The price for grandpas is 3.56"); break;
            //if I understood correctly, having enum eliminates the need for a default kasi given na na "ito lang ichecheck mo"
        }
    }
    public enum People{
        MEN, WOMEN, KID, GRANDMA, GRANDPA
    }
}
