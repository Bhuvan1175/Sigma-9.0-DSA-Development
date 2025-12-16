public  class ArrayAsFunction{
    public static void Update(int marks[]){
        for (int i = 0; i < marks.length; i++) {
            marks[i]=marks[i]+1;
        }
    }
    public static void main(String[] args) {
        int marks[]={90,98,99,94};
        Update(marks);
        for(int mark:marks){
            System.out.print(mark+" ");
        }
    }
}