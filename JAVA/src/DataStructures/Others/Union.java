package DataStructures.Others;

/**
 * Created by argshub on 6/7/2018.
 */
public class Union {


    private int element;

    public Union(int element) {
        this.element = element;
    }

    public char[] data() {
        char data[] = new char[4];
        data[0] = (char) (element & (255));
        data[1] = (char) ((element >> 7) & (255));
        data[2] = (char) ((element >> 14) & (255));
        data[3] = (char) ((element >> 21) & (255));
        return data;
    }


    public static void main(String arg[]) {
        Union union = new Union(1234567890);
        char data[] = union.data();
        for (int i = 0; i < data.length; i++) System.out.printf("%c\t", data[i]);
    }
}
