import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Scanner;
import java.util.UUID;


public class Imagedownload {
    public static void main(String[] args)
    {
        BufferedImage image = null;
        try{
            System.out.println("Paste Your URL here");
            Scanner k = new Scanner(System.in);
            String user= k.nextLine();
            URL url = new URL(user);
            image = ImageIO.read(url);
            String name = UUID.randomUUID().toString();
            ImageIO.write(image, "png",new File("C:\\Users\\"+ System.getProperty("user.name")+"\\Downloads\\"+name +".png"));

        }
        catch (IOException e){

    }
}
}
