package RedRover.M12_L.H10_L.grades;

public class SubjectRegister {
    private Row[] rows;

    private boolean locked = true;


    public SubjectRegister(String[] studentName, int numberOfClasses){
        this.rows = new Row[studentName.length];
        for (int i = 0; i < studentName.length; i++) {
            Row row = new Row(studentName[i], numberOfClasses);
            rows[i] = row;
        }
    }

    public int getNumberOfStudents(){
        return rows.length;
    }

    public void giveGrade(String studentName, int lessonNumber, int grade) {
        giveGrade(studentName, lessonNumber, new Grade(grade));
    }


        public void giveGrade(String studentName, int lessonNumber, Grade grade) {
        if (locked){
            System.out.println("This register is LOCKED! You can't modify it.");
            return;
        }
        Row row = findByName(studentName);      //Найти ряд (row)
        if (row != null) {
            row.giveGrade(lessonNumber, grade);
            System.out.println(studentName + " gets " + grade.getValue());
        } else {
            System.out.println("Can't find student " + studentName);
        }
    }

    private Row findByName (String studentName){
        for (int i = 0; i < rows.length; i++) {
            if (rows[i].getStudentName().equalsIgnoreCase(studentName)){
                return rows[i];
            }
        }
        return null;
        }

    public void print(){
            System.out.println("=========================");
            for (int i = 0; i < rows.length; i++) {
                System.out.println(rows[i].printable());

            }
            System.out.println("=========================");
        };

    public void unlock(){
        this.locked = false;
    }

    public void lock() {
        this.locked = true;
    }

    public Integer getFinalGrade(String studentName){
        Row row = findByName(studentName);      //Найти ряд (row)
        if (row != null) {
            return row.getFinalGrage();
        } else {
            System.out.println("Can't find student " + studentName);
        }
        return null;
    }





}
