package Day2.GetterSetter;

public class gettersetter {

    public static void main(String[] args) {
        
    
        SinhVien sv = new SinhVien();
        sv.setTen("Nguyen Van A");
        sv.setTuoi(24);
        System.out.println(("Ten cua sinh vien la :"+sv.getTen()));
        System.out.println(("Tuoi cua sinh vien la :"+sv.getTuoi()));
    }}


    class SinhVien{
        private String ten;
        private int tuoi;
        public void setTen(String ten){
            this.ten =ten;

        }
  
        public String getTen(){
            return ten;

        }
        public void setTuoi (int tuoi){
            this.tuoi=tuoi;

        }
        public int getTuoi(){
            return tuoi;
        }

    }

