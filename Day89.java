package coding;

public class day89 {
    public static void main(String[]args){
        String[][] buah = {
            {"apel"," anggur"},
            {"durian"," semangka"," pepaya"},
            {"tomat"," timun"},
        };
        for(int i=0; i<buah.length; i++){
            for(int j=0; j<buah[i].length; j++){
                System.out.print(buah[i][j]);
            }
            System.out.println();
        }
    }
}
