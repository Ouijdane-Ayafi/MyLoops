public class MyLoops {
    
    public static void main(String[] args) {
        
        //TODO 1: Créez une boucle "for" qui affiche la phrase "I am having so much fun!" 5 fois
    for(int i=0; i<5; i++)
    {
     System.out.println("I am having so much fun !");
    }   
      //TODO 2:Changer la boucle for par la boucle while
    int i=0;
    while(i<5){
        System.out.println("I am having so much fun !");
    }  
    //Ce n'est pas une bonne idée du tout ça nous fait entrer dans une boucle infinie car le i ne change pas 
   //TODO 3:Sautez l'affichage de la quatrième boucle
    for (int i=1;i<=5;i++)
    {
        if(i==4){
            continue;
        }
        System.out.println("I am having so much fun !");
    }
    }
}
