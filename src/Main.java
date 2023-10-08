public class Main {
    public static void main(String[] args) {

        Griffindor garry = new Griffindor("Гарри ", "Поттер",80,75,90,80,79);
        Griffindor germiona = new Griffindor("Гермиона  ", "Грейнджер",90,80,60,78,85);
        Griffindor ron = new Griffindor("Рон  ", "Уизли",70,60,60,90,68);

        Slytherin drako = new Slytherin("Драко ","Малфой",89, 78, 79,77,70,99,34);
        Slytherin gregori = new Slytherin("Грэхэм  ","Монтегю",78, 80, 68,87,50,65,56);
        Slytherin grehem = new Slytherin("Грегори  ","Гойл",50, 67, 47,89,78,56,67);

        Ravenclaw gou = new Ravenclaw("Чжоу " ," Чанг ",51,88,92,26,39,75);
        Ravenclaw padma = new Ravenclaw("Падма  " ," Патил ",76,48,29,85,96,35);
        Ravenclaw markus = new Ravenclaw("Маркус   " ,"  Белби.  ",86,34,57,85,83,37);

        Hufflepuff zahariya = new Hufflepuff("Захария "," Смит",99,64,60,10,40);
        Hufflepuff sedrik = new Hufflepuff("Седрик  ","  Диггори",45,54,85,75,65);
        Hufflepuff jastin = new Hufflepuff("Джастин   ","  Финч-Флетчли. ",75,30,93,54,97);

        Griffindor.comparingTheStudent(germiona,garry);

    }
}