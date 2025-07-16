package NivelIntrermediario.Aula14;

public enum Biju {

    SHUKAKU("Shukaku", "Gaara", 1),
    MATATABI("Matatabi", "Yugito Nii", 2),
    ISOBU("Isobu", "Yagura Karatachi", 3),
    SON_GOKU("Son Goku", "Rōshi", 4),
    KOKU("Kokuō", "Han", 5),
    SAIKEN("Saiken", "Utakata", 6),
    CHOMEI("Chōmei", "Fū", 7),
    GYUKI("Gyūki", "Killer Bee", 8),
    KURAMA("Kurama", "Naruto Uzumaki", 9);

    String nomeBiju;
    String jinchuriki;
    int numeroDeCaldas;

    Biju(){

    }

    Biju(String nomeBiju, String jinchuriki, int numeroDeCaldas) {
        this.nomeBiju = nomeBiju;
        this.jinchuriki = jinchuriki;
        this.numeroDeCaldas = numeroDeCaldas;
    }
}