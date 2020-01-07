public class Rectangle
{
    private int weidth;
    private int height;

    public void setDimensions(int newWidth, int newHeight)
    {
        weidth = newWidth;
        height = newHeight;

    }
    public int getArea()
    {
        return weidth*height;
    }
}
