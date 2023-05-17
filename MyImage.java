public class MyImage {

    ImageTool imTool = new ImageTool ();
    boolean isColor = false;
    int[][] greyPixels;
    int[][][] pixels;
    int M, N; // rows and cols
    String title = "no title";

    // Constructor
    public MyImage (String filename, String imageTitle, boolean isColorImage)
    {
        isColor = isColorImage;
        if (isColor) {
            pixels = imTool.imageFileToPixels (filename);
            M = pixels.length;
            N = pixels[0].length;
        }
        else {
            greyPixels = imTool.imageFileToGreyPixels (filename);
            M = greyPixels.length;
            N = greyPixels[0].length;
        }
        title = imageTitle;
    }

    public void show ()
    {
        if (isColor) {
            imTool.showImage (pixels, title);
        }
        else {
            imTool.showImage (greyPixels, title);
        }
    }

    public String toString ()
    {
        if (isColor) {
            return "Image (color): #rows="+M+" #cols="+N;
        }
        else {
            return "Image (BW): #rows="+M+" #cols="+N;
        }
    }

    public double averagePixelIntensity ()
    {
        if (isColor) {
            int sumPixelValues = 0;
            for (int row=0; row<M; row++) {
                for (int col=0; col<N; col++) {
                    for (int colorVal=1; colorVal<4; colorVal++) {
                        sumPixelValues += pixels[row][col][colorVal];
                    }
                }
            }
            return (double) sumPixelValues / (M*N*3);
        }
        else {
            int sumPixelValues = 0;
            for (int row=0; row<M; row++) {
                for (int col=0; col<N; col++) {
                    sumPixelValues += greyPixels[row][col];
                }
            }
            return (double) sumPixelValues / (M*N);
        }
    }
}