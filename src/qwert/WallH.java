package qwert;

public enum WallH {
    low( "Низкий" , 3 ) , medium( "Средний" , 3 ) , high( "Высокий" , 2 ) ;

    private String name;
    private int height;

    public int getHeight() {
        return height;
    }

    WallH(String name, int height) {
        this .name = name;
        this .height = height;
    }
}
