public class island {
    public static void main(String[] args) {
        char[][] island = {
            {'0','1','1'},
            {'0','1','0'},
            {'0','0','0'}
        };
        for (int i = 0; i < island.length; i++) {
            for (int j = 0; j < island[0].length; j++) {
                if (island[i][j] == '1') {
                    dulr(island, x, y);
                }
            }
        }
    }

    public static void dulr(char[][] island, int x, int y) {
        island[x][y]='0';
        if(y+1 < island.length && island[x][y+1]=='1'){
            dulr(island, x, y+1);
        }if(y-1 < island.length && island[x][y-1]=='1'){
            dulr(island, x, y-1);
        }if(y-1 < island.length && island[x][y-1]=='1'){
            dulr(island, x, y-1);
        }
    }
}
