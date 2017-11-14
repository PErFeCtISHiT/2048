package logic;

public class game {
    private panel p = new panel();
    public boolean move(int way){
        switch (way){
            case 0://向上
                for(int i = 0;i < 4;i++){
                    for(int j = 0;j < 3;j++){
                        if(p.a[j][i] != 0 && p.a[j][i] == p.a[j + 1][i]){
                            p.a[j][i] *= 2;
                            p.a[j + 1][i] = 0;
                        }
                    }
                }
            case 1://向下
                for(int i = 0;i < 4;i++){
                    for(int j = 3;j > 0;j--){
                        if(p.a[j][i] != 0 && p.a[j][i] == p.a[j - 1][i]){
                            p.a[j][i] *= 2;
                            p.a[j - 1][i] = 0;
                        }
                    }
                }
            case 3://向右
                for(int i = 0;i < 4;i++){
                    for(int j = 0;j < 3;j++){
                        if(p.a[i][j] != 0 && p.a[i][j] == p.a[i][j + 1]){
                            p.a[i][j + 1] *= 2;
                            p.a[i][j] = 0;
                        }
                    }
                }
            case 4://向左
                for(int i = 0;i < 4;i++){
                    for(int j = 3;j > 0;j--){
                        if(p.a[i][j] != 0 && p.a[i][j] == p.a[i][j - 1]){
                            p.a[i][j - 1] *= 2;
                            p.a[i][j] = 0;
                        }
                    }
                }
        }
        if(!p.generate())
            return false;
        return true;
    }
}