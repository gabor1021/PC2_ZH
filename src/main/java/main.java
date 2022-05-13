import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        /*1. (2 pont) Készítsen egy ***Matrix*** osztályt. Az osztályban írja meg a ***sumOfNumbersDivisibleByFive*** és a
   ***indexOfRowsWithZeros*** metódusokat. Mindkét metódus meghatározza egy 2-dimenziós egész mátrixban: előbbi az 5-tel
   osztható számok összegét, utóbbi azon sorok indexeit, melyek csupa 0 értékből állnak!*/
        int[][] matrix = {{5, 4, 2, 3, 5},
                {3, 7, 2, 3, 2},
                {0, 0, 0, 0, 0},
                {0, 5, 6, 2, 3},
                {0, 0, 0, 0, 0}};
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
        System.out.println(masodik.getCourses());
        /*3. (2 pont) Származtasson egy ***Scheduler*** osztályt a ***Timetable*** osztályból, melynek ***setTimestamp***
   metódusával lehessen beállítani a ***Timetable*** kurzusainak időpontját.*/
        Scheduler harmadik=new Scheduler();
        harmadik.newCourse("programozás II");
        harmadik.newCourse("analízis II");
        harmadik.newCourse("kalkulus II");
        harmadik.setTimestamp(13,0);
        harmadik.setTimestamp(12,1);
        harmadik.setTimestamp(8,2);
        System.out.println(harmadik.getCourses());
    }

}

class Matrix {
    public Integer sumOfNumbersDivisibleByFive(int[][] matrix) {
        Integer sum = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (matrix[i][j] % 5 == 0) sum += matrix[i][j];
            }
        }
        return sum;
    }

    public ArrayList<Integer> indexOfRowsWithZeros(int[][] matrix) {
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
    protected ArrayList<String> courseName=new ArrayList<>();
    protected ArrayList<Integer> timestamp=new ArrayList<>();

    public void newCourse(String coursename) {
        courseName.add(coursename);
        timestamp.add(null);
    }

    public String getCourses() {
        String courses = "";
        for (int i = 0; i < courseName.size(); i++) {
            if(timestamp.get(i)==null)courses += courseName.get(i) + "\t-\t" + "Nincs időpont" + "\n";
            else courses += courseName.get(i) + "\t-\t" + timestamp.get(i) + " óra\n";
        }
        return courses;
    }
}

class Scheduler extends Timetable{

    public void setTimestamp(Integer time, int index){
        timestamp.set(index,time);
    }
}