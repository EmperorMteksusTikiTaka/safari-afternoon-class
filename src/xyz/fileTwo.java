package xyz;

public class fileTwo {
    public static void main(String[] args) {
        String[] names;
        String output;
        names=new String[5];
        names[0]="king";
        names[1]="wanyama";
        names[2]="Peter";
        names[3]="Abigael";
        names[4]="Evans";
        System.out.println(names[1]);

        output=names[0]+" "+
                names[1]+" "+
                names[2]+" "+names[3]
                +" "+names[4];
        System.out.println(output);
    }
}
