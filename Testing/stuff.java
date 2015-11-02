public class stuff{
    public static void main(String[]args){
        /*int[] [] stuff = new int[5][3];
        for(int i=0; i<5; i++){ 
            for(int j=0; j<3; j++){ 
            stuff[i][j] = 0; 
            System.out.printf(stuff[i][j] + " ");
            }
        System.out.println("");
        }*/
        String[][] board = {
            {"  ","1"," ","2"," ","3"},
            {"1 ","","|","","|",""},
            {"  ","-","+","-","+","-"},
            {"2 ","","|","","|",""},
            {"  ","-","+","-","+","-"},
            {"3 ","","|","","|",""},
        };
        String[][] game = {
            {"X"," "," "},
            {" ","O","X"},
            {" "," "," "},
        };
        
        for(int k=0; k<3; k++){
            for(int l=0; l<3; l++){
                board[2*k + 1][2*l + 1] = game[k][l];
            }
        }
        for(int i=0; i<6; i++){ 
            for(int j=0; j<6; j++){ 
            //stuff[i][j] = 0; 
            System.out.printf(board[i][j] + "");
            }
        System.out.println("");
        }
    }
}