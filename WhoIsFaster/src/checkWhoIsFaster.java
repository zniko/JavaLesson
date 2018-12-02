public class checkWhoIsFaster {

    public static String checkSpeed (Cat cat , Dog dog)
    {
     if(dog.getDogSpeed()>cat.getCatSpeed()) return ("Dog is faster");
     if(cat.getCatSpeed()>dog.getDogSpeed()) return ("Cat is faster");
     else                                    return ("Dog and Car are fast in the same level");
    }



}
