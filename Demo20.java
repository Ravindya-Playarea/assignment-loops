void main(){

    //(2.1)
    int x = 0, y = 5, z = 0;
    while (x++ < 38) {

        System.out.print(y == 0 && z!=5? "\n" : " * ");

        if (y == 0 ) {
            // y = 5 - z;
            y=z<5 ? 5-z:z-3;
            z++;
            if(z==6) z++;
        }

        y--;

    }

    System.out.println("----------------------------------------");
//(2.2)
    int row = 0;
    int col = 6;

    while (row <= 9) {

        while (col-- > 0) {
            System.out.print(col == 0 && row != 5 ? "\n" : " * ");
        }
        col = row < 5 ? 5 - row : row == 5 ? 2 : row - 2;
        row++;
    }

    System.out.println("----------------------------------------");
/*
    int r=0;
    int column=6;

    while (r<=9){
        while(column-->0){
            if(column!=0) {
                System.out.print(" * ");
            }
        }
        column=r<5?5-r:r==5?2:r-2;
        r++;
        System.out.println();
    }

 */

}
