void main() {
    int x = 0, y = 5, z = 0;
    while (x++ < 21) {
        System.out.print(y == 0 ? "\n" : " * ");
        if (y == 0) {
            y = 5 - z;
            z++;
        }
        y--;
    }

}

