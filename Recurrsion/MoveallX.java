package Recurrsion;

public class MoveallX {
    public static StringBuilder Move(int idx, int count,StringBuilder str,String input){
        if(idx==input.length()){
            for(int i=0;i<count;i++){
                str.append("X");
            }
            return str;
        }
        if(input.charAt(idx)!='X'){
            str.append(input.charAt(idx));
        }
        else{
            count++;
        }
        Move(idx+1, count, str, input);
        return str;
    }
    public static void main(String[] args) {
        String input = "aXbbXccDefXd";
        StringBuilder str = new StringBuilder();
        System.out.println(Move(0, 0, str, input));
    }
}
