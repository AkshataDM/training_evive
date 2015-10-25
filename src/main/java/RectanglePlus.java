
public class RectanglePlus implements Relatable  {

        public int width = 0;
        public int height = 0;


        public RectanglePlus() {

        }

        public RectanglePlus(int w, int h) {

            width = w;
            height = h;
        }

    public int getArea() {
        return width * height;
    }

    public int isLargerThan(Relatable other) {
        RectanglePlus otherRect
                = (RectanglePlus)other;
        if (this.getArea() < otherRect.getArea())
            return -1;
        else if (this.getArea() > otherRect.getArea())
            return 1;
        else
            return 0;
    }


}
