public class Instacoment {
 
    public static void main(String[] args) {
 
        Instagram Instacoment = new Instagram(); 
        Instacoment.Likes(); 
        Instacoment.Coment();
        Instacoment.PostComent();

        System.out.println("Yang Berkomentar adalah" + Coment.getLikes() + "Banyak");
        
        double bmi = Instacoment.getLikes() / ((Instacoment.getComent() * 0.01) * (Instacoment.PostComent() * 0.01));
       
        System.out.println("Yang Menyukai postingan ini adalah " + bmi);

   }

}

}

}