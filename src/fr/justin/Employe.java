package fr.justin;
// deuxieme façon
public class Employe {
    String nom,prenom,tel;

    public Employe(BuilderEmploye builder) {
        nom=builder.nom;
        prenom=builder.prenom;
        tel=builder.tel;
    }


    public static class BuilderEmploye{
        String nom;
        String prenom;
        String tel;

        public BuilderEmploye(String nom, String prenom) {
            this.nom = nom;
            this.prenom = prenom;
        }



        public BuilderEmploye addTel(String tel){
            this.tel=tel;
            return this;
        }

        public Employe build(){
            return new Employe(this);
        }
    }
}
