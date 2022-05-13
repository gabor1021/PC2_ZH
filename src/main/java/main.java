import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        //A0UN1F neptun kód
        /*1. (2 pont) Készítsen egy ***Matrix*** osztályt. Az osztályban írja meg a ***sumOfNumbersDivisibleByFive*** és a
   ***indexOfRowsWithZeros*** metódusokat. Mindkét metódus meghatározza egy 2-dimenziós egész mátrixban: előbbi az 5-tel
   osztható számok összegét, utóbbi azon sorok indexeit, melyek csupa 0 értékből állnak!*/
        int[][] matrix = {
                {84, 67, 22, -72, 95},
                {72, -70, 2, -88, 30},
                {95, -79, -87, -27, -97},
                {-52, -64, -13, -19, -27},
                {79, 89, 95, -84, -53}
        };
        Matrix elso = new Matrix();
        System.out.println(elso.sumOfNumbersDivisibleByFive(matrix));
        System.out.println(elso.indexOfRowsWithZeros(matrix));
        /*2. (4 pont) Implementálja a ***Timetable*** osztályt, ami kurzusok nevét és időpontjait kezeli (courseName, timestamp).
   Az osztálynak rendelkeznie kell egy ***newCourse*** (új kurzus hozzáadása, csak név), egy ***removeCourse*** (adott
   elem törlése) és egy ***getCourses*** (egy String-ben visszaadja az aktuálisan tárolt kurzusok adatait: <kurzusnév>
   <időpont> formátumban) metódussal.*/
        Timetable masodik = new Timetable();

        masodik.newCourse("programozás II");
        masodik.newCourse("analízis II");
        masodik.newCourse("kalkulus II");
        masodik.newCourse("kalkulus II");
        System.out.println(masodik.getCourses());

        masodik.removeCourse("analízis I");
        System.out.println(masodik.getCourses());
        /*3. (2 pont) Származtasson egy ***Scheduler*** osztályt a ***Timetable*** osztályból, melynek ***setTimestamp***
   metódusával lehessen beállítani a ***Timetable*** kurzusainak időpontját.*/
        Scheduler harmadik = new Scheduler();

        harmadik.newCourse("programozás II");
        harmadik.newCourse("analízis II");
        harmadik.newCourse("kalkulus II");
        harmadik.newCourse("kalkulus II");
        harmadik.setTimestamp("programozás II", 8);
        harmadik.setTimestamp("analízis II", 12);
        harmadik.setTimestamp("kalkulus II", 2);
        harmadik.setTimestamp("kalkulus I", 14);
        System.out.println(harmadik.getCourses());


        harmadik.removeCourse("kalkulus II");
        System.out.println(harmadik.getCourses());

        System.out.println(harmadik.getCourses());
    }

}

class Matrix {
    public static int sumOfNumbersDivisibleByFive(int[][] matrix) {
        Integer sum = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (matrix[i][j] % 5 == 0) sum += matrix[i][j];
            }
        }
        return sum;
    }

    public static ArrayList<Integer> indexOfRowsWithZeros(int[][] matrix) {
        ArrayList<Integer> list = new ArrayList<>();
        Integer i = 0;
        for (; i < 5; i++) {
            if (matrix[i][0] == 0) {
                for (int j = 0; j < 5; j++) {
                    if (matrix[i][j] == 0 && j == 4) list.add(i);
                }
            }
        }
        return list;
    }
}

class Timetable {
    protected ArrayList<String> courseName = new ArrayList<>();
    protected ArrayList<Integer> timestamp = new ArrayList<>();

    public void newCourse(String coursename) {
        Boolean y = true;
        for (int i = 0; i < courseName.size(); i++) {
            if (courseName.get(i) == coursename) {
                System.out.println("Már hozzá van adva a(z) " + coursename + " kurzus");
                y = false;
            }
        }
        if (y) {
            courseName.add(coursename);
            timestamp.add(null);
        }
    }

    public String getCourses() {
        String courses = "";
        for (int i = 0; i < courseName.size(); i++) {
            if (timestamp.get(i) == null) courses += courseName.get(i) + " -\n";
            else courses += courseName.get(i) + " - " + timestamp.get(i) + " óra\n";
        }
        return courses;
    }

    public void removeCourse(String coursename) {
        Boolean y = true;
        for (int i = 0; i < courseName.size(); i++) {
            if (courseName.get(i) == coursename) {
                courseName.remove(i);
                timestamp.remove(i);
                y = false;
            }
        }
        if (y) System.out.println("Nincs a(z) " + coursename + " kurzus a listában");
    }
}

class Scheduler extends Timetable {

    public void setTimestamp(String coursename, Integer time) {
        Boolean y = true;
        for (int i = 0; i < courseName.size(); i++) {
            if (courseName.get(i) == coursename) {
                timestamp.set(i, time);
                y = false;
            }
        }
        if (y) System.out.println("Nincs a(z) " + coursename + " kurzus a listában");
    }
}