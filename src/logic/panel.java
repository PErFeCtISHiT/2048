package logic;

public class panel {
    int a[][] = new int[4][4];
    panel(){//产生两个初始格子
        int p = (int)(Math.random() * 4);
        int q = (int)(Math.random() * 4);
        int rand = (int)(Math.random() * 2);
        if(rand == 1)
            a[p][q] = 2;
        else
            a[p][q] = 4;
        p = (int)(Math.random() * 4);
        q = (int)(Math.random() * 4);
        while(a[p][q] != 0){
            p = (int)(Math.random() * 4);
            q = (int)(Math.random() * 4);
        }
        rand = (int)(Math.random() * 2);
        if(rand == 1)
            a[p][q] = 2;
        else
            a[p][q] = 4;
    }
    boolean generate(){//产生元素
        int p = (int)(Math.random() * 4);
        int q = (int)(Math.random() * 4);
        int rand = (int)(Math.random() * 2);
        while(a[p][q] != 0){
            p = (int)(Math.random() * 4);
            q = (int)(Math.random() * 4);
        }
        if(rand == 1)
            a[p][q] = 2;
        else
            a[p][q] = 4;
        if(!judge())
            return false;
        return true;
    }
    boolean judge(){//判断是否结束
        for(int i = 0;i < 4;i++){
            for(int j = 0;j < 4;j++){
                if(a[i][j] == 0)
                    return true;
            }
        }
        return false;
    }
}
